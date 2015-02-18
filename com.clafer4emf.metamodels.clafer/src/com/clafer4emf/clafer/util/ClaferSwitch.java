/**
 */
package com.clafer4emf.clafer.util;

import com.clafer4emf.clafer.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.clafer4emf.clafer.ClaferPackage
 * @generated
 */
public class ClaferSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClaferPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaferSwitch() {
		if (modelPackage == null) {
			modelPackage = ClaferPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClaferPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClaferPackage.CELEMENT: {
				CElement cElement = (CElement)theEObject;
				T result = caseCElement(cElement);
				if (result == null) result = caseElement(cElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClaferPackage.CLAFER: {
				Clafer clafer = (Clafer)theEObject;
				T result = caseClafer(clafer);
				if (result == null) result = caseCElement(clafer);
				if (result == null) result = caseElement(clafer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClaferPackage.CLAFER_MODEL: {
				ClaferModel claferModel = (ClaferModel)theEObject;
				T result = caseClaferModel(claferModel);
				if (result == null) result = caseClafer(claferModel);
				if (result == null) result = caseCElement(claferModel);
				if (result == null) result = caseElement(claferModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClaferPackage.CINTERVAL: {
				CInterval cInterval = (CInterval)theEObject;
				T result = caseCInterval(cInterval);
				if (result == null) result = caseCElement(cInterval);
				if (result == null) result = caseElement(cInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClaferPackage.GCARD_INTERVAL: {
				GCardInterval gCardInterval = (GCardInterval)theEObject;
				T result = caseGCardInterval(gCardInterval);
				if (result == null) result = caseCInterval(gCardInterval);
				if (result == null) result = caseCElement(gCardInterval);
				if (result == null) result = caseElement(gCardInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClaferPackage.CARD_INTERVAL: {
				CardInterval cardInterval = (CardInterval)theEObject;
				T result = caseCardInterval(cardInterval);
				if (result == null) result = caseCInterval(cardInterval);
				if (result == null) result = caseCElement(cardInterval);
				if (result == null) result = caseElement(cardInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCElement(CElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clafer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClafer(Clafer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaferModel(ClaferModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CInterval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CInterval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCInterval(CInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GCard Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GCard Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGCardInterval(GCardInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardInterval(CardInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ClaferSwitch
