package com.clafer4emf

import com.clafer4emf.clafer.Clafer
import com.clafer4emf.clafer.ClaferFactory
import com.clafer4emf.clafer.ClaferModel
import java.util.HashMap
import java.util.Map
import java.util.Stack
import org.clafer.ast.AstAbstractClafer
import org.clafer.ast.AstClafer
import org.clafer.ast.AstConcreteClafer
import org.clafer.ast.AstModel
import org.clafer.collection.Triple
import org.clafer.objective.Objective
import org.clafer.scope.Scope

/**
 * @author akgun
 */
class ClaferAstToClaferEcore {
	val Map<AstClafer, Clafer> astClaferToClaferMapping = new HashMap

	def ClaferModel transform(Triple<AstModel, Scope, Objective[]> triple) {
		val astModel = triple.fst

		val claferModel = ClaferFactory.eINSTANCE.createClaferModel
		claferModel.name = "clafer"

		val abstracts = astModel.abstracts
		val children = astModel.children
		val stack = new Stack<AstClafer>

		stack.addAll(abstracts)
		stack.addAll(children)

		/* Stack bosalana kadar devam. */
		while (!stack.empty()) {
			val top = stack.pop

			/* Gecelim mi? */
			if (!shouldSkip(top) && !astClaferToClaferMapping.containsKey(top)) {
				val clafer = top.asClafer
				claferModel.CElements.add(clafer)

				/* Eslestirmeyi hatirla. */
				astClaferToClaferMapping.put(top, clafer)

				stack.addAll(top.children)

				/* Ref tipleri de topla. */
				if (top.ref != null) {
					stack.add(top.ref.targetType)
				}
			}
		}

		/* Ref tipleri bagla. */
		setRefTypes()

		/* Children'lari dogru yerlere koy. */
		setChildren()

		/* Super tipleri bagla. */
		setSuperTypes()

		if (claferModel.CElements == null || claferModel.CElements.empty) {
			throw new RuntimeException("ClaferModel bos. Concrete Clafer var mi?")
		}

		return claferModel
	}

	def setRefTypes() {
		astClaferToClaferMapping.forEach [ astClafer, clafer |
			/* Ref (->) varsa. */
			if (astClafer.ref != null && astClafer.ref.unique) {
				var refClafer = astClaferToClaferMapping.get(astClafer.ref.targetType)
				clafer.CTarget = refClafer
			}
		]
	}

	def setChildren() {
		astClaferToClaferMapping.forEach [ astClafer, clafer |
			astClafer.children.forEach [ childClafer |
				clafer.CElements.add(astClaferToClaferMapping.get(childClafer))
			]
		]
	}

	def setSuperTypes() {
		astClaferToClaferMapping.forEach [ astClafer, clafer |
			if (astClafer.ref != null) {

				/* ':' iliskileri icin */
				if (astClafer.ref.unique == false) {
					val target = astClafer.ref.targetType
					val cl = astClaferToClaferMapping.get(target)
					clafer.CSuper = cl
				}
			} else {
				clafer.CSuper = astClaferToClaferMapping.get(astClafer.superClafer)
			}
		]
	}

	def dispatch asClafer(AstClafer astClafer) {
		val clafer = ClaferFactory.eINSTANCE.createClafer
		clafer.name = astClafer.name

		return clafer
	}

	def dispatch asClafer(AstAbstractClafer astAbstractClafer) {
		val clafer = ClaferFactory.eINSTANCE.createClafer
		clafer.name = astAbstractClafer.claferName
		clafer.isAbstract = true

		/* Group cardinality yarat. */
		var claferGCard = ClaferFactory.eINSTANCE.createGCardInterval
		clafer.CGroupCardinality = claferGCard

		claferGCard.min = astAbstractClafer.groupCard.low
		claferGCard.max = if (astAbstractClafer.groupCard.high == Integer.MAX_VALUE) -1 else astAbstractClafer.groupCard.high

		return clafer
	}

	def dispatch asClafer(AstConcreteClafer astConcreteClafer) {
		val clafer = ClaferFactory.eINSTANCE.createClafer
		clafer.name = astConcreteClafer.claferName

		/* Group cardinality yarat. */
		var claferGCard = ClaferFactory.eINSTANCE.createGCardInterval
		clafer.CGroupCardinality = claferGCard

		/* Cardinality yarat. */
		var claferCard = ClaferFactory.eINSTANCE.createCardInterval
		clafer.CCardinality = claferCard

		claferGCard.min = astConcreteClafer.groupCard.low
		claferGCard.max = if (astConcreteClafer.groupCard.high == Integer.MAX_VALUE) -1 else astConcreteClafer.groupCard.high 
		

		claferCard.min = astConcreteClafer.card.low
		claferCard.max = if (astConcreteClafer.card.high == Integer.MAX_VALUE) -1 else astConcreteClafer.card.high

		return clafer
	}

	/**
	 * Parse c0_Student to Student.
	 * 
	 * @param clafer
	 *            Clafer.
	 * @return Name.
	 */
	def getClaferName(AstClafer clafer) {
		val name = clafer.name
		val index = name.indexOf("_")

		/* Bulunamazsa olani dondur. */
		if (index == -1) {
			return name
		}

		return name.substring(index + 1)
	}

	def shouldSkip(AstClafer astClafer) {
		if (astClafer.name == "#clafer#") {
			return true
		}

		return false
	}
}
