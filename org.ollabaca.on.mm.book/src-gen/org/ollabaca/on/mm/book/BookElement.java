/**
 */
package org.ollabaca.on.mm.book;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.book.BookElement#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.book.BookPackage#getBookElement()
 * @model
 * @generated
 */
public interface BookElement extends PackageableElement
{
  /**
   * Returns the value of the '<em><b>Documentation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' reference.
   * @see #setDocumentation(Element)
   * @see org.ollabaca.on.mm.book.BookPackage#getBookElement_Documentation()
   * @model
   * @generated
   */
  Element getDocumentation();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.book.BookElement#getDocumentation <em>Documentation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' reference.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(Element value);

} // BookElement
