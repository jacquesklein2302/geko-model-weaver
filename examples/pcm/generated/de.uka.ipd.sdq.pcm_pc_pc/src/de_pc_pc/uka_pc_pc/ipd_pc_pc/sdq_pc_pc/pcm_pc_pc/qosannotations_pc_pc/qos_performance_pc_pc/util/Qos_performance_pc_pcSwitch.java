/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.SpecifiedQoSAnnotation;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.qosannotations_pc_pc.qos_performance_pc_pc.Qos_performance_pc_pcPackage
 * @generated
 */
public class Qos_performance_pc_pcSwitch<T> extends Switch<T> {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Qos_performance_pc_pcPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Qos_performance_pc_pcSwitch() {
      if (modelPackage == null) {
         modelPackage = Qos_performance_pc_pcPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage) {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject) {
      switch (classifierID) {
         case Qos_performance_pc_pcPackage.SYSTEM_SPECIFIED_EXECUTION_TIME: {
            SystemSpecifiedExecutionTime systemSpecifiedExecutionTime = (SystemSpecifiedExecutionTime)theEObject;
            T result = caseSystemSpecifiedExecutionTime(systemSpecifiedExecutionTime);
            if (result == null) result = caseSpecifiedExecutionTime(systemSpecifiedExecutionTime);
            if (result == null) result = caseSpecifiedQoSAnnotation(systemSpecifiedExecutionTime);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Qos_performance_pc_pcPackage.SPECIFIED_EXECUTION_TIME: {
            SpecifiedExecutionTime specifiedExecutionTime = (SpecifiedExecutionTime)theEObject;
            T result = caseSpecifiedExecutionTime(specifiedExecutionTime);
            if (result == null) result = caseSpecifiedQoSAnnotation(specifiedExecutionTime);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         case Qos_performance_pc_pcPackage.COMPONENT_SPECIFIED_EXECUTION_TIME: {
            ComponentSpecifiedExecutionTime componentSpecifiedExecutionTime = (ComponentSpecifiedExecutionTime)theEObject;
            T result = caseComponentSpecifiedExecutionTime(componentSpecifiedExecutionTime);
            if (result == null) result = caseSpecifiedExecutionTime(componentSpecifiedExecutionTime);
            if (result == null) result = caseSpecifiedQoSAnnotation(componentSpecifiedExecutionTime);
            if (result == null) result = defaultCase(theEObject);
            return result;
         }
         default: return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>System Specified Execution Time</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>System Specified Execution Time</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSystemSpecifiedExecutionTime(SystemSpecifiedExecutionTime object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Specified Execution Time</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Specified Execution Time</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSpecifiedExecutionTime(SpecifiedExecutionTime object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Component Specified Execution Time</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Component Specified Execution Time</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseComponentSpecifiedExecutionTime(ComponentSpecifiedExecutionTime object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Specified Qo SAnnotation</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Specified Qo SAnnotation</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSpecifiedQoSAnnotation(SpecifiedQoSAnnotation object) {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object) {
      return null;
   }

} //Qos_performance_pc_pcSwitch
