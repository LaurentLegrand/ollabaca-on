/**
 */
package org.ollabaca.on.site;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.Named#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.site.SitePackage#getNamed()
 * @model abstract="true"
 * @generated
 */
public interface Named extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ollabaca.on.site.SitePackage#getNamed_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.site.Named#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Named
