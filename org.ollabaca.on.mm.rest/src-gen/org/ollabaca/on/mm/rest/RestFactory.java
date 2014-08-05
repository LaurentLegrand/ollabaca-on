/**
 */
package org.ollabaca.on.mm.rest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.mm.rest.RestPackage
 * @generated
 */
public interface RestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestFactory eINSTANCE = org.ollabaca.on.mm.rest.impl.RestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mime Type</em>'.
	 * @generated
	 */
	MimeType createMimeType();

	/**
	 * Returns a new object of class '<em>Http Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Resource</em>'.
	 * @generated
	 */
	HttpResource createHttpResource();

	/**
	 * Returns a new object of class '<em>DELETE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DELETE</em>'.
	 * @generated
	 */
	DELETE createDELETE();

	/**
	 * Returns a new object of class '<em>GET</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GET</em>'.
	 * @generated
	 */
	GET createGET();

	/**
	 * Returns a new object of class '<em>HEAD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HEAD</em>'.
	 * @generated
	 */
	HEAD createHEAD();

	/**
	 * Returns a new object of class '<em>POST</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POST</em>'.
	 * @generated
	 */
	POST createPOST();

	/**
	 * Returns a new object of class '<em>OPTIONS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPTIONS</em>'.
	 * @generated
	 */
	OPTIONS createOPTIONS();

	/**
	 * Returns a new object of class '<em>Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Parameter</em>'.
	 * @generated
	 */
	QueryParameter createQueryParameter();

	/**
	 * Returns a new object of class '<em>Path Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Parameter</em>'.
	 * @generated
	 */
	PathParameter createPathParameter();

	/**
	 * Returns a new object of class '<em>Form Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Parameter</em>'.
	 * @generated
	 */
	FormParameter createFormParameter();

	/**
	 * Returns a new object of class '<em>Cookie Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cookie Parameter</em>'.
	 * @generated
	 */
	CookieParameter createCookieParameter();

	/**
	 * Returns a new object of class '<em>Header Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Parameter</em>'.
	 * @generated
	 */
	HeaderParameter createHeaderParameter();

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
