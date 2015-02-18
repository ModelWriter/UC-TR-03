package com.clafer4emf.util.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class PackageQNameBuilder {

	protected abstract String seperator();

	public String getPackageQName(EPackage ePackage) {
		if (ePackage == null) {
			return "";
		}
		List<EPackage> ePackageList = new ArrayList<>();

		do {
			ePackageList.add(ePackage);
			ePackage = ePackage.getESuperPackage();
		} while (ePackage != null);

		StringBuilder sb = new StringBuilder();
		for (EPackage p : ePackageList) {
			sb.append(p.getName());
			sb.append(seperator());
		}

		String packageName = sb.toString();
		int lastIndexOf = packageName.lastIndexOf(seperator());
		if (lastIndexOf > 0) {
			packageName = packageName.substring(0, lastIndexOf);
		}

		return packageName;
	}

	public String getPackageQName(EClassifier classifier) {
		EPackage ePackage = classifier.getEPackage();

		return getPackageQName(ePackage);
	}

	public String getPackageQName(EStructuralFeature eStructuralFeature) {
		return getPackageQName(eStructuralFeature.getEContainingClass());
	}

	public String getPackageQName(EEnumLiteral eEnumLiteral) {
		return getPackageQName(eEnumLiteral.getEEnum());
	}
}
