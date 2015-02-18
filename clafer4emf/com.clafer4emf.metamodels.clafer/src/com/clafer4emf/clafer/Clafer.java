/**
 */
package com.clafer4emf.clafer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clafer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.clafer4emf.clafer.Clafer#getName <em>Name</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.Clafer#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.Clafer#getCElements <em>CElements</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.Clafer#getCSuper <em>CSuper</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.Clafer#getCTarget <em>CTarget</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.Clafer#getCCardinality <em>CCardinality</em>}</li>
 *   <li>{@link com.clafer4emf.clafer.Clafer#getCGroupCardinality <em>CGroup Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.clafer4emf.clafer.ClaferPackage#getClafer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllClafersIntheSameLevelMustHaveUniqueNames ClaferMustHaveName OnlySuperTypingToTopLevelAbstractClafers OnlyReferenceToTopLevelAbstractClafers AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AllClafersIntheSameLevelMustHaveUniqueNames='self.cElements->isUnique(name)' ClaferMustHaveName='self.oclIsTypeOf(Clafer) implies self.name.size() > 0' OnlySuperTypingToTopLevelAbstractClafers='cElements-> forAll(c:Clafer, r:Clafer | not c.cSuper.oclIsUndefined() and c.cSuper = r implies r.isAbstract = true)' OnlyReferenceToTopLevelAbstractClafers='cElements-> forAll(c:Clafer, r:Clafer | not c.cTarget.oclIsUndefined() and c.cTarget = r implies r.isAbstract = true)' AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime='not (cElements->exists(c:Clafer | c.cSuper <> null and c.cTarget <> null))'"
 * @generated
 */
public interface Clafer extends CElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.clafer4emf.clafer.ClaferPackage#getClafer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.Clafer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see com.clafer4emf.clafer.ClaferPackage#getClafer_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.Clafer#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>CElements</b></em>' containment reference list.
	 * The list contents are of type {@link com.clafer4emf.clafer.Clafer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CElements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CElements</em>' containment reference list.
	 * @see com.clafer4emf.clafer.ClaferPackage#getClafer_CElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clafer> getCElements();

	/**
	 * Returns the value of the '<em><b>CSuper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSuper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSuper</em>' reference.
	 * @see #setCSuper(Clafer)
	 * @see com.clafer4emf.clafer.ClaferPackage#getClafer_CSuper()
	 * @model
	 * @generated
	 */
	Clafer getCSuper();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.Clafer#getCSuper <em>CSuper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSuper</em>' reference.
	 * @see #getCSuper()
	 * @generated
	 */
	void setCSuper(Clafer value);

	/**
	 * Returns the value of the '<em><b>CTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTarget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTarget</em>' reference.
	 * @see #setCTarget(Clafer)
	 * @see com.clafer4emf.clafer.ClaferPackage#getClafer_CTarget()
	 * @model
	 * @generated
	 */
	Clafer getCTarget();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.Clafer#getCTarget <em>CTarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTarget</em>' reference.
	 * @see #getCTarget()
	 * @generated
	 */
	void setCTarget(Clafer value);

	/**
	 * Returns the value of the '<em><b>CCardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCardinality</em>' containment reference.
	 * @see #setCCardinality(CardInterval)
	 * @see com.clafer4emf.clafer.ClaferPackage#getClafer_CCardinality()
	 * @model containment="true"
	 * @generated
	 */
	CardInterval getCCardinality();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.Clafer#getCCardinality <em>CCardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCardinality</em>' containment reference.
	 * @see #getCCardinality()
	 * @generated
	 */
	void setCCardinality(CardInterval value);

	/**
	 * Returns the value of the '<em><b>CGroup Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CGroup Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CGroup Cardinality</em>' containment reference.
	 * @see #setCGroupCardinality(GCardInterval)
	 * @see com.clafer4emf.clafer.ClaferPackage#getClafer_CGroupCardinality()
	 * @model containment="true"
	 * @generated
	 */
	GCardInterval getCGroupCardinality();

	/**
	 * Sets the value of the '{@link com.clafer4emf.clafer.Clafer#getCGroupCardinality <em>CGroup Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CGroup Cardinality</em>' containment reference.
	 * @see #getCGroupCardinality()
	 * @generated
	 */
	void setCGroupCardinality(GCardInterval value);

} // Clafer
