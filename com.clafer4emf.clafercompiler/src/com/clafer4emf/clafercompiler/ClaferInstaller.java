package com.clafer4emf.clafercompiler;

import com.clafer4emf.util.bundle.ProgramInstaller;
import com.clafer4emf.util.file.PathManager;

public class ClaferInstaller extends ProgramInstaller {

	public static final ClaferInstaller INSTANCE = new ClaferInstaller();

	@Override
	public String exePath() {
		return PathManager.create().folder(installationFolder().toString())
				.folder("clafer-tools").file("clafer.exe").getPath();
	}

	@Override
	public String folderName() {
		return ".clafer4emf";
	}

	@Override
	protected ClassLoader classLoader() {
		return getClass().getClassLoader();
	}

	@Override
	protected String resourcePath() {
		return "static/clafer-tools.zip";
	}
}
