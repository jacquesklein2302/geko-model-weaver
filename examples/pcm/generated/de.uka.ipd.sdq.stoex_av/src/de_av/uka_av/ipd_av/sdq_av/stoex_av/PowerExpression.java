/**
 */
package de_av.uka_av.ipd_av.sdq_av.stoex_av;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.PowerExpression#getBase <em>Base</em>}</li>
 *   <li>{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.PowerExpression#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage#getPowerExpression()
 * @model
 * @generated
 */
public interface PowerExpression extends Power {
   /**
    * Returns the value of the '<em><b>Base</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Base</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Base</em>' containment reference.
    * @see #setBase(Power)
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage#getPowerExpression_Base()
    * @model containment="true" ordered="false"
    * @generated
    */
   Power getBase();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.PowerExpression#getBase <em>Base</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Base</em>' containment reference.
    * @see #getBase()
    * @generated
    */
   void setBase(Power value);

   /**
    * Returns the value of the '<em><b>Exponent</b></em>' containment reference.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Exponent</em>' containment reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Exponent</em>' containment reference.
    * @see #setExponent(Unary)
    * @see de_av.uka_av.ipd_av.sdq_av.stoex_av.Stoex_avPackage#getPowerExpression_Exponent()
    * @model containment="true" ordered="false"
    * @generated
    */
   Unary getExponent();

   /**
    * Sets the value of the '{@link de_av.uka_av.ipd_av.sdq_av.stoex_av.PowerExpression#getExponent <em>Exponent</em>}' containment reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @param value the new value of the '<em>Exponent</em>' containment reference.
    * @see #getExponent()
    * @generated
    */
   void setExponent(Unary value);

} // PowerExpression
