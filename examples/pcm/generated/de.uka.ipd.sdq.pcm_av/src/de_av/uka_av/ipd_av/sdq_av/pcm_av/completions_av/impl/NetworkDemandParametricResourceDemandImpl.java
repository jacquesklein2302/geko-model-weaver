/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.Completions_avPackage;
import de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.NetworkDemandParametricResourceDemand;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.CommunicationLinkResourceType;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.seff_av.seff_performance_av.impl.ParametricResourceDemandImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Demand Parametric Resource Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.completions_av.impl.NetworkDemandParametricResourceDemandImpl#getRequiredCommunicationLinkResource_ParametricResourceDemand <em>Required Communication Link Resource Parametric Resource Demand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkDemandParametricResourceDemandImpl extends ParametricResourceDemandImpl implements NetworkDemandParametricResourceDemand {
   /**
    * The cached value of the '{@link #getRequiredCommunicationLinkResource_ParametricResourceDemand() <em>Required Communication Link Resource Parametric Resource Demand</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getRequiredCommunicationLinkResource_ParametricResourceDemand()
    * @generated
    * @ordered
    */
   protected CommunicationLinkResourceType requiredCommunicationLinkResource_ParametricResourceDemand;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected NetworkDemandParametricResourceDemandImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Completions_avPackage.Literals.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType getRequiredCommunicationLinkResource_ParametricResourceDemand() {
      if (requiredCommunicationLinkResource_ParametricResourceDemand != null && requiredCommunicationLinkResource_ParametricResourceDemand.eIsProxy()) {
         InternalEObject oldRequiredCommunicationLinkResource_ParametricResourceDemand = (InternalEObject)requiredCommunicationLinkResource_ParametricResourceDemand;
         requiredCommunicationLinkResource_ParametricResourceDemand = (CommunicationLinkResourceType)eResolveProxy(oldRequiredCommunicationLinkResource_ParametricResourceDemand);
         if (requiredCommunicationLinkResource_ParametricResourceDemand != oldRequiredCommunicationLinkResource_ParametricResourceDemand) {
            if (eNotificationRequired())
               eNotify(new ENotificationImpl(this, Notification.RESOLVE, Completions_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredCommunicationLinkResource_ParametricResourceDemand, requiredCommunicationLinkResource_ParametricResourceDemand));
         }
      }
      return requiredCommunicationLinkResource_ParametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public CommunicationLinkResourceType basicGetRequiredCommunicationLinkResource_ParametricResourceDemand() {
      return requiredCommunicationLinkResource_ParametricResourceDemand;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setRequiredCommunicationLinkResource_ParametricResourceDemand(CommunicationLinkResourceType newRequiredCommunicationLinkResource_ParametricResourceDemand) {
      CommunicationLinkResourceType oldRequiredCommunicationLinkResource_ParametricResourceDemand = requiredCommunicationLinkResource_ParametricResourceDemand;
      requiredCommunicationLinkResource_ParametricResourceDemand = newRequiredCommunicationLinkResource_ParametricResourceDemand;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Completions_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND, oldRequiredCommunicationLinkResource_ParametricResourceDemand, requiredCommunicationLinkResource_ParametricResourceDemand));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType) {
      switch (featureID) {
         case Completions_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            if (resolve) return getRequiredCommunicationLinkResource_ParametricResourceDemand();
            return basicGetRequiredCommunicationLinkResource_ParametricResourceDemand();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue) {
      switch (featureID) {
         case Completions_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            setRequiredCommunicationLinkResource_ParametricResourceDemand((CommunicationLinkResourceType)newValue);
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
         case Completions_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            setRequiredCommunicationLinkResource_ParametricResourceDemand((CommunicationLinkResourceType)null);
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
         case Completions_avPackage.NETWORK_DEMAND_PARAMETRIC_RESOURCE_DEMAND__REQUIRED_COMMUNICATION_LINK_RESOURCE_PARAMETRIC_RESOURCE_DEMAND:
            return requiredCommunicationLinkResource_ParametricResourceDemand != null;
      }
      return super.eIsSet(featureID);
   }

} //NetworkDemandParametricResourceDemandImpl
