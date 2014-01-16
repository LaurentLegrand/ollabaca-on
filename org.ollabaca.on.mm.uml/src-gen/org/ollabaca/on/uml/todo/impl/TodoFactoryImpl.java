/**
 */
package org.ollabaca.on.uml.todo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ollabaca.on.uml.todo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TodoFactoryImpl extends EFactoryImpl implements TodoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TodoFactory init()
  {
    try
    {
      TodoFactory theTodoFactory = (TodoFactory)EPackage.Registry.INSTANCE.getEFactory(TodoPackage.eNS_URI);
      if (theTodoFactory != null)
      {
        return theTodoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TodoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TodoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TodoPackage.FRONT: return createFront();
      case TodoPackage.MIDDLE: return createMiddle();
      case TodoPackage.BACK: return createBack();
      case TodoPackage.ENVIRONMENT: return createEnvironment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Front createFront()
  {
    FrontImpl front = new FrontImpl();
    return front;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Middle createMiddle()
  {
    MiddleImpl middle = new MiddleImpl();
    return middle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Back createBack()
  {
    BackImpl back = new BackImpl();
    return back;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Environment createEnvironment()
  {
    EnvironmentImpl environment = new EnvironmentImpl();
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TodoPackage getTodoPackage()
  {
    return (TodoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TodoPackage getPackage()
  {
    return TodoPackage.eINSTANCE;
  }

} //TodoFactoryImpl
