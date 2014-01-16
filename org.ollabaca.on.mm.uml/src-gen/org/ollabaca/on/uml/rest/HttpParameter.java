/**
 */
package org.ollabaca.on.uml.rest;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.rest.HttpParameter#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.rest.RestPackage#getHttpParameter()
 * @model
 * @generated
 */
public interface HttpParameter extends Parameter
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.ollabaca.on.uml.rest.HttpParameterKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.ollabaca.on.uml.rest.HttpParameterKind
   * @see #setKind(HttpParameterKind)
   * @see org.ollabaca.on.uml.rest.RestPackage#getHttpParameter_Kind()
   * @model unique="false" required="true"
   * @generated
   */
  HttpParameterKind getKind();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.rest.HttpParameter#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.ollabaca.on.uml.rest.HttpParameterKind
   * @see #getKind()
   * @generated
   */
  void setKind(HttpParameterKind value);

} // HttpParameter
