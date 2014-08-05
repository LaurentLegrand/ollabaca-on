/**
 */
package org.ollabaca.on.mm.rest.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.ParameterImpl;

import org.ollabaca.on.mm.rest.HttpParameter;
import org.ollabaca.on.mm.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HttpParameterImpl extends ParameterImpl implements HttpParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.HTTP_PARAMETER;
	}

} //HttpParameterImpl
