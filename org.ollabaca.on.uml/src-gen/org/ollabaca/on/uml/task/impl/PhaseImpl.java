/**
 */
package org.ollabaca.on.uml.task.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import org.ollabaca.on.uml.task.Phase;
import org.ollabaca.on.uml.task.TaskPackage;

import org.ollabaca.on.uml.util.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.task.impl.PhaseImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.impl.PhaseImpl#getNestedPhases <em>Nested Phases</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.impl.PhaseImpl#getNestingPhase <em>Nesting Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhaseImpl extends NamedElementImpl implements Phase
{
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
   * The cached value of the '{@link #getNestedPhases() <em>Nested Phases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedPhases()
   * @generated
   * @ordered
   */
  protected EList<Phase> nestedPhases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhaseImpl()
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
    return TaskPackage.Literals.PHASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Period getPeriod()
  {
    return period;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPeriod(Period newPeriod)
  {
    Period oldPeriod = period;
    period = newPeriod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.PHASE__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Phase> getNestedPhases()
  {
    if (nestedPhases == null)
    {
      nestedPhases = new EObjectContainmentWithInverseEList<Phase>(Phase.class, this, TaskPackage.PHASE__NESTED_PHASES, TaskPackage.PHASE__NESTING_PHASE);
    }
    return nestedPhases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase getNestingPhase()
  {
    if (eContainerFeatureID() != TaskPackage.PHASE__NESTING_PHASE) return null;
    return (Phase)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase basicGetNestingPhase()
  {
    if (eContainerFeatureID() != TaskPackage.PHASE__NESTING_PHASE) return null;
    return (Phase)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNestingPhase(Phase newNestingPhase, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newNestingPhase, TaskPackage.PHASE__NESTING_PHASE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNestingPhase(Phase newNestingPhase)
  {
    if (newNestingPhase != eInternalContainer() || (eContainerFeatureID() != TaskPackage.PHASE__NESTING_PHASE && newNestingPhase != null))
    {
      if (EcoreUtil.isAncestor(this, newNestingPhase))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newNestingPhase != null)
        msgs = ((InternalEObject)newNestingPhase).eInverseAdd(this, TaskPackage.PHASE__NESTED_PHASES, Phase.class, msgs);
      msgs = basicSetNestingPhase(newNestingPhase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.PHASE__NESTING_PHASE, newNestingPhase, newNestingPhase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TaskPackage.PHASE__NESTED_PHASES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedPhases()).basicAdd(otherEnd, msgs);
      case TaskPackage.PHASE__NESTING_PHASE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetNestingPhase((Phase)otherEnd, msgs);
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
      case TaskPackage.PHASE__NESTED_PHASES:
        return ((InternalEList<?>)getNestedPhases()).basicRemove(otherEnd, msgs);
      case TaskPackage.PHASE__NESTING_PHASE:
        return basicSetNestingPhase(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case TaskPackage.PHASE__NESTING_PHASE:
        return eInternalContainer().eInverseRemove(this, TaskPackage.PHASE__NESTED_PHASES, Phase.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case TaskPackage.PHASE__PERIOD:
        return getPeriod();
      case TaskPackage.PHASE__NESTED_PHASES:
        return getNestedPhases();
      case TaskPackage.PHASE__NESTING_PHASE:
        if (resolve) return getNestingPhase();
        return basicGetNestingPhase();
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
      case TaskPackage.PHASE__PERIOD:
        setPeriod((Period)newValue);
        return;
      case TaskPackage.PHASE__NESTED_PHASES:
        getNestedPhases().clear();
        getNestedPhases().addAll((Collection<? extends Phase>)newValue);
        return;
      case TaskPackage.PHASE__NESTING_PHASE:
        setNestingPhase((Phase)newValue);
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
      case TaskPackage.PHASE__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case TaskPackage.PHASE__NESTED_PHASES:
        getNestedPhases().clear();
        return;
      case TaskPackage.PHASE__NESTING_PHASE:
        setNestingPhase((Phase)null);
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
      case TaskPackage.PHASE__PERIOD:
        return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
      case TaskPackage.PHASE__NESTED_PHASES:
        return nestedPhases != null && !nestedPhases.isEmpty();
      case TaskPackage.PHASE__NESTING_PHASE:
        return basicGetNestingPhase() != null;
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
    result.append(" (period: ");
    result.append(period);
    result.append(')');
    return result.toString();
  }

} //PhaseImpl
