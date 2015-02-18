package com.clafer4emf.util.bundle;

import java.io.File;

import com.clafer4emf.util.file.FileCopier;
import com.clafer4emf.util.file.TempFileFactory;
import com.clafer4emf.util.file.ZipUtil;
import com.clafer4emf.util.resource.BundleUtil;

public abstract class Installer {

	public void install() {
		File resourceFile = BundleUtil.INSTANCE.getResource(classLoader(),
				resourcePath());
		File tempFile = TempFileFactory.INSTANCE
				.createFile(resourceExtension());
		FileCopier.INSTANCE.copy(resourceFile, tempFile);
		ZipUtil.INSTANCE.unzip(tempFile, installationFolder());
	}

	protected abstract ClassLoader classLoader();

	protected String resourceExtension() {
		return "zip";
	}

	/**
	 * Plugin projesi icerisindeki resource path'i. Ornegin
	 * <code>static/my_program.zip</code>. <code>static</code> sadece bir
	 * klasor.
	 *
	 * @return Resource path.
	 */
	protected abstract String resourcePath();

	protected abstract File installationFolder();
}
