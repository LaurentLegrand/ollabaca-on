/**
 */
package org.ollabaca.on.mm.om;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.om.Measure#getProperty <em>Property</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.om.Measure#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.om.OmPackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends OmElement
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Property)
   * @see org.ollabaca.on.mm.om.OmPackage#getMeasure_Property()
   * @model
   * @generated
   */
  Property getProperty();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.om.Measure#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Property value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' reference.
   * @see #setUnit(Unit)
   * @see org.ollabaca.on.mm.om.OmPackage#getMeasure_Unit()
   * @model
   * @generated
   */
  Unit getUnit();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.om.Measure#getUnit <em>Unit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' reference.
   * @see #getUnit()
   * @generated
   */
  void setUnit(Unit value);

} // Measure
