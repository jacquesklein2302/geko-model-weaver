/**
 */
package de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.util;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.identifier_pc_pc.util.Identifier_pc_pcValidator;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.composition_pc_pc.util.Composition_pc_pcValidator;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.core_pc_pc.entity_pc_pc.util.Entity_pc_pcValidator;

import de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System_pc_pcPackage;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System_pc_pcPackage
 * @generated
 */
public class System_pc_pcValidator extends EObjectValidator {
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final System_pc_pcValidator INSTANCE = new System_pc_pcValidator();

   /**
    * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see org.eclipse.emf.common.util.Diagnostic#getSource()
    * @see org.eclipse.emf.common.util.Diagnostic#getCode()
    * @generated
    */
   public static final String DIAGNOSTIC_SOURCE = "de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc";

   /**
    * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'System Must Have At Least One Provided Role' of 'System'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static final int SYSTEM__SYSTEM_MUST_HAVE_AT_LEAST_ONE_PROVIDED_ROLE = 1;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

   /**
    * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Identifier_pc_pcValidator identifier_pc_pcValidator;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Composition_pc_pcValidator composition_pc_pcValidator;

   /**
    * The cached base package validator.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Entity_pc_pcValidator entity_pc_pcValidator;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public System_pc_pcValidator() {
      super();
      identifier_pc_pcValidator = Identifier_pc_pcValidator.INSTANCE;
      composition_pc_pcValidator = Composition_pc_pcValidator.INSTANCE;
      entity_pc_pcValidator = Entity_pc_pcValidator.INSTANCE;
   }

   /**
    * Returns the package of this validator switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EPackage getEPackage() {
     return System_pc_pcPackage.eINSTANCE;
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
         case System_pc_pcPackage.SYSTEM:
            return validateSystem((de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System)value, diagnostics, context);
         default:
            return true;
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSystem(de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
      if (!validate_NoCircularContainment(system, diagnostics, context)) return false;
      boolean result = validate_EveryMultiplicityConforms(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryDataValueConforms(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryProxyResolves(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_UniqueID(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryKeyUnique(system, diagnostics, context);
      if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(system, diagnostics, context);
      if (result || diagnostics != null) result &= identifier_pc_pcValidator.validateIdentifier_idHasToBeUnique(system, diagnostics, context);
      if (result || diagnostics != null) result &= composition_pc_pcValidator.validateComposedStructure_MultipleConnectorsConstraint(system, diagnostics, context);
      if (result || diagnostics != null) result &= composition_pc_pcValidator.validateComposedStructure_MultipleConnectorsConstraintForAssemblyConnectors(system, diagnostics, context);
      if (result || diagnostics != null) result &= entity_pc_pcValidator.validateComposedProvidingRequiringEntity_ProvidedRolesMustBeBound(system, diagnostics, context);
      if (result || diagnostics != null) result &= validateSystem_SystemMustHaveAtLeastOneProvidedRole(system, diagnostics, context);
      return result;
   }

   /**
    * Validates the SystemMustHaveAtLeastOneProvidedRole constraint of '<em>System</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean validateSystem_SystemMustHaveAtLeastOneProvidedRole(de_pc_pc.uka_pc_pc.ipd_pc_pc.sdq_pc_pc.pcm_pc_pc.system_pc_pc.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
      return system.SystemMustHaveAtLeastOneProvidedRole(diagnostics, context);
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

} //System_pc_pcValidator
