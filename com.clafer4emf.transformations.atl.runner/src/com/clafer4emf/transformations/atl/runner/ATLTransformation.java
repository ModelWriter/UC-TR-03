package com.clafer4emf.transformations.atl.runner;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.m2m.atl.core.ATLCoreException;

import com.clafer4emf.clafer.ClaferModel;
import com.clafer4emf.clafer.ClaferPackage;
import com.clafer4emf.transformations.ITransformation;
import com.clafer4emf.util.emf.ModelIO;
import com.clafer4emf.util.file.TempFileFactory;

public class ATLTransformation implements ITransformation {

	@Override
	public void transform(ClaferModel claferModel, URI outputURI) {
		final TempFileFactory xmiFileFactory = new TempFileFactory() {

			@Override
			protected String fileExtension() {
				return ".xmi";
			}
		};

		final URI tempFileURI = xmiFileFactory.createURI();

		new ModelIO<ClaferModel>() {

			@Override
			protected void registerPackages(Registry packageRegistry) {
				packageRegistry.put(ClaferPackage.eNS_URI,
						ClaferPackage.eINSTANCE);
			}
		}.write(tempFileURI, claferModel);

		try {
			new ATLRunner().run(tempFileURI, outputURI);
		} catch (ATLCoreException | IOException e) {
			e.printStackTrace();
		}
	}
}
