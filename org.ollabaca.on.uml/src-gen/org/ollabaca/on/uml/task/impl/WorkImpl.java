/**
 */
package org.ollabaca.on.uml.task.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ollabaca.on.uml.task.TaskPackage;
import org.ollabaca.on.uml.task.Work;

import org.ollabaca.on.uml.util.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.task.impl.WorkImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.impl.WorkImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.impl.WorkImpl#getRealized <em>Realized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkImpl extends TaskElementImpl implements Work
{
  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

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
   * The default value of the '{@link #getRealized() <em>Realized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealized()
   * @generated
   * @ordered
   */
  protected static final double REALIZED_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getRealized() <em>Realized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealized()
   * @generated
   * @ordered
   */
  protected double realized = REALIZED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkImpl()
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
    return TaskPackage.Literals.WORK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK__SUMMARY, oldSummary, summary));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK__PERIOD, oldPeriod, period));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getRealized()
  {
    return realized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealized(double newRealized)
  {
    double oldRealized = realized;
    realized = newRealized;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.WORK__REALIZED, oldRealized, realized));
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
      case TaskPackage.WORK__SUMMARY:
        return getSummary();
      case TaskPackage.WORK__PERIOD:
        return getPeriod();
      case TaskPackage.WORK__REALIZED:
        return getRealized();
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
      case TaskPackage.WORK__SUMMARY:
        setSummary((String)newValue);
        return;
      case TaskPackage.WORK__PERIOD:
        setPeriod((Period)newValue);
        return;
      case TaskPackage.WORK__REALIZED:
        setRealized((Double)newValue);
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
      case TaskPackage.WORK__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case TaskPackage.WORK__PERIOD:
        setPeriod(PERIOD_EDEFAULT);
        return;
      case TaskPackage.WORK__REALIZED:
        setRealized(REALIZED_EDEFAULT);
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
      case TaskPackage.WORK__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case TaskPackage.WORK__PERIOD:
        return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
      case TaskPackage.WORK__REALIZED:
        return realized != REALIZED_EDEFAULT;
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
    result.append(" (summary: ");
    result.append(summary);
    result.append(", period: ");
    result.append(period);
    result.append(", realized: ");
    result.append(realized);
    result.append(')');
    return result.toString();
  }

} //WorkImpl
