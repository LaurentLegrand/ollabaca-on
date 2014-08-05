/**
 */
package org.ollabaca.on.mm.org;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.org.Organization#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.Organization#getMembers <em>Members</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.Organization#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.Organization#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.org.OrgPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends Agent {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.ollabaca.on.mm.org.OrgPackage#getOrganization_Purpose()
	 * @model unique="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.mm.org.Organization#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.org.Membership}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.org.Membership#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * List of memberships
	 * 
	 * Cf. http://www.w3.org/TR/2012/WD-vocab-org-20121023/#org:member
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.ollabaca.on.mm.org.OrgPackage#getOrganization_Members()
	 * @see org.ollabaca.on.mm.org.Membership#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<Membership> getMembers();

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.org.Organization}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.org.Organization#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Sub organizations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see org.ollabaca.on.mm.org.OrgPackage#getOrganization_Organizations()
	 * @see org.ollabaca.on.mm.org.Organization#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Organization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.org.Organization#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Organization)
	 * @see org.ollabaca.on.mm.org.OrgPackage#getOrganization_Parent()
	 * @see org.ollabaca.on.mm.org.Organization#getOrganizations
	 * @model opposite="organizations" transient="false"
	 * @generated
	 */
	Organization getParent();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.mm.org.Organization#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Organization value);

} // Organization
