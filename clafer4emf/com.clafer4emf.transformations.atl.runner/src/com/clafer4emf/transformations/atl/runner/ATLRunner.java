package com.clafer4emf.transformations.atl.runner;

import com.clafer4emf.util.atl.AbstractATLRunner;

public class ATLRunner extends AbstractATLRunner {

	@Override
	protected String outRefModelName() {
		return "ECORE";
	}

	@Override
	protected String inRefModelName() {
		return "CLAFER";
	}

	@Override
	protected String outputMetamodelURI() {
		return "platform:/plugin/com.clafer4emf.metamodels.ecore/model/ecore.ecore";
	}

	@Override
	protected String inputMetamodelURI() {
		return "platform:/plugin/com.clafer4emf.metamodels.clafer/model/clafer.ecore";
	}

	@Override
	protected String asmEntryName() {
		return "transformation/transformation.asm";
	}

	@Override
	protected String bundleName() {
		return "com.clafer4emf.transformations.atl";
	}
}
