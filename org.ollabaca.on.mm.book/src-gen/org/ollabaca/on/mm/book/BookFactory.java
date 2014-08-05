/**
 */
package org.ollabaca.on.mm.book;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.mm.book.BookPackage
 * @generated
 */
public interface BookFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookFactory eINSTANCE = org.ollabaca.on.mm.book.impl.BookFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	BookElement createBookElement();

	/**
	 * Returns a new object of class '<em>Book</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Book</em>'.
	 * @generated
	 */
	Book createBook();

	/**
	 * Returns a new object of class '<em>Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Part</em>'.
	 * @generated
	 */
	Part createPart();

	/**
	 * Returns a new object of class '<em>Chapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chapter</em>'.
	 * @generated
	 */
	Chapter createChapter();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BookPackage getBookPackage();

} //BookFactory
