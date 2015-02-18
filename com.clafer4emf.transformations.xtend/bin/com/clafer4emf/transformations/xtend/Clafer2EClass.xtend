package com.clafer4emf.transformations.xtend

import com.clafer4emf.clafer.Clafer
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcoreFactory

class Clafer2EClass extends BaseTransformation {

	def EClass transform(Clafer in) {
		val eClass = EcoreFactory.eINSTANCE.createEClass
		eClass.name = in.qName
		eClass.abstract = in.isAbstract

		return eClass
	}
}
