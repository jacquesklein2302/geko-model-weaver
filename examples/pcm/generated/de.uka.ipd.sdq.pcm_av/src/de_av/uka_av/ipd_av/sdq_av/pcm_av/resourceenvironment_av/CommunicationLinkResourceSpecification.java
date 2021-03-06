/**
 */
package de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av;

import de_av.uka_av.ipd_av.sdq_av.identifier_av.Identifier;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable;

import de_av.uka_av.ipd_av.sdq_av.pcm_av.resourcetype_av.CommunicationLinkResourceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link Resource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Throughput and performance specification of linking resources
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getFailureProbability <em>Failure Probability</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getCommunicationLinkResourceSpecification()
 * @model
 * @generated
 */
public interface CommunicationLinkResourceSpecification extends Identifier {
   /**
    * Returns the value of the '<em><b>Linking Resource Communication Link Resource Specification</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource <em>Communication Link Resource Specifications Linking Resource</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Linking Resource Communication Link Resource Specification</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Linking Resource Communication Link Resource Specification</em>' container reference.
    * @see #setLinkingResource_CommunicationLinkResourceSpecification(LinkingResource)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getCommunicationLinkResourceSpecification_LinkingResource_CommunicationLinkResourceSpecification()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.LinkingResource#getCommunicationLinkResourceSpecifications_LinkingResource
    * @model opposite="communicationLinkResourceSpecifications_LinkingResource" transient="false" ordered="false"
    * @generated
    */
   LinkingResource getLinkingResource_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getLinkingResource_CommunicationLinkResourceSpecification <em>Linking Resource Communication Link Resource Specification</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Linking Resource Communication Link Resource Specification</em>' container reference.
    * @see #getLinkingResource_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setLinkingResource_CommunicationLinkResourceSpecification(LinkingResource value);

   /**
    * Returns the value of the '<em><b>Failure Probability</b></em>' attribute.
    * The default value is <code>"0.0"</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Specifies the probability that a service call over this communication link fails. The failure could be due to message loss or overload, for example.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Failure Probability</em>' attribute.
    * @see #setFailureProbability(double)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getCommunicationLinkResourceSpecification_FailureProbability()
    * @model default="0.0" required="true" ordered="false"
    * @generated
    */
   double getFailureProbability();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getFailureProbability <em>Failure Probability</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Failure Probability</em>' attribute.
    * @see #getFailureProbability()
    * @generated
    */
   void setFailureProbability(double value);

   /**
    * Returns the value of the '<em><b>Communication Link Resource Type Communication Link Resource Specification</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Communication Link Resource Type Communication Link Resource Specification</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Communication Link Resource Type Communication Link Resource Specification</em>' reference.
    * @see #setCommunicationLinkResourceType_CommunicationLinkResourceSpecification(CommunicationLinkResourceType)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getCommunicationLinkResourceSpecification_CommunicationLinkResourceType_CommunicationLinkResourceSpecification()
    * @model ordered="false"
    * @generated
    */
   CommunicationLinkResourceType getCommunicationLinkResourceType_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getCommunicationLinkResourceType_CommunicationLinkResourceSpecification <em>Communication Link Resource Type Communication Link Resource Specification</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Communication Link Resource Type Communication Link Resource Specification</em>' reference.
    * @see #getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setCommunicationLinkResourceType_CommunicationLinkResourceSpecification(CommunicationLinkResourceType value);

   /**
    * Returns the value of the '<em><b>Latency Communication Link Resource Specification</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable <em>Communication Link Resource Specification latency PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Specifies the latency of this linking resource in the simulated time unit. The latency is the time that a message on this linking resource takes to receive the receiver. In synchronous communication (call and return), the latency is added twice to the duration, once for the call and once for the response. 
    * <!-- end-model-doc -->
    * @return the value of the '<em>Latency Communication Link Resource Specification</em>' containment reference.
    * @see #setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getCommunicationLinkResourceSpecification_Latency_CommunicationLinkResourceSpecification()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecification_latency_PCMRandomVariable
    * @model opposite="communicationLinkResourceSpecification_latency_PCMRandomVariable" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getLatency_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getLatency_CommunicationLinkResourceSpecification <em>Latency Communication Link Resource Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Latency Communication Link Resource Specification</em>' containment reference.
    * @see #getLatency_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setLatency_CommunicationLinkResourceSpecification(PCMRandomVariable value);

   /**
    * Returns the value of the '<em><b>Throughput Communication Link Resource Specification</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable <em>Communication Link Resource Specifcation throughput PCM Random Variable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Specifies the maximum throughput of this linking resource in byte per simulated time unit. 
    * <!-- end-model-doc -->
    * @return the value of the '<em>Throughput Communication Link Resource Specification</em>' containment reference.
    * @see #setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable)
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.Resourceenvironment_avPackage#getCommunicationLinkResourceSpecification_Throughput_CommunicationLinkResourceSpecification()
    * @see de_av.uka_av.ipd_av.sdq_av.pcm_av.core_av.PCMRandomVariable#getCommunicationLinkResourceSpecifcation_throughput_PCMRandomVariable
    * @model opposite="communicationLinkResourceSpecifcation_throughput_PCMRandomVariable" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getThroughput_CommunicationLinkResourceSpecification();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.pcm_av.resourceenvironment_av.CommunicationLinkResourceSpecification#getThroughput_CommunicationLinkResourceSpecification <em>Throughput Communication Link Resource Specification</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Throughput Communication Link Resource Specification</em>' containment reference.
    * @see #getThroughput_CommunicationLinkResourceSpecification()
    * @generated
    */
   void setThroughput_CommunicationLinkResourceSpecification(PCMRandomVariable value);

} // CommunicationLinkResourceSpecification
