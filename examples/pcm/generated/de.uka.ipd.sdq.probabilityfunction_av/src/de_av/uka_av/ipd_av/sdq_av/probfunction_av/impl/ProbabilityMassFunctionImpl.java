/**
 */
package de_av.uka_av.ipd_av.sdq_av.probfunction_av.impl;

import de_av.uka_av.ipd_av.sdq_av.probfunction_av.ProbabilityMassFunction;
import de_av.uka_av.ipd_av.sdq_av.probfunction_av.Probfunction_avPackage;
import de_av.uka_av.ipd_av.sdq_av.probfunction_av.Sample;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probability Mass Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.impl.ProbabilityMassFunctionImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.probfunction_av.impl.ProbabilityMassFunctionImpl#isOrderedDomain <em>Ordered Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProbabilityMassFunctionImpl extends ProbabilityFunctionImpl implements ProbabilityMassFunction {
   /**
    * The cached value of the '{@link #getSamples() <em>Samples</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSamples()
    * @generated
    * @ordered
    */
   protected EList<Sample> samples;

   /**
    * The default value of the '{@link #isOrderedDomain() <em>Ordered Domain</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isOrderedDomain()
    * @generated
    * @ordered
    */
   protected static final boolean ORDERED_DOMAIN_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isOrderedDomain() <em>Ordered Domain</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #isOrderedDomain()
    * @generated
    * @ordered
    */
   protected boolean orderedDomain = ORDERED_DOMAIN_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ProbabilityMassFunctionImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return Probfunction_avPackage.Literals.PROBABILITY_MASS_FUNCTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<Sample> getSamples() {
      if (samples == null) {
         samples = new EObjectContainmentEList<Sample>(Sample.class, this, Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__SAMPLES);
      }
      return samples;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public boolean isOrderedDomain() {
      return orderedDomain;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setOrderedDomain(boolean newOrderedDomain) {
      boolean oldOrderedDomain = orderedDomain;
      orderedDomain = newOrderedDomain;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN, oldOrderedDomain, orderedDomain));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
      switch (featureID) {
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return ((InternalEList<?>)getSamples()).basicRemove(otherEnd, msgs);
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
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return getSamples();
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            return isOrderedDomain();
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
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            getSamples().clear();
            getSamples().addAll((Collection<? extends Sample>)newValue);
            return;
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            setOrderedDomain((Boolean)newValue);
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
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            getSamples().clear();
            return;
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            setOrderedDomain(ORDERED_DOMAIN_EDEFAULT);
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
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__SAMPLES:
            return samples != null && !samples.isEmpty();
         case Probfunction_avPackage.PROBABILITY_MASS_FUNCTION__ORDERED_DOMAIN:
            return orderedDomain != ORDERED_DOMAIN_EDEFAULT;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString() {
      if (eIsProxy()) return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (orderedDomain: ");
      result.append(orderedDomain);
      result.append(')');
      return result.toString();
   }

} //ProbabilityMassFunctionImpl
