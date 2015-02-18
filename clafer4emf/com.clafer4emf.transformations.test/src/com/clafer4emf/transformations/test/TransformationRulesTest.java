package com.clafer4emf.transformations.test;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.clafer4emf.clafer.Clafer;
import com.clafer4emf.clafer.ClaferFactory;
import com.clafer4emf.clafer.ClaferModel;
import com.clafer4emf.transformations.xtend.ClaferModel2EPackage;
import com.clafer4emf.util.emf.ModelIO;

public class TransformationRulesTest {
	private static final URI MODEL_OUTPUT_URI = URI
			.createFileURI("C:/Users/akgun/git/clafer4emf/com.clafer4emf.transformations.test/test.ecore");

	@Test
	public void executeTest1() {
		ClaferModel model = ClaferFactory.eINSTANCE.createClaferModel();
		model.setName("Root");
		model.setIsAbstract(true);

		Clafer clafer = ClaferFactory.eINSTANCE.createClafer();
		clafer.setName("ClaferA");
		model.getCElements().add(clafer);

		EPackage ePackage = new ClaferModel2EPackage().transform(model);
		assertEquals("Root", ePackage.getName());

		EClassifier newClassifier = ePackage.getEClassifiers().get(0);
		assertEquals("ClaferA", ((EClass) newClassifier).getName());

		ModelIO<EObject> modelIO = new ModelIO<EObject>();
		modelIO.write(MODEL_OUTPUT_URI, ePackage);
	}
}
