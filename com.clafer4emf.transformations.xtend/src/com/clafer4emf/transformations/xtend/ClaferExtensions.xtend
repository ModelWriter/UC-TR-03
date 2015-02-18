package com.clafer4emf.transformations.xtend

import com.clafer4emf.clafer.Clafer
import com.clafer4emf.clafer.ClaferModel
import java.util.Stack
import java.util.HashMap
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EcorePackage

class ClaferExtensions {
	val final primitiveEcoreMapping = new HashMap<String, EDataType>

	new() {
		primitiveEcoreMapping.put("int", EcorePackage.eINSTANCE.EInt)
		primitiveEcoreMapping.put("string", EcorePackage.eINSTANCE.EString)
	}

	def allClafers(ClaferModel claferModel) {
		return allClafers(claferModel, [true])
	}

	def allClafers(ClaferModel claferModel, (Clafer)=>boolean predicate) {
		val allClafers = newLinkedList()
		val stack = new Stack<Clafer>
		stack.addAll(claferModel.CElements)

		while (!stack.empty()) {
			val top = stack.pop

			if (predicate.apply(top)) {
				allClafers.add(top)
			}

			stack.addAll(top.CElements)
		}

		return allClafers
	}

	def qName(Clafer clafer) {
		var parent = clafer.eContainer as Clafer
		val list = newLinkedList
		while (parent != null && !(parent instanceof ClaferModel)) {
			list.add(parent.name.toFirstUpper)

			parent = parent.eContainer as Clafer
		}

		list.add(0, clafer.name.toFirstUpper)

		list.reverse

		return list.join
	}

	def isRoot(Clafer clafer) {
		return clafer.eContainer instanceof ClaferModel
	}

	def isPrimitive(Clafer clafer) {
		return primitiveEcoreMapping.containsKey(clafer.name)
	}

	def getPrimitiveEDataType(Clafer clafer) {
		return primitiveEcoreMapping.get(clafer.name)
	}

	def getPrimitiveEDataType(String name) {
		return primitiveEcoreMapping.get(name.toLowerCase)
	}

	def containsPrimitiveEDataType(String name) {
		return primitiveEcoreMapping.containsKey(name.toLowerCase)
	}

	def isXor(Clafer clafer) {
		val gCard = clafer.CGroupCardinality

		if (gCard != null && gCard.min == 1 && gCard.max == 1) {
			return true
		}

		return false
	}

	def isOr(Clafer clafer) {
		val gCard = clafer.CGroupCardinality

		if (gCard != null && gCard.min == 1 && gCard.max == Integer.MAX_VALUE) {
			return true
		}

		return false
	}
}
