/**
 */
package org.ollabaca.on.mm.gtbr.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ollabaca.on.mm.gtbr.Account;
import org.ollabaca.on.mm.gtbr.Credit;
import org.ollabaca.on.mm.gtbr.Debit;
import org.ollabaca.on.mm.gtbr.GtbrPackage;
import org.ollabaca.on.mm.gtbr.Transfer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.TransferImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.TransferImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.TransferImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.TransferImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.TransferImpl#getDebit <em>Debit</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.TransferImpl#getCredit <em>Credit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransferImpl extends AccountingElementImpl implements Transfer {
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Account from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Account to;

	/**
	 * The cached value of the '{@link #getDebit() <em>Debit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebit()
	 * @generated
	 * @ordered
	 */
	protected Debit debit;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected Credit credit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GtbrPackage.Literals.TRANSFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Account)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtbrPackage.TRANSFER__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Account newFrom) {
		Account oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Account)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtbrPackage.TRANSFER__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Account newTo) {
		Account oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Debit getDebit() {
		return debit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebit(Debit newDebit, NotificationChain msgs) {
		Debit oldDebit = debit;
		debit = newDebit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__DEBIT, oldDebit, newDebit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebit(Debit newDebit) {
		if (newDebit != debit) {
			NotificationChain msgs = null;
			if (debit != null)
				msgs = ((InternalEObject)debit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtbrPackage.TRANSFER__DEBIT, null, msgs);
			if (newDebit != null)
				msgs = ((InternalEObject)newDebit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtbrPackage.TRANSFER__DEBIT, null, msgs);
			msgs = basicSetDebit(newDebit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__DEBIT, newDebit, newDebit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credit getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredit(Credit newCredit, NotificationChain msgs) {
		Credit oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__CREDIT, oldCredit, newCredit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(Credit newCredit) {
		if (newCredit != credit) {
			NotificationChain msgs = null;
			if (credit != null)
				msgs = ((InternalEObject)credit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GtbrPackage.TRANSFER__CREDIT, null, msgs);
			if (newCredit != null)
				msgs = ((InternalEObject)newCredit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GtbrPackage.TRANSFER__CREDIT, null, msgs);
			msgs = basicSetCredit(newCredit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.TRANSFER__CREDIT, newCredit, newCredit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GtbrPackage.TRANSFER__DEBIT:
				return basicSetDebit(null, msgs);
			case GtbrPackage.TRANSFER__CREDIT:
				return basicSetCredit(null, msgs);
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
			case GtbrPackage.TRANSFER__DATE:
				return getDate();
			case GtbrPackage.TRANSFER__AMOUNT:
				return getAmount();
			case GtbrPackage.TRANSFER__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case GtbrPackage.TRANSFER__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case GtbrPackage.TRANSFER__DEBIT:
				return getDebit();
			case GtbrPackage.TRANSFER__CREDIT:
				return getCredit();
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
			case GtbrPackage.TRANSFER__DATE:
				setDate((Date)newValue);
				return;
			case GtbrPackage.TRANSFER__AMOUNT:
				setAmount((Double)newValue);
				return;
			case GtbrPackage.TRANSFER__FROM:
				setFrom((Account)newValue);
				return;
			case GtbrPackage.TRANSFER__TO:
				setTo((Account)newValue);
				return;
			case GtbrPackage.TRANSFER__DEBIT:
				setDebit((Debit)newValue);
				return;
			case GtbrPackage.TRANSFER__CREDIT:
				setCredit((Credit)newValue);
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
			case GtbrPackage.TRANSFER__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case GtbrPackage.TRANSFER__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case GtbrPackage.TRANSFER__FROM:
				setFrom((Account)null);
				return;
			case GtbrPackage.TRANSFER__TO:
				setTo((Account)null);
				return;
			case GtbrPackage.TRANSFER__DEBIT:
				setDebit((Debit)null);
				return;
			case GtbrPackage.TRANSFER__CREDIT:
				setCredit((Credit)null);
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
			case GtbrPackage.TRANSFER__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case GtbrPackage.TRANSFER__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case GtbrPackage.TRANSFER__FROM:
				return from != null;
			case GtbrPackage.TRANSFER__TO:
				return to != null;
			case GtbrPackage.TRANSFER__DEBIT:
				return debit != null;
			case GtbrPackage.TRANSFER__CREDIT:
				return credit != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //TransferImpl
