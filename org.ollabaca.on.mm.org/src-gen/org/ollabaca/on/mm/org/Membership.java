/**
 */
package org.ollabaca.on.mm.org;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Relationships between Role & Membership is detailed here : http://www.epimorphics.com/web/wiki/organization-ontology-second-draft
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.org.Membership#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.Membership#getRole <em>Role</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.Membership#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.org.OrgPackage#getMembership()
 * @model
 * @generated
 */
public interface Membership extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.org.Organization#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The organization that contains this membership
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' container reference.
	 * @see org.ollabaca.on.mm.org.OrgPackage#getMembership_Organization()
	 * @see org.ollabaca.on.mm.org.Organization#getMembers
	 * @model opposite="members" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Role played by members
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.ollabaca.on.mm.org.OrgPackage#getMembership_Role()
	 * @model required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.mm.org.Membership#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.org.Agent}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.org.Agent#getMemberships <em>Memberships</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see org.ollabaca.on.mm.org.OrgPackage#getMembership_Members()
	 * @see org.ollabaca.on.mm.org.Agent#getMemberships
	 * @model opposite="memberships"
	 * @generated
	 */
	EList<Agent> getMembers();

} // Membership
