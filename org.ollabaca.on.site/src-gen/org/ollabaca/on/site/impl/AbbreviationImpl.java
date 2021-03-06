/**
 */
package org.ollabaca.on.site.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ollabaca.on.site.Abbreviation;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.SitePackage;
import org.ollabaca.on.site.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abbreviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.impl.AbbreviationImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.AbbreviationImpl#getSite <em>Site</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbbreviationImpl extends NamedImpl implements Abbreviation {
	/**
	 * The cached value of the '{@link #getTopics() <em>Topics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopics()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbbreviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitePackage.Literals.ABBREVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopics() {
		if (topics == null) {
			topics = new EObjectWithInverseResolvingEList<Topic>(Topic.class, this, SitePackage.ABBREVIATION__TOPICS, SitePackage.TOPIC__ABBREVIATION);
		}
		return topics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site getSite() {
		if (eContainerFeatureID() != SitePackage.ABBREVIATION__SITE) return null;
		return (Site)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site basicGetSite() {
		if (eContainerFeatureID() != SitePackage.ABBREVIATION__SITE) return null;
		return (Site)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(Site newSite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSite, SitePackage.ABBREVIATION__SITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(Site newSite) {
		if (newSite != eInternalContainer() || (eContainerFeatureID() != SitePackage.ABBREVIATION__SITE && newSite != null)) {
			if (EcoreUtil.isAncestor(this, newSite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, SitePackage.SITE__ABBREVIATIONS, Site.class, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.ABBREVIATION__SITE, newSite, newSite));
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
			case SitePackage.ABBREVIATION__TOPICS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopics()).basicAdd(otherEnd, msgs);
			case SitePackage.ABBREVIATION__SITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSite((Site)otherEnd, msgs);
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
			case SitePackage.ABBREVIATION__TOPICS:
				return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
			case SitePackage.ABBREVIATION__SITE:
				return basicSetSite(null, msgs);
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
			case SitePackage.ABBREVIATION__SITE:
				return eInternalContainer().eInverseRemove(this, SitePackage.SITE__ABBREVIATIONS, Site.class, msgs);
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
			case SitePackage.ABBREVIATION__TOPICS:
				return getTopics();
			case SitePackage.ABBREVIATION__SITE:
				if (resolve) return getSite();
				return basicGetSite();
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
			case SitePackage.ABBREVIATION__TOPICS:
				getTopics().clear();
				getTopics().addAll((Collection<? extends Topic>)newValue);
				return;
			case SitePackage.ABBREVIATION__SITE:
				setSite((Site)newValue);
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
			case SitePackage.ABBREVIATION__TOPICS:
				getTopics().clear();
				return;
			case SitePackage.ABBREVIATION__SITE:
				setSite((Site)null);
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
			case SitePackage.ABBREVIATION__TOPICS:
				return topics != null && !topics.isEmpty();
			case SitePackage.ABBREVIATION__SITE:
				return basicGetSite() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbbreviationImpl
