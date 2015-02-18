package com.clafer4emf.transformations;

import org.eclipse.emf.common.util.URI;

import com.clafer4emf.clafer.ClaferModel;

public interface ITransformation {

	void transform(ClaferModel claferModel, URI outputURI);
}
