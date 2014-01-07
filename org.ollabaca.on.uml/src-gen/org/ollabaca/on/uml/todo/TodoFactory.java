/**
 */
package org.ollabaca.on.uml.todo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.uml.todo.TodoPackage
 * @generated
 */
public interface TodoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TodoFactory eINSTANCE = org.ollabaca.on.uml.todo.impl.TodoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Front</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Front</em>'.
   * @generated
   */
  Front createFront();

  /**
   * Returns a new object of class '<em>Middle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Middle</em>'.
   * @generated
   */
  Middle createMiddle();

  /**
   * Returns a new object of class '<em>Back</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Back</em>'.
   * @generated
   */
  Back createBack();

  /**
   * Returns a new object of class '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment</em>'.
   * @generated
   */
  Environment createEnvironment();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TodoPackage getTodoPackage();

} //TodoFactory
