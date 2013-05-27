/**
 */
package org.ollabaca.on.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.model.Unit#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Unit#getContainer <em>Container</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Unit#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.model.ModelPackage#getUnit()
 * @model
 * @generated
 */
public interface Unit extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.model.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.ollabaca.on.model.ModelPackage#getUnit_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' containment reference.
   * @see #setContainer(Container)
   * @see org.ollabaca.on.model.ModelPackage#getUnit_Container()
   * @model containment="true"
   * @generated
   */
  Container getContainer();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.Unit#getContainer <em>Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' containment reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(Container value);

  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.model.Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see org.ollabaca.on.model.ModelPackage#getUnit_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

} // Unit
