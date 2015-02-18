package com.clafer4emf;

import java.io.File;

import org.clafer.ast.AstModel;
import org.clafer.collection.Triple;
import org.clafer.objective.Objective;
import org.clafer.scope.Scope;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

import com.clafer4emf.clafer.ClaferModel;
import com.clafer4emf.clafer.ClaferPackage;
import com.clafer4emf.clafercompiler.ClaferCompiler;
import com.clafer4emf.pref.Clafer4EMFPrefStore;
import com.clafer4emf.transformations.TransformationService;
import com.clafer4emf.util.emf.ModelIO;
import com.clafer4emf.util.file.FileManager;

public class Clafer4EMF {

	public void claferToEcore(File claferFile) throws Exception {
		final ClaferCompiler claferCompiler = new ClaferCompiler();
		final File chocoJSFile = claferCompiler.compileToChocoJS(claferFile);
		final Triple<AstModel, Scope, Objective[]> parsedModel = new Choco3BasedInstanceGenerator()
				.parse(chocoJSFile);
		final ClaferModel claferModel = new ClaferAstToClaferEcore()
				.transform(parsedModel);

		/* Save clafer model. */
		new ModelIO<ClaferModel>() {

			@Override
			protected void registerPackages(Registry packageRegistry) {
				packageRegistry.put(ClaferPackage.eNS_URI,
						ClaferPackage.eINSTANCE);
			}

		}.write(URI.createFileURI(newFileExtension(claferFile, ".clafer")),
				claferModel);

		TransformationService.INSTANCE.execute(getTransformationPref(),
				claferModel,
				URI.createFileURI(newFileExtension(claferFile, ".ecore")));
	}

	public void ecoreToClafer(File ecoreFile) {
		final EPackage ePackage = (EPackage) new ModelIO<EObject>().read(
				URI.createFileURI(ecoreFile.toString())).get(0);
		final String claferString = new Ecore2Clafer().transform(ePackage);
		FileManager.get().write(
				new File(newFileExtension(ecoreFile, ".ecore.cfr")),
				claferString);
	}

	public String newFileExtension(File claferFile, String extName) {
		String fileName = claferFile.getName();
		fileName = fileName.substring(0, fileName.lastIndexOf("."));

		return claferFile.getParent() + "/" + fileName + extName;
	}

	private String getTransformationPref() {
		return Clafer4EMFPrefStore.INSTANCE.getTransformationStrategy();
	}

	public void compile2Alloy(File claferFile) throws Exception {
		ClaferCompiler claferCompiler = new ClaferCompiler();
		claferCompiler.compileToAlloy(claferFile);
	}

	public void compileToDesugaredClafer(File claferFile) throws Exception {
		ClaferCompiler claferCompiler = new ClaferCompiler();
		claferCompiler.compileToDesugared(claferFile);
	}
}
