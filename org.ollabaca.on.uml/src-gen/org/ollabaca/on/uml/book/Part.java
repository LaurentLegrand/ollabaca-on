/**
 */
package org.ollabaca.on.uml.book;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.book.Part#getChapters <em>Chapters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.book.BookPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends BookElement
{
  /**
   * Returns the value of the '<em><b>Chapters</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.uml.book.Chapter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chapters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chapters</em>' containment reference list.
   * @see org.ollabaca.on.uml.book.BookPackage#getPart_Chapters()
   * @model containment="true"
   * @generated
   */
  EList<Chapter> getChapters();

} // Part
