/**
 */
package com.clafer4emf.clafer.util;

import com.clafer4emf.clafer.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.clafer4emf.clafer.ClaferPackage
 * @generated
 */
public class ClaferAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClaferPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaferAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClaferPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaferSwitch<Adapter> modelSwitch =
		new ClaferSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseCElement(CElement object) {
				return createCElementAdapter();
			}
			@Override
			public Adapter caseClafer(Clafer object) {
				return createClaferAdapter();
			}
			@Override
			public Adapter caseClaferModel(ClaferModel object) {
				return createClaferModelAdapter();
			}
			@Override
			public Adapter caseCInterval(CInterval object) {
				return createCIntervalAdapter();
			}
			@Override
			public Adapter caseGCardInterval(GCardInterval object) {
				return createGCardIntervalAdapter();
			}
			@Override
			public Adapter caseCardInterval(CardInterval object) {
				return createCardIntervalAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.clafer4emf.clafer.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.clafer4emf.clafer.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.clafer4emf.clafer.CElement <em>CElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.clafer4emf.clafer.CElement
	 * @generated
	 */
	public Adapter createCElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.clafer4emf.clafer.Clafer <em>Clafer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.clafer4emf.clafer.Clafer
	 * @generated
	 */
	public Adapter createClaferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.clafer4emf.clafer.ClaferModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.clafer4emf.clafer.ClaferModel
	 * @generated
	 */
	public Adapter createClaferModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.clafer4emf.clafer.CInterval <em>CInterval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.clafer4emf.clafer.CInterval
	 * @generated
	 */
	public Adapter createCIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.clafer4emf.clafer.GCardInterval <em>GCard Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.clafer4emf.clafer.GCardInterval
	 * @generated
	 */
	public Adapter createGCardIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.clafer4emf.clafer.CardInterval <em>Card Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.clafer4emf.clafer.CardInterval
	 * @generated
	 */
	public Adapter createCardIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClaferAdapterFactory
