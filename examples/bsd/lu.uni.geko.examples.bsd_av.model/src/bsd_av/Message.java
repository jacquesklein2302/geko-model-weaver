/**
 */
package bsd_av;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bsd_av.Message#getSendEvent <em>Send Event</em>}</li>
 *   <li>{@link bsd_av.Message#getReceiveEvent <em>Receive Event</em>}</li>
 *   <li>{@link bsd_av.Message#getParameters <em>Parameters</em>}</li>
 *   <li>{@link bsd_av.Message#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bsd_av.Bsd_avPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Send Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Event</em>' containment reference.
	 * @see #setSendEvent(SendEvent)
	 * @see bsd_av.Bsd_avPackage#getMessage_SendEvent()
	 * @model containment="true"
	 * @generated
	 */
	SendEvent getSendEvent();

	/**
	 * Sets the value of the '{@link bsd_av.Message#getSendEvent <em>Send Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Event</em>' containment reference.
	 * @see #getSendEvent()
	 * @generated
	 */
	void setSendEvent(SendEvent value);

	/**
	 * Returns the value of the '<em><b>Receive Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Event</em>' containment reference.
	 * @see #setReceiveEvent(ReceiveEvent)
	 * @see bsd_av.Bsd_avPackage#getMessage_ReceiveEvent()
	 * @model containment="true"
	 * @generated
	 */
	ReceiveEvent getReceiveEvent();

	/**
	 * Sets the value of the '{@link bsd_av.Message#getReceiveEvent <em>Receive Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Event</em>' containment reference.
	 * @see #getReceiveEvent()
	 * @generated
	 */
	void setReceiveEvent(ReceiveEvent value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see bsd_av.Bsd_avPackage#getMessage_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see bsd_av.Bsd_avPackage#getMessage_Type()
	 * @model
	 * @generated
	 */
	EList<String> getType();

} // Message
