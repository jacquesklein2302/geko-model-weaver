/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.impl.EntityImpl;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.reliability_pc_av.FailureType;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.ExceptionType;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Repository_pc_avPackage;
import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Signature;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SignatureImpl#getExceptions__Signature <em>Exceptions Signature</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.impl.SignatureImpl#getFailureType <em>Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImpl extends EntityImpl implements Signature {
   /**
    * The cached value of the '{@link #getExceptions__Signature() <em>Exceptions Signature</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getExceptions__Signature()
    * @generated
    * @ordered
    */
   protected EList<ExceptionType> exceptions__Signature;

   /**
    * The cached value of the '{@link #getFailureType() <em>Failure Type</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getFailureType()
    * @generated
    * @ordered
    */
   protected EList<FailureType> failureType;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected SignatureImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Repository_pc_avPackage.Literals.SIGNATURE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<ExceptionType> getExceptions__Signature() {
      if (exceptions__Signature == null) {
         exceptions__Signature = new EObjectContainmentEList<ExceptionType>(ExceptionType.class, this, Repository_pc_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE);
      }
      return exceptions__Signature;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<FailureType> getFailureType() {
      if (failureType == null) {
         failureType = new EObjectResolvingEList<FailureType>(FailureType.class, this, Repository_pc_avPackage.SIGNATURE__FAILURE_TYPE);
      }
      return failureType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Repository_pc_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            return ((InternalEList<?>)getExceptions__Signature()).basicRemove(otherEnd, msgs);
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
         case Repository_pc_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            return getExceptions__Signature();
         case Repository_pc_avPackage.SIGNATURE__FAILURE_TYPE:
            return getFailureType();
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
         case Repository_pc_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            getExceptions__Signature().clear();
            getExceptions__Signature().addAll((Collection<? extends ExceptionType>)newValue);
            return;
         case Repository_pc_avPackage.SIGNATURE__FAILURE_TYPE:
            getFailureType().clear();
            getFailureType().addAll((Collection<? extends FailureType>)newValue);
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
         case Repository_pc_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            getExceptions__Signature().clear();
            return;
         case Repository_pc_avPackage.SIGNATURE__FAILURE_TYPE:
            getFailureType().clear();
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
         case Repository_pc_avPackage.SIGNATURE__EXCEPTIONS_SIGNATURE:
            return exceptions__Signature != null && !exceptions__Signature.isEmpty();
         case Repository_pc_avPackage.SIGNATURE__FAILURE_TYPE:
            return failureType != null && !failureType.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} //SignatureImpl
