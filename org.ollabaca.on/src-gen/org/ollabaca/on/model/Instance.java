/**
 */
package org.ollabaca.on.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.model.Instance#getTitle <em>Title</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getSee <em>See</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getName <em>Name</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getType <em>Type</em>}</li>
 *   <li>{@link org.ollabaca.on.model.Instance#getSlots <em>Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.model.ModelPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Value
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.Instance#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(String)
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Abstract()
   * @model
   * @generated
   */
  String getAbstract();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.Instance#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(String value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.Instance#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Abbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abbr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abbr</em>' attribute.
   * @see #setAbbr(String)
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Abbr()
   * @model
   * @generated
   */
  String getAbbr();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.Instance#getAbbr <em>Abbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abbr</em>' attribute.
   * @see #getAbbr()
   * @generated
   */
  void setAbbr(String value);

  /**
   * Returns the value of the '<em><b>See</b></em>' reference list.
   * The list contents are of type {@link org.ollabaca.on.model.Instance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>See</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>See</em>' reference list.
   * @see org.ollabaca.on.model.ModelPackage#getInstance_See()
   * @model
   * @generated
   */
  EList<Instance> getSee();

  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute list.
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.Instance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.ollabaca.on.model.Instance#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.model.Slot}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slots</em>' containment reference list.
   * @see org.ollabaca.on.model.ModelPackage#getInstance_Slots()
   * @model containment="true"
   * @generated
   */
  EList<Slot> getSlots();

} // Instance
