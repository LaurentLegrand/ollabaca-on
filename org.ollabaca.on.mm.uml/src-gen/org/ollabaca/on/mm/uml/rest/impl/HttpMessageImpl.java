/**
 */
package org.ollabaca.on.mm.uml.rest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Property;

import org.eclipse.uml2.uml.internal.impl.ClassifierImpl;

import org.ollabaca.on.mm.uml.rest.HttpMessage;
import org.ollabaca.on.mm.uml.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.uml.rest.impl.HttpMessageImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.uml.rest.impl.HttpMessageImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpMessageImpl extends ClassifierImpl implements HttpMessage
{
  /**
   * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaders()
   * @generated
   * @ordered
   */
  protected EList<Property> headers;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected Property content;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HttpMessageImpl()
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
    return RestPackage.Literals.HTTP_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getHeaders()
  {
    if (headers == null)
    {
      headers = new EObjectContainmentEList<Property>(Property.class, this, RestPackage.HTTP_MESSAGE__HEADERS);
    }
    return headers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(Property newContent, NotificationChain msgs)
  {
    Property oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestPackage.HTTP_MESSAGE__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(Property newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestPackage.HTTP_MESSAGE__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestPackage.HTTP_MESSAGE__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.HTTP_MESSAGE__CONTENT, newContent, newContent));
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
      case RestPackage.HTTP_MESSAGE__HEADERS:
        return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
      case RestPackage.HTTP_MESSAGE__CONTENT:
        return basicSetContent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RestPackage.HTTP_MESSAGE__HEADERS:
        return getHeaders();
      case RestPackage.HTTP_MESSAGE__CONTENT:
        return getContent();
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
      case RestPackage.HTTP_MESSAGE__HEADERS:
        getHeaders().clear();
        getHeaders().addAll((Collection<? extends Property>)newValue);
        return;
      case RestPackage.HTTP_MESSAGE__CONTENT:
        setContent((Property)newValue);
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
      case RestPackage.HTTP_MESSAGE__HEADERS:
        getHeaders().clear();
        return;
      case RestPackage.HTTP_MESSAGE__CONTENT:
        setContent((Property)null);
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
      case RestPackage.HTTP_MESSAGE__HEADERS:
        return headers != null && !headers.isEmpty();
      case RestPackage.HTTP_MESSAGE__CONTENT:
        return content != null;
    }
    return super.eIsSet(featureID);
  }

} //HttpMessageImpl
