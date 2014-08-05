/**
 */
package org.ollabaca.on.mm.om.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ollabaca.on.mm.om.Dimension;
import org.ollabaca.on.mm.om.OmPackage;
import org.ollabaca.on.mm.om.QuantityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.om.impl.DimensionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.om.impl.DimensionImpl#getMagnitude <em>Magnitude</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected QuantityKind quantity;

	/**
	 * The default value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
	protected static final float MAGNITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMagnitude() <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagnitude()
	 * @generated
	 * @ordered
	 */
	protected float magnitude = MAGNITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OmPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (QuantityKind)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OmPackage.DIMENSION__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(QuantityKind newQuantity) {
		QuantityKind oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmPackage.DIMENSION__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMagnitude() {
		return magnitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagnitude(float newMagnitude) {
		float oldMagnitude = magnitude;
		magnitude = newMagnitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OmPackage.DIMENSION__MAGNITUDE, oldMagnitude, magnitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OmPackage.DIMENSION__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case OmPackage.DIMENSION__MAGNITUDE:
				return getMagnitude();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OmPackage.DIMENSION__QUANTITY:
				setQuantity((QuantityKind)newValue);
				return;
			case OmPackage.DIMENSION__MAGNITUDE:
				setMagnitude((Float)newValue);
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
			case OmPackage.DIMENSION__QUANTITY:
				setQuantity((QuantityKind)null);
				return;
			case OmPackage.DIMENSION__MAGNITUDE:
				setMagnitude(MAGNITUDE_EDEFAULT);
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
			case OmPackage.DIMENSION__QUANTITY:
				return quantity != null;
			case OmPackage.DIMENSION__MAGNITUDE:
				return magnitude != MAGNITUDE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (magnitude: ");
		result.append(magnitude);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
