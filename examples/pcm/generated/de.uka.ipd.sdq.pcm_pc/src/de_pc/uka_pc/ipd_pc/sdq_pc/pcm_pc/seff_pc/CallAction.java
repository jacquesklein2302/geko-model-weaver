/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc;

import de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic class realising call relations between behaviours (e.g. method call).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.CallAction#getInputVariableUsages__CallAction <em>Input Variable Usages Call Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getCallAction()
 * @model
 * @generated
 */
public interface CallAction extends EObject {
   /**
    * Returns the value of the '<em><b>Input Variable Usages Call Action</b></em>' containment reference list.
    * The list contents are of type {@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage}.
    * It is bidirectional and its opposite is '{@link de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage#getCallAction__VariableUsage <em>Call Action Variable Usage</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Input Variable Usages Call Action</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Input Variable Usages Call Action</em>' containment reference list.
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.seff_pc.Seff_pcPackage#getCallAction_InputVariableUsages__CallAction()
    * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.parameter_pc.VariableUsage#getCallAction__VariableUsage
    * @model opposite="callAction__VariableUsage" containment="true" ordered="false"
    * @generated
    */
   EList<VariableUsage> getInputVariableUsages__CallAction();

} // CallAction
