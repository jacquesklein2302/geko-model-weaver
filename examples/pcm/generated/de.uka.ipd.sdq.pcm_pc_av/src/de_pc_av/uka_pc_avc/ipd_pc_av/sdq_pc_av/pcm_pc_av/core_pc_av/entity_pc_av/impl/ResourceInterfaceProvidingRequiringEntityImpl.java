/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceInterfaceProvidingEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceInterfaceProvidingRequiringEntity;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceProvidedRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Interface Providing Requiring Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.ResourceInterfaceProvidingRequiringEntityImpl#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceInterfaceProvidingRequiringEntityImpl extends ResourceInterfaceRequiringEntityImpl implements ResourceInterfaceProvidingRequiringEntity {
   /**
    * The cached value of the '{@link #getResourceProvidedRoles__ResourceInterfaceProvidingEntity() <em>Resource Provided Roles Resource Interface Providing Entity</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getResourceProvidedRoles__ResourceInterfaceProvidingEntity()
    * @generated
    * @ordered
    */
   protected EList<ResourceProvidedRole> resourceProvidedRoles__ResourceInterfaceProvidingEntity;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ResourceInterfaceProvidingRequiringEntityImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Entity_pc_avPackage.Literals.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ResourceProvidedRole> getResourceProvidedRoles__ResourceInterfaceProvidingEntity() {
      if (resourceProvidedRoles__ResourceInterfaceProvidingEntity == null) {
         resourceProvidedRoles__ResourceInterfaceProvidingEntity = new EObjectContainmentWithInverseEList<ResourceProvidedRole>(ResourceProvidedRole.class, this, Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY, Entity_pc_avPackage.RESOURCE_PROVIDED_ROLE__RESOURCE_INTERFACE_PROVIDING_ENTITY_RESOURCE_PROVIDED_ROLE);
      }
      return resourceProvidedRoles__ResourceInterfaceProvidingEntity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceProvidedRoles__ResourceInterfaceProvidingEntity()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return ((InternalEList<?>)getResourceProvidedRoles__ResourceInterfaceProvidingEntity()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return getResourceProvidedRoles__ResourceInterfaceProvidingEntity();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            getResourceProvidedRoles__ResourceInterfaceProvidingEntity().clear();
            getResourceProvidedRoles__ResourceInterfaceProvidingEntity().addAll((Collection<? extends ResourceProvidedRole>)newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID) {
      switch (featureID) {
         case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            getResourceProvidedRoles__ResourceInterfaceProvidingEntity().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID) {
      switch (featureID) {
         case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY:
            return resourceProvidedRoles__ResourceInterfaceProvidingEntity != null && !resourceProvidedRoles__ResourceInterfaceProvidingEntity.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
      if (baseClass == ResourceInterfaceProvidingEntity.class) {
         switch (derivedFeatureID) {
            case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY: return Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY;
            default: return -1;
         }
      }
      return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
      if (baseClass == ResourceInterfaceProvidingEntity.class) {
         switch (baseFeatureID) {
            case Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY: return Entity_pc_avPackage.RESOURCE_INTERFACE_PROVIDING_REQUIRING_ENTITY__RESOURCE_PROVIDED_ROLES_RESOURCE_INTERFACE_PROVIDING_ENTITY;
            default: return -1;
         }
      }
      return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
   }

} //ResourceInterfaceProvidingRequiringEntityImpl
