/**
 */
package de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each ScenarioBehaviour has exactly one Start action which marks the action where the control flows begins. Start actions have no predecessor.
 * <!-- end-model-doc -->
 *
 *
 * @see de_pc.uka_pc.ipd_pc.sdq_pc.pcm_pc.usagemodel_pc.Usagemodel_pcPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends AbstractUserAction {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.predecessor.oclIsUndefined()'"
    * @generated
    */
   boolean StartHasNoPredecessor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Start
