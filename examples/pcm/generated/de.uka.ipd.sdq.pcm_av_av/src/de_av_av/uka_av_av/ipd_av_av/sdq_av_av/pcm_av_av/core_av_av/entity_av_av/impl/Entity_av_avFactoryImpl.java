/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.impl;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.entity_av_av.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Entity_av_avFactoryImpl extends EFactoryImpl implements Entity_av_avFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public static Entity_av_avFactory init() {
      try {
         Entity_av_avFactory theEntity_av_avFactory = (Entity_av_avFactory)EPackage.Registry.INSTANCE.getEFactory(Entity_av_avPackage.eNS_URI);
         if (theEntity_av_avFactory != null) {
            return theEntity_av_avFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new Entity_av_avFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity_av_avFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case Entity_av_avPackage.RESOURCE_PROVIDED_ROLE: return createResourceProvidedRole();
         case Entity_av_avPackage.INTERFACE_PROVIDING_REQUIRING_ENTITY: return createInterfaceProvidingRequiringEntity();
         case Entity_av_avPackage.INTERFACE_PROVIDING_ENTITY: return createInterfaceProvidingEntity();
         case Entity_av_avPackage.INTERFACE_REQUIRING_ENTITY: return createInterfaceRequiringEntity();
         case Entity_av_avPackage.RESOURCE_INTERFACE_REQUIRING_ENTITY: return createResourceInterfaceRequiringEntity();
         case Entity_av_avPackage.RESOURCE_REQUIRED_ROLE: return createResourceRequiredRole();
         case Entity_av_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY: return createResourceInterfaceProvidingEntity();
         case Entity_av_avPackage.COMPOSED_PROVIDING_REQUIRING_ENTITY: return createComposedProvidingRequiringEntity();
         case Entity_av_avPackage.NAMED_ELEMENT: return createNamedElement();
         case Entity_av_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY: return createResourceInterfaceProvidingRequiringEntity();
         case Entity_av_avPackage.ENTITY: return createEntity();
         default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceProvidedRole createResourceProvidedRole() {
      ResourceProvidedRoleImpl resourceProvidedRole = new ResourceProvidedRoleImpl();
      return resourceProvidedRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceProvidingRequiringEntity createInterfaceProvidingRequiringEntity() {
      InterfaceProvidingRequiringEntityImpl interfaceProvidingRequiringEntity = new InterfaceProvidingRequiringEntityImpl();
      return interfaceProvidingRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceProvidingEntity createInterfaceProvidingEntity() {
      InterfaceProvidingEntityImpl interfaceProvidingEntity = new InterfaceProvidingEntityImpl();
      return interfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public InterfaceRequiringEntity createInterfaceRequiringEntity() {
      InterfaceRequiringEntityImpl interfaceRequiringEntity = new InterfaceRequiringEntityImpl();
      return interfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceRequiringEntity createResourceInterfaceRequiringEntity() {
      ResourceInterfaceRequiringEntityImpl resourceInterfaceRequiringEntity = new ResourceInterfaceRequiringEntityImpl();
      return resourceInterfaceRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceRequiredRole createResourceRequiredRole() {
      ResourceRequiredRoleImpl resourceRequiredRole = new ResourceRequiredRoleImpl();
      return resourceRequiredRole;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceProvidingEntity createResourceInterfaceProvidingEntity() {
      ResourceInterfaceProvidingEntityImpl resourceInterfaceProvidingEntity = new ResourceInterfaceProvidingEntityImpl();
      return resourceInterfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ComposedProvidingRequiringEntity createComposedProvidingRequiringEntity() {
      ComposedProvidingRequiringEntityImpl composedProvidingRequiringEntity = new ComposedProvidingRequiringEntityImpl();
      return composedProvidingRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NamedElement createNamedElement() {
      NamedElementImpl namedElement = new NamedElementImpl();
      return namedElement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ResourceInterfaceProvidingRequiringEntity createResourceInterfaceProvidingRequiringEntity() {
      ResourceInterfaceProvidingRequiringEntityImpl resourceInterfaceProvidingRequiringEntity = new ResourceInterfaceProvidingRequiringEntityImpl();
      return resourceInterfaceProvidingRequiringEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity createEntity() {
      EntityImpl entity = new EntityImpl();
      return entity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Entity_av_avPackage getEntity_av_avPackage() {
      return (Entity_av_avPackage)getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @deprecated
    * @generated
    */
   @Deprecated
   public static Entity_av_avPackage getPackage() {
      return Entity_av_avPackage.eINSTANCE;
   }

} //Entity_av_avFactoryImpl
