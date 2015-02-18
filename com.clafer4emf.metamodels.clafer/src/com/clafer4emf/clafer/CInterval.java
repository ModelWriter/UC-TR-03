/**
 */
package com.clafer4emf.clafer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CInterval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.clafer4emf.clafer.CInterval#getMin <em>Min</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.CInterval#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.clafer4emf.clafer.ClaferPackage#getCInterval()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IntervalRules'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IntervalRules='\n\t\t\tlet i = self in \n\t\t\t\t(i.Min >= 0) and\n\t\t\t\t(i.Max >= i.Min or i.Max = -1) and\n\t\t\t\t(i.Min = 0 implies i.Max <> 0 or i.Max = 1 or i.Max = -1) and\n\t\t\t\t(i.Min = 1 implies i.Max = -1 or i.Max >= 1)'"
 * @generated
 */
public interface CInterval extends CElement {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see com.clafer4emf.clafer.ClaferPackage#getCInterval_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.CInterval#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see com.clafer4emf.clafer.ClaferPackage#getCInterval_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.CInterval#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // CInterval
