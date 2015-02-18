package com.clafer4emf.transformations.xtend

import com.clafer4emf.clafer.Clafer
import com.clafer4emf.clafer.ClaferModel
import com.clafer4emf.util.ecore.Walker
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Stack
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcoreFactory
import com.clafer4emf.util.annotation.Annotater

/* TODO: Optimize transform method. */
class ClaferModel2EPackage extends BaseTransformation {
	val extension Annotater annotater = new Annotater
	val Map<Clafer, EClass> claferToEObjectMapping = new HashMap

	def EPackage transform(ClaferModel claferModel) {
		val ePackage = EcoreFactory.eINSTANCE.createEPackage
		ePackage.name = claferModel.name
		ePackage.nsPrefix = "clafer"
		ePackage.nsURI = "http://clafer4emf.com/clafer"

		val clafer2Eclass = new Clafer2EClass

		/* Tum EClass'lari olustur. */
		claferModel.allClafers.forEach [ clafer |
			val eClass = clafer2Eclass.transform(clafer)
			/* Primitive type (int, string) */
			if (clafer.primitive) {
				val eAttr = EcoreFactory.eINSTANCE.createEAttribute
				eAttr.name = "value"
				eAttr.EType = clafer.primitiveEDataType
				eClass.EStructuralFeatures.add(eAttr)
			}
			ePackage.EClassifiers.add(eClass)
			claferToEObjectMapping.put(clafer, eClass)
		]

		val clafer2ERef = new Clafer2EReference

		/* Ref tipleri bagla. */
		claferModel.allClafers.forEach [ clafer |
			/* Root olmayan clafer ise. */
			if (!clafer.root) {
				val parentClafer = clafer.eContainer as Clafer
				val parentEClass = claferToEObjectMapping.get(parentClafer)

				if (parentEClass == null) {
					throw new RuntimeException("EClass bulunamadi. Clafer: " + parentClafer)
				}

				val eRef = clafer2ERef.transform(clafer, claferToEObjectMapping)

				/* xor ve or durumlarini belirleyen Group cardinality. */
				if (clafer.or || clafer.xor) {
					eRef.lowerBound = clafer.CGroupCardinality.min
					eRef.upperBound = clafer.CGroupCardinality.max
				} else {
					eRef.lowerBound = clafer.CCardinality.min
					eRef.upperBound = clafer.CCardinality.max
				}

				parentEClass.EStructuralFeatures.add(eRef)
			}
		]

		/* Super tipleri doldur. */
		claferModel.allClafers.forEach [ clafer |
			if (clafer.CSuper != null) {
				val eClass = claferToEObjectMapping.get(clafer)
				val superEClass = claferToEObjectMapping.get(clafer.CSuper)

				eClass.ESuperTypes.add(superEClass)
			}
			if (clafer.CTarget != null) {
				val eClass = claferToEObjectMapping.get(clafer)
				val targetEClass = claferToEObjectMapping.get(clafer.CTarget)

				eClass.ESuperTypes.add(targetEClass)
			}
		]

		/* Enum kisitlarina gore modeli degistir. */
		claferModel.allClafers.forEach [ clafer |
			val groupCardinality = clafer.CGroupCardinality
			if (groupCardinality != null) {

				/* xor, or */
				if (clafer.xor || clafer.or) {
					val eClass = claferToEObjectMapping.get(clafer)
					eClass.EStructuralFeatures.clear
					eClass.abstract = true
					eClass.markEnum(clafer.qName)

					clafer.CElements.forEach [ childClafer |
						val childEClass = claferToEObjectMapping.get(childClafer)
						childEClass.markEnumLiteral(childClafer.name)
						childEClass.ESuperTypes.add(eClass)
					]
				}
			}
		]

		optimizeEcore(ePackage)

		return ePackage
	}

	def optimizeEcore(EPackage ePackage) {
		optimizePrimitiveAttributes(ePackage)
		removeUnusedPrimitives(ePackage)
		optimizeEnums(ePackage)
		optimizeInheritance(ePackage)
	}

	def optimizePrimitiveAttributes(EPackage ePackage) {

		/* Tipleri topla cunku dolasirken silemezsin. */
		val eClassesToRemove = newLinkedList
		val Map<EClass, List<EAttribute>> eAttrsToAdd = new HashMap
		val Map<EClass, List<EReference>> eRefsToRemove = new HashMap

		/* Traverse EPackage tree. */
		new Walker(ePackage) {

			override protected greetReference(EReference eRef) {
				val eClass = eRef.EContainingClass
				val refType = eRef.EType as EClass

				val primitiveTypeName = refType.subTypeOfPrimitive
				if (primitiveTypeName != null) {

					/* Bos EClass, gereksiz. */
					if (refType.EStructuralFeatures.empty) {
						eClassesToRemove.add(refType)

						val eAttr = EcoreFactory.eINSTANCE.createEAttribute
						eAttr.name = eRef.name
						eAttr.lowerBound = eRef.lowerBound
						eAttr.upperBound = eRef.upperBound
						eAttr.EType = ext.getPrimitiveEDataType(primitiveTypeName)

						val eAttrList = eAttrsToAdd.get(eClass)
						if (eAttrList == null) {
							eAttrsToAdd.put(eClass, newLinkedList)
						}
						eAttrsToAdd.get(eClass).add(eAttr)

						val eRefList = eRefsToRemove.get(eClass)
						if (eRefList == null) {
							eRefsToRemove.put(eClass, newLinkedList)
						}
						eRefsToRemove.get(eClass).add(eRef)
					}
				}
			}

		}.walk

		ePackage.EClassifiers.removeAll(eClassesToRemove)
		eAttrsToAdd.forEach [ eClass, eAttrList |
			eClass.EStructuralFeatures.addAll(eAttrList)
		]
		eRefsToRemove.forEach [ eClass, eRefList |
			eClass.EStructuralFeatures.removeAll(eRefList)
		]
	}

