/**
 */
package org.ollabaca.on.uml.rest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.uml2.uml.internal.impl.OperationImpl;

import org.ollabaca.on.uml.rest.HttpMethod;
import org.ollabaca.on.uml.rest.HttpMethodKind;
import org.ollabaca.on.uml.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.rest.impl.HttpMethodImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.rest.impl.HttpMethodImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.rest.impl.HttpMethodImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.rest.impl.HttpMethodImpl#getProduces <em>Produces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpMethodImpl extends OperationImpl implements HttpMethod
{
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
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final HttpMethodKind KIND_EDEFAULT = HttpMethodKind.GET;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected HttpMethodKind kind = KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsumes()
   * @generated
   * @ordered
   */
  protected EList<String> consumes;

  /**
   * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduces()
   * @generated
   * @ordered
   */
  protected EList<String> produces;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HttpMethodImpl()
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
    return RestPackage.Literals.HTTP_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
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
  public HttpMethodKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(HttpMethodKind newKind)
  {
    HttpMethodKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.HTTP_METHOD__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getConsumes()
  {
    if (consumes == null)
    {
      consumes = new EDataTypeEList<String>(String.class, this, RestPackage.HTTP_METHOD__CONSUMES);
    }
    return consumes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getProduces()
  {
    if (produces == null)
    {
      produces = new EDataTypeEList<String>(String.class, this, RestPackage.HTTP_METHOD__PRODUCES);
    }
    return produces;
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
      case RestPackage.HTTP_METHOD__PATH:
        return getPath();
      case RestPackage.HTTP_METHOD__KIND:
        return getKind();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestPackage.HTTP_METHOD__PATH:
        setPath((String)newValue);
        return;
      case RestPackage.HTTP_METHOD__KIND:
        setKind((HttpMethodKind)newValue);
        return;
      case RestPackage.HTTP_METHOD__CONSUMES:
        getConsumes().clear();
        getConsumes().addAll((Collection<? extends String>)newValue);
        return;
      case RestPackage.HTTP_METHOD__PRODUCES:
        getProduces().clear();
        getProduces().addAll((Collection<? extends String>)newValue);
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
      case RestPackage.HTTP_METHOD__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case RestPackage.HTTP_METHOD__KIND:
        setKind(KIND_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RestPackage.HTTP_METHOD__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case RestPackage.HTTP_METHOD__KIND:
        return kind != KIND_EDEFAULT;
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (path: ");
    result.append(path);
    result.append(", kind: ");
    result.append(kind);
    result.append(", consumes: ");
    result.append(consumes);
    result.append(", produces: ");
    result.append(produces);
    result.append(')');
    return result.toString();
  }

} //HttpMethodImpl
