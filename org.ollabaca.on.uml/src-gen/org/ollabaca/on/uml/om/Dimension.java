/**
 */
package org.ollabaca.on.uml.om;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.om.Dimension#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.om.Dimension#getMagnitude <em>Magnitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.om.OmPackage#getDimension()
 * @model
 * @generated
 */
public interface Dimension extends EObject
{
  /**
   * Returns the value of the '<em><b>Quantity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity</em>' reference.
   * @see #setQuantity(QuantityKind)
   * @see org.ollabaca.on.uml.om.OmPackage#getDimension_Quantity()
   * @model
   * @generated
   */
  QuantityKind getQuantity();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.om.Dimension#getQuantity <em>Quantity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity</em>' reference.
   * @see #getQuantity()
   * @generated
   */
  void setQuantity(QuantityKind value);

  /**
   * Returns the value of the '<em><b>Magnitude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Magnitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Magnitude</em>' attribute.
   * @see #setMagnitude(float)
   * @see org.ollabaca.on.uml.om.OmPackage#getDimension_Magnitude()
   * @model unique="false"
   * @generated
   */
  float getMagnitude();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.om.Dimension#getMagnitude <em>Magnitude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Magnitude</em>' attribute.
   * @see #getMagnitude()
   * @generated
   */
  void setMagnitude(float value);

} // Dimension
