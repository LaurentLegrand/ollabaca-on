/**
 */
package org.ollabaca.on.uml.book;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.book.Section#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.book.Section#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.book.BookPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends BookElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see org.ollabaca.on.uml.book.BookPackage#getSection_Elements()
   * @model
   * @generated
   */
  EList<Element> getElements();

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.uml.book.Section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.ollabaca.on.uml.book.BookPackage#getSection_Sections()
   * @model containment="true"
   * @generated
   */
  EList<Section> getSections();

} // Section
