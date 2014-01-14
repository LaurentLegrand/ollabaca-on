/**
 */
package org.ollabaca.on.mm.task;

import org.ollabaca.on.mm.task.util.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Corresponds to the amount of time spent on the WorkProduct
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.task.Work#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.Work#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.Work#getRealized <em>Realized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.task.TaskPackage#getWork()
 * @model
 * @generated
 */
public interface Work extends TaskElement
{
  /**
   * Returns the value of the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' attribute.
   * @see #setSummary(String)
   * @see org.ollabaca.on.mm.task.TaskPackage#getWork_Summary()
   * @model unique="false"
   * @generated
   */
  String getSummary();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.task.Work#getSummary <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' attribute.
   * @see #getSummary()
   * @generated
   */
  void setSummary(String value);

  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(Period)
   * @see org.ollabaca.on.mm.task.TaskPackage#getWork_Period()
   * @model unique="false" dataType="org.ollabaca.on.mm.task.Period" required="true"
   * @generated
   */
  Period getPeriod();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.task.Work#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(Period value);

  /**
   * Returns the value of the '<em><b>Realized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * Amount of work realized
   * <!-- end-model-doc -->
   * @return the value of the '<em>Realized</em>' attribute.
   * @see #setRealized(double)
   * @see org.ollabaca.on.mm.task.TaskPackage#getWork_Realized()
   * @model unique="false"
   * @generated
   */
  double getRealized();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.task.Work#getRealized <em>Realized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Realized</em>' attribute.
   * @see #getRealized()
   * @generated
   */
  void setRealized(double value);

} // Work
