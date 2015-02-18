package com.clafer4emf.transformations;

import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;

import com.clafer4emf.clafer.ClaferModel;

public class TransformationService {
	static final Logger LOG = Logger.getLogger(TransformationService.class
			.getName());
	public static TransformationService INSTANCE = new TransformationService();
	public static final String EXTENSION_POINT_ID = "com.clafer4emf.transformations.point";

	public void execute(ITransformation transformation,
			ClaferModel claferModel, URI outputURI) {
		LOG.info("Executing transformation: " + transformation);
		transformation.transform(claferModel, outputURI);
	}

	public void execute(String transformationId, ClaferModel claferModel,
			URI outputURI) {
		ITransformation transformation = get(transformationId);
		if (transformation == null) {
			throw new RuntimeException(
					"No transformation extension found. Transformation id: "
							+ transformationId);
		}

		execute(transformation, claferModel, outputURI);
	}

	public ITransformation get(String id) {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] extensions = reg
				.getConfigurationElementsFor(EXTENSION_POINT_ID);

		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement transformationExt = extensions[i];

			try {
				ITransformation transformation = (ITransformation) transformationExt
						.createExecutableExtension("class");
				String transformationId = transformationExt.getAttribute("id");
				if (transformationId.equals(id)) {
					return transformation;
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		LOG.warning("No transformation extension found. Transformation id: "
				+ id);

		return null;
	}
}
