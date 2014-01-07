/**
 */
package org.ollabaca.on.uml.org;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.org.Agent#getMemberships <em>Memberships</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.org.OrgPackage#getAgent()
 * @model abstract="true"
 * @generated
 */
public interface Agent extends NamedElement, OrgElement
{
  /**
   * Returns the value of the '<em><b>Memberships</b></em>' reference list.
   * The list contents are of type {@link org.ollabaca.on.uml.org.Membership}.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.uml.org.Membership#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * cf. http://www.w3.org/TR/2012/WD-vocab-org-20121023/#org:hasMembership
   * <!-- end-model-doc -->
   * @return the value of the '<em>Memberships</em>' reference list.
   * @see org.ollabaca.on.uml.org.OrgPackage#getAgent_Memberships()
   * @see org.ollabaca.on.uml.org.Membership#getMembers
   * @model opposite="members" changeable="false"
   * @generated
   */
  EList<Membership> getMemberships();

} // Agent
