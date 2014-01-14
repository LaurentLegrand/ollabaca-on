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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ollabaca.on.mm.org.Membership;
import org.ollabaca.on.mm.org.OrgPackage;
import org.ollabaca.on.mm.org.Organization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.org.impl.OrganizationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.impl.OrganizationImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.impl.OrganizationImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.org.impl.OrganizationImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends AgentImpl implements Organization
{
  /**
   * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected static final String PURPOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPurpose()
   * @generated
   * @ordered
   */
  protected String purpose = PURPOSE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Membership> members;

  /**
   * The cached value of the '{@link #getOrganizations() <em>Organizations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizations()
   * @generated
   * @ordered
   */
  protected EList<Organization> organizations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganizationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OrgPackage.Literals.ORGANIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPurpose()
  {
    return purpose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPurpose(String newPurpose)
  {
    String oldPurpose = purpose;
    purpose = newPurpose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrgPackage.ORGANIZATION__PURPOSE, oldPurpose, purpose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Membership> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, OrgPackage.ORGANIZATION__MEMBERS, OrgPackage.MEMBERSHIP__ORGANIZATION);
    }
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Organization> getOrganizations()
  {
    if (organizations == null)
    {
      organizations = new EObjectContainmentWithInverseEList<Organization>(Organization.class, this, OrgPackage.ORGANIZATION__ORGANIZATIONS, OrgPackage.ORGANIZATION__PARENT);
    }
    return organizations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organization getParent()
  {
    if (eContainerFeatureID() != OrgPackage.ORGANIZATION__PARENT) return null;
    return (Organization)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organization basicGetParent()
  {
    if (eContainerFeatureID() != OrgPackage.ORGANIZATION__PARENT) return null;
    return (Organization)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Organization newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, OrgPackage.ORGANIZATION__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Organization newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != OrgPackage.ORGANIZATION__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, OrgPackage.ORGANIZATION__ORGANIZATIONS, Organization.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrgPackage.ORGANIZATION__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrgPackage.ORGANIZATION__MEMBERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
      case OrgPackage.ORGANIZATION__ORGANIZATIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganizations()).basicAdd(otherEnd, msgs);
      case OrgPackage.ORGANIZATION__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((Organization)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrgPackage.ORGANIZATION__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
      case OrgPackage.ORGANIZATION__ORGANIZATIONS:
        return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
      case OrgPackage.ORGANIZATION__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case OrgPackage.ORGANIZATION__PARENT:
        return eInternalContainer().eInverseRemove(this, OrgPackage.ORGANIZATION__ORGANIZATIONS, Organization.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OrgPackage.ORGANIZATION__PURPOSE:
        return getPurpose();
      case OrgPackage.ORGANIZATION__MEMBERS:
        return getMembers();
      case OrgPackage.ORGANIZATION__ORGANIZATIONS:
        return getOrganizations();
      case OrgPackage.ORGANIZATION__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OrgPackage.ORGANIZATION__PURPOSE:
        setPurpose((String)newValue);
        return;
      case OrgPackage.ORGANIZATION__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Membership>)newValue);
        return;
      case OrgPackage.ORGANIZATION__ORGANIZATIONS:
        getOrganizations().clear();
        getOrganizations().addAll((Collection<? extends Organization>)newValue);
        return;
      case OrgPackage.ORGANIZATION__PARENT:
        setParent((Organization)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OrgPackage.ORGANIZATION__PURPOSE:
        setPurpose(PURPOSE_EDEFAULT);
        return;
      case OrgPackage.ORGANIZATION__MEMBERS:
        getMembers().clear();
        return;
      case OrgPackage.ORGANIZATION__ORGANIZATIONS:
        getOrganizations().clear();
        return;
      case OrgPackage.ORGANIZATION__PARENT:
        setParent((Organization)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OrgPackage.ORGANIZATION__PURPOSE:
        return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
      case OrgPackage.ORGANIZATION__MEMBERS:
        return members != null && !members.isEmpty();
      case OrgPackage.ORGANIZATION__ORGANIZATIONS:
        return organizations != null && !organizations.isEmpty();
      case OrgPackage.ORGANIZATION__PARENT:
        return basicGetParent() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (purpose: ");
    result.append(purpose);
    result.append(')');
    return result.toString();
  }

} //OrganizationImpl
