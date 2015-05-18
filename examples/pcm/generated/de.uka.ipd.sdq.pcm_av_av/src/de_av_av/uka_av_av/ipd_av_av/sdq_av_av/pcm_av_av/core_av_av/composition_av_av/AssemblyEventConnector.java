/**
 */
package de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.PCMRandomVariable;

import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.SinkRole;
import de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.repository_av_av.SourceRole;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Event Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AssemblyConnector is a bidirectional link of two assembly contexts. Intuitively, an AssemblyEventConnector connects a sink and a source. AssemblyContext must refer to the tuple (Role,AssemblyContext) in order to uniquely identify which component sink and source roles communicate with each other.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSinkRole__AssemblyEventConnector <em>Sink Role Assembly Event Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSourceRole__AssemblyEventConnector <em>Source Role Assembly Event Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSinkAssemblyContext__AssemblyEventConnector <em>Sink Assembly Context Assembly Event Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSourceAssemblyContext__AssemblyEventConnector <em>Source Assembly Context Assembly Event Connector</em>}</li>
 *   <li>{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector <em>Filter Condition Assembly Event Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyEventConnector()
 * @model
 * @generated
 */
public interface AssemblyEventConnector extends Connector {
   /**
    * Returns the value of the '<em><b>Sink Role Assembly Event Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sink Role Assembly Event Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sink Role Assembly Event Connector</em>' reference.
    * @see #setSinkRole__AssemblyEventConnector(SinkRole)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyEventConnector_SinkRole__AssemblyEventConnector()
    * @model ordered="false"
    * @generated
    */
   SinkRole getSinkRole__AssemblyEventConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSinkRole__AssemblyEventConnector <em>Sink Role Assembly Event Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sink Role Assembly Event Connector</em>' reference.
    * @see #getSinkRole__AssemblyEventConnector()
    * @generated
    */
   void setSinkRole__AssemblyEventConnector(SinkRole value);

   /**
    * Returns the value of the '<em><b>Source Role Assembly Event Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source Role Assembly Event Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source Role Assembly Event Connector</em>' reference.
    * @see #setSourceRole__AssemblyEventConnector(SourceRole)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyEventConnector_SourceRole__AssemblyEventConnector()
    * @model ordered="false"
    * @generated
    */
   SourceRole getSourceRole__AssemblyEventConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSourceRole__AssemblyEventConnector <em>Source Role Assembly Event Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Role Assembly Event Connector</em>' reference.
    * @see #getSourceRole__AssemblyEventConnector()
    * @generated
    */
   void setSourceRole__AssemblyEventConnector(SourceRole value);

   /**
    * Returns the value of the '<em><b>Sink Assembly Context Assembly Event Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sink Assembly Context Assembly Event Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Sink Assembly Context Assembly Event Connector</em>' reference.
    * @see #setSinkAssemblyContext__AssemblyEventConnector(AssemblyContext)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyEventConnector_SinkAssemblyContext__AssemblyEventConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getSinkAssemblyContext__AssemblyEventConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSinkAssemblyContext__AssemblyEventConnector <em>Sink Assembly Context Assembly Event Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Sink Assembly Context Assembly Event Connector</em>' reference.
    * @see #getSinkAssemblyContext__AssemblyEventConnector()
    * @generated
    */
   void setSinkAssemblyContext__AssemblyEventConnector(AssemblyContext value);

   /**
    * Returns the value of the '<em><b>Source Assembly Context Assembly Event Connector</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Source Assembly Context Assembly Event Connector</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Source Assembly Context Assembly Event Connector</em>' reference.
    * @see #setSourceAssemblyContext__AssemblyEventConnector(AssemblyContext)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyEventConnector_SourceAssemblyContext__AssemblyEventConnector()
    * @model ordered="false"
    * @generated
    */
   AssemblyContext getSourceAssemblyContext__AssemblyEventConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getSourceAssemblyContext__AssemblyEventConnector <em>Source Assembly Context Assembly Event Connector</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Source Assembly Context Assembly Event Connector</em>' reference.
    * @see #getSourceAssemblyContext__AssemblyEventConnector()
    * @generated
    */
   void setSourceAssemblyContext__AssemblyEventConnector(AssemblyContext value);

   /**
    * Returns the value of the '<em><b>Filter Condition Assembly Event Connector</b></em>' containment reference.
    * It is bidirectional and its opposite is '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.PCMRandomVariable#getAssemblyEventConnector__FilterCondition <em>Assembly Event Connector Filter Condition</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Filter Condition Assembly Event Connector</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Filter Condition Assembly Event Connector</em>' containment reference.
    * @see #setFilterCondition__AssemblyEventConnector(PCMRandomVariable)
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.Composition_av_avPackage#getAssemblyEventConnector_FilterCondition__AssemblyEventConnector()
    * @see de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.PCMRandomVariable#getAssemblyEventConnector__FilterCondition
    * @model opposite="assemblyEventConnector__FilterCondition" containment="true" ordered="false"
    * @generated
    */
   PCMRandomVariable getFilterCondition__AssemblyEventConnector();

   /**
    * Sets the value of the '{@link de_av_av.uka_av_av.ipd_av_av.sdq_av_av.pcm_av_av.core_av_av.composition_av_av.AssemblyEventConnector#getFilterCondition__AssemblyEventConnector <em>Filter Condition Assembly Event Connector</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Filter Condition Assembly Event Connector</em>' containment reference.
    * @see #getFilterCondition__AssemblyEventConnector()
    * @generated
    */
   void setFilterCondition__AssemblyEventConnector(PCMRandomVariable value);

} // AssemblyEventConnector