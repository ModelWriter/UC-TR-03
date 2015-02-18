package com.clafer4emf.util.atl;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.osgi.framework.Bundle;

/**
 * Executes an ATL transformation. Uses .asm file.
 * 
 * @author akgun
 */
public abstract class AbstractATLRunner {

	/**
	 * Runs ATL transformation.
	 * 
	 * @param inputModelURI
	 *            - URI string to input model. For ex,
	 *            <code>platform:/plugin/Families2Persons/models/sample-Families.families</code>
	 * 
	 * @param outputModelURI
	 *            - URI string to output model. For ex,
	 *            <code>platform:/plugin/Families2Persons/models/sample-Persons.persons</code>
	 *            .
	 * @throws ATLCoreException
	 * @throws IOException
	 */
	public void run(URI inputModelURI, URI outputModelURI)
			throws ATLCoreException, IOException {
		final URL asmURL = getASMURL();

		IInjector injector = CoreService.getInjector("EMF");
		IExtractor extractor = CoreService.getExtractor("EMF");
		ModelFactory factory = CoreService.getModelFactory("EMF");

		/* Create input metamodel. */
		final IReferenceModel inputMetamodel = factory.newReferenceModel();
		injector.inject(inputMetamodel, inputMetamodelURI());

		/* Create output metamodel. */
		final IReferenceModel outputMetamodel = factory.newReferenceModel();
		injector.inject(outputMetamodel, outputMetamodelURI());

		/* Create input model and load from file. */
		final IModel inputModel = factory.newModel(inputMetamodel);
		injector.inject(inputModel, inputModelURI.toString());

		/* Create output model. */
		final IModel outputModel = factory.newModel(outputMetamodel);

		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM");
		launcher.initialize(Collections.<String, Object> emptyMap());

		launcher.addInModel(inputModel, "IN", inRefModelName());
		launcher.addOutModel(outputModel, "OUT", outRefModelName());

		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(),
				Collections.<String, Object> emptyMap(), asmURL.openStream());

		/* Save model. */
		extractor.extract(outputModel, outputModelURI.toString());
	}

	/**
	 * Gets .asm file in bundle.
	 * 
	 * @return asm file URL.
	 */
	protected URL getASMURL() {
		Bundle bundle = Platform.getBundle(bundleName());
		URL asmURL = bundle.getEntry(asmEntryName());

		return asmURL;
	}

	/**
	 * Variable for output model in ATL transformation. For ex,
	 * <code>Persons</code>.
	 * 
	 * @return Var.
	 */
	protected abstract String outRefModelName();

	/**
	 * Variable for input model in ATL transformation. For ex,
	 * <code>Families</code>.
	 * 
	 * @return Var.
	 */
	protected abstract String inRefModelName();

	/**
	 * Metamodel URI. For ex,
	 * <code>platform:/plugin/com.clafer4emf.metamodels.ecore/model/ecore.ecore</code>
	 * 
	 * @return URI string.
	 */
	protected abstract String outputMetamodelURI();

	/**
	 * Metamodel URI. For ex,
	 * <code>platform:/plugin/com.clafer4emf.metamodels.clafer/model/clafer.ecore</code>
	 * 
	 * @return URI string.
	 */
	protected abstract String inputMetamodelURI();

	/**
	 * ASM path in plugin.
	 * 
	 * @return path.
	 */
	protected abstract String asmEntryName();

	/**
	 * Plugin name.
	 * 
	 * @return plugin name.
	 */
	protected abstract String bundleName();
}
