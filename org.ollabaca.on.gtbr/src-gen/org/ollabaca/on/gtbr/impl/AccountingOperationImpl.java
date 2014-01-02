/**
 */
package org.ollabaca.on.gtbr.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ollabaca.on.gtbr.Account;
import org.ollabaca.on.gtbr.AccountingOperation;
import org.ollabaca.on.gtbr.GtbrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accounting Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.gtbr.impl.AccountingOperationImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.impl.AccountingOperationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.impl.AccountingOperationImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AccountingOperationImpl extends AccountingElementImpl implements AccountingOperation
{
  /**
   * The cached value of the '{@link #getAccount() <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected Account account;

  /**
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final Date DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected Date date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final double AMOUNT_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected double amount = AMOUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccountingOperationImpl()
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
    return GtbrPackage.Literals.ACCOUNTING_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getAccount()
  {
    if (account != null && account.eIsProxy())
    {
      InternalEObject oldAccount = (InternalEObject)account;
      account = (Account)eResolveProxy(oldAccount);
      if (account != oldAccount)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT, oldAccount, account));
      }
    }
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetAccount()
  {
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccount(Account newAccount, NotificationChain msgs)
  {
    Account oldAccount = account;
    account = newAccount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT, oldAccount, newAccount);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccount(Account newAccount)
  {
    if (newAccount != account)
    {
      NotificationChain msgs = null;
      if (account != null)
        msgs = ((InternalEObject)account).eInverseRemove(this, GtbrPackage.ACCOUNT__OPERATIONS, Account.class, msgs);
      if (newAccount != null)
        msgs = ((InternalEObject)newAccount).eInverseAdd(this, GtbrPackage.ACCOUNT__OPERATIONS, Account.class, msgs);
      msgs = basicSetAccount(newAccount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT, newAccount, newAccount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(Date newDate)
  {
    Date oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNTING_OPERATION__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(double newAmount)
  {
    double oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNTING_OPERATION__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT:
        if (account != null)
          msgs = ((InternalEObject)account).eInverseRemove(this, GtbrPackage.ACCOUNT__OPERATIONS, Account.class, msgs);
        return basicSetAccount((Account)otherEnd, msgs);
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
      case GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT:
        return basicSetAccount(null, msgs);
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
      case GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT:
        if (resolve) return getAccount();
        return basicGetAccount();
      case GtbrPackage.ACCOUNTING_OPERATION__DATE:
        return getDate();
      case GtbrPackage.ACCOUNTING_OPERATION__AMOUNT:
        return getAmount();
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
      case GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT:
        setAccount((Account)newValue);
        return;
      case GtbrPackage.ACCOUNTING_OPERATION__DATE:
        setDate((Date)newValue);
        return;
      case GtbrPackage.ACCOUNTING_OPERATION__AMOUNT:
        setAmount((Double)newValue);
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
      case GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT:
        setAccount((Account)null);
        return;
      case GtbrPackage.ACCOUNTING_OPERATION__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case GtbrPackage.ACCOUNTING_OPERATION__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
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
      case GtbrPackage.ACCOUNTING_OPERATION__ACCOUNT:
        return account != null;
      case GtbrPackage.ACCOUNTING_OPERATION__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case GtbrPackage.ACCOUNTING_OPERATION__AMOUNT:
        return amount != AMOUNT_EDEFAULT;
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
    result.append(" (date: ");
    result.append(date);
    result.append(", amount: ");
    result.append(amount);
    result.append(')');
    return result.toString();
  }

} //AccountingOperationImpl
