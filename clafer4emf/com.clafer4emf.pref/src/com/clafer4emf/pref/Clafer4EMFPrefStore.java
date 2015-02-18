package com.clafer4emf.pref;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;

public class Clafer4EMFPrefStore {
	public static Clafer4EMFPrefStore INSTANCE = new Clafer4EMFPrefStore();
	private IEclipsePreferences eclipsePreferences;

	protected Clafer4EMFPrefStore() {
		eclipsePreferences = InstanceScope.INSTANCE
				.getNode(Activator.PLUGIN_ID);
	}

	public String getTransformationStrategy() {
		return eclipsePreferences.get(PrefKeys.TRANSFORM_STRATEGY_KEY,
				PrefKeys.XTEND_VALUE);
	}
}
