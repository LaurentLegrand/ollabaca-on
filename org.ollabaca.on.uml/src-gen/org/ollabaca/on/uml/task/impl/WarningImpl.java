/**
 */
package org.ollabaca.on.uml.task.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.CommentImpl;

import org.ollabaca.on.uml.task.Note;
import org.ollabaca.on.uml.task.TaskPackage;
import org.ollabaca.on.uml.task.Warning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Warning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.task.impl.WarningImpl#getMitigation <em>Mitigation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WarningImpl extends CommentImpl implements Warning
{
  /**
   * The cached value of the '{@link #getMitigation() <em>Mitigation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMitigation()
   * @generated
   * @ordered
   */
  protected Note mitigation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WarningImpl()
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
    return TaskPackage.Literals.WARNING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note getMitigation()
  {
    return mitigation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMitigation(Note newMitigation, NotificationChain msgs)
  {
    Note oldMitigation = mitigation;
    mitigation = newMitigation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.WARNING__MITIGATION, oldMitigation, newMitigation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMitigation(Note newMitigation)
  {
    if (newMitigation != mitigation)
    {
      NotificationChain msgs = null;
      if (mitigation != null)
        msgs = ((InternalEObject)mitigation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaskPackage.WARNING__MITIGATION, null, msgs);
      if (newMitigation != null)
        msgs = ((InternalEObject)newMitigation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaskPackage.WARNING__MITIGATION, null, msgs);
      msgs = basicSetMitigation(newMitigation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WARNING__MITIGATION, newMitigation, newMitigation));
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
      case TaskPackage.WARNING__MITIGATION:
        return basicSetMitigation(null, msgs);
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
      case TaskPackage.WARNING__MITIGATION:
        return getMitigation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TaskPackage.WARNING__MITIGATION:
        setMitigation((Note)newValue);
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
      case TaskPackage.WARNING__MITIGATION:
        setMitigation((Note)null);
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
      case TaskPackage.WARNING__MITIGATION:
        return mitigation != null;
    }
    return super.eIsSet(featureID);
  }

} //WarningImpl
