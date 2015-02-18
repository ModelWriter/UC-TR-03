/**
 */
package com.clafer4emf.clafer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.clafer4emf.clafer.ClaferPackage
 * @generated
 */
public interface ClaferFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClaferFactory eINSTANCE = com.clafer4emf.clafer.impl.ClaferFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clafer</em>'.
	 * @generated
	 */
	Clafer createClafer();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	ClaferModel createClaferModel();

	/**
	 * Returns a new object of class '<em>GCard Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GCard Interval</em>'.
	 * @generated
	 */
	GCardInterval createGCardInterval();

	/**
	 * Returns a new object of class '<em>Card Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Interval</em>'.
	 * @generated
	 */
	CardInterval createCardInterval();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClaferPackage getClaferPackage();

} //ClaferFactory
