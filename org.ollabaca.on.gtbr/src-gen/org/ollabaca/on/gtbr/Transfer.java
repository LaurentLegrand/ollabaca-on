/**
 */
package org.ollabaca.on.gtbr;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.gtbr.Transfer#getDate <em>Date</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Transfer#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Transfer#getFrom <em>From</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Transfer#getTo <em>To</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Transfer#getDebit <em>Debit</em>}</li>
 *   <li>{@link org.ollabaca.on.gtbr.Transfer#getCredit <em>Credit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.gtbr.GtbrPackage#getTransfer()
 * @model
 * @generated
 */
public interface Transfer extends AccountingElement
{
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
   * @see org.ollabaca.on.gtbr.GtbrPackage#getTransfer_Date()
   * @model unique="false" dataType="org.ollabaca.on.gtbr.Date" required="true"
   * @generated
   */
  Date getDate();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Transfer#getDate <em>Date</em>}' attribute.
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
   * @see org.ollabaca.on.gtbr.GtbrPackage#getTransfer_Amount()
   * @model unique="false"
   * @generated
   */
  double getAmount();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Transfer#getAmount <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount</em>' attribute.
   * @see #getAmount()
   * @generated
   */
  void setAmount(double value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Account)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getTransfer_From()
   * @model
   * @generated
   */
  Account getFrom();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Transfer#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Account value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Account)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getTransfer_To()
   * @model
   * @generated
   */
  Account getTo();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Transfer#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Account value);

  /**
   * Returns the value of the '<em><b>Debit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debit</em>' containment reference.
   * @see #setDebit(Debit)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getTransfer_Debit()
   * @model containment="true"
   * @generated
   */
  Debit getDebit();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Transfer#getDebit <em>Debit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debit</em>' containment reference.
   * @see #getDebit()
   * @generated
   */
  void setDebit(Debit value);

  /**
   * Returns the value of the '<em><b>Credit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credit</em>' containment reference.
   * @see #setCredit(Credit)
   * @see org.ollabaca.on.gtbr.GtbrPackage#getTransfer_Credit()
   * @model containment="true"
   * @generated
   */
  Credit getCredit();

  /**
   * Sets the value of the '{@link org.ollabaca.on.gtbr.Transfer#getCredit <em>Credit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Credit</em>' containment reference.
   * @see #getCredit()
   * @generated
   */
  void setCredit(Credit value);

} // Transfer
