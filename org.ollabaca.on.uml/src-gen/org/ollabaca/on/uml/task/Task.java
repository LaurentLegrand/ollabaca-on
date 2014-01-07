/**
 */
package org.ollabaca.on.uml.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;

import org.ollabaca.on.uml.org.Membership;

import org.ollabaca.on.uml.util.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Task
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getAccount <em>Account</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getElements <em>Elements</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getCompletion <em>Completion</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.ollabaca.on.uml.task.Task#getWorks <em>Works</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.uml.task.TaskPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Account</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account</em>' reference.
   * @see #setAccount(Account)
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Account()
   * @model
   * @generated
   */
  Account getAccount();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.task.Task#getAccount <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account</em>' reference.
   * @see #getAccount()
   * @generated
   */
  void setAccount(Account value);

  /**
   * Returns the value of the '<em><b>Phase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phase</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phase</em>' reference.
   * @see #setPhase(Phase)
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Phase()
   * @model required="true"
   * @generated
   */
  Phase getPhase();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.task.Task#getPhase <em>Phase</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phase</em>' reference.
   * @see #getPhase()
   * @generated
   */
  void setPhase(Phase value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.uml2.uml.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Elements()
   * @model required="true"
   * @generated
   */
  EList<Element> getElements();

  /**
   * Returns the value of the '<em><b>Performer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Performer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Performer</em>' reference.
   * @see #setPerformer(Membership)
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Performer()
   * @model required="true"
   * @generated
   */
  Membership getPerformer();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.task.Task#getPerformer <em>Performer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Performer</em>' reference.
   * @see #getPerformer()
   * @generated
   */
  void setPerformer(Membership value);

  /**
   * Returns the value of the '<em><b>Effort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * Specifies the effort needed to complete the item
   * <!-- end-model-doc -->
   * @return the value of the '<em>Effort</em>' attribute.
   * @see #setEffort(double)
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Effort()
   * @model unique="false"
   * @generated
   */
  double getEffort();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.task.Task#getEffort <em>Effort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effort</em>' attribute.
   * @see #getEffort()
   * @generated
   */
  void setEffort(double value);

  /**
   * Returns the value of the '<em><b>Completion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * <!-- end-model-doc -->
   * @return the value of the '<em>Completion</em>' attribute.
   * @see #setCompletion(double)
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Completion()
   * @model unique="false"
   * @generated
   */
  double getCompletion();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.task.Task#getCompletion <em>Completion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Completion</em>' attribute.
   * @see #getCompletion()
   * @generated
   */
  void setCompletion(double value);

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
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Period()
   * @model unique="false" dataType="org.ollabaca.on.uml.task.Period" required="true"
   * @generated
   */
  Period getPeriod();

  /**
   * Sets the value of the '{@link org.ollabaca.on.uml.task.Task#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(Period value);

  /**
   * Returns the value of the '<em><b>Works</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.uml.task.Work}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Works</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Works</em>' containment reference list.
   * @see org.ollabaca.on.uml.task.TaskPackage#getTask_Works()
   * @model containment="true"
   * @generated
   */
  EList<Work> getWorks();

} // Task
