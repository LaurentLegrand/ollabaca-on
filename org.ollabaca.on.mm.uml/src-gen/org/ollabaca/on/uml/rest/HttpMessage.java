/**
 */
package org.ollabaca.on.uml.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.rest.HttpMessage#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.rest.HttpMessage#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.rest.RestPackage#getHttpMessage()
 * @model
 * @generated
 */
public interface HttpMessage extends Classifier
{
  /**
   * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.uml2.uml.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Headers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headers</em>' containment reference list.
   * @see org.ollabaca.on.uml.rest.RestPackage#getHttpMessage_Headers()
   * @model containment="true"
   * @generated
   */
  EList<Property> getHeaders();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(Property)
   * @see org.ollabaca.on.uml.rest.RestPackage#getHttpMessage_Content()
   * @model containment="true"
   * @generated
   */
  Property getContent();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.rest.HttpMessage#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(Property value);

} // HttpMessage
