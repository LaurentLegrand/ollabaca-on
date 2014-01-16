/**
 */
package org.ollabaca.on.mm.uml.rest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.mm.uml.rest.RestPackage
 * @generated
 */
public interface RestFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RestFactory eINSTANCE = org.ollabaca.on.mm.uml.rest.impl.RestFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Http Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Resource</em>'.
   * @generated
   */
  HttpResource createHttpResource();

  /**
   * Returns a new object of class '<em>Http Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Method</em>'.
   * @generated
   */
  HttpMethod createHttpMethod();

  /**
   * Returns a new object of class '<em>Http Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Parameter</em>'.
   * @generated
   */
  HttpParameter createHttpParameter();

  /**
   * Returns a new object of class '<em>Http Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Message</em>'.
   * @generated
   */
  HttpMessage createHttpMessage();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RestPackage getRestPackage();

} //RestFactory
