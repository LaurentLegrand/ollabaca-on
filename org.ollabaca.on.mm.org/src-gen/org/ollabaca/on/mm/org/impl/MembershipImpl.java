/**
 */
package org.ollabaca.on.mm.org.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ollabaca.on.mm.org.Agent;
import org.ollabaca.on.mm.org.Membership;
import org.ollabaca.on.mm.org.OrgPackage;
import org.ollabaca.on.mm.org.Organization;
import org.ollabaca.on.mm.org.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.org.impl.MembershipImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.impl.MembershipImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.impl.MembershipImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MembershipImpl extends MinimalEObjectImpl.Container implements Membership {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgPackage.Literals.MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (eContainerFeatureID() != OrgPackage.MEMBERSHIP__ORGANIZATION) return null;
		return (Organization)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		if (eContainerFeatureID() != OrgPackage.MEMBERSHIP__ORGANIZATION) return null;
		return (Organization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrgPackage.MEMBERSHIP__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgPackage.MEMBERSHIP__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getMembers() {
		if (members == null) {
			members = new EObjectWithInverseResolvingEList.ManyInverse<Agent>(Agent.class, this, OrgPackage.MEMBERSHIP__MEMBERS, OrgPackage.AGENT__MEMBERSHIPS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgPackage.MEMBERSHIP__ORGANIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, OrgPackage.MEMBERSHIP__ORGANIZATION, msgs);
			case OrgPackage.MEMBERSHIP__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgPackage.MEMBERSHIP__ORGANIZATION:
				return eBasicSetContainer(null, OrgPackage.MEMBERSHIP__ORGANIZATION, msgs);
			case OrgPackage.MEMBERSHIP__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OrgPackage.MEMBERSHIP__ORGANIZATION:
				return eInternalContainer().eInverseRemove(this, OrgPackage.ORGANIZATION__MEMBERS, Organization.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgPackage.MEMBERSHIP__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case OrgPackage.MEMBERSHIP__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case OrgPackage.MEMBERSHIP__MEMBERS:
				return getMembers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrgPackage.MEMBERSHIP__ROLE:
				setRole((Role)newValue);
				return;
			case OrgPackage.MEMBERSHIP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Agent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrgPackage.MEMBERSHIP__ROLE:
				setRole((Role)null);
				return;
			case OrgPackage.MEMBERSHIP__MEMBERS:
				getMembers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrgPackage.MEMBERSHIP__ORGANIZATION:
				return basicGetOrganization() != null;
			case OrgPackage.MEMBERSHIP__ROLE:
				return role != null;
			case OrgPackage.MEMBERSHIP__MEMBERS:
				return members != null && !members.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MembershipImpl
