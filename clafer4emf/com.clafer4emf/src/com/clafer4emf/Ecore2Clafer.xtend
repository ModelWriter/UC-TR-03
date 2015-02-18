package com.clafer4emf

import com.clafer4emf.util.annotation.Annotater
import com.clafer4emf.util.ecore.Walker
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage

class Ecore2Clafer {
	val extension Annotater annotater = new Annotater

	def String transform(EPackage ePackage) {
		val sb = new StringBuilder

		new Walker(ePackage) {

			override protected greetClass(EClass eClass) {

				/* Enum degilse. */
				if (eClass.enumMark == null && eClass.enumLiteralMark == null) {
					val abstract = if(eClass.abstract) "abstract " else ""
					sb.append(abstract)
					sb.append(eClass.name)
					sb.append(claferSuperType(eClass))
					sb.newLine
				}

				super.greetClass(eClass)
			}

			override protected greetAttribute(EAttribute eAttribute) {
				val parentClass = eAttribute.EContainingClass
				val eType = eAttribute.EType

				/* Enum tipini xor yap. */
				if (eType instanceof EEnum) {
					sb.newTab
					sb.append("xor ")
					sb.append(eType.name.replace(parentClass.name, "").toLowerCase)
					eType.ELiterals.forEach [
						sb.newLine.newTab.newTab
						sb.append(name.toLowerCase)
					]
					sb.newLine
				} else {
					sb.newTab
					sb.append(eAttribute.name)
					sb.append(claferAttrType(eAttribute))
					sb.newLine
				}
			}

			override protected greetReference(EReference eReference) {
				val eType = eReference.EType as EClass

				/* Enum tipi ise. */
				if (eType.enumMark != null) {
					val enumLiteralEClasses = eType.subClasses(root)

					enumLiteralEClasses.forEach [
						val literalName = name.toLowerCase.replace(eType.name.toLowerCase, "").replace(
							eReference.name.toLowerCase, "")
						println(literalName)
					]

				/* TODO Doldur. */
				} else {
					sb.newTab
					sb.append(eReference.name)
					sb.append(" : " + eType.name)
					sb.newLine
				}
			}

		}.walk

		return sb.toString
	}

	def newLine(StringBuilder sb) {
		sb.append("\n")
	}

	def newTab(StringBuilder sb) {
		sb.append("\t")
	}

	def claferAttrType(EAttribute eAttribute) {
		val type = eAttribute.EType
		if (type == EcorePackage.eINSTANCE.EInt) {
			return " : int"
		} else if (type == EcorePackage.eINSTANCE.EString) {
			return " : string"
		}

		return ""
	}

	def claferSuperType(EClass eClass) {
		val superTypes = eClass.ESuperTypes
		if (superTypes.size != 1) {
			return ""
		}

		return " : " + superTypes.get(0).name
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
}
