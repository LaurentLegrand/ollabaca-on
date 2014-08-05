/**
 */
package org.ollabaca.on.mm.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.task.Stage#getNestedStages <em>Nested Stages</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.Stage#getNestingStage <em>Nesting Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.task.TaskPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends NamedElement, TaskElement {
	/**
	 * Returns the value of the '<em><b>Nested Stages</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.task.Stage}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.task.Stage#getNestingStage <em>Nesting Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Stages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Stages</em>' containment reference list.
	 * @see org.ollabaca.on.mm.task.TaskPackage#getStage_NestedStages()
	 * @see org.ollabaca.on.mm.task.Stage#getNestingStage
	 * @model opposite="nestingStage" containment="true"
	 * @generated
	 */
	EList<Stage> getNestedStages();

	/**
	 * Returns the value of the '<em><b>Nesting Stage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.task.Stage#getNestedStages <em>Nested Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Stage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Stage</em>' container reference.
	 * @see #setNestingStage(Stage)
	 * @see org.ollabaca.on.mm.task.TaskPackage#getStage_NestingStage()
	 * @see org.ollabaca.on.mm.task.Stage#getNestedStages
	 * @model opposite="nestedStages" transient="false"
	 * @generated
	 */
	Stage getNestingStage();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.mm.task.Stage#getNestingStage <em>Nesting Stage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Stage</em>' container reference.
	 * @see #getNestingStage()
	 * @generated
	 */
	void setNestingStage(Stage value);

} // Stage
