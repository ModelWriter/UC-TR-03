package com.clafer4emf.command.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PlatformUI;

import com.clafer4emf.Clafer4EMF;
import com.clafer4emf.util.plugin.AbstractJob;

public class GenerateDesugaredClaferHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		new AbstractJob(PlatformUI.getWorkbench().getActiveWorkbenchWindow()) {

			@Override
			protected IStatus runInsideJob(IProgressMonitor monitor) {
				IFile iFile = getIFileSelection().get(0);

				try {
					new Clafer4EMF().compileToDesugaredClafer(iFile
							.getLocation().toFile());

					return Status.OK_STATUS;
				} catch (Exception e) {
					e.printStackTrace();

					return new Status(IStatus.ERROR, "com.clafer4emf",
							e.getMessage());
				}
			}

			@Override
			protected String jobName() {
				return "Generating Desugared Clafer";
			}
		}.execute();

		return null;
	}
}
