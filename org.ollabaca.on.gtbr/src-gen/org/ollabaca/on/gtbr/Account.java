/**
 */
package org.ollabaca.on.gtbr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;

import org.ollabaca.on.uml.org.Agent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Account#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends NamedElement, AccountingElement
{
  /**
   * Returns the value of the '<em><b>Institution</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Institution</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Institution</em>' reference.
   * @see #setInstitution(Agent)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Institution()
   * @model
   * @generated
   */
  Agent getInstitution();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Account#getInstitution <em>Institution</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Institution</em>' reference.
   * @see #getInstitution()
   * @generated
   */
  void setInstitution(Agent value);

  /**
   * Returns the value of the '<em><b>Holder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Holder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Holder</em>' reference.
   * @see #setHolder(Agent)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Holder()
   * @model
   * @generated
   */
  Agent getHolder();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Account#getHolder <em>Holder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Holder</em>' reference.
   * @see #getHolder()
   * @generated
   */
  void setHolder(Agent value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' reference list.
   * The list contents are of type {@link org.ollabaca.on.gtbr.AccountingOperation}.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.gtbr.AccountingOperation#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' reference list.
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Operations()
   * @see org.ollabaca.on.gtbr.AccountingOperation#getAccount
   * @model opposite="account"
   * @generated
   */
  EList<AccountingOperation> getOperations();

  /**
   * Returns the value of the '<em><b>Balance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Balance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Balance</em>' attribute.
   * @see org.ollabaca.on.gtbr.GtbrPackage#getAccount_Balance()
   * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.ollabaca.on.gtbr.Account%> _this = this;\nreturn <%org.ollabaca.on.gtbr.util.Accounts%>.getBalance(_this);'"
   * @generated
   */
  double getBalance();

} // Account
