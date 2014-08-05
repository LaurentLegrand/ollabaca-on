/**
 */
package org.ollabaca.on.mm.rest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ollabaca.on.mm.rest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestFactoryImpl extends EFactoryImpl implements RestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestFactory init() {
		try {
			RestFactory theRestFactory = (RestFactory)EPackage.Registry.INSTANCE.getEFactory(RestPackage.eNS_URI);
			if (theRestFactory != null) {
				return theRestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RestPackage.MIME_TYPE: return createMimeType();
			case RestPackage.HTTP_RESOURCE: return createHttpResource();
			case RestPackage.DELETE: return createDELETE();
			case RestPackage.GET: return createGET();
			case RestPackage.HEAD: return createHEAD();
			case RestPackage.POST: return createPOST();
			case RestPackage.OPTIONS: return createOPTIONS();
			case RestPackage.QUERY_PARAMETER: return createQueryParameter();
			case RestPackage.PATH_PARAMETER: return createPathParameter();
			case RestPackage.FORM_PARAMETER: return createFormParameter();
			case RestPackage.COOKIE_PARAMETER: return createCookieParameter();
			case RestPackage.HEADER_PARAMETER: return createHeaderParameter();
			case RestPackage.HTTP_MESSAGE: return createHttpMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType createMimeType() {
		MimeTypeImpl mimeType = new MimeTypeImpl();
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpResource createHttpResource() {
		HttpResourceImpl httpResource = new HttpResourceImpl();
		return httpResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DELETE createDELETE() {
		DELETEImpl delete = new DELETEImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GET createGET() {
		GETImpl get = new GETImpl();
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEAD createHEAD() {
		HEADImpl head = new HEADImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POST createPOST() {
		POSTImpl post = new POSTImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPTIONS createOPTIONS() {
		OPTIONSImpl options = new OPTIONSImpl();
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameter createQueryParameter() {
		QueryParameterImpl queryParameter = new QueryParameterImpl();
		return queryParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathParameter createPathParameter() {
		PathParameterImpl pathParameter = new PathParameterImpl();
		return pathParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormParameter createFormParameter() {
		FormParameterImpl formParameter = new FormParameterImpl();
		return formParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookieParameter createCookieParameter() {
		CookieParameterImpl cookieParameter = new CookieParameterImpl();
		return cookieParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderParameter createHeaderParameter() {
		HeaderParameterImpl headerParameter = new HeaderParameterImpl();
		return headerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMessage createHttpMessage() {
		HttpMessageImpl httpMessage = new HttpMessageImpl();
		return httpMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestPackage getRestPackage() {
		return (RestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestPackage getPackage() {
		return RestPackage.eINSTANCE;
	}

} //RestFactoryImpl
