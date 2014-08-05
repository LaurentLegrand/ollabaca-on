/**
 */
package org.ollabaca.on.mm.book.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ollabaca.on.mm.book.BookPackage;
import org.ollabaca.on.mm.book.Chapter;
import org.ollabaca.on.mm.book.Part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.book.impl.PartImpl#getChapters <em>Chapters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends BookElementImpl implements Part {
	/**
	 * The cached value of the '{@link #getChapters() <em>Chapters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapters()
	 * @generated
	 * @ordered
	 */
	protected EList<Chapter> chapters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookPackage.Literals.PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chapter> getChapters() {
		if (chapters == null) {
			chapters = new EObjectContainmentEList<Chapter>(Chapter.class, this, BookPackage.PART__CHAPTERS);
		}
		return chapters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BookPackage.PART__CHAPTERS:
				return ((InternalEList<?>)getChapters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookPackage.PART__CHAPTERS:
				return getChapters();
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
			case BookPackage.PART__CHAPTERS:
				getChapters().clear();
				getChapters().addAll((Collection<? extends Chapter>)newValue);
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
			case BookPackage.PART__CHAPTERS:
				getChapters().clear();
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
			case BookPackage.PART__CHAPTERS:
				return chapters != null && !chapters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PartImpl
