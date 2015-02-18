/**
 */
package com.clafer4emf.clafer.util;

import com.clafer4emf.clafer.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.clafer4emf.clafer.ClaferPackage
 * @generated
 */
public class ClaferValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ClaferValidator INSTANCE = new ClaferValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.clafer4emf.clafer";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaferValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ClaferPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ClaferPackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case ClaferPackage.CELEMENT:
				return validateCElement((CElement)value, diagnostics, context);
			case ClaferPackage.CLAFER:
				return validateClafer((Clafer)value, diagnostics, context);
			case ClaferPackage.CLAFER_MODEL:
				return validateClaferModel((ClaferModel)value, diagnostics, context);
			case ClaferPackage.CINTERVAL:
				return validateCInterval((CInterval)value, diagnostics, context);
			case ClaferPackage.GCARD_INTERVAL:
				return validateGCardInterval((GCardInterval)value, diagnostics, context);
			case ClaferPackage.CARD_INTERVAL:
				return validateCardInterval((CardInterval)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCElement(CElement cElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClafer(Clafer clafer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clafer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_AllClafersIntheSameLevelMustHaveUniqueNames(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_ClaferMustHaveName(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_OnlySuperTypingToTopLevelAbstractClafers(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_OnlyReferenceToTopLevelAbstractClafers(clafer, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime(clafer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AllClafersIntheSameLevelMustHaveUniqueNames constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAFER__ALL_CLAFERS_INTHE_SAME_LEVEL_MUST_HAVE_UNIQUE_NAMES__EEXPRESSION = "self.cElements->isUnique(name)";

	/**
	 * Validates the AllClafersIntheSameLevelMustHaveUniqueNames constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClafer_AllClafersIntheSameLevelMustHaveUniqueNames(Clafer clafer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CLAFER,
				 clafer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AllClafersIntheSameLevelMustHaveUniqueNames",
				 CLAFER__ALL_CLAFERS_INTHE_SAME_LEVEL_MUST_HAVE_UNIQUE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ClaferMustHaveName constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAFER__CLAFER_MUST_HAVE_NAME__EEXPRESSION = "self.oclIsTypeOf(Clafer) implies self.name.size() > 0";

	/**
	 * Validates the ClaferMustHaveName constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClafer_ClaferMustHaveName(Clafer clafer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CLAFER,
				 clafer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ClaferMustHaveName",
				 CLAFER__CLAFER_MUST_HAVE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OnlySuperTypingToTopLevelAbstractClafers constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAFER__ONLY_SUPER_TYPING_TO_TOP_LEVEL_ABSTRACT_CLAFERS__EEXPRESSION = "cElements-> forAll(c:Clafer, r:Clafer | not c.cSuper.oclIsUndefined() and c.cSuper = r implies r.isAbstract = true)";

	/**
	 * Validates the OnlySuperTypingToTopLevelAbstractClafers constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClafer_OnlySuperTypingToTopLevelAbstractClafers(Clafer clafer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CLAFER,
				 clafer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlySuperTypingToTopLevelAbstractClafers",
				 CLAFER__ONLY_SUPER_TYPING_TO_TOP_LEVEL_ABSTRACT_CLAFERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OnlyReferenceToTopLevelAbstractClafers constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAFER__ONLY_REFERENCE_TO_TOP_LEVEL_ABSTRACT_CLAFERS__EEXPRESSION = "cElements-> forAll(c:Clafer, r:Clafer | not c.cTarget.oclIsUndefined() and c.cTarget = r implies r.isAbstract = true)";

	/**
	 * Validates the OnlyReferenceToTopLevelAbstractClafers constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClafer_OnlyReferenceToTopLevelAbstractClafers(Clafer clafer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CLAFER,
				 clafer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OnlyReferenceToTopLevelAbstractClafers",
				 CLAFER__ONLY_REFERENCE_TO_TOP_LEVEL_ABSTRACT_CLAFERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAFER__ACLAFER_CANNOT_BE_AREFERENCE_CLAFER_AND_HAS_ASUPER_TYPE_AT_THE_SAME_TIME__EEXPRESSION = "not (cElements->exists(c:Clafer | c.cSuper <> null and c.cTarget <> null))";

	/**
	 * Validates the AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime constraint of '<em>Clafer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClafer_AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime(Clafer clafer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CLAFER,
				 clafer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime",
				 CLAFER__ACLAFER_CANNOT_BE_AREFERENCE_CLAFER_AND_HAS_ASUPER_TYPE_AT_THE_SAME_TIME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaferModel(ClaferModel claferModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(claferModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_AllClafersIntheSameLevelMustHaveUniqueNames(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_ClaferMustHaveName(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_OnlySuperTypingToTopLevelAbstractClafers(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_OnlyReferenceToTopLevelAbstractClafers(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateClafer_AClaferCannotBeAReferenceClaferAndHasASuperTypeAtTheSameTime(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateClaferModel_OneClaferModel(claferModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateClaferModel_ClaferModelRules(claferModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneClaferModel constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAFER_MODEL__ONE_CLAFER_MODEL__EEXPRESSION = "\n" +
		"\t\t\tClaferModel.allInstances()->size() = 1";

	/**
	 * Validates the OneClaferModel constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaferModel_OneClaferModel(ClaferModel claferModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CLAFER_MODEL,
				 claferModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneClaferModel",
				 CLAFER_MODEL__ONE_CLAFER_MODEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ClaferModelRules constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLAFER_MODEL__CLAFER_MODEL_RULES__EEXPRESSION = "\n" +
		"\t\t\tlet i = self in \n" +
		"\t\t\t\ti.oclIsTypeOf(ClaferModel) implies\n" +
		"\t\t\t\t\ti.cCardinality.oclIsUndefined() and \n" +
		"\t\t\t\t\ti.cGroupCardinality.oclIsUndefined() and\n" +
		"\t\t\t\t\ti.cSuper.oclIsUndefined() and\n" +
		"\t\t\t\t\ti.cTarget.oclIsUndefined() and\n" +
		"\t\t\t\t\ti.isAbstract = false and\n" +
		"\t\t\t\t\ti.name.size() = 0";

	/**
	 * Validates the ClaferModelRules constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaferModel_ClaferModelRules(ClaferModel claferModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CLAFER_MODEL,
				 claferModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ClaferModelRules",
				 CLAFER_MODEL__CLAFER_MODEL_RULES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCInterval(CInterval cInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateCInterval_IntervalRules(cInterval, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IntervalRules constraint of '<em>CInterval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CINTERVAL__INTERVAL_RULES__EEXPRESSION = "\n" +
		"\t\t\tlet i = self in \n" +
		"\t\t\t\t(i.Min >= 0) and\n" +
		"\t\t\t\t(i.Max >= i.Min or i.Max = -1) and\n" +
		"\t\t\t\t(i.Min = 0 implies i.Max <> 0 or i.Max = 1 or i.Max = -1) and\n" +
		"\t\t\t\t(i.Min = 1 implies i.Max = -1 or i.Max >= 1)";

	/**
	 * Validates the IntervalRules constraint of '<em>CInterval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCInterval_IntervalRules(CInterval cInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ClaferPackage.Literals.CINTERVAL,
				 cInterval,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IntervalRules",
				 CINTERVAL__INTERVAL_RULES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGCardInterval(GCardInterval gCardInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gCardInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gCardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateCInterval_IntervalRules(gCardInterval, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardInterval(CardInterval cardInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cardInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cardInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateCInterval_IntervalRules(cardInterval, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ClaferValidator
