package com.clafer4emf.util.plugin;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IWorkbenchWindow;

public abstract class AbstractJob extends WorkbenchSelector {

	public AbstractJob(IWorkbenchWindow activeWindow) {
		super(activeWindow);
	}

	public AbstractJob(URI originURI) {
		super(originURI);
	}

	public void execute() {
		Job job = new Job(jobName()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					delay();

					/* Esas kodlari calistir. */
					IStatus status = runInsideJob(monitor);

					delay();

					monitor.done();

					/* Is bitince cagir. */
					onJobFinished();

					return status;
				} catch (Exception e) {
					e.printStackTrace();
					return Status.CANCEL_STATUS;
				}
			}
		};
		job.setUser(true);
		job.schedule();
	}

	protected void delay() {
		try {
			Thread.sleep(delayDuration());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected long delayDuration() {
		return 400;
	}

	/**
	 * Job calismasi bitince cagirilir.
	 */
	protected void onJobFinished() {
		refresh();
	}

	/**
	 * Projeyi yeniler. Boylece yeni yaratilan dosya varsa gorunur.
	 */
	protected void refresh() {
		try {
			getSelectionProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Job icerisinde calistirilir.
	 * 
	 * @param monitor
	 * 
	 * @return
	 */
	protected abstract IStatus runInsideJob(IProgressMonitor monitor);

	/**
	 * Job adini verir.
	 * 
	 * @return Job adi.
	 */
	protected abstract String jobName();
}
