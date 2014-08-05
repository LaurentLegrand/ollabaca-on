/**
 */
package org.ollabaca.on.mm.rest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.ollabaca.on.mm.rest.CookieParameter;
import org.ollabaca.on.mm.rest.FormParameter;
import org.ollabaca.on.mm.rest.HeaderParameter;
import org.ollabaca.on.mm.rest.HttpMessage;
import org.ollabaca.on.mm.rest.HttpMethod;
import org.ollabaca.on.mm.rest.HttpParameter;
import org.ollabaca.on.mm.rest.HttpResource;
import org.ollabaca.on.mm.rest.MimeType;
import org.ollabaca.on.mm.rest.PathParameter;
import org.ollabaca.on.mm.rest.QueryParameter;
import org.ollabaca.on.mm.rest.RestFactory;
import org.ollabaca.on.mm.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestPackageImpl extends EPackageImpl implements RestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookieParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpMessageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ollabaca.on.mm.rest.RestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestPackageImpl() {
		super(eNS_URI, RestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestPackage init() {
		if (isInited) return (RestPackage)EPackage.Registry.INSTANCE.getEPackage(RestPackage.eNS_URI);

		// Obtain or create and register package
		RestPackageImpl theRestPackage = (RestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRestPackage.createPackageContents();

		// Initialize created meta-data
		theRestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestPackage.eNS_URI, theRestPackage);
		return theRestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeType() {
		return mimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpResource() {
		return httpResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpResource_Path() {
		return (EAttribute)httpResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpMethod() {
		return httpMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpMethod_Path() {
		return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpMethod_Consumes() {
		return (EReference)httpMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpMethod_Produces() {
		return (EReference)httpMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDELETE() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGET() {
		return getEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHEAD() {
		return headEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOST() {
		return postEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPTIONS() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpParameter() {
		return httpParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameter() {
		return queryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathParameter() {
		return pathParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormParameter() {
		return formParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookieParameter() {
		return cookieParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeaderParameter() {
		return headerParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpMessage() {
		return httpMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpMessage_Headers() {
		return (EReference)httpMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHttpMessage_Content() {
		return (EReference)httpMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestFactory getRestFactory() {
		return (RestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mimeTypeEClass = createEClass(MIME_TYPE);

		httpResourceEClass = createEClass(HTTP_RESOURCE);
		createEAttribute(httpResourceEClass, HTTP_RESOURCE__PATH);

		httpMethodEClass = createEClass(HTTP_METHOD);
		createEAttribute(httpMethodEClass, HTTP_METHOD__PATH);
		createEReference(httpMethodEClass, HTTP_METHOD__CONSUMES);
		createEReference(httpMethodEClass, HTTP_METHOD__PRODUCES);

		deleteEClass = createEClass(DELETE);

		getEClass = createEClass(GET);

		headEClass = createEClass(HEAD);

		postEClass = createEClass(POST);

		optionsEClass = createEClass(OPTIONS);

		httpParameterEClass = createEClass(HTTP_PARAMETER);

		queryParameterEClass = createEClass(QUERY_PARAMETER);

		pathParameterEClass = createEClass(PATH_PARAMETER);

		formParameterEClass = createEClass(FORM_PARAMETER);

		cookieParameterEClass = createEClass(COOKIE_PARAMETER);

		headerParameterEClass = createEClass(HEADER_PARAMETER);

		httpMessageEClass = createEClass(HTTP_MESSAGE);
		createEReference(httpMessageEClass, HTTP_MESSAGE__HEADERS);
		createEReference(httpMessageEClass, HTTP_MESSAGE__CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mimeTypeEClass.getESuperTypes().add(theUMLPackage.getClass_());
		httpResourceEClass.getESuperTypes().add(theUMLPackage.getInterface());
		httpMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		deleteEClass.getESuperTypes().add(this.getHttpMethod());
		getEClass.getESuperTypes().add(this.getHttpMethod());
		headEClass.getESuperTypes().add(this.getHttpMethod());
		postEClass.getESuperTypes().add(this.getHttpMethod());
		optionsEClass.getESuperTypes().add(this.getHttpMethod());
		httpParameterEClass.getESuperTypes().add(theUMLPackage.getParameter());
		queryParameterEClass.getESuperTypes().add(this.getHttpParameter());
		pathParameterEClass.getESuperTypes().add(this.getHttpParameter());
		formParameterEClass.getESuperTypes().add(this.getHttpParameter());
		cookieParameterEClass.getESuperTypes().add(this.getHttpParameter());
		headerParameterEClass.getESuperTypes().add(this.getHttpParameter());
		httpMessageEClass.getESuperTypes().add(theUMLPackage.getClassifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(mimeTypeEClass, MimeType.class, "MimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpResourceEClass, HttpResource.class, "HttpResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpResource_Path(), theEcorePackage.getEString(), "path", null, 0, 1, HttpResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpMethodEClass, HttpMethod.class, "HttpMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpMethod_Path(), theEcorePackage.getEString(), "path", null, 0, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpMethod_Consumes(), this.getMimeType(), null, "consumes", null, 0, -1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpMethod_Produces(), this.getMimeType(), null, "produces", null, 0, -1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, org.ollabaca.on.mm.rest.DELETE.class, "DELETE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getEClass, org.ollabaca.on.mm.rest.GET.class, "GET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headEClass, org.ollabaca.on.mm.rest.HEAD.class, "HEAD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postEClass, org.ollabaca.on.mm.rest.POST.class, "POST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionsEClass, org.ollabaca.on.mm.rest.OPTIONS.class, "OPTIONS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpParameterEClass, HttpParameter.class, "HttpParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pathParameterEClass, PathParameter.class, "PathParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formParameterEClass, FormParameter.class, "FormParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cookieParameterEClass, CookieParameter.class, "CookieParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headerParameterEClass, HeaderParameter.class, "HeaderParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpMessageEClass, HttpMessage.class, "HttpMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHttpMessage_Headers(), theUMLPackage.getProperty(), null, "headers", null, 0, -1, HttpMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHttpMessage_Content(), theUMLPackage.getProperty(), null, "content", null, 0, 1, HttpMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RestPackageImpl
