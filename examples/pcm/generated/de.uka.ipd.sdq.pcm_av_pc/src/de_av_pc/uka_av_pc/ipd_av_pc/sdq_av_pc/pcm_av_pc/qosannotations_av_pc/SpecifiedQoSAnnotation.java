/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Role;
import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Signature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified Qo SAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     SpecifiedQoSAnnotations&nbsp;(as&nbsp;an&nbsp;abstract&nbsp;class)&nbsp;associate&nbsp;specified&nbsp;(see&nbsp;QoSAnnotation)&nbsp;QoS&nbsp;properties&nbsp;to&nbsp;services&nbsp;of&nbsp;components.&nbsp;A&nbsp;service&nbsp;is&nbsp;thereby&nbsp;determined&nbsp;by&nbsp;a&nbsp;Signature&nbsp;and&nbsp;a&nbsp;Role&nbsp;(i.e.,&nbsp;an&nbsp;interface&nbsp;bound&nbsp;to&nbsp;a&nbsp;component).
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.SpecifiedQoSAnnotation#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.SpecifiedQoSAnnotation#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage#getSpecifiedQoSAnnotation()
 * @model
 * @generated
 */
public interface SpecifiedQoSAnnotation extends EObject {
   /**
    * Returns the value of the '<em><b>Signature Specified Qo SAnnation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Signature Specified Qo SAnnation</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Signature Specified Qo SAnnation</em>' reference.
    * @see #setSignature_SpecifiedQoSAnnation(Signature)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage#getSpecifiedQoSAnnotation_Signature_SpecifiedQoSAnnation()
    * @model ordered="false"
    * @generated
    */
   Signature getSignature_SpecifiedQoSAnnation();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.SpecifiedQoSAnnotation#getSignature_SpecifiedQoSAnnation <em>Signature Specified Qo SAnnation</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Signature Specified Qo SAnnation</em>' reference.
    * @see #getSignature_SpecifiedQoSAnnation()
    * @generated
    */
   void setSignature_SpecifiedQoSAnnation(Signature value);

   /**
    * Returns the value of the '<em><b>Role Specified Qo SAnnotation</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Role Specified Qo SAnnotation</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Role Specified Qo SAnnotation</em>' reference.
    * @see #setRole_SpecifiedQoSAnnotation(Role)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage#getSpecifiedQoSAnnotation_Role_SpecifiedQoSAnnotation()
    * @model ordered="false"
    * @generated
    */
   Role getRole_SpecifiedQoSAnnotation();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.SpecifiedQoSAnnotation#getRole_SpecifiedQoSAnnotation <em>Role Specified Qo SAnnotation</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Role Specified Qo SAnnotation</em>' reference.
    * @see #getRole_SpecifiedQoSAnnotation()
    * @generated
    */
   void setRole_SpecifiedQoSAnnotation(Role value);

   /**
    * Returns the value of the '<em><b>Qos Annotations Specified Qo SAnnotation</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Qos Annotations Specified Qo SAnnotation</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Qos Annotations Specified Qo SAnnotation</em>' container reference.
    * @see #setQosAnnotations_SpecifiedQoSAnnotation(QoSAnnotations)
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.Qosannotations_av_pcPackage#getSpecifiedQoSAnnotation_QosAnnotations_SpecifiedQoSAnnotation()
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations
    * @model opposite="specifiedQoSAnnotations_QoSAnnotations" transient="false" ordered="false"
    * @generated
    */
   QoSAnnotations getQosAnnotations_SpecifiedQoSAnnotation();

   /**
    * Sets the value of the '{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.qosannotations_av_pc.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Qos Annotations Specified Qo SAnnotation</em>' container reference.
    * @see #getQosAnnotations_SpecifiedQoSAnnotation()
    * @generated
    */
   void setQosAnnotations_SpecifiedQoSAnnotation(QoSAnnotations value);

} // SpecifiedQoSAnnotation
