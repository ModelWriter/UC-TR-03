package com.clafer4emf.clafercompiler;

import java.io.File;

public class ClaferCompiler {

	public File compile(File claferFile, String mode) throws Exception {
		final String claferFileStr = claferFile.toString();

		//TODO: clafer -k -m=choco s6.cfr --meta-data
		final Process compilerProcess = Runtime.getRuntime().exec(
				String.format("%s -k -m=%s %s", getClaferProgramPath(), mode,
						claferFileStr));
		compilerProcess.waitFor();

		if (compilerProcess.exitValue() != 0) {
			throw new Exception(
					"Clafer compilation error: make sure your model is correct. Aborting...");
		}

		int extensionIndex = claferFileStr.lastIndexOf(".");
		if (extensionIndex != -1) {
			return new File(claferFileStr.substring(0, extensionIndex) + ".js");
		} else {
			throw new Exception("Extension not found.");
		}
	}

	public File compileToChocoJS(File claferFile) throws Exception {
		return compile(claferFile, "choco");
	}

	public File compileToDesugared(File claferFile) throws Exception {
		return compile(claferFile, "clafer");
	}

	public File compileToAlloy(File claferFile) throws Exception {
		return compile(claferFile, "alloy42");
	}

	public String getClaferProgramPath() {
		ClaferInstaller.INSTANCE.tryInstall();

		return ClaferInstaller.INSTANCE.exePath();
	}
}
