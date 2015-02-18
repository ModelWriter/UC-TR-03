/**
 */
package com.clafer4emf.clafer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.clafer4emf.clafer.ClaferFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ClaferPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "clafer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://clafer4emf.com/metamodels/clafer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cfr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClaferPackage eINSTANCE = com.clafer4emf.clafer.impl.ClaferPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.clafer4emf.clafer.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clafer4emf.clafer.impl.ElementImpl
	 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.clafer4emf.clafer.impl.CElementImpl <em>CElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clafer4emf.clafer.impl.CElementImpl
	 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getCElement()
	 * @generated
	 */
	int CELEMENT = 1;

	/**
	 * The number of structural features of the '<em>CElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.clafer4emf.clafer.impl.ClaferImpl <em>Clafer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clafer4emf.clafer.impl.ClaferImpl
	 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getClafer()
	 * @generated
	 */
	int CLAFER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER__NAME = CELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER__IS_ABSTRACT = CELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CElements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER__CELEMENTS = CELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CSuper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER__CSUPER = CELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER__CTARGET = CELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CCardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER__CCARDINALITY = CELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CGroup Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER__CGROUP_CARDINALITY = CELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Clafer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_FEATURE_COUNT = CELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Clafer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_OPERATION_COUNT = CELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.clafer4emf.clafer.impl.ClaferModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clafer4emf.clafer.impl.ClaferModelImpl
	 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getClaferModel()
	 * @generated
	 */
	int CLAFER_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL__NAME = CLAFER__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL__IS_ABSTRACT = CLAFER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>CElements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL__CELEMENTS = CLAFER__CELEMENTS;

	/**
	 * The feature id for the '<em><b>CSuper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL__CSUPER = CLAFER__CSUPER;

	/**
	 * The feature id for the '<em><b>CTarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL__CTARGET = CLAFER__CTARGET;

	/**
	 * The feature id for the '<em><b>CCardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL__CCARDINALITY = CLAFER__CCARDINALITY;

	/**
	 * The feature id for the '<em><b>CGroup Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL__CGROUP_CARDINALITY = CLAFER__CGROUP_CARDINALITY;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL_FEATURE_COUNT = CLAFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAFER_MODEL_OPERATION_COUNT = CLAFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.clafer4emf.clafer.impl.CIntervalImpl <em>CInterval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clafer4emf.clafer.impl.CIntervalImpl
	 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getCInterval()
	 * @generated
	 */
	int CINTERVAL = 4;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERVAL__MIN = CELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERVAL__MAX = CELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CInterval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERVAL_FEATURE_COUNT = CELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CInterval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINTERVAL_OPERATION_COUNT = CELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.clafer4emf.clafer.impl.GCardIntervalImpl <em>GCard Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clafer4emf.clafer.impl.GCardIntervalImpl
	 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getGCardInterval()
	 * @generated
	 */
	int GCARD_INTERVAL = 5;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCARD_INTERVAL__MIN = CINTERVAL__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCARD_INTERVAL__MAX = CINTERVAL__MAX;

	/**
	 * The number of structural features of the '<em>GCard Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCARD_INTERVAL_FEATURE_COUNT = CINTERVAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GCard Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GCARD_INTERVAL_OPERATION_COUNT = CINTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.clafer4emf.clafer.impl.CardIntervalImpl <em>Card Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.clafer4emf.clafer.impl.CardIntervalImpl
	 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getCardInterval()
	 * @generated
	 */
	int CARD_INTERVAL = 6;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INTERVAL__MIN = CINTERVAL__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INTERVAL__MAX = CINTERVAL__MAX;

	/**
	 * The number of structural features of the '<em>Card Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INTERVAL_FEATURE_COUNT = CINTERVAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Card Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_INTERVAL_OPERATION_COUNT = CINTERVAL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.clafer4emf.clafer.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.clafer4emf.clafer.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link com.clafer4emf.clafer.CElement <em>CElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CElement</em>'.
	 * @see com.clafer4emf.clafer.CElement
	 * @generated
	 */
	EClass getCElement();

	/**
	 * Returns the meta object for class '{@link com.clafer4emf.clafer.Clafer <em>Clafer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clafer</em>'.
	 * @see com.clafer4emf.clafer.Clafer
	 * @generated
	 */
	EClass getClafer();

	/**
	 * Returns the meta object for the attribute '{@link com.clafer4emf.clafer.Clafer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.clafer4emf.clafer.Clafer#getName()
	 * @see #getClafer()
	 * @generated
	 */
	EAttribute getClafer_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.clafer4emf.clafer.Clafer#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see com.clafer4emf.clafer.Clafer#isIsAbstract()
	 * @see #getClafer()
	 * @generated
	 */
	EAttribute getClafer_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link com.clafer4emf.clafer.Clafer#getCElements <em>CElements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>CElements</em>'.
	 * @see com.clafer4emf.clafer.Clafer#getCElements()
	 * @see #getClafer()
	 * @generated
	 */
	EReference getClafer_CElements();

	/**
	 * Returns the meta object for the reference '{@link com.clafer4emf.clafer.Clafer#getCSuper <em>CSuper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CSuper</em>'.
	 * @see com.clafer4emf.clafer.Clafer#getCSuper()
	 * @see #getClafer()
	 * @generated
	 */
	EReference getClafer_CSuper();

	/**
	 * Returns the meta object for the reference '{@link com.clafer4emf.clafer.Clafer#getCTarget <em>CTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CTarget</em>'.
	 * @see com.clafer4emf.clafer.Clafer#getCTarget()
	 * @see #getClafer()
	 * @generated
	 */
	EReference getClafer_CTarget();

	/**
	 * Returns the meta object for the containment reference '{@link com.clafer4emf.clafer.Clafer#getCCardinality <em>CCardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CCardinality</em>'.
	 * @see com.clafer4emf.clafer.Clafer#getCCardinality()
	 * @see #getClafer()
	 * @generated
	 */
	EReference getClafer_CCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link com.clafer4emf.clafer.Clafer#getCGroupCardinality <em>CGroup Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CGroup Cardinality</em>'.
	 * @see com.clafer4emf.clafer.Clafer#getCGroupCardinality()
	 * @see #getClafer()
	 * @generated
	 */
	EReference getClafer_CGroupCardinality();

	/**
	 * Returns the meta object for class '{@link com.clafer4emf.clafer.ClaferModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.clafer4emf.clafer.ClaferModel
	 * @generated
	 */
	EClass getClaferModel();

	/**
	 * Returns the meta object for class '{@link com.clafer4emf.clafer.CInterval <em>CInterval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CInterval</em>'.
	 * @see com.clafer4emf.clafer.CInterval
	 * @generated
	 */
	EClass getCInterval();

	/**
	 * Returns the meta object for the attribute '{@link com.clafer4emf.clafer.CInterval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see com.clafer4emf.clafer.CInterval#getMin()
	 * @see #getCInterval()
	 * @generated
	 */
	EAttribute getCInterval_Min();

	/**
	 * Returns the meta object for the attribute '{@link com.clafer4emf.clafer.CInterval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.clafer4emf.clafer.CInterval#getMax()
	 * @see #getCInterval()
	 * @generated
	 */
	EAttribute getCInterval_Max();

	/**
	 * Returns the meta object for class '{@link com.clafer4emf.clafer.GCardInterval <em>GCard Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GCard Interval</em>'.
	 * @see com.clafer4emf.clafer.GCardInterval
	 * @generated
	 */
	EClass getGCardInterval();

	/**
	 * Returns the meta object for class '{@link com.clafer4emf.clafer.CardInterval <em>Card Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Interval</em>'.
	 * @see com.clafer4emf.clafer.CardInterval
	 * @generated
	 */
	EClass getCardInterval();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClaferFactory getClaferFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.clafer4emf.clafer.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clafer4emf.clafer.impl.ElementImpl
		 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link com.clafer4emf.clafer.impl.CElementImpl <em>CElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clafer4emf.clafer.impl.CElementImpl
		 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getCElement()
		 * @generated
		 */
		EClass CELEMENT = eINSTANCE.getCElement();

		/**
		 * The meta object literal for the '{@link com.clafer4emf.clafer.impl.ClaferImpl <em>Clafer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clafer4emf.clafer.impl.ClaferImpl
		 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getClafer()
		 * @generated
		 */
		EClass CLAFER = eINSTANCE.getClafer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAFER__NAME = eINSTANCE.getClafer_Name();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAFER__IS_ABSTRACT = eINSTANCE.getClafer_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>CElements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAFER__CELEMENTS = eINSTANCE.getClafer_CElements();

		/**
		 * The meta object literal for the '<em><b>CSuper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAFER__CSUPER = eINSTANCE.getClafer_CSuper();

		/**
		 * The meta object literal for the '<em><b>CTarget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAFER__CTARGET = eINSTANCE.getClafer_CTarget();

		/**
		 * The meta object literal for the '<em><b>CCardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAFER__CCARDINALITY = eINSTANCE.getClafer_CCardinality();

		/**
		 * The meta object literal for the '<em><b>CGroup Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAFER__CGROUP_CARDINALITY = eINSTANCE.getClafer_CGroupCardinality();

		/**
		 * The meta object literal for the '{@link com.clafer4emf.clafer.impl.ClaferModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clafer4emf.clafer.impl.ClaferModelImpl
		 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getClaferModel()
		 * @generated
		 */
		EClass CLAFER_MODEL = eINSTANCE.getClaferModel();

		/**
		 * The meta object literal for the '{@link com.clafer4emf.clafer.impl.CIntervalImpl <em>CInterval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clafer4emf.clafer.impl.CIntervalImpl
		 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getCInterval()
		 * @generated
		 */
		EClass CINTERVAL = eINSTANCE.getCInterval();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CINTERVAL__MIN = eINSTANCE.getCInterval_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CINTERVAL__MAX = eINSTANCE.getCInterval_Max();

		/**
		 * The meta object literal for the '{@link com.clafer4emf.clafer.impl.GCardIntervalImpl <em>GCard Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clafer4emf.clafer.impl.GCardIntervalImpl
		 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getGCardInterval()
		 * @generated
		 */
		EClass GCARD_INTERVAL = eINSTANCE.getGCardInterval();

		/**
		 * The meta object literal for the '{@link com.clafer4emf.clafer.impl.CardIntervalImpl <em>Card Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.clafer4emf.clafer.impl.CardIntervalImpl
		 * @see com.clafer4emf.clafer.impl.ClaferPackageImpl#getCardInterval()
		 * @generated
		 */
		EClass CARD_INTERVAL = eINSTANCE.getCardInterval();

	}

} //ClaferPackage
