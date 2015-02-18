/**
 */
package com.clafer4emf.clafer.impl;

import com.clafer4emf.clafer.CardInterval;
import com.clafer4emf.clafer.Clafer;
import com.clafer4emf.clafer.ClaferPackage;
import com.clafer4emf.clafer.GCardInterval;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clafer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.clafer4emf.clafer.impl.ClaferImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.impl.ClaferImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.impl.ClaferImpl#getCElements <em>CElements</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.impl.ClaferImpl#getCSuper <em>CSuper</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.impl.ClaferImpl#getCTarget <em>CTarget</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.impl.ClaferImpl#getCCardinality <em>CCardinality</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.impl.ClaferImpl#getCGroupCardinality <em>CGroup Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaferImpl extends CElementImpl implements Clafer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCElements() <em>CElements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Clafer> cElements;

	/**
	 * The cached value of the '{@link #getCSuper() <em>CSuper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSuper()
	 * @generated
	 * @ordered
	 */
	protected Clafer cSuper;

	/**
	 * The cached value of the '{@link #getCTarget() <em>CTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTarget()
	 * @generated
	 * @ordered
	 */
	protected Clafer cTarget;

	/**
	 * The cached value of the '{@link #getCCardinality() <em>CCardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardInterval cCardinality;

	/**
	 * The cached value of the '{@link #getCGroupCardinality() <em>CGroup Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCGroupCardinality()
	 * @generated
	 * @ordered
	 */
	protected GCardInterval cGroupCardinality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClaferPackage.Literals.CLAFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clafer> getCElements() {
		if (cElements == null) {
			cElements = new EObjectContainmentEList<Clafer>(Clafer.class, this, ClaferPackage.CLAFER__CELEMENTS);
		}
		return cElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clafer getCSuper() {
		if (cSuper != null && cSuper.eIsProxy()) {
			InternalEObject oldCSuper = (InternalEObject)cSuper;
			cSuper = (Clafer)eResolveProxy(oldCSuper);
			if (cSuper != oldCSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClaferPackage.CLAFER__CSUPER, oldCSuper, cSuper));
			}
		}
		return cSuper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clafer basicGetCSuper() {
		return cSuper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSuper(Clafer newCSuper) {
		Clafer oldCSuper = cSuper;
		cSuper = newCSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__CSUPER, oldCSuper, cSuper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clafer getCTarget() {
		if (cTarget != null && cTarget.eIsProxy()) {
			InternalEObject oldCTarget = (InternalEObject)cTarget;
			cTarget = (Clafer)eResolveProxy(oldCTarget);
			if (cTarget != oldCTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClaferPackage.CLAFER__CTARGET, oldCTarget, cTarget));
			}
		}
		return cTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clafer basicGetCTarget() {
		return cTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTarget(Clafer newCTarget) {
		Clafer oldCTarget = cTarget;
		cTarget = newCTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__CTARGET, oldCTarget, cTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardInterval getCCardinality() {
		return cCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCCardinality(CardInterval newCCardinality, NotificationChain msgs) {
		CardInterval oldCCardinality = cCardinality;
		cCardinality = newCCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__CCARDINALITY, oldCCardinality, newCCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCardinality(CardInterval newCCardinality) {
		if (newCCardinality != cCardinality) {
			NotificationChain msgs = null;
			if (cCardinality != null)
				msgs = ((InternalEObject)cCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClaferPackage.CLAFER__CCARDINALITY, null, msgs);
			if (newCCardinality != null)
				msgs = ((InternalEObject)newCCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClaferPackage.CLAFER__CCARDINALITY, null, msgs);
			msgs = basicSetCCardinality(newCCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__CCARDINALITY, newCCardinality, newCCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCardInterval getCGroupCardinality() {
		return cGroupCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCGroupCardinality(GCardInterval newCGroupCardinality, NotificationChain msgs) {
		GCardInterval oldCGroupCardinality = cGroupCardinality;
		cGroupCardinality = newCGroupCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__CGROUP_CARDINALITY, oldCGroupCardinality, newCGroupCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCGroupCardinality(GCardInterval newCGroupCardinality) {
		if (newCGroupCardinality != cGroupCardinality) {
			NotificationChain msgs = null;
			if (cGroupCardinality != null)
				msgs = ((InternalEObject)cGroupCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClaferPackage.CLAFER__CGROUP_CARDINALITY, null, msgs);
			if (newCGroupCardinality != null)
				msgs = ((InternalEObject)newCGroupCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClaferPackage.CLAFER__CGROUP_CARDINALITY, null, msgs);
			msgs = basicSetCGroupCardinality(newCGroupCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClaferPackage.CLAFER__CGROUP_CARDINALITY, newCGroupCardinality, newCGroupCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClaferPackage.CLAFER__CELEMENTS:
				return ((InternalEList<?>)getCElements()).basicRemove(otherEnd, msgs);
			case ClaferPackage.CLAFER__CCARDINALITY:
				return basicSetCCardinality(null, msgs);
			case ClaferPackage.CLAFER__CGROUP_CARDINALITY:
				return basicSetCGroupCardinality(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClaferPackage.CLAFER__NAME:
				return getName();
			case ClaferPackage.CLAFER__IS_ABSTRACT:
				return isIsAbstract();
			case ClaferPackage.CLAFER__CELEMENTS:
				return getCElements();
			case ClaferPackage.CLAFER__CSUPER:
				if (resolve) return getCSuper();
				return basicGetCSuper();
			case ClaferPackage.CLAFER__CTARGET:
				if (resolve) return getCTarget();
				return basicGetCTarget();
			case ClaferPackage.CLAFER__CCARDINALITY:
				return getCCardinality();
			case ClaferPackage.CLAFER__CGROUP_CARDINALITY:
				return getCGroupCardinality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClaferPackage.CLAFER__NAME:
				setName((String)newValue);
				return;
			case ClaferPackage.CLAFER__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ClaferPackage.CLAFER__CELEMENTS:
				getCElements().clear();
				getCElements().addAll((Collection<? extends Clafer>)newValue);
				return;
			case ClaferPackage.CLAFER__CSUPER:
				setCSuper((Clafer)newValue);
				return;
			case ClaferPackage.CLAFER__CTARGET:
				setCTarget((Clafer)newValue);
				return;
			case ClaferPackage.CLAFER__CCARDINALITY:
				setCCardinality((CardInterval)newValue);
				return;
			case ClaferPackage.CLAFER__CGROUP_CARDINALITY:
				setCGroupCardinality((GCardInterval)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClaferPackage.CLAFER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClaferPackage.CLAFER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ClaferPackage.CLAFER__CELEMENTS:
				getCElements().clear();
				return;
			case ClaferPackage.CLAFER__CSUPER:
				setCSuper((Clafer)null);
				return;
			case ClaferPackage.CLAFER__CTARGET:
				setCTarget((Clafer)null);
				return;
			case ClaferPackage.CLAFER__CCARDINALITY:
				setCCardinality((CardInterval)null);
				return;
			case ClaferPackage.CLAFER__CGROUP_CARDINALITY:
				setCGroupCardinality((GCardInterval)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClaferPackage.CLAFER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClaferPackage.CLAFER__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ClaferPackage.CLAFER__CELEMENTS:
				return cElements != null && !cElements.isEmpty();
			case ClaferPackage.CLAFER__CSUPER:
				return cSuper != null;
			case ClaferPackage.CLAFER__CTARGET:
				return cTarget != null;
			case ClaferPackage.CLAFER__CCARDINALITY:
				return cCardinality != null;
			case ClaferPackage.CLAFER__CGROUP_CARDINALITY:
				return cGroupCardinality != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ClaferImpl
