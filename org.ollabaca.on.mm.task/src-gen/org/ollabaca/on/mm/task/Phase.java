/**
 */
package org.ollabaca.on.mm.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

import org.ollabaca.on.mm.task.util.Period;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.task.Phase#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.Phase#getNestedPhases <em>Nested Phases</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.Phase#getNestingPhase <em>Nesting Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.task.TaskPackage#getPhase()
 * @model
 * @generated
 */
public interface Phase extends NamedElement, TaskElement
{
  /**
   * Returns the value of the '<em><b>Period</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * Period of the phase
   * <!-- end-model-doc -->
   * @return the value of the '<em>Period</em>' attribute.
   * @see #setPeriod(Period)
   * @see org.ollabaca.on.mm.task.TaskPackage#getPhase_Period()
   * @model unique="false" dataType="org.ollabaca.on.mm.task.Period"
   * @generated
   */
  Period getPeriod();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.task.Phase#getPeriod <em>Period</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Period</em>' attribute.
   * @see #getPeriod()
   * @generated
   */
  void setPeriod(Period value);

  /**
   * Returns the value of the '<em><b>Nested Phases</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.mm.task.Phase}.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.task.Phase#getNestingPhase <em>Nesting Phase</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested Phases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Phases</em>' containment reference list.
   * @see org.ollabaca.on.mm.task.TaskPackage#getPhase_NestedPhases()
   * @see org.ollabaca.on.mm.task.Phase#getNestingPhase
   * @model opposite="nestingPhase" containment="true"
   * @generated
   */
  EList<Phase> getNestedPhases();

  /**
   * Returns the value of the '<em><b>Nesting Phase</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.task.Phase#getNestedPhases <em>Nested Phases</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nesting Phase</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nesting Phase</em>' container reference.
   * @see #setNestingPhase(Phase)
   * @see org.ollabaca.on.mm.task.TaskPackage#getPhase_NestingPhase()
   * @see org.ollabaca.on.mm.task.Phase#getNestedPhases
   * @model opposite="nestedPhases" transient="false"
   * @generated
   */
  Phase getNestingPhase();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.task.Phase#getNestingPhase <em>Nesting Phase</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nesting Phase</em>' container reference.
   * @see #getNestingPhase()
   * @generated
   */
  void setNestingPhase(Phase value);

} // Phase
