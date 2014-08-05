/**
 */
package org.ollabaca.on.mm.task.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Element;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import org.ollabaca.on.mm.org.Membership;

import org.ollabaca.on.mm.task.Account;
import org.ollabaca.on.mm.task.Phase;
import org.ollabaca.on.mm.task.Task;
import org.ollabaca.on.mm.task.TaskPackage;
import org.ollabaca.on.mm.task.Work;

import org.ollabaca.on.mm.task.util.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.TaskImpl#getWorks <em>Works</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
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
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected Phase phase;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getPerformer() <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformer()
	 * @generated
	 * @ordered
	 */
	protected Membership performer;

	/**
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFORT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected double effort = EFFORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPLETION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompletion() <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletion()
	 * @generated
	 * @ordered
	 */
	protected double completion = COMPLETION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Period PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period = PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorks() <em>Works</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorks()
	 * @generated
	 * @ordered
	 */
	protected EList<Work> works;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		if (account != null && account.eIsProxy()) {
			InternalEObject oldAccount = (InternalEObject)account;
			account = (Account)eResolveProxy(oldAccount);
			if (account != oldAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__ACCOUNT, oldAccount, account));
			}
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		Account oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase getPhase() {
		if (phase != null && phase.eIsProxy()) {
			InternalEObject oldPhase = (InternalEObject)phase;
			phase = (Phase)eResolveProxy(oldPhase);
			if (phase != oldPhase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__PHASE, oldPhase, phase));
			}
		}
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phase basicGetPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(Phase newPhase) {
		Phase oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<Element>(Element.class, this, TaskPackage.TASK__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership getPerformer() {
		if (performer != null && performer.eIsProxy()) {
			InternalEObject oldPerformer = (InternalEObject)performer;
			performer = (Membership)eResolveProxy(oldPerformer);
			if (performer != oldPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.TASK__PERFORMER, oldPerformer, performer));
			}
		}
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Membership basicGetPerformer() {
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformer(Membership newPerformer) {
		Membership oldPerformer = performer;
		performer = newPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__PERFORMER, oldPerformer, performer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffort() {
		return effort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffort(double newEffort) {
		double oldEffort = effort;
		effort = newEffort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__EFFORT, oldEffort, effort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompletion() {
		return completion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(double newCompletion) {
		double oldCompletion = completion;
		completion = newCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__COMPLETION, oldCompletion, completion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.TASK__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Work> getWorks() {
		if (works == null) {
			works = new EObjectContainmentEList<Work>(Work.class, this, TaskPackage.TASK__WORKS);
		}
		return works;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskPackage.TASK__WORKS:
				return ((InternalEList<?>)getWorks()).basicRemove(otherEnd, msgs);
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
			case TaskPackage.TASK__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case TaskPackage.TASK__PHASE:
				if (resolve) return getPhase();
				return basicGetPhase();
			case TaskPackage.TASK__ELEMENTS:
				return getElements();
			case TaskPackage.TASK__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case TaskPackage.TASK__EFFORT:
				return getEffort();
			case TaskPackage.TASK__COMPLETION:
				return getCompletion();
			case TaskPackage.TASK__PERIOD:
				return getPeriod();
			case TaskPackage.TASK__WORKS:
				return getWorks();
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
			case TaskPackage.TASK__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case TaskPackage.TASK__PHASE:
				setPhase((Phase)newValue);
				return;
			case TaskPackage.TASK__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case TaskPackage.TASK__PERFORMER:
				setPerformer((Membership)newValue);
				return;
			case TaskPackage.TASK__EFFORT:
				setEffort((Double)newValue);
				return;
			case TaskPackage.TASK__COMPLETION:
				setCompletion((Double)newValue);
				return;
			case TaskPackage.TASK__PERIOD:
				setPeriod((Period)newValue);
				return;
			case TaskPackage.TASK__WORKS:
				getWorks().clear();
				getWorks().addAll((Collection<? extends Work>)newValue);
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
			case TaskPackage.TASK__ACCOUNT:
				setAccount((Account)null);
				return;
			case TaskPackage.TASK__PHASE:
				setPhase((Phase)null);
				return;
			case TaskPackage.TASK__ELEMENTS:
				getElements().clear();
				return;
			case TaskPackage.TASK__PERFORMER:
				setPerformer((Membership)null);
				return;
			case TaskPackage.TASK__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case TaskPackage.TASK__COMPLETION:
				setCompletion(COMPLETION_EDEFAULT);
				return;
			case TaskPackage.TASK__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case TaskPackage.TASK__WORKS:
				getWorks().clear();
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
			case TaskPackage.TASK__ACCOUNT:
				return account != null;
			case TaskPackage.TASK__PHASE:
				return phase != null;
			case TaskPackage.TASK__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case TaskPackage.TASK__PERFORMER:
				return performer != null;
			case TaskPackage.TASK__EFFORT:
				return effort != EFFORT_EDEFAULT;
			case TaskPackage.TASK__COMPLETION:
				return completion != COMPLETION_EDEFAULT;
			case TaskPackage.TASK__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case TaskPackage.TASK__WORKS:
				return works != null && !works.isEmpty();
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
		result.append(" (effort: ");
		result.append(effort);
		result.append(", completion: ");
		result.append(completion);
		result.append(", period: ");
		result.append(period);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
