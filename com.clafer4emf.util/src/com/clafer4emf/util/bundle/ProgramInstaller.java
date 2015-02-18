package com.clafer4emf.util.bundle;

import java.io.File;

import com.clafer4emf.util.file.PathManager;

public abstract class ProgramInstaller extends Installer {

	/**
	 * Program yuklu degilse, yukler.
	 */
	public void tryInstall() {
		if (!shouldInstall()) {
			return;
		}

		install();
	}

	public boolean shouldInstall() {
		return !new File(exePath()).exists();
	}

	/**
	 * Program exe path.
	 * 
	 * @return Path to the exe file.
	 */
	public abstract String exePath();

	/**
	 * 
	 * @return Folder name to be installed.
	 */
	public abstract String folderName();

	@Override
	protected File installationFolder() {
		return new File(PathManager.create().home().folder(folderName())
				.build());
	}
}
