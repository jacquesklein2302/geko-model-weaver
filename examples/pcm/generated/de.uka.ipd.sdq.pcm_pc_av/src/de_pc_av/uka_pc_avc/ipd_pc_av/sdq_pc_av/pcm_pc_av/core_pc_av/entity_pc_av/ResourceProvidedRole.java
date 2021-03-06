/**
 */
package de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.repository_pc_av.Role;

import de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.resourcetype_pc_av.ResourceInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Provided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}</li>
 *   <li>{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole <em>Provided Resource Interface Resource Provided Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage#getResourceProvidedRole()
 * @model
 * @generated
 */
public interface ResourceProvidedRole extends Role {
   /**
    * Returns the value of the '<em><b>Resource Interface Providing Entity Resource Provided Role</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity <em>Resource Provided Roles Resource Interface Providing Entity</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Resource Interface Providing Entity Resource Provided Role</em>' container reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Resource Interface Providing Entity Resource Provided Role</em>' container reference.
    * @see #setResourceInterfaceProvidingEntity__ResourceProvidedRole(ResourceInterfaceProvidingEntity)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage#getResourceProvidedRole_ResourceInterfaceProvidingEntity__ResourceProvidedRole()
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceInterfaceProvidingEntity#getResourceProvidedRoles__ResourceInterfaceProvidingEntity
    * @model opposite="resourceProvidedRoles__ResourceInterfaceProvidingEntity" transient="false" ordered="false"
    * @generated
    */
   ResourceInterfaceProvidingEntity getResourceInterfaceProvidingEntity__ResourceProvidedRole();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceProvidedRole#getResourceInterfaceProvidingEntity__ResourceProvidedRole <em>Resource Interface Providing Entity Resource Provided Role</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Resource Interface Providing Entity Resource Provided Role</em>' container reference.
    * @see #getResourceInterfaceProvidingEntity__ResourceProvidedRole()
    * @generated
    */
   void setResourceInterfaceProvidingEntity__ResourceProvidedRole(ResourceInterfaceProvidingEntity value);

   /**
    * Returns the value of the '<em><b>Provided Resource Interface Resource Provided Role</b></em>' reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Provided Resource Interface Resource Provided Role</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Provided Resource Interface Resource Provided Role</em>' reference.
    * @see #setProvidedResourceInterface__ResourceProvidedRole(ResourceInterface)
    * @see de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.Entity_pc_avPackage#getResourceProvidedRole_ProvidedResourceInterface__ResourceProvidedRole()
    * @model ordered="false"
    * @generated
    */
   ResourceInterface getProvidedResourceInterface__ResourceProvidedRole();

   /**
    * Sets the value of the '{@link de_pc_av.uka_pc_avc.ipd_pc_av.sdq_pc_av.pcm_pc_av.core_pc_av.entity_pc_av.ResourceProvidedRole#getProvidedResourceInterface__ResourceProvidedRole <em>Provided Resource Interface Resource Provided Role</em>}' reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Provided Resource Interface Resource Provided Role</em>' reference.
    * @see #getProvidedResourceInterface__ResourceProvidedRole()
    * @generated
    */
   void setProvidedResourceInterface__ResourceProvidedRole(ResourceInterface value);

} // ResourceProvidedRole
