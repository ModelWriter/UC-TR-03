/**
 */
package com.clafer4emf.clafer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.clafer4emf.clafer.ClaferPackage#getClaferModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneClaferModel ClaferModelRules'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneClaferModel='\n\t\t\tClaferModel.allInstances()->size() = 1' ClaferModelRules='\n\t\t\tlet i = self in \n\t\t\t\ti.oclIsTypeOf(ClaferModel) implies\n\t\t\t\t\ti.cCardinality.oclIsUndefined() and \n\t\t\t\t\ti.cGroupCardinality.oclIsUndefined() and\n\t\t\t\t\ti.cSuper.oclIsUndefined() and\n\t\t\t\t\ti.cTarget.oclIsUndefined() and\n\t\t\t\t\ti.isAbstract = false and\n\t\t\t\t\ti.name.size() = 0'"
 * @generated
 */
public interface ClaferModel extends Clafer {
} // ClaferModel
