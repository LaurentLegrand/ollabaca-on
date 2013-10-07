/**
 */
package org.ollabaca.on.site;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.site.SiteFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on'"
 * @generated
 */
public interface SitePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "site";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.ollabaca.on.site";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "site";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SitePackage eINSTANCE = org.ollabaca.on.site.impl.SitePackageImpl.init();

  /**
   * The meta object id for the '{@link org.ollabaca.on.site.impl.NamedImpl <em>Named</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.site.impl.NamedImpl
   * @see org.ollabaca.on.site.impl.SitePackageImpl#getNamed()
   * @generated
   */
  int NAMED = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED__NAME = 0;

  /**
   * The number of structural features of the '<em>Named</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Named</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.site.impl.TagImpl <em>Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.site.impl.TagImpl
   * @see org.ollabaca.on.site.impl.SitePackageImpl#getTag()
   * @generated
   */
  int TAG = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Topics</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__TOPICS = NAMED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Site</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG__SITE = NAMED_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.site.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.site.impl.AbbreviationImpl
   * @see org.ollabaca.on.site.impl.SitePackageImpl#getAbbreviation()
   * @generated
   */
  int ABBREVIATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Topics</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION__TOPICS = NAMED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Site</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION__SITE = NAMED_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Abbreviation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION_FEATURE_COUNT = NAMED_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Abbreviation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABBREVIATION_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.site.impl.SiteImpl <em>Site</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.site.impl.SiteImpl
   * @see org.ollabaca.on.site.impl.SitePackageImpl#getSite()
   * @generated
   */
  int SITE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Topics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE__TOPICS = NAMED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tags</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE__TAGS = NAMED_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Abbreviations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE__ABBREVIATIONS = NAMED_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

  /**
   * The operation id for the '<em>Get Or Create Tag</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE___GET_OR_CREATE_TAG__STRING = NAMED_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Get Or Create Abbr</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE___GET_OR_CREATE_ABBR__STRING = NAMED_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Get Topic</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE___GET_TOPIC__STRING = NAMED_OPERATION_COUNT + 2;

  /**
   * The operation id for the '<em>Get Roots</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE___GET_ROOTS = NAMED_OPERATION_COUNT + 3;

  /**
   * The operation id for the '<em>Get Topic</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE___GET_TOPIC__EOBJECT = NAMED_OPERATION_COUNT + 4;

  /**
   * The number of operations of the '<em>Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 5;

  /**
   * The meta object id for the '{@link org.ollabaca.on.site.impl.TopicImpl <em>Topic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.site.impl.TopicImpl
   * @see org.ollabaca.on.site.impl.SitePackageImpl#getTopic()
   * @generated
   */
  int TOPIC = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__NAME = NAMED__NAME;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__TITLE = NAMED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__ABSTRACT = NAMED_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__DOCUMENTATION = NAMED_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Tags</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__TAGS = NAMED_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__PARENT = NAMED_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Topics</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__TOPICS = NAMED_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>See</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__SEE = NAMED_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Abbreviation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__ABBREVIATION = NAMED_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC__TARGET = NAMED_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Topic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_FEATURE_COUNT = NAMED_FEATURE_COUNT + 9;

  /**
   * The operation id for the '<em>Is Anonymous</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC___IS_ANONYMOUS = NAMED_OPERATION_COUNT + 0;

  /**
   * The operation id for the '<em>Get Ancestors And Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC___GET_ANCESTORS_AND_SELF = NAMED_OPERATION_COUNT + 1;

  /**
   * The operation id for the '<em>Get Ancestors</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC___GET_ANCESTORS = NAMED_OPERATION_COUNT + 2;

  /**
   * The number of operations of the '<em>Topic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPIC_OPERATION_COUNT = NAMED_OPERATION_COUNT + 3;


  /**
   * Returns the meta object for class '{@link org.ollabaca.on.site.Named <em>Named</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named</em>'.
   * @see org.ollabaca.on.site.Named
   * @generated
   */
  EClass getNamed();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.site.Named#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ollabaca.on.site.Named#getName()
   * @see #getNamed()
   * @generated
   */
  EAttribute getNamed_Name();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.site.Tag <em>Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag</em>'.
   * @see org.ollabaca.on.site.Tag
   * @generated
   */
  EClass getTag();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.site.Tag#getTopics <em>Topics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Topics</em>'.
   * @see org.ollabaca.on.site.Tag#getTopics()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Topics();

  /**
   * Returns the meta object for the container reference '{@link org.ollabaca.on.site.Tag#getSite <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Site</em>'.
   * @see org.ollabaca.on.site.Tag#getSite()
   * @see #getTag()
   * @generated
   */
  EReference getTag_Site();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.site.Abbreviation <em>Abbreviation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbreviation</em>'.
   * @see org.ollabaca.on.site.Abbreviation
   * @generated
   */
  EClass getAbbreviation();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.site.Abbreviation#getTopics <em>Topics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Topics</em>'.
   * @see org.ollabaca.on.site.Abbreviation#getTopics()
   * @see #getAbbreviation()
   * @generated
   */
  EReference getAbbreviation_Topics();

  /**
   * Returns the meta object for the container reference '{@link org.ollabaca.on.site.Abbreviation#getSite <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Site</em>'.
   * @see org.ollabaca.on.site.Abbreviation#getSite()
   * @see #getAbbreviation()
   * @generated
   */
  EReference getAbbreviation_Site();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.site.Site <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site</em>'.
   * @see org.ollabaca.on.site.Site
   * @generated
   */
  EClass getSite();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.site.Site#getTopics <em>Topics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Topics</em>'.
   * @see org.ollabaca.on.site.Site#getTopics()
   * @see #getSite()
   * @generated
   */
  EReference getSite_Topics();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.site.Site#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tags</em>'.
   * @see org.ollabaca.on.site.Site#getTags()
   * @see #getSite()
   * @generated
   */
  EReference getSite_Tags();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.site.Site#getAbbreviations <em>Abbreviations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abbreviations</em>'.
   * @see org.ollabaca.on.site.Site#getAbbreviations()
   * @see #getSite()
   * @generated
   */
  EReference getSite_Abbreviations();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Site#getOrCreateTag(java.lang.String) <em>Get Or Create Tag</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Or Create Tag</em>' operation.
   * @see org.ollabaca.on.site.Site#getOrCreateTag(java.lang.String)
   * @generated
   */
  EOperation getSite__GetOrCreateTag__String();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Site#getOrCreateAbbr(java.lang.String) <em>Get Or Create Abbr</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Or Create Abbr</em>' operation.
   * @see org.ollabaca.on.site.Site#getOrCreateAbbr(java.lang.String)
   * @generated
   */
  EOperation getSite__GetOrCreateAbbr__String();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Site#getTopic(java.lang.String) <em>Get Topic</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Topic</em>' operation.
   * @see org.ollabaca.on.site.Site#getTopic(java.lang.String)
   * @generated
   */
  EOperation getSite__GetTopic__String();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Site#getRoots() <em>Get Roots</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Roots</em>' operation.
   * @see org.ollabaca.on.site.Site#getRoots()
   * @generated
   */
  EOperation getSite__GetRoots();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Site#getTopic(org.eclipse.emf.ecore.EObject) <em>Get Topic</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Topic</em>' operation.
   * @see org.ollabaca.on.site.Site#getTopic(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  EOperation getSite__GetTopic__EObject();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.site.Topic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Topic</em>'.
   * @see org.ollabaca.on.site.Topic
   * @generated
   */
  EClass getTopic();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.site.Topic#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.ollabaca.on.site.Topic#getTitle()
   * @see #getTopic()
   * @generated
   */
  EAttribute getTopic_Title();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.site.Topic#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.ollabaca.on.site.Topic#getAbstract()
   * @see #getTopic()
   * @generated
   */
  EAttribute getTopic_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.ollabaca.on.site.Topic#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see org.ollabaca.on.site.Topic#getDocumentation()
   * @see #getTopic()
   * @generated
   */
  EAttribute getTopic_Documentation();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.site.Topic#getTags <em>Tags</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tags</em>'.
   * @see org.ollabaca.on.site.Topic#getTags()
   * @see #getTopic()
   * @generated
   */
  EReference getTopic_Tags();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.site.Topic#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see org.ollabaca.on.site.Topic#getParent()
   * @see #getTopic()
   * @generated
   */
  EReference getTopic_Parent();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.site.Topic#getTopics <em>Topics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Topics</em>'.
   * @see org.ollabaca.on.site.Topic#getTopics()
   * @see #getTopic()
   * @generated
   */
  EReference getTopic_Topics();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.site.Topic#getSee <em>See</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>See</em>'.
   * @see org.ollabaca.on.site.Topic#getSee()
   * @see #getTopic()
   * @generated
   */
  EReference getTopic_See();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.site.Topic#getAbbreviation <em>Abbreviation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Abbreviation</em>'.
   * @see org.ollabaca.on.site.Topic#getAbbreviation()
   * @see #getTopic()
   * @generated
   */
  EReference getTopic_Abbreviation();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.site.Topic#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.ollabaca.on.site.Topic#getTarget()
   * @see #getTopic()
   * @generated
   */
  EReference getTopic_Target();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Topic#isAnonymous() <em>Is Anonymous</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Is Anonymous</em>' operation.
   * @see org.ollabaca.on.site.Topic#isAnonymous()
   * @generated
   */
  EOperation getTopic__IsAnonymous();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Topic#getAncestorsAndSelf() <em>Get Ancestors And Self</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Ancestors And Self</em>' operation.
   * @see org.ollabaca.on.site.Topic#getAncestorsAndSelf()
   * @generated
   */
  EOperation getTopic__GetAncestorsAndSelf();

  /**
   * Returns the meta object for the '{@link org.ollabaca.on.site.Topic#getAncestors() <em>Get Ancestors</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the '<em>Get Ancestors</em>' operation.
   * @see org.ollabaca.on.site.Topic#getAncestors()
   * @generated
   */
  EOperation getTopic__GetAncestors();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SiteFactory getSiteFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ollabaca.on.site.impl.NamedImpl <em>Named</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.site.impl.NamedImpl
     * @see org.ollabaca.on.site.impl.SitePackageImpl#getNamed()
     * @generated
     */
    EClass NAMED = eINSTANCE.getNamed();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.site.impl.TagImpl <em>Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.site.impl.TagImpl
     * @see org.ollabaca.on.site.impl.SitePackageImpl#getTag()
     * @generated
     */
    EClass TAG = eINSTANCE.getTag();

    /**
     * The meta object literal for the '<em><b>Topics</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__TOPICS = eINSTANCE.getTag_Topics();

    /**
     * The meta object literal for the '<em><b>Site</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAG__SITE = eINSTANCE.getTag_Site();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.site.impl.AbbreviationImpl <em>Abbreviation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.site.impl.AbbreviationImpl
     * @see org.ollabaca.on.site.impl.SitePackageImpl#getAbbreviation()
     * @generated
     */
    EClass ABBREVIATION = eINSTANCE.getAbbreviation();

    /**
     * The meta object literal for the '<em><b>Topics</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABBREVIATION__TOPICS = eINSTANCE.getAbbreviation_Topics();

    /**
     * The meta object literal for the '<em><b>Site</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABBREVIATION__SITE = eINSTANCE.getAbbreviation_Site();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.site.impl.SiteImpl <em>Site</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.site.impl.SiteImpl
     * @see org.ollabaca.on.site.impl.SitePackageImpl#getSite()
     * @generated
     */
    EClass SITE = eINSTANCE.getSite();

    /**
     * The meta object literal for the '<em><b>Topics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITE__TOPICS = eINSTANCE.getSite_Topics();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITE__TAGS = eINSTANCE.getSite_Tags();

    /**
     * The meta object literal for the '<em><b>Abbreviations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITE__ABBREVIATIONS = eINSTANCE.getSite_Abbreviations();

    /**
     * The meta object literal for the '<em><b>Get Or Create Tag</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SITE___GET_OR_CREATE_TAG__STRING = eINSTANCE.getSite__GetOrCreateTag__String();

    /**
     * The meta object literal for the '<em><b>Get Or Create Abbr</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SITE___GET_OR_CREATE_ABBR__STRING = eINSTANCE.getSite__GetOrCreateAbbr__String();

    /**
     * The meta object literal for the '<em><b>Get Topic</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SITE___GET_TOPIC__STRING = eINSTANCE.getSite__GetTopic__String();

    /**
     * The meta object literal for the '<em><b>Get Roots</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SITE___GET_ROOTS = eINSTANCE.getSite__GetRoots();

    /**
     * The meta object literal for the '<em><b>Get Topic</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation SITE___GET_TOPIC__EOBJECT = eINSTANCE.getSite__GetTopic__EObject();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.site.impl.TopicImpl <em>Topic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.site.impl.TopicImpl
     * @see org.ollabaca.on.site.impl.SitePackageImpl#getTopic()
     * @generated
     */
    EClass TOPIC = eINSTANCE.getTopic();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPIC__TITLE = eINSTANCE.getTopic_Title();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPIC__ABSTRACT = eINSTANCE.getTopic_Abstract();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOPIC__DOCUMENTATION = eINSTANCE.getTopic_Documentation();

    /**
     * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC__TAGS = eINSTANCE.getTopic_Tags();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC__PARENT = eINSTANCE.getTopic_Parent();

    /**
     * The meta object literal for the '<em><b>Topics</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC__TOPICS = eINSTANCE.getTopic_Topics();

    /**
     * The meta object literal for the '<em><b>See</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC__SEE = eINSTANCE.getTopic_See();

    /**
     * The meta object literal for the '<em><b>Abbreviation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC__ABBREVIATION = eINSTANCE.getTopic_Abbreviation();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOPIC__TARGET = eINSTANCE.getTopic_Target();

    /**
     * The meta object literal for the '<em><b>Is Anonymous</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation TOPIC___IS_ANONYMOUS = eINSTANCE.getTopic__IsAnonymous();

    /**
     * The meta object literal for the '<em><b>Get Ancestors And Self</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation TOPIC___GET_ANCESTORS_AND_SELF = eINSTANCE.getTopic__GetAncestorsAndSelf();

    /**
     * The meta object literal for the '<em><b>Get Ancestors</b></em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EOperation TOPIC___GET_ANCESTORS = eINSTANCE.getTopic__GetAncestors();

  }

} //SitePackage
