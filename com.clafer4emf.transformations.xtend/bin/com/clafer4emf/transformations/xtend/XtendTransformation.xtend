package com.clafer4emf.transformations.xtend

import com.clafer4emf.clafer.ClaferModel
import com.clafer4emf.transformations.ITransformation
import org.eclipse.emf.common.util.URI
import com.clafer4emf.util.emf.ModelIO
import org.eclipse.emf.ecore.EObject

class XtendTransformation implements ITransformation {

	override transform(ClaferModel claferModel, URI outputURI) {
		val ePackage = new ClaferModel2EPackage().transform(claferModel)
		new ModelIO<EObject>().write(outputURI, ePackage)
	}
}
