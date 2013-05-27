/**
 */
package org.ollabaca.on.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.model.InstanceRef#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.model.ModelPackage#getInstanceRef()
 * @model
 * @generated
 */
public interface InstanceRef extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(Instance)
   * @see org.ollabaca.on.model.ModelPackage#getInstanceRef_Value()
   * @model
   * @generated
   */
  Instance getValue();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.InstanceRef#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Instance value);

} // InstanceRef
