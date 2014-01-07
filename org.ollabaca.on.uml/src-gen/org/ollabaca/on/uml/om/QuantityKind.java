/**
 */
package org.ollabaca.on.uml.om;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.om.QuantityKind#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.om.OmPackage#getQuantityKind()
 * @model
 * @generated
 */
public interface QuantityKind extends DataType, OmElement
{
  /**
   * Returns the value of the '<em><b>Dimension</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.uml.om.Dimension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' containment reference list.
   * @see org.ollabaca.on.uml.om.OmPackage#getQuantityKind_Dimension()
   * @model containment="true"
   * @generated
   */
  EList<Dimension> getDimension();

} // QuantityKind
