/**
 */
package com.clafer4emf.clafer.provider;

import com.clafer4emf.clafer.CardInterval;
import com.clafer4emf.clafer.Clafer;
import com.clafer4emf.clafer.ClaferFactory;
import com.clafer4emf.clafer.ClaferPackage;
import com.clafer4emf.clafer.GCardInterval;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.clafer4emf.clafer.Clafer}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClaferItemProvider extends CElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClaferItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addCSuperPropertyDescriptor(object);
			addCTargetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Clafer_name_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Clafer_name_feature", "_UI_Clafer_type"),
				ClaferPackage.Literals.CLAFER__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Clafer_isAbstract_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Clafer_isAbstract_feature", "_UI_Clafer_type"),
				ClaferPackage.Literals.CLAFER__IS_ABSTRACT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the CSuper feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCSuperPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Clafer_cSuper_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Clafer_cSuper_feature", "_UI_Clafer_type"),
				ClaferPackage.Literals.CLAFER__CSUPER, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the CTarget feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Clafer_cTarget_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Clafer_cTarget_feature", "_UI_Clafer_type"),
				ClaferPackage.Literals.CLAFER__CTARGET, true, false, true,
				null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ClaferPackage.Literals.CLAFER__CELEMENTS);
			childrenFeatures.add(ClaferPackage.Literals.CLAFER__CCARDINALITY);
			childrenFeatures
					.add(ClaferPackage.Literals.CLAFER__CGROUP_CARDINALITY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Clafer.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Clafer"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> abstract 0 .. * c0_Web : c0_NamedElement 0 .. *
	 */
	@Override
	public String getText(Object object) {
		Clafer clafer = ((Clafer) object);
		String name = getName(clafer);
		String gCard = getGroupCardinalityStr(clafer);
		String card = getCardinalityStr(clafer);
		String abst = getAbstractStr(clafer);
		String cSuper = getSuperStr(clafer);
		String cTarget = getTargetStr(clafer);

		if (clafer.getName() == null || clafer.getName().length() == 0)
			return getString("_UI_Clafer_type");

		return abst + gCard + name + cSuper + cTarget + card;
	}

	private String getAbstractStr(Clafer clafer) {
		return clafer.isIsAbstract() ? "abstract " : "";
	}

	private String getGroupCardinalityStr(Clafer clafer) {
		final GCardInterval groupCardinality = clafer.getCGroupCardinality();
		if (groupCardinality == null) {
			return "";
		}

		int min = groupCardinality.getMin();
		int max = groupCardinality.getMax();

		/* Default cardinality. */
		if (min == 0 && (max == -1 || max == Integer.MAX_VALUE)) {
			return "";
		}

		return String.format("%s..%s ", min, max == Integer.MAX_VALUE
				|| max == -1 ? "*" : max);
	}

	private String getName(Clafer clafer) {
		return String.format("%s ", clafer.getName());
	}

	private String getSuperStr(Clafer clafer) {
		return clafer.getCSuper() != null ? ": " + clafer.getCSuper().getName()
				+ " " : "";
	}

	private String getTargetStr(Clafer clafer) {
		return clafer.getCTarget() != null ? "-> "
				+ clafer.getCTarget().getName() + " " : "";
	}

	private String getCardinalityStr(Clafer clafer) {
		final CardInterval cCardinality = clafer.getCCardinality();
		if (cCardinality == null) {
			return "";
		}

		int min = cCardinality.getMin();
		int max = cCardinality.getMax();

		/* Default cardinality. */
		if (min == 1 && max == 1) {
			return "";
		}

		return String.format("%s..%s", min, max == Integer.MAX_VALUE
				|| max == -1 ? "*" : max);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Clafer.class)) {
		case ClaferPackage.CLAFER__NAME:
		case ClaferPackage.CLAFER__IS_ABSTRACT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case ClaferPackage.CLAFER__CELEMENTS:
		case ClaferPackage.CLAFER__CCARDINALITY:
		case ClaferPackage.CLAFER__CGROUP_CARDINALITY:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				ClaferPackage.Literals.CLAFER__CELEMENTS,
				ClaferFactory.eINSTANCE.createClafer()));

		newChildDescriptors.add(createChildParameter(
				ClaferPackage.Literals.CLAFER__CELEMENTS,
				ClaferFactory.eINSTANCE.createClaferModel()));

		newChildDescriptors.add(createChildParameter(
				ClaferPackage.Literals.CLAFER__CCARDINALITY,
				ClaferFactory.eINSTANCE.createCardInterval()));

		newChildDescriptors.add(createChildParameter(
				ClaferPackage.Literals.CLAFER__CGROUP_CARDINALITY,
				ClaferFactory.eINSTANCE.createGCardInterval()));
	}

}
