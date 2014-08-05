/**
 */
package org.ollabaca.on.mm.rest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.internal.impl.OperationImpl;

import org.ollabaca.on.mm.rest.HttpMethod;
import org.ollabaca.on.mm.rest.MimeType;
import org.ollabaca.on.mm.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.rest.impl.HttpMethodImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.rest.impl.HttpMethodImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.rest.impl.HttpMethodImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HttpMethodImpl extends OperationImpl implements HttpMethod {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected EList<MimeType> consumes;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<MimeType> produces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.HTTP_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.HTTP_METHOD__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MimeType> getConsumes() {
		if (consumes == null) {
			consumes = new EObjectResolvingEList<MimeType>(MimeType.class, this, RestPackage.HTTP_METHOD__CONSUMES);
		}
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MimeType> getProduces() {
		if (produces == null) {
			produces = new EObjectResolvingEList<MimeType>(MimeType.class, this, RestPackage.HTTP_METHOD__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestPackage.HTTP_METHOD__PATH:
				return getPath();
			case RestPackage.HTTP_METHOD__CONSUMES:
				return getConsumes();
			case RestPackage.HTTP_METHOD__PRODUCES:
				return getProduces();
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
			case RestPackage.HTTP_METHOD__PATH:
				setPath((String)newValue);
				return;
			case RestPackage.HTTP_METHOD__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends MimeType>)newValue);
				return;
			case RestPackage.HTTP_METHOD__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends MimeType>)newValue);
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
			case RestPackage.HTTP_METHOD__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case RestPackage.HTTP_METHOD__CONSUMES:
				getConsumes().clear();
				return;
			case RestPackage.HTTP_METHOD__PRODUCES:
				getProduces().clear();
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
			case RestPackage.HTTP_METHOD__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case RestPackage.HTTP_METHOD__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case RestPackage.HTTP_METHOD__PRODUCES:
				return produces != null && !produces.isEmpty();
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //HttpMethodImpl
