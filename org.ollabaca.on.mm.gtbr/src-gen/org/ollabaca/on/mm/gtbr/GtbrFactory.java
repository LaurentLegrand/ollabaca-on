/**
 */
package org.ollabaca.on.mm.gtbr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.mm.gtbr.GtbrPackage
 * @generated
 */
public interface GtbrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GtbrFactory eINSTANCE = org.ollabaca.on.mm.gtbr.impl.GtbrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account</em>'.
	 * @generated
	 */
	Account createAccount();

	/**
	 * Returns a new object of class '<em>Debit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debit</em>'.
	 * @generated
	 */
	Debit createDebit();

	/**
	 * Returns a new object of class '<em>Credit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credit</em>'.
	 * @generated
	 */
	Credit createCredit();

	/**
	 * Returns a new object of class '<em>Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer</em>'.
	 * @generated
	 */
	Transfer createTransfer();

	/**
	 * Returns a new object of class '<em>Clearing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearing</em>'.
	 * @generated
	 */
	Clearing createClearing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GtbrPackage getGtbrPackage();

} //GtbrFactory
