/**
 */
package org.ollabaca.on.mm.task.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.CommentImpl;

import org.ollabaca.on.mm.task.Note;
import org.ollabaca.on.mm.task.TaskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NoteImpl extends CommentImpl implements Note
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NoteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TaskPackage.Literals.NOTE;
  }

} //NoteImpl
