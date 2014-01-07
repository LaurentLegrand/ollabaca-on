/**
 */
package org.ollabaca.on.uml.task;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.uml.task.TaskPackage
 * @generated
 */
public interface TaskFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TaskFactory eINSTANCE = org.ollabaca.on.uml.task.impl.TaskFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phase</em>'.
   * @generated
   */
  Phase createPhase();

  /**
   * Returns a new object of class '<em>Stage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stage</em>'.
   * @generated
   */
  Stage createStage();

  /**
   * Returns a new object of class '<em>Account</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Account</em>'.
   * @generated
   */
  Account createAccount();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  Task createTask();

  /**
   * Returns a new object of class '<em>Work</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work</em>'.
   * @generated
   */
  Work createWork();

  /**
   * Returns a new object of class '<em>Warning</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Warning</em>'.
   * @generated
   */
  Warning createWarning();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

  /**
   * Returns a new object of class '<em>Important</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Important</em>'.
   * @generated
   */
  Important createImportant();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TaskPackage getTaskPackage();

} //TaskFactory
