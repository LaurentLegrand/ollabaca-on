/**
 */
package org.ollabaca.on.mm.gtbr;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.gtbr.Record#getAccount <em>Account</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.Record#getDate <em>Date</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.Record#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.gtbr.GtbrPackage#getRecord()
 * @model abstract="true"
 * @generated
 */
public interface Record extends AccountingElement
{
  /**
   * Returns the value of the '<em><b>Account</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.gtbr.Account#getRecords <em>Records</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account</em>' reference.
   * @see #setAccount(Account)
   * @see org.ollabaca.on.mm.gtbr.GtbrPackage#getRecord_Account()
   * @see org.ollabaca.on.mm.gtbr.Account#getRecords
   * @model opposite="records"
   * @generated
   */
  Account getAccount();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.gtbr.Record#getAccount <em>Account</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account</em>' reference.
   * @see #getAccount()
   * @generated
   */
  void setAccount(Account value);

  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(Date)
   * @see org.ollabaca.on.mm.gtbr.GtbrPackage#getRecord_Date()
   * @model unique="false" dataType="org.ollabaca.on.mm.gtbr.Date" required="true"
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.gtbr.Record#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(Date value);

  /**
   * Returns the value of the '<em><b>Amount</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Amount</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount</em>' attribute.
   * @see #setAmount(double)
   * @see org.ollabaca.on.mm.gtbr.GtbrPackage#getRecord_Amount()
   * @model unique="false"
   * @generated
   */
  double getAmount();

  /**
   * Sets the value of the '{@link org.ollabaca.on.mm.gtbr.Record#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(double value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model unique="false" balanceUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return balance;'"
   * @generated
   */
  double apply(double balance);

} // Record
