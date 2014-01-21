/**
 */
package org.ollabaca.on.mm.rest;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.rest.HttpResource#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.rest.RestPackage#getHttpResource()
 * @model
 * @generated
 */
public interface HttpResource extends Interface
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.ollabaca.on.mm.rest.RestPackage#getHttpResource_Path()
   * @model unique="false"
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.rest.HttpResource#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // HttpResource
