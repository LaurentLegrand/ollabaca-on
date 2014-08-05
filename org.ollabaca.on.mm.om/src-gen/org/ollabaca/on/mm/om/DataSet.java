/**
 */
package org.ollabaca.on.mm.om;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.om.DataSet#getMeasures <em>Measures</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.mm.om.OmPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Measures</b></em>' reference list.
	 * The list contents are of type {@link org.ollabaca.on.mm.om.Measure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' reference list.
	 * @see org.ollabaca.on.mm.om.OmPackage#getDataSet_Measures()
	 * @model
	 * @generated
	 */
	EList<Measure> getMeasures();

} // DataSet
