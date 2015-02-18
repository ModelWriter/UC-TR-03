package com.clafer4emf.pref.pages;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.clafer4emf.pref.Activator;
import com.clafer4emf.pref.PrefKeys;

public class Clafer4EMFPrefPage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public Clafer4EMFPrefPage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		createTransformStrategyPref();
	}

	private void createTransformStrategyPref() {
		final String entries[][] = {
				{ PrefKeys.XTEND_KEY, PrefKeys.XTEND_VALUE },
				{ PrefKeys.ATL_KEY, PrefKeys.ATL_VALUE } };
		ComboFieldEditor transformStrategyCombo = new ComboFieldEditor(
				PrefKeys.TRANSFORM_STRATEGY_KEY,
				PrefKeys.TRANSFORM_STRATEGY_LABEL, entries,
				getFieldEditorParent());
		addField(transformStrategyCombo);
	}
}
