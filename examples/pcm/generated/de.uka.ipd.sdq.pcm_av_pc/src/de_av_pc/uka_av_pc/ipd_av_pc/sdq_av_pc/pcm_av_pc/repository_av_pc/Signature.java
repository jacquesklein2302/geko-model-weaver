/**
 */
package de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.core_av_pc.entity_av_pc.Entity;

import de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     This&nbsp;entity&nbsp;represents&nbsp;the&nbsp;signature&nbsp;of&nbsp;a&nbsp;method,&nbsp;i.e.,&nbsp;its&nbsp;parameters,&nbsp;exception&nbsp;declarations,&nbsp;return&nbsp;type,&nbsp;etc.<br />
 *     <br />
 *     Every&nbsp;service&nbsp;of&nbsp;an&nbsp;interface&nbsp;has&nbsp;a&nbsp;unique&nbsp;signature,&nbsp;like&nbsp;void&nbsp;doSomething(int&nbsp;a).&nbsp;A&nbsp;PCM&nbsp;signature&nbsp;is&nbsp;comparable&nbsp;to&nbsp;a&nbsp;method&nbsp;signature&nbsp;in&nbsp;programming&nbsp;languages&nbsp;like&nbsp;C#,&nbsp;Java&nbsp;or&nbsp;the&nbsp;OMG&nbsp;IDL.<br />
 *     <br />
 *     It&nbsp;contains:<br />
 *     <br />
 *     *&nbsp;A&nbsp;type&nbsp;of&nbsp;the&nbsp;return&nbsp;value&nbsp;or&nbsp;void&nbsp;(no&nbsp;return&nbsp;value),<br />
 *     <br />
 *     *&nbsp;an&nbsp;identifier&nbsp;naming&nbsp;the&nbsp;service,<br />
 *     <br />
 *     *&nbsp;an&nbsp;ordered&nbsp;set&nbsp;of&nbsp;parameters&nbsp;(0..*).Each&nbsp;parameter&nbsp;is&nbsp;a&nbsp;tuple&nbsp;of&nbsp;a&nbsp;datatype&nbsp;and&nbsp;an&nbsp;identifier&nbsp;(which&nbsp;is&nbsp;unique&nbsp;across&nbsp;the&nbsp;parameters).&nbsp;Additionally,&nbsp;the&nbsp;modifiers&nbsp;in,&nbsp;out,&nbsp;and&nbsp;inout&nbsp;(with&nbsp;its&nbsp;OMG<br />
 *     IDL&nbsp;semantics)&nbsp;can&nbsp;be&nbsp;used&nbsp;for&nbsp;parameters,&nbsp;and<br />
 *     <br />
 *     *&nbsp;an&nbsp;unordered&nbsp;set&nbsp;of&nbsp;exceptions.<br />
 *     <br />
 *     A&nbsp;signature&nbsp;has&nbsp;to&nbsp;be&nbsp;unique&nbsp;for&nbsp;an&nbsp;interface&nbsp;through&nbsp;the&nbsp;tupel&nbsp;(identifier,&nbsp;order&nbsp;of&nbsp;parameters).&nbsp;An&nbsp;interface&nbsp;has&nbsp;a&nbsp;list&nbsp;of&nbsp;1..*&nbsp;signatures&nbsp;(interfaces&nbsp;associate&nbsp;1..*&nbsp;signatures,&nbsp;not&nbsp;the&nbsp;other&nbsp;way&nbsp;around).&nbsp;A<br />
 *     signature&nbsp;is&nbsp;assigned&nbsp;to&nbsp;exactly&nbsp;one&nbsp;interface.&nbsp;However,&nbsp;different&nbsp;interfaces&nbsp;can&nbsp;define&nbsp;equally&nbsp;named&nbsp;signatures.&nbsp;If,&nbsp;for&nbsp;example,&nbsp;void&nbsp;doIt()&nbsp;is&nbsp;defined&nbsp;for&nbsp;interface&nbsp;A&nbsp;and&nbsp;B,&nbsp;void&nbsp;doIt()&nbsp;is&nbsp;not&nbsp;identical&nbsp;in&nbsp;both&nbsp;interfaces.
 * </p>
 * <p>
 *     Failure that may occur inside external services must be specified at the service signatures. This way components that
 *     use this services may implement failure handling without knowing the internal behaviour of the connected component.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Signature#getExceptions__Signature <em>Exceptions Signature</em>}</li>
 *   <li>{@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Signature#getFailureType <em>Failure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends Entity {
   /**
    * Returns the value of the '<em><b>Exceptions Signature</b></em>' containment reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.ExceptionType}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * This property represents the list of exceptions declared by this signature.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Exceptions Signature</em>' containment reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getSignature_Exceptions__Signature()
    * @model containment="true" ordered="false"
    * @generated
    */
   EList<ExceptionType> getExceptions__Signature();

   /**
    * Returns the value of the '<em><b>Failure Type</b></em>' reference list.
    * The list contents are of type {@link de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.reliability_av_pc.FailureType}.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * <!-- begin-model-doc -->
    * Optional&nbsp;specification&nbsp;of&nbsp;failure&nbsp;types&nbsp;that&nbsp;can&nbsp;happen&nbsp;on&nbsp;execution&nbsp;of&nbsp;the&nbsp;specified&nbsp;service.
    * <!-- end-model-doc -->
    * @return the value of the '<em>Failure Type</em>' reference list.
    * @see de_av_pc.uka_av_pc.ipd_av_pc.sdq_av_pc.pcm_av_pc.repository_av_pc.Repository_av_pcPackage#getSignature_FailureType()
    * @model ordered="false"
    * @generated
    */
   EList<FailureType> getFailureType();

} // Signature
