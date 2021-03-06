/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.entity_av.Entity;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SAnnotations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * QoSAnnotations allow software architects and performance analysts to annotate Quality of Service (QoS) attributes to services (i.e., signatures of an interface). It is important to note that these annotations are specified and not derived. Usually the PCM uses the internal specification of a components behaviour (i.e., its RD-SEFFs) to determine its QoS. However, in a mixed top down and bottom up approach as favoured by the PCM, software architects have to combine components whose internals are not yet known with fully specified components. QoSAnnotations provide a first perforamnce (or reliability) abstraction of the services offered by a component using the SpecifiedQoSAnnotation. They furthermore define the output parameters of the services without describing its internal behviour.
 * 
 * Notes:
 * - Should the association of QoSAnnotations to services not be in the class QoSAnnotation instead of SpecifiedQoSAnnotation and SpecifiedOutputParameterAbstraction separately?
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.QoSAnnotations#getSpecifiedOutputParameterAbstractions_QoSAnnotations <em>Specified Output Parameter Abstractions Qo SAnnotations</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.QoSAnnotations#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.QoSAnnotations#getSpecifiedQoSAnnotations_QoSAnnotations <em>Specified Qo SAnnotations Qo SAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage#getQoSAnnotations()
 * @model
 * @generated
 */
public interface QoSAnnotations extends Entity {
   /**
    * Returns the value of the '<em><b>Specified Output Parameter Abstractions Qo SAnnotations</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedOutputParameterAbstraction}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction <em>Qos Annotations Specified Output Parameter Abstraction</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Specified Output Parameter Abstractions Qo SAnnotations</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage#getQoSAnnotations_SpecifiedOutputParameterAbstractions_QoSAnnotations()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedOutputParameterAbstraction#getQosAnnotations_SpecifiedOutputParameterAbstraction
    * @model opposite="qosAnnotations_SpecifiedOutputParameterAbstraction" containment="true" ordered="false"
    * @generated
    */
   EList<SpecifiedOutputParameterAbstraction> getSpecifiedOutputParameterAbstractions_QoSAnnotations();

   /**
    * Returns the value of the '<em><b>System Qo SAnnotations</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System#getQosAnnotations_System <em>Qos Annotations System</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>System Qo SAnnotations</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>System Qo SAnnotations</em>' container reference.
    * @see #setSystem_QoSAnnotations(de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage#getQoSAnnotations_System_QoSAnnotations()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System#getQosAnnotations_System
    * @model opposite="qosAnnotations_System" transient="false" ordered="false"
    * @generated
    */
   de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System getSystem_QoSAnnotations();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.QoSAnnotations#getSystem_QoSAnnotations <em>System Qo SAnnotations</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>System Qo SAnnotations</em>' container reference.
    * @see #getSystem_QoSAnnotations()
    * @generated
    */
   void setSystem_QoSAnnotations(de_av.uka_av.ipd_av.sdq_av.pcm_av.system_av.System value);

   /**
    * Returns the value of the '<em><b>Specified Qo SAnnotations Qo SAnnotations</b></em>' containment reference list.
    * The list contents are of type {@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedQoSAnnotation}.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation <em>Qos Annotations Specified Qo SAnnotation</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Specified Qo SAnnotations Qo SAnnotations</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Specified Qo SAnnotations Qo SAnnotations</em>' containment reference list.
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.Qosannotations_avPackage#getQoSAnnotations_SpecifiedQoSAnnotations_QoSAnnotations()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.qosannotations_av.SpecifiedQoSAnnotation#getQosAnnotations_SpecifiedQoSAnnotation
    * @model opposite="qosAnnotations_SpecifiedQoSAnnotation" containment="true" ordered="false"
    * @generated
    */
   EList<SpecifiedQoSAnnotation> getSpecifiedQoSAnnotations_QoSAnnotations();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * @param diagnostics The chain of diagnostics to which problems are to be appended.
    * @param context The cache of context-specific information.
    * <!-- end-model-doc -->
    * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.specifiedQoSAnnotations_QoSAnnotations->select(oclIsTypeOf(pcm::qosannotations::qos_reliability::SpecifiedReliabilityAnnotation))->forAll( x, y | ( x<>y ) implies ( ( x.role_SpecifiedQoSAnnotation <> y.role_SpecifiedQoSAnnotation )  or ( x.signature_SpecifiedQoSAnnation <> y.signature_SpecifiedQoSAnnation ) ) )'"
    * @generated
    */
   boolean MultipleReliabilityAnnotationsPerExternalCallNotAllowed(DiagnosticChain diagnostics, Map<Object, Object> context);

} // QoSAnnotations
