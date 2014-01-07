/**
 */
package org.ollabaca.on.uml.task;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.task.Warning#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.task.TaskPackage#getWarning()
 * @model
 * @generated
 */
public interface Warning extends Comment
{
  /**
   * Returns the value of the '<em><b>Mitigation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mitigation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mitigation</em>' containment reference.
   * @see #setMitigation(Note)
   * @see org.ollabaca.on.uml.task.TaskPackage#getWarning_Mitigation()
   * @model containment="true"
   * @generated
   */
  Note getMitigation();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.task.Warning#getMitigation <em>Mitigation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mitigation</em>' containment reference.
   * @see #getMitigation()
   * @generated
   */
  void setMitigation(Note value);

} // Warning
