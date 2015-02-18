package com.clafer4emf.util.ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Walker {
	private EPackage root;

	public Walker(EPackage root) {
		setRoot(root);
	}

	public void walk() {
		if (getRoot() == null) {
			throw new RuntimeException("Root null.");
		}

		greetPackage(getRoot());
	}

	public void setRoot(EPackage root) {
		this.root = root;
	}

	public EPackage getRoot() {
		return root;
	}

	protected void greetPackage(EPackage ePackage) {
		EList<EPackage> eSubpackages = ePackage.getESubpackages();

		/*
		 * Alt paketler varsa onlari gez (Deep first).
		 */
		if (eSubpackages != null && !eSubpackages.isEmpty()) {
			for (EPackage s : eSubpackages) {
				greetPackage(s);
			}
		}

		EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
		for (EClassifier eClassifier : eClassifiers) {
			greetClassifier(eClassifier);
		}
	}

	protected void greetClassifier(EClassifier eClassifier) {
		if (eClassifier instanceof EClass) {
			greetClass((EClass) eClassifier);
		} else if (eClassifier instanceof EEnum) {
			greetEnum((EEnum) eClassifier);
		} else {
			throw new RuntimeException("EClassifier tipi eslesmiyor. Tip: "
					+ eClassifier.toString());
		}
	}

	protected void greetClass(EClass eClass) {
		EList<EStructuralFeature> eStructuralFeatures = eClass
				.getEStructuralFeatures();

		for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
			greetStructuralFeature(eStructuralFeature);
		}
	}

	protected void greetEnum(EEnum eEnum) {
		EList<EEnumLiteral> eLiterals = eEnum.getELiterals();

		for (EEnumLiteral eEnumLiteral : eLiterals) {
			greetEnumLiteral(eEnumLiteral);
		}
	}

	protected void greetEnumLiteral(EEnumLiteral eEnumLiteral) {
	}

	protected void greetStructuralFeature(EStructuralFeature eStructuralFeature) {
		if (eStructuralFeature instanceof EAttribute) {
			greetAttribute((EAttribute) eStructuralFeature);
		} else if (eStructuralFeature instanceof EReference) {
			greetReference((EReference) eStructuralFeature);
		} else {
			throw new RuntimeException(
					"EStructuralFeature tipi eslesmiyor. Tip: "
							+ eStructuralFeature.toString());
		}
	}

	protected void greetAttribute(EAttribute eAttribute) {
	}

	protected void greetReference(EReference eReference) {
	}
}
