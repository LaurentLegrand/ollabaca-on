/**
 */
package org.ollabaca.on.site.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ollabaca.on.site.Abbreviation;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Named;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.SiteFactory;
import org.ollabaca.on.site.SitePackage;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SitePackageImpl extends EPackageImpl implements SitePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbreviationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topicEClass = null;

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
   * @see org.ollabaca.on.site.SitePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SitePackageImpl()
  {
    super(eNS_URI, SiteFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SitePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SitePackage init()
  {
    if (isInited) return (SitePackage)EPackage.Registry.INSTANCE.getEPackage(SitePackage.eNS_URI);

    // Obtain or create and register package
    SitePackageImpl theSitePackage = (SitePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SitePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SitePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSitePackage.createPackageContents();

    // Initialize created meta-data
    theSitePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSitePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SitePackage.eNS_URI, theSitePackage);
    return theSitePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamed()
  {
    return namedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamed_Name()
  {
    return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTag()
  {
    return tagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTag_Topics()
  {
    return (EReference)tagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTag_Site()
  {
    return (EReference)tagEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Topics()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Site()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbreviation()
  {
    return abbreviationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbbreviation_Topics()
  {
    return (EReference)abbreviationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbbreviation_Site()
  {
    return (EReference)abbreviationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSite()
  {
    return siteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSite_Topics()
  {
    return (EReference)siteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSite_Tags()
  {
    return (EReference)siteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSite_Abbreviations()
  {
    return (EReference)siteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSite_Types()
  {
    return (EReference)siteEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSite__GetOrCreateTag__String()
  {
    return siteEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSite__GetOrCreateAbbr__String()
  {
    return siteEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSite__GetOrCreateType__String()
  {
    return siteEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSite__GetTopic__String()
  {
    return siteEClass.getEOperations().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSite__GetRoots()
  {
    return siteEClass.getEOperations().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getSite__GetTopic__EObject()
  {
    return siteEClass.getEOperations().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopic()
  {
    return topicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopic_Title()
  {
    return (EAttribute)topicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopic_Abstract()
  {
    return (EAttribute)topicEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopic_Documentation()
  {
    return (EAttribute)topicEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopic_Tags()
  {
    return (EReference)topicEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopic_Parent()
  {
    return (EReference)topicEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopic_Topics()
  {
    return (EReference)topicEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopic_See()
  {
    return (EReference)topicEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopic_Abbreviation()
  {
    return (EReference)topicEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopic_Type()
  {
    return (EReference)topicEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopic_Target()
  {
    return (EReference)topicEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getTopic__IsAnonymous()
  {
    return topicEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getTopic__GetAncestorsAndSelf()
  {
    return topicEClass.getEOperations().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getTopic__GetAncestors()
  {
    return topicEClass.getEOperations().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteFactory getSiteFactory()
  {
    return (SiteFactory)getEFactoryInstance();
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
    elementEClass = createEClass(ELEMENT);

    namedEClass = createEClass(NAMED);
    createEAttribute(namedEClass, NAMED__NAME);

    tagEClass = createEClass(TAG);
    createEReference(tagEClass, TAG__TOPICS);
    createEReference(tagEClass, TAG__SITE);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__TOPICS);
    createEReference(typeEClass, TYPE__SITE);

    abbreviationEClass = createEClass(ABBREVIATION);
    createEReference(abbreviationEClass, ABBREVIATION__TOPICS);
    createEReference(abbreviationEClass, ABBREVIATION__SITE);

    siteEClass = createEClass(SITE);
    createEReference(siteEClass, SITE__TOPICS);
    createEReference(siteEClass, SITE__TAGS);
    createEReference(siteEClass, SITE__ABBREVIATIONS);
    createEReference(siteEClass, SITE__TYPES);
    createEOperation(siteEClass, SITE___GET_OR_CREATE_TAG__STRING);
    createEOperation(siteEClass, SITE___GET_OR_CREATE_ABBR__STRING);
    createEOperation(siteEClass, SITE___GET_OR_CREATE_TYPE__STRING);
    createEOperation(siteEClass, SITE___GET_TOPIC__STRING);
    createEOperation(siteEClass, SITE___GET_ROOTS);
    createEOperation(siteEClass, SITE___GET_TOPIC__EOBJECT);

    topicEClass = createEClass(TOPIC);
    createEAttribute(topicEClass, TOPIC__TITLE);
    createEAttribute(topicEClass, TOPIC__ABSTRACT);
    createEAttribute(topicEClass, TOPIC__DOCUMENTATION);
    createEReference(topicEClass, TOPIC__TAGS);
    createEReference(topicEClass, TOPIC__PARENT);
    createEReference(topicEClass, TOPIC__TOPICS);
    createEReference(topicEClass, TOPIC__SEE);
    createEReference(topicEClass, TOPIC__ABBREVIATION);
    createEReference(topicEClass, TOPIC__TYPE);
    createEReference(topicEClass, TOPIC__TARGET);
    createEOperation(topicEClass, TOPIC___IS_ANONYMOUS);
    createEOperation(topicEClass, TOPIC___GET_ANCESTORS_AND_SELF);
    createEOperation(topicEClass, TOPIC___GET_ANCESTORS);
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
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    namedEClass.getESuperTypes().add(this.getElement());
    tagEClass.getESuperTypes().add(this.getNamed());
    typeEClass.getESuperTypes().add(this.getNamed());
    abbreviationEClass.getESuperTypes().add(this.getNamed());
    siteEClass.getESuperTypes().add(this.getNamed());
    topicEClass.getESuperTypes().add(this.getNamed());

    // Initialize classes, features, and operations; add parameters
    initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamed_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTag_Topics(), this.getTopic(), this.getTopic_Tags(), "topics", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTag_Site(), this.getSite(), this.getSite_Tags(), "site", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Topics(), this.getTopic(), this.getTopic_Type(), "topics", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Site(), this.getSite(), this.getSite_Types(), "site", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abbreviationEClass, Abbreviation.class, "Abbreviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbbreviation_Topics(), this.getTopic(), this.getTopic_Abbreviation(), "topics", null, 0, -1, Abbreviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbbreviation_Site(), this.getSite(), this.getSite_Abbreviations(), "site", null, 0, 1, Abbreviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(siteEClass, Site.class, "Site", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSite_Topics(), this.getTopic(), null, "topics", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSite_Tags(), this.getTag(), this.getTag_Site(), "tags", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSite_Abbreviations(), this.getAbbreviation(), this.getAbbreviation_Site(), "abbreviations", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSite_Types(), this.getType(), this.getType_Site(), "types", null, 0, -1, Site.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = initEOperation(getSite__GetOrCreateTag__String(), this.getTag(), "getOrCreateTag", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getSite__GetOrCreateAbbr__String(), this.getAbbreviation(), "getOrCreateAbbr", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getSite__GetOrCreateType__String(), this.getType(), "getOrCreateType", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getSite__GetTopic__String(), this.getTopic(), "getTopic", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEOperation(getSite__GetRoots(), this.getTopic(), "getRoots", 0, -1, !IS_UNIQUE, IS_ORDERED);

    op = initEOperation(getSite__GetTopic__EObject(), this.getTopic(), "getTopic", 0, 1, !IS_UNIQUE, IS_ORDERED);
    addEParameter(op, theEcorePackage.getEObject(), "target", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopic_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTopic_Abstract(), theEcorePackage.getEString(), "abstract", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTopic_Documentation(), theEcorePackage.getEString(), "documentation", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_Tags(), this.getTag(), this.getTag_Topics(), "tags", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_Parent(), this.getTopic(), this.getTopic_Topics(), "parent", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_Topics(), this.getTopic(), this.getTopic_Parent(), "topics", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_See(), this.getTopic(), null, "see", null, 0, -1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_Abbreviation(), this.getAbbreviation(), this.getAbbreviation_Topics(), "abbreviation", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_Type(), this.getType(), this.getType_Topics(), "type", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTopic_Target(), theEcorePackage.getEObject(), null, "target", null, 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEOperation(getTopic__IsAnonymous(), theEcorePackage.getEBoolean(), "isAnonymous", 0, 1, !IS_UNIQUE, IS_ORDERED);

    initEOperation(getTopic__GetAncestorsAndSelf(), this.getTopic(), "getAncestorsAndSelf", 0, -1, !IS_UNIQUE, IS_ORDERED);

    initEOperation(getTopic__GetAncestors(), this.getTopic(), "getAncestors", 0, -1, !IS_UNIQUE, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SitePackageImpl
