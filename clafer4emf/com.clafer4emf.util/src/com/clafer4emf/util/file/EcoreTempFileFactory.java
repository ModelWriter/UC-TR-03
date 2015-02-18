package com.clafer4emf.util.file;

public class EcoreTempFileFactory extends TempFileFactory {
	public static final EcoreTempFileFactory INSTANCE = new EcoreTempFileFactory();

	@Override
	protected String fileExtension() {
		return ".ecore";
	}
}
