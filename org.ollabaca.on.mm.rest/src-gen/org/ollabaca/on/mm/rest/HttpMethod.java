/**
 */
package org.ollabaca.on.mm.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.rest.HttpMethod#getPath <em>Path</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.rest.HttpMethod#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.rest.HttpMethod#getProduces <em>Produces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.rest.RestPackage#getHttpMethod()
 * @model abstract="true"
 * @generated
 */
public interface HttpMethod extends Operation {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.ollabaca.on.mm.rest.RestPackage#getHttpMethod_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.mm.rest.HttpMethod#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.rest.MimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' reference list.
	 * @see org.ollabaca.on.mm.rest.RestPackage#getHttpMethod_Consumes()
	 * @model
	 * @generated
	 */
	EList<MimeType> getConsumes();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.rest.MimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' reference list.
	 * @see org.ollabaca.on.mm.rest.RestPackage#getHttpMethod_Produces()
	 * @model
	 * @generated
	 */
	EList<MimeType> getProduces();

} // HttpMethod
