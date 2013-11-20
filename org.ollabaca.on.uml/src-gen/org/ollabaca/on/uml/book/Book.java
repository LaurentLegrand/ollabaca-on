/**
 */
package org.ollabaca.on.uml.book;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.book.Book#getParts <em>Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.book.BookPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends BookElement
{
  /**
   * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.uml.book.Part}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' containment reference list.
   * @see org.ollabaca.on.uml.book.BookPackage#getBook_Parts()
   * @model containment="true"
   * @generated
   */
  EList<Part> getParts();

} // Book
