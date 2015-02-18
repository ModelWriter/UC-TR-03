/**
 */
package com.clafer4emf.clafer.impl;

import com.clafer4emf.clafer.CElement;
import com.clafer4emf.clafer.CInterval;
import com.clafer4emf.clafer.CardInterval;
import com.clafer4emf.clafer.Clafer;
import com.clafer4emf.clafer.ClaferFactory;
import com.clafer4emf.clafer.ClaferModel;
import com.clafer4emf.clafer.ClaferPackage;
import com.clafer4emf.clafer.Element;
import com.clafer4emf.clafer.GCardInterval;

import com.clafer4emf.clafer.util.ClaferValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaferPackageImpl extends EPackageImpl implements ClaferPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claferModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gCardIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardIntervalEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.clafer4emf.clafer.ClaferPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClaferPackageImpl() {
		super(eNS_URI, ClaferFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClaferPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClaferPackage init() {
		if (isInited) return (ClaferPackage)EPackage.Registry.INSTANCE.getEPackage(ClaferPackage.eNS_URI);

		// Obtain or create and register package
		ClaferPackageImpl theClaferPackage = (ClaferPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClaferPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClaferPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theClaferPackage.createPackageContents();

		// Initialize created meta-data
		theClaferPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theClaferPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ClaferValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theClaferPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClaferPackage.eNS_URI, theClaferPackage);
		return theClaferPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCElement() {
		return cElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClafer() {
		return claferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClafer_Name() {
		return (EAttribute)claferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClafer_IsAbstract() {
		return (EAttribute)claferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClafer_CElements() {
		return (EReference)claferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClafer_CSuper() {
		return (EReference)claferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClafer_CTarget() {
		return (EReference)claferEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClafer_CCardinality() {
		return (EReference)claferEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClafer_CGroupCardinality() {
		return (EReference)claferEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaferModel() {
		return claferModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCInterval() {
		return cIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCInterval_Min() {
		return (EAttribute)cIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCInterval_Max() {
		return (EAttribute)cIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGCardInterval() {
		return gCardIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardInterval() {
		return cardIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaferFactory getClaferFactory() {
		return (ClaferFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);

		cElementEClass = createEClass(CELEMENT);

		claferEClass = createEClass(CLAFER);
		createEAttribute(claferEClass, CLAFER__NAME);
		createEAttribute(claferEClass, CLAFER__IS_ABSTRACT);
		createEReference(claferEClass, CLAFER__CELEMENTS);
		createEReference(claferEClass, CLAFER__CSUPER);
		createEReference(claferEClass, CLAFER__CTARGET);
		createEReference(claferEClass, CLAFER__CCARDINALITY);
		createEReference(claferEClass, CLAFER__CGROUP_CARDINALITY);

		claferModelEClass = createEClass(CLAFER_MODEL);

		cIntervalEClass = createEClass(CINTERVAL);
		createEAttribute(cIntervalEClass, CINTERVAL__MIN);
		createEAttribute(cIntervalEClass, CINTERVAL__MAX);

		gCardIntervalEClass = createEClass(GCARD_INTERVAL);

		cardIntervalEClass = createEClass(CARD_INTERVAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cElementEClass.getESuperTypes().add(this.getElement());
		claferEClass.getESuperTypes().add(this.getCElement());
		claferModelEClass.getESuperTypes().add(this.getClafer());
		cIntervalEClass.getESuperTypes().add(this.getCElement());
		gCardIntervalEClass.getESuperTypes().add(this.getCInterval());
		cardIntervalEClass.getESuperTypes().add(this.getCInterval());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cElementEClass, CElement.class, "CElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(claferEClass, Clafer.class, "Clafer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClafer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Clafer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClafer_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, Clafer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClafer_CElements(), this.getClafer(), null, "cElements", null, 0, -1, Clafer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClafer_CSuper(), this.getClafer(), null, "cSuper", null, 0, 1, Clafer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClafer_CTarget(), this.getClafer(), null, "cTarget", null, 0, 1, Clafer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClafer_CCardinality(), this.getCardInterval(), null, "cCardinality", null, 0, 1, Clafer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClafer_CGroupCardinality(), this.getGCardInterval(), null, "cGroupCardinality", null, 0, 1, Clafer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claferModelEClass, ClaferModel.class, "ClaferModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cIntervalEClass, CInterval.class, "CInterval", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCInterval_Min(), ecorePackage.getEInt(), "Min", null, 1, 1, CInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCInterval_Max(), ecorePackage.getEInt(), "Max", null, 1, 1, CInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gCardIntervalEClass, GCardInterval.class, "GCardInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardIntervalEClass, CardInterval.class, "CardInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (claferEClass, 
		   source, 
		   new String[] {
			 "constraints", "AllClafersIntheSameLevelMustHaveUniqueNames ClaferMustHaveName OnlySuperTypingToTopLevelAbstractClafers OnlyReferenceToTopLevelAbstractClafers AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime"
		   });	
		addAnnotation
		  (claferModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneClaferModel ClaferModelRules"
		   });	
		addAnnotation
		  (cIntervalEClass, 
		   source, 
		   new String[] {
			 "constraints", "IntervalRules"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (claferEClass, 
		   source, 
		   new String[] {
			 "AllClafersIntheSameLevelMustHaveUniqueNames", "self.cElements->isUnique(name)",
			 "ClaferMustHaveName", "self.oclIsTypeOf(Clafer) implies self.name.size() > 0",
			 "OnlySuperTypingToTopLevelAbstractClafers", "cElements-> forAll(c:Clafer, r:Clafer | not c.cSuper.oclIsUndefined() and c.cSuper = r implies r.isAbstract = true)",
			 "OnlyReferenceToTopLevelAbstractClafers", "cElements-> forAll(c:Clafer, r:Clafer | not c.cTarget.oclIsUndefined() and c.cTarget = r implies r.isAbstract = true)",
			 "AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime", "not (cElements->exists(c:Clafer | c.cSuper <> null and c.cTarget <> null))"
		   });
		addAnnotation
		  (claferEClass, 
		   new boolean[] { true },
		   "http://www.eclipse.org/emf/2002/GenModel",
		   new String[] {
			 "documentation", "a Clafer cannot be a reference Clafer and has a super type at the same time"
		   });	
		addAnnotation
		  (claferModelEClass, 
		   source, 
		   new String[] {
			 "OneClaferModel", "\n\t\t\tClaferModel.allInstances()->size() = 1",
			 "ClaferModelRules", "\n\t\t\tlet i = self in \n\t\t\t\ti.oclIsTypeOf(ClaferModel) implies\n\t\t\t\t\ti.cCardinality.oclIsUndefined() and \n\t\t\t\t\ti.cGroupCardinality.oclIsUndefined() and\n\t\t\t\t\ti.cSuper.oclIsUndefined() and\n\t\t\t\t\ti.cTarget.oclIsUndefined() and\n\t\t\t\t\ti.isAbstract = false and\n\t\t\t\t\ti.name.size() = 0"
		   });	
		addAnnotation
		  (cIntervalEClass, 
		   source, 
		   new String[] {
			 "IntervalRules", "\n\t\t\tlet i = self in \n\t\t\t\t(i.Min >= 0) and\n\t\t\t\t(i.Max >= i.Min or i.Max = -1) and\n\t\t\t\t(i.Min = 0 implies i.Max <> 0 or i.Max = 1 or i.Max = -1) and\n\t\t\t\t(i.Min = 1 implies i.Max = -1 or i.Max >= 1)"
		   });
	}

} //ClaferPackageImpl
