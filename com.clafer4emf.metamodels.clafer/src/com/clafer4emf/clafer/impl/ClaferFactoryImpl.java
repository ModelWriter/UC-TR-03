/**
 */
package com.clafer4emf.clafer.impl;

import com.clafer4emf.clafer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaferFactoryImpl extends EFactoryImpl implements ClaferFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClaferFactory init() {
		try {
			ClaferFactory theClaferFactory = (ClaferFactory)EPackage.Registry.INSTANCE.getEFactory(ClaferPackage.eNS_URI);
			if (theClaferFactory != null) {
				return theClaferFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClaferFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaferFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClaferPackage.CLAFER: return createClafer();
			case ClaferPackage.CLAFER_MODEL: return createClaferModel();
			case ClaferPackage.GCARD_INTERVAL: return createGCardInterval();
			case ClaferPackage.CARD_INTERVAL: return createCardInterval();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clafer createClafer() {
		ClaferImpl clafer = new ClaferImpl();
		return clafer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaferModel createClaferModel() {
		ClaferModelImpl claferModel = new ClaferModelImpl();
		return claferModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCardInterval createGCardInterval() {
		GCardIntervalImpl gCardInterval = new GCardIntervalImpl();
		return gCardInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardInterval createCardInterval() {
		CardIntervalImpl cardInterval = new CardIntervalImpl();
		return cardInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaferPackage getClaferPackage() {
		return (ClaferPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClaferPackage getPackage() {
		return ClaferPackage.eINSTANCE;
	}

} //ClaferFactoryImpl
