/**
 */
package org.ollabaca.on.uml.rest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.ollabaca.on.uml.rest.HttpMessage;
import org.ollabaca.on.uml.rest.HttpMethod;
import org.ollabaca.on.uml.rest.HttpMethodKind;
import org.ollabaca.on.uml.rest.HttpParameter;
import org.ollabaca.on.uml.rest.HttpParameterKind;
import org.ollabaca.on.uml.rest.HttpResource;
import org.ollabaca.on.uml.rest.RestFactory;
import org.ollabaca.on.uml.rest.RestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestPackageImpl extends EPackageImpl implements RestPackage
{
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
  private EClass httpParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum httpMethodKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum httpParameterKindEEnum = null;

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
   * @see org.ollabaca.on.uml.rest.RestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RestPackageImpl()
  {
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
  public static RestPackage init()
  {
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
  public EClass getHttpResource()
  {
    return httpResourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpResource_Path()
  {
    return (EAttribute)httpResourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpMethod()
  {
    return httpMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Path()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Kind()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Consumes()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Produces()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpParameter()
  {
    return httpParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpParameter_Kind()
  {
    return (EAttribute)httpParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpMessage()
  {
    return httpMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpMessage_Headers()
  {
    return (EReference)httpMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpMessage_Content()
  {
    return (EReference)httpMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHttpMethodKind()
  {
    return httpMethodKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHttpParameterKind()
  {
    return httpParameterKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestFactory getRestFactory()
  {
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    httpResourceEClass = createEClass(HTTP_RESOURCE);
    createEAttribute(httpResourceEClass, HTTP_RESOURCE__PATH);

    httpMethodEClass = createEClass(HTTP_METHOD);
    createEAttribute(httpMethodEClass, HTTP_METHOD__PATH);
    createEAttribute(httpMethodEClass, HTTP_METHOD__KIND);
    createEAttribute(httpMethodEClass, HTTP_METHOD__CONSUMES);
    createEAttribute(httpMethodEClass, HTTP_METHOD__PRODUCES);

    httpParameterEClass = createEClass(HTTP_PARAMETER);
    createEAttribute(httpParameterEClass, HTTP_PARAMETER__KIND);

    httpMessageEClass = createEClass(HTTP_MESSAGE);
    createEReference(httpMessageEClass, HTTP_MESSAGE__HEADERS);
    createEReference(httpMessageEClass, HTTP_MESSAGE__CONTENT);

    // Create enums
    httpMethodKindEEnum = createEEnum(HTTP_METHOD_KIND);
    httpParameterKindEEnum = createEEnum(HTTP_PARAMETER_KIND);
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
  public void initializePackageContents()
  {
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
    httpResourceEClass.getESuperTypes().add(theUMLPackage.getInterface());
    httpMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
    httpParameterEClass.getESuperTypes().add(theUMLPackage.getParameter());
    httpMessageEClass.getESuperTypes().add(theUMLPackage.getClassifier());

    // Initialize classes, features, and operations; add parameters
    initEClass(httpResourceEClass, HttpResource.class, "HttpResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpResource_Path(), theEcorePackage.getEString(), "path", null, 0, 1, HttpResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpMethodEClass, HttpMethod.class, "HttpMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpMethod_Path(), theEcorePackage.getEString(), "path", null, 0, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHttpMethod_Kind(), this.getHttpMethodKind(), "kind", null, 1, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHttpMethod_Consumes(), theEcorePackage.getEString(), "consumes", null, 0, -1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHttpMethod_Produces(), theEcorePackage.getEString(), "produces", null, 0, -1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpParameterEClass, HttpParameter.class, "HttpParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpParameter_Kind(), this.getHttpParameterKind(), "kind", null, 1, 1, HttpParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpMessageEClass, HttpMessage.class, "HttpMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHttpMessage_Headers(), theUMLPackage.getProperty(), null, "headers", null, 0, -1, HttpMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpMessage_Content(), theUMLPackage.getProperty(), null, "content", null, 0, 1, HttpMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(httpMethodKindEEnum, HttpMethodKind.class, "HttpMethodKind");
    addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.GET);
    addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.PUT);
    addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.POST);
    addEEnumLiteral(httpMethodKindEEnum, HttpMethodKind.DELETE);

    initEEnum(httpParameterKindEEnum, HttpParameterKind.class, "HttpParameterKind");
    addEEnumLiteral(httpParameterKindEEnum, HttpParameterKind.QUERY);
    addEEnumLiteral(httpParameterKindEEnum, HttpParameterKind.PATH);
    addEEnumLiteral(httpParameterKindEEnum, HttpParameterKind.FORM);
    addEEnumLiteral(httpParameterKindEEnum, HttpParameterKind.COOKIE);
    addEEnumLiteral(httpParameterKindEEnum, HttpParameterKind.HEADER);

    // Create resource
    createResource(eNS_URI);
  }

} //RestPackageImpl
