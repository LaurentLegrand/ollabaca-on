/**
 */
package org.ollabaca.on.mm.task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * cf. http://www.taskjuggler.org/tj3/manual/account.html
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.task.Account#getNestedAccounts <em>Nested Accounts</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.Account#getNestingAccount <em>Nesting Account</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.task.TaskPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends NamedElement, TaskElement, PackageableElement {
	/**
	 * Returns the value of the '<em><b>Nested Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.task.Account}.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.task.Account#getNestingAccount <em>Nesting Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Accounts</em>' containment reference list.
	 * @see org.ollabaca.on.mm.task.TaskPackage#getAccount_NestedAccounts()
	 * @see org.ollabaca.on.mm.task.Account#getNestingAccount
	 * @model opposite="nestingAccount" containment="true"
	 * @generated
	 */
	EList<Account> getNestedAccounts();

	/**
	 * Returns the value of the '<em><b>Nesting Account</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ollabaca.on.mm.task.Account#getNestedAccounts <em>Nested Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Account</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Account</em>' container reference.
	 * @see #setNestingAccount(Account)
	 * @see org.ollabaca.on.mm.task.TaskPackage#getAccount_NestingAccount()
	 * @see org.ollabaca.on.mm.task.Account#getNestedAccounts
	 * @model opposite="nestedAccounts" transient="false"
	 * @generated
	 */
	Account getNestingAccount();

	/**
	 * Sets the value of the '{@link org.ollabaca.on.mm.task.Account#getNestingAccount <em>Nesting Account</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Account</em>' container reference.
	 * @see #getNestingAccount()
	 * @generated
	 */
	void setNestingAccount(Account value);

} // Account
