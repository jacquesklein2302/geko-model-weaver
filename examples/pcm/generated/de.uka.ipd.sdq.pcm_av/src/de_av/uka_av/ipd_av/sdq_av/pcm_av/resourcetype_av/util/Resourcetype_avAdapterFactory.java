/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.util;

import de_av.uka_av.ipd_av.sdq_av.identifier_av.Identifier;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.NamedElement;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceProvidingEntity;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.*;

import de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.Resourcetype_avPackage
 * @generated
 */
public class Resourcetype_avAdapterFactory extends AdapterFactoryImpl {
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected static Resourcetype_avPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Resourcetype_avAdapterFactory() {
      if (modelPackage == null) {
         modelPackage = Resourcetype_avPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
    * <!-- end-user-doc -->
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object) {
      if (object == modelPackage) {
         return true;
      }
      if (object instanceof EObject) {
         return ((EObject)object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected Resourcetype_avSwitch<Adapter> modelSwitch =
      new Resourcetype_avSwitch<Adapter>() {
         @Override
         public Adapter caseResourceSignature(ResourceSignature object) {
            return createResourceSignatureAdapter();
         }
         @Override
         public Adapter caseProcessingResourceType(ProcessingResourceType object) {
            return createProcessingResourceTypeAdapter();
         }
         @Override
         public Adapter caseResourceType(ResourceType object) {
            return createResourceTypeAdapter();
         }
         @Override
         public Adapter caseResourceRepository(ResourceRepository object) {
            return createResourceRepositoryAdapter();
         }
         @Override
         public Adapter caseSchedulingPolicy(SchedulingPolicy object) {
            return createSchedulingPolicyAdapter();
         }
         @Override
         public Adapter caseCommunicationLinkResourceType(CommunicationLinkResourceType object) {
            return createCommunicationLinkResourceTypeAdapter();
         }
         @Override
         public Adapter caseResourceInterface(ResourceInterface object) {
            return createResourceInterfaceAdapter();
         }
         @Override
         public Adapter caseIdentifier(Identifier object) {
            return createIdentifierAdapter();
         }
         @Override
         public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
         }
         @Override
         public Adapter caseEntity(Entity object) {
            return createEntityAdapter();
         }
         @Override
         public Adapter caseUnitCarryingElement(UnitCarryingElement object) {
            return createUnitCarryingElementAdapter();
         }
         @Override
         public Adapter caseResourceInterfaceProvidingEntity(ResourceInterfaceProvidingEntity object) {
            return createResourceInterfaceProvidingEntityAdapter();
         }
         @Override
         public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
         }
      };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target) {
      return modelSwitch.doSwitch((EObject)target);
   }


   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceSignature <em>Resource Signature</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceSignature
    * @generated
    */
   public Adapter createResourceSignatureAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ProcessingResourceType <em>Processing Resource Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ProcessingResourceType
    * @generated
    */
   public Adapter createProcessingResourceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceType <em>Resource Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceType
    * @generated
    */
   public Adapter createResourceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceRepository <em>Resource Repository</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceRepository
    * @generated
    */
   public Adapter createResourceRepositoryAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.SchedulingPolicy <em>Scheduling Policy</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.SchedulingPolicy
    * @generated
    */
   public Adapter createSchedulingPolicyAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.CommunicationLinkResourceType <em>Communication Link Resource Type</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.CommunicationLinkResourceType
    * @generated
    */
   public Adapter createCommunicationLinkResourceTypeAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceInterface <em>Resource Interface</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.ResourceInterface
    * @generated
    */
   public Adapter createResourceInterfaceAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.identifier_av.Identifier <em>Identifier</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.identifier_av.Identifier
    * @generated
    */
   public Adapter createIdentifierAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.NamedElement <em>Named Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.NamedElement
    * @generated
    */
   public Adapter createNamedElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity <em>Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity
    * @generated
    */
   public Adapter createEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement <em>Unit Carrying Element</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.units_av.UnitCarryingElement
    * @generated
    */
   public Adapter createUnitCarryingElementAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceProvidingEntity <em>Resource Interface Providing Entity</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.ResourceInterfaceProvidingEntity
    * @generated
    */
   public Adapter createResourceInterfaceProvidingEntityAdapter() {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter() {
      return null;
   }

} //Resourcetype_avAdapterFactory
