/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.Completions_av_pcPackage
 * @generated
 */
public interface Completions_av_pcFactory extends EFactory {
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   Completions_av_pcFactory eINSTANCE = de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.completions_av_pc.impl.Completions_av_pcFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Completion</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Completion</em>'.
    * @generated
    */
   Completion createCompletion();

   /**
    * Returns a new object of class '<em>Completion Repository</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Completion Repository</em>'.
    * @generated
    */
   CompletionRepository createCompletionRepository();

   /**
    * Returns a new object of class '<em>Delegating External Call Action</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Delegating External Call Action</em>'.
    * @generated
    */
   DelegatingExternalCallAction createDelegatingExternalCallAction();

   /**
    * Returns a new object of class '<em>Network Demand Parametric Resource Demand</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return a new object of class '<em>Network Demand Parametric Resource Demand</em>'.
    * @generated
    */
   NetworkDemandParametricResourceDemand createNetworkDemandParametricResourceDemand();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the package supported by this factory.
    * @generated
    */
   Completions_av_pcPackage getCompletions_av_pcPackage();

} //Completions_av_pcFactory
