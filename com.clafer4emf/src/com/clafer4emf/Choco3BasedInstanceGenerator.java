package com.clafer4emf;

import java.io.File;
import java.io.IOException;

import org.clafer.ast.AstModel;
import org.clafer.collection.Triple;
import org.clafer.javascript.Javascript;
import org.clafer.objective.Objective;
import org.clafer.scope.Scope;

public class Choco3BasedInstanceGenerator {

	public Triple<AstModel, Scope, Objective[]> parse(File chocoJSFile)
			throws IOException {
		final Triple<AstModel, Scope, Objective[]> model = Javascript
				.readModel(chocoJSFile);

		return model;
	}

	public Triple<AstModel, Scope, Objective[]> parse(String chocoJSFile)
			throws IOException {

		return parse(new File(chocoJSFile));
	}
}
