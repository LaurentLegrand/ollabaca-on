/**
 */
package org.ollabaca.on.mm.gtbr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.ollabaca.on.mm.gtbr.GtbrPackage#getCredit()
 * @model
 * @generated
 */
public interface Credit extends Record {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" balanceUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='double _amount = this.getAmount();\nreturn (balance + _amount);'"
	 * @generated
	 */
	double apply(double balance);

} // Credit