	def removeUnusedPrimitives(EPackage ePackage) {
		val Map<EClass, Boolean> primitives = new HashMap

		/* Collect primitives. */
		new Walker(ePackage) {

			override protected greetClass(EClass eClass) {
				if (ext.containsPrimitiveEDataType(eClass.name)) {
					primitives.put(eClass, true)
				}
			}

		}.walk

		/* Kullanim durumlarini incele. */
		new Walker(ePackage) {

			override protected greetClass(EClass eClass) {
				eClass.ESuperTypes.forEach [ superClass |
					if (primitives.containsKey(superClass)) {

						/* Silme. */
						primitives.put(superClass, false)
					}
				]
			}

		}.walk

		/* Kullanilmayan siniflari sil. */
		primitives.forEach [ eClass, delete |
			if (delete) {
				ePackage.EClassifiers.remove(eClass)
			}
		]
	}

	def optimizeEnums(EPackage ePackage) {
		val classesToAdd = newLinkedList
		val classesToRemove = newLinkedList
		val Map<EClass, List<EReference>> eRefsToRemove = new HashMap
		val Map<EClass, List<EAttribute>> eAttrsToAdd = new HashMap

		new Walker(ePackage) {

			override protected greetReference(EReference eReference) {
				val enumClass = eReference.EType as EClass
				val enumMark = enumClass.enumMark

				/* EnumClass buludu. */
				if (enumMark != null && enumMark.key == annotater.ENUM_CLASS) {

					/* Enum tipi yarat. */
					val eEnum = EcoreFactory.eINSTANCE.createEEnum
					eEnum.name = enumClass.enumMark.value.toFirstUpper

					/* Enum literals yapilacak siniflar. */
					val enumSubClasses = enumClass.subClasses(ePackage)
					var index = 0
					for (EClass enumSubClass : enumSubClasses) {

						/* SubClass bos degilse, optimize yok. */
						if (!enumSubClass.EStructuralFeatures.empty) {
							return
						}

						/* Enum literal olustur. */
						val eEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral
						eEnumLiteral.name = enumSubClass.enumLiteralMark.value.toUpperCase
						eEnumLiteral.value = index++
						eEnum.ELiterals.add(eEnumLiteral)
					}

					/* Yeni attribute yarat. */
					val eAttr = EcoreFactory.eINSTANCE.createEAttribute
					eAttr.name = eReference.name
					eAttr.EType = eEnum
					eAttr.lowerBound = eReference.lowerBound
					eAttr.upperBound = eReference.upperBound

					classesToAdd.add(eEnum)
					classesToRemove.add(enumClass)
					classesToRemove.addAll(enumSubClasses)

					if (eRefsToRemove.get(eReference.EContainingClass) == null) {
						eRefsToRemove.put(eReference.EContainingClass, newLinkedList)
					}
					eRefsToRemove.get(eReference.EContainingClass).add(eReference)

					if (eAttrsToAdd.get(eReference.EContainingClass) == null) {
						eAttrsToAdd.put(eReference.EContainingClass, newLinkedList)
					}
					eAttrsToAdd.get(eReference.EContainingClass).add(eAttr)
				}
			}
		}.walk

		ePackage.EClassifiers.addAll(classesToAdd)
		ePackage.EClassifiers.removeAll(classesToRemove)
		eRefsToRemove.forEach [ eClass, refList |
			eClass.EStructuralFeatures.removeAll(refList)
		]
		eAttrsToAdd.forEach [ eClass, attrList |
			eClass.EStructuralFeatures.addAll(attrList)
		]
	}

	def optimizeInheritance(EPackage ePackage) {
		val classesToRemove = newLinkedList

		new Walker(ePackage) {

			override protected greetReference(EReference eReference) {
				val refType = eReference.EType as EClass

				/* Gereksiz bir sinif mi? */
				if (refType.EStructuralFeatures.empty) {

					/* Enum'lar ozel durum onlari gec. */
					if (refType.enumMark != null || refType.enumLiteralMark != null) {
						return
					}

					/* Super tip yoksa ya da multi inheritance varsa optimizasyon yapamayiz. */
					if (refType.ESuperTypes == null || refType.ESuperTypes.size != 1) {
						return
					}

					val superType = refType.ESuperTypes.get(0) as EClass
					eReference.EType = superType
					classesToRemove.add(refType)
				}
			}
		}.walk

		ePackage.EClassifiers.removeAll(classesToRemove)
	}

	def subClasses(EClass eClass, EPackage ePackage) {
		val subClasses = newLinkedList

		new Walker(ePackage) {

			override protected greetClass(EClass currentEClass) {
				if (currentEClass.ESuperTypes.contains(eClass)) {
					subClasses.add(currentEClass)
				}
			}

		}.walk

		return subClasses
	}

	def subTypeOfPrimitive(EClass eClass) {
		val stack = new Stack
		stack.addAll(eClass.ESuperTypes)

		while (!stack.isEmpty) {
			val top = stack.pop
			if (ext.containsPrimitiveEDataType(top.name)) {
				return top.name
			}

			stack.addAll(top.ESuperTypes)
		}

		return null
	}
}
