/**
 */
package org.ollabaca.on.mm.om;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.om.Unit#getQuantityKind <em>Quantity Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.om.OmPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends OmElement
{
  /**
   * Returns the value of the '<em><b>Quantity Kind</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantity Kind</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantity Kind</em>' reference.
   * @see #setQuantityKind(QuantityKind)
   * @see org.ollabaca.on.mm.om.OmPackage#getUnit_QuantityKind()
   * @model
   * @generated
   */
  QuantityKind getQuantityKind();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.om.Unit#getQuantityKind <em>Quantity Kind</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantity Kind</em>' reference.
   * @see #getQuantityKind()
   * @generated
   */
  void setQuantityKind(QuantityKind value);

} // Unit
