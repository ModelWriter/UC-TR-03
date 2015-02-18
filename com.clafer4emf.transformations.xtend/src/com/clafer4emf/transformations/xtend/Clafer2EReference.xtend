package com.clafer4emf.transformations.xtend

import org.eclipse.emf.ecore.EReference
import com.clafer4emf.clafer.Clafer
import org.eclipse.emf.ecore.EcoreFactory
import java.util.Map
import org.eclipse.emf.ecore.EClass

class Clafer2EReference {

	def EReference transform(Clafer clafer, Map<Clafer, EClass> claferToEObjectMapping) {
		val eRef = EcoreFactory.eINSTANCE.createEReference
		eRef.name = clafer.name
		eRef.EType = claferToEObjectMapping.get(clafer)
		eRef.containment = if(clafer.CTarget != null) false else true

		val cardinality = clafer.CCardinality
		eRef.lowerBound = cardinality.min
		eRef.upperBound = cardinality.max

		return eRef
	}
}
