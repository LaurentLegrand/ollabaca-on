/**
 */
package org.ollabaca.on.uml.book;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.UMLPackage;

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
 * @see org.ollabaca.on.uml.book.BookFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.ollabaca.on.uml'"
 * @generated
 */
public interface BookPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "book";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.ollabaca.on.uml.book";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "book";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BookPackage eINSTANCE = org.ollabaca.on.uml.book.impl.BookPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ollabaca.on.uml.book.impl.BookElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.uml.book.impl.BookElementImpl
   * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getBookElement()
   * @generated
   */
  int BOOK_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__EANNOTATIONS = UMLPackage.PACKAGEABLE_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__OWNED_COMMENT = UMLPackage.PACKAGEABLE_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__OWNED_ELEMENT = UMLPackage.PACKAGEABLE_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__OWNER = UMLPackage.PACKAGEABLE_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__CLIENT_DEPENDENCY = UMLPackage.PACKAGEABLE_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__NAME = UMLPackage.PACKAGEABLE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__NAME_EXPRESSION = UMLPackage.PACKAGEABLE_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__QUALIFIED_NAME = UMLPackage.PACKAGEABLE_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__VISIBILITY = UMLPackage.PACKAGEABLE_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__OWNING_TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT__DOCUMENTATION = UMLPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT_FEATURE_COUNT = UMLPackage.PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_EANNOTATION__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___ADD_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___CREATE_EANNOTATION__STRING = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___DESTROY = UMLPackage.PACKAGEABLE_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_KEYWORDS = UMLPackage.PACKAGEABLE_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_APPLIED_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_MODEL = UMLPackage.PACKAGEABLE_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_NEAREST_PACKAGE = UMLPackage.PACKAGEABLE_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_REQUIRED_STEREOTYPES = UMLPackage.PACKAGEABLE_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_STEREOTYPE_APPLICATIONS = UMLPackage.PACKAGEABLE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.PACKAGEABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PACKAGEABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___HAS_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.PACKAGEABLE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___REMOVE_KEYWORD__STRING = UMLPackage.PACKAGEABLE_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.PACKAGEABLE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PACKAGEABLE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___ALL_OWNED_ELEMENTS = UMLPackage.PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___MUST_BE_OWNED = UMLPackage.PACKAGEABLE_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___CREATE_USAGE__NAMEDELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_LABEL = UMLPackage.PACKAGEABLE_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_LABEL__BOOLEAN = UMLPackage.PACKAGEABLE_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___ALL_NAMESPACES = UMLPackage.PACKAGEABLE_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___ALL_OWNING_PACKAGES = UMLPackage.PACKAGEABLE_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_NAMESPACE = UMLPackage.PACKAGEABLE_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___GET_QUALIFIED_NAME = UMLPackage.PACKAGEABLE_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___SEPARATOR = UMLPackage.PACKAGEABLE_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.PACKAGEABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT___IS_TEMPLATE_PARAMETER = UMLPackage.PACKAGEABLE_ELEMENT___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_ELEMENT_OPERATION_COUNT = UMLPackage.PACKAGEABLE_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.uml.book.impl.BookImpl <em>Book</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.uml.book.impl.BookImpl
   * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getBook()
   * @generated
   */
  int BOOK = 1;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__EANNOTATIONS = BOOK_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__OWNED_COMMENT = BOOK_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__OWNED_ELEMENT = BOOK_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__OWNER = BOOK_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__CLIENT_DEPENDENCY = BOOK_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__NAME = BOOK_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__NAME_EXPRESSION = BOOK_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__NAMESPACE = BOOK_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__QUALIFIED_NAME = BOOK_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__VISIBILITY = BOOK_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__OWNING_TEMPLATE_PARAMETER = BOOK_ELEMENT__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__TEMPLATE_PARAMETER = BOOK_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__DOCUMENTATION = BOOK_ELEMENT__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK__PARTS = BOOK_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_FEATURE_COUNT = BOOK_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_EANNOTATION__STRING = BOOK_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___ADD_KEYWORD__STRING = BOOK_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___APPLY_STEREOTYPE__STEREOTYPE = BOOK_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___CREATE_EANNOTATION__STRING = BOOK_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___DESTROY = BOOK_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_KEYWORDS = BOOK_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_APPLICABLE_STEREOTYPE__STRING = BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_APPLICABLE_STEREOTYPES = BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_APPLIED_STEREOTYPE__STRING = BOOK_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_APPLIED_STEREOTYPES = BOOK_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_MODEL = BOOK_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_NEAREST_PACKAGE = BOOK_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_RELATIONSHIPS = BOOK_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_REQUIRED_STEREOTYPE__STRING = BOOK_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_REQUIRED_STEREOTYPES = BOOK_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_SOURCE_DIRECTED_RELATIONSHIPS = BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_STEREOTYPE_APPLICATION__STEREOTYPE = BOOK_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_STEREOTYPE_APPLICATIONS = BOOK_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_TARGET_DIRECTED_RELATIONSHIPS = BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_VALUE__STEREOTYPE_STRING = BOOK_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___HAS_KEYWORD__STRING = BOOK_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___HAS_VALUE__STEREOTYPE_STRING = BOOK_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___IS_STEREOTYPE_APPLIED__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___IS_STEREOTYPE_REQUIRED__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___REMOVE_KEYWORD__STRING = BOOK_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___SET_VALUE__STEREOTYPE_STRING_OBJECT = BOOK_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___UNAPPLY_STEREOTYPE__STEREOTYPE = BOOK_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___ALL_OWNED_ELEMENTS = BOOK_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___MUST_BE_OWNED = BOOK_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___CREATE_DEPENDENCY__NAMEDELEMENT = BOOK_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___CREATE_USAGE__NAMEDELEMENT = BOOK_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_LABEL = BOOK_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_LABEL__BOOLEAN = BOOK_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___ALL_NAMESPACES = BOOK_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___ALL_OWNING_PACKAGES = BOOK_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = BOOK_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_NAMESPACE = BOOK_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___GET_QUALIFIED_NAME = BOOK_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___SEPARATOR = BOOK_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = BOOK_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK___IS_TEMPLATE_PARAMETER = BOOK_ELEMENT___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOK_OPERATION_COUNT = BOOK_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.uml.book.impl.PartImpl <em>Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.uml.book.impl.PartImpl
   * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getPart()
   * @generated
   */
  int PART = 2;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__EANNOTATIONS = BOOK_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__OWNED_COMMENT = BOOK_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__OWNED_ELEMENT = BOOK_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__OWNER = BOOK_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__CLIENT_DEPENDENCY = BOOK_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAME = BOOK_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAME_EXPRESSION = BOOK_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__NAMESPACE = BOOK_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__QUALIFIED_NAME = BOOK_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__VISIBILITY = BOOK_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__OWNING_TEMPLATE_PARAMETER = BOOK_ELEMENT__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__TEMPLATE_PARAMETER = BOOK_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__DOCUMENTATION = BOOK_ELEMENT__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Chapters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART__CHAPTERS = BOOK_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_FEATURE_COUNT = BOOK_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_EANNOTATION__STRING = BOOK_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___ADD_KEYWORD__STRING = BOOK_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___APPLY_STEREOTYPE__STEREOTYPE = BOOK_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___CREATE_EANNOTATION__STRING = BOOK_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___DESTROY = BOOK_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_KEYWORDS = BOOK_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_APPLICABLE_STEREOTYPE__STRING = BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_APPLICABLE_STEREOTYPES = BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_APPLIED_STEREOTYPE__STRING = BOOK_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_APPLIED_STEREOTYPES = BOOK_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_MODEL = BOOK_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_NEAREST_PACKAGE = BOOK_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_RELATIONSHIPS = BOOK_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_REQUIRED_STEREOTYPE__STRING = BOOK_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_REQUIRED_STEREOTYPES = BOOK_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_SOURCE_DIRECTED_RELATIONSHIPS = BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_STEREOTYPE_APPLICATION__STEREOTYPE = BOOK_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_STEREOTYPE_APPLICATIONS = BOOK_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_TARGET_DIRECTED_RELATIONSHIPS = BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_VALUE__STEREOTYPE_STRING = BOOK_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___HAS_KEYWORD__STRING = BOOK_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___HAS_VALUE__STEREOTYPE_STRING = BOOK_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___IS_STEREOTYPE_APPLIED__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___IS_STEREOTYPE_REQUIRED__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___REMOVE_KEYWORD__STRING = BOOK_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___SET_VALUE__STEREOTYPE_STRING_OBJECT = BOOK_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___UNAPPLY_STEREOTYPE__STEREOTYPE = BOOK_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___ALL_OWNED_ELEMENTS = BOOK_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___MUST_BE_OWNED = BOOK_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___CREATE_DEPENDENCY__NAMEDELEMENT = BOOK_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___CREATE_USAGE__NAMEDELEMENT = BOOK_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_LABEL = BOOK_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_LABEL__BOOLEAN = BOOK_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___ALL_NAMESPACES = BOOK_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___ALL_OWNING_PACKAGES = BOOK_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = BOOK_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_NAMESPACE = BOOK_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___GET_QUALIFIED_NAME = BOOK_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___SEPARATOR = BOOK_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = BOOK_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART___IS_TEMPLATE_PARAMETER = BOOK_ELEMENT___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PART_OPERATION_COUNT = BOOK_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.uml.book.impl.SectionImpl <em>Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.uml.book.impl.SectionImpl
   * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getSection()
   * @generated
   */
  int SECTION = 4;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__EANNOTATIONS = BOOK_ELEMENT__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__OWNED_COMMENT = BOOK_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__OWNED_ELEMENT = BOOK_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__OWNER = BOOK_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__CLIENT_DEPENDENCY = BOOK_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME = BOOK_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAME_EXPRESSION = BOOK_ELEMENT__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__NAMESPACE = BOOK_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__QUALIFIED_NAME = BOOK_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__VISIBILITY = BOOK_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__OWNING_TEMPLATE_PARAMETER = BOOK_ELEMENT__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__TEMPLATE_PARAMETER = BOOK_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__DOCUMENTATION = BOOK_ELEMENT__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__ELEMENTS = BOOK_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION__SECTIONS = BOOK_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_FEATURE_COUNT = BOOK_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_EANNOTATION__STRING = BOOK_ELEMENT___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___ADD_KEYWORD__STRING = BOOK_ELEMENT___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___APPLY_STEREOTYPE__STEREOTYPE = BOOK_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___CREATE_EANNOTATION__STRING = BOOK_ELEMENT___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___DESTROY = BOOK_ELEMENT___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_KEYWORDS = BOOK_ELEMENT___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_APPLICABLE_STEREOTYPE__STRING = BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_APPLICABLE_STEREOTYPES = BOOK_ELEMENT___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_APPLIED_STEREOTYPE__STRING = BOOK_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_APPLIED_STEREOTYPES = BOOK_ELEMENT___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = BOOK_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_MODEL = BOOK_ELEMENT___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_NEAREST_PACKAGE = BOOK_ELEMENT___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_RELATIONSHIPS = BOOK_ELEMENT___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_REQUIRED_STEREOTYPE__STRING = BOOK_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_REQUIRED_STEREOTYPES = BOOK_ELEMENT___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_SOURCE_DIRECTED_RELATIONSHIPS = BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE = BOOK_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_STEREOTYPE_APPLICATIONS = BOOK_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_TARGET_DIRECTED_RELATIONSHIPS = BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = BOOK_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_VALUE__STEREOTYPE_STRING = BOOK_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___HAS_KEYWORD__STRING = BOOK_ELEMENT___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___HAS_VALUE__STEREOTYPE_STRING = BOOK_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___IS_STEREOTYPE_APPLIED__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE = BOOK_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___REMOVE_KEYWORD__STRING = BOOK_ELEMENT___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___SET_VALUE__STEREOTYPE_STRING_OBJECT = BOOK_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___UNAPPLY_STEREOTYPE__STEREOTYPE = BOOK_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___ALL_OWNED_ELEMENTS = BOOK_ELEMENT___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___MUST_BE_OWNED = BOOK_ELEMENT___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = BOOK_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___CREATE_DEPENDENCY__NAMEDELEMENT = BOOK_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___CREATE_USAGE__NAMEDELEMENT = BOOK_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_LABEL = BOOK_ELEMENT___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_LABEL__BOOLEAN = BOOK_ELEMENT___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___ALL_NAMESPACES = BOOK_ELEMENT___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___ALL_OWNING_PACKAGES = BOOK_ELEMENT___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = BOOK_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_NAMESPACE = BOOK_ELEMENT___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___GET_QUALIFIED_NAME = BOOK_ELEMENT___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___SEPARATOR = BOOK_ELEMENT___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = BOOK_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION___IS_TEMPLATE_PARAMETER = BOOK_ELEMENT___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECTION_OPERATION_COUNT = BOOK_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ollabaca.on.uml.book.impl.ChapterImpl <em>Chapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ollabaca.on.uml.book.impl.ChapterImpl
   * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getChapter()
   * @generated
   */
  int CHAPTER = 3;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__EANNOTATIONS = SECTION__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__OWNED_COMMENT = SECTION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__OWNED_ELEMENT = SECTION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__OWNER = SECTION__OWNER;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__CLIENT_DEPENDENCY = SECTION__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__NAME = SECTION__NAME;

  /**
   * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__NAME_EXPRESSION = SECTION__NAME_EXPRESSION;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__NAMESPACE = SECTION__NAMESPACE;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__QUALIFIED_NAME = SECTION__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__VISIBILITY = SECTION__VISIBILITY;

  /**
   * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__OWNING_TEMPLATE_PARAMETER = SECTION__OWNING_TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__TEMPLATE_PARAMETER = SECTION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__DOCUMENTATION = SECTION__DOCUMENTATION;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__ELEMENTS = SECTION__ELEMENTS;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER__SECTIONS = SECTION__SECTIONS;

  /**
   * The number of structural features of the '<em>Chapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_FEATURE_COUNT = SECTION_FEATURE_COUNT + 0;

  /**
   * The operation id for the '<em>Get EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_EANNOTATION__STRING = SECTION___GET_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Validate Has Owner</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = SECTION___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Not Own Self</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = SECTION___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Add Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___ADD_KEYWORD__STRING = SECTION___ADD_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Apply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___APPLY_STEREOTYPE__STEREOTYPE = SECTION___APPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>Create EAnnotation</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___CREATE_EANNOTATION__STRING = SECTION___CREATE_EANNOTATION__STRING;

  /**
   * The operation id for the '<em>Destroy</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___DESTROY = SECTION___DESTROY;

  /**
   * The operation id for the '<em>Get Keywords</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_KEYWORDS = SECTION___GET_KEYWORDS;

  /**
   * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_APPLICABLE_STEREOTYPE__STRING = SECTION___GET_APPLICABLE_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_APPLICABLE_STEREOTYPES = SECTION___GET_APPLICABLE_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_APPLIED_STEREOTYPE__STRING = SECTION___GET_APPLIED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_APPLIED_STEREOTYPES = SECTION___GET_APPLIED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Applied Substereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = SECTION___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = SECTION___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Model</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_MODEL = SECTION___GET_MODEL;

  /**
   * The operation id for the '<em>Get Nearest Package</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_NEAREST_PACKAGE = SECTION___GET_NEAREST_PACKAGE;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_RELATIONSHIPS = SECTION___GET_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_RELATIONSHIPS__ECLASS = SECTION___GET_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Required Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_REQUIRED_STEREOTYPE__STRING = SECTION___GET_REQUIRED_STEREOTYPE__STRING;

  /**
   * The operation id for the '<em>Get Required Stereotypes</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_REQUIRED_STEREOTYPES = SECTION___GET_REQUIRED_STEREOTYPES;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_SOURCE_DIRECTED_RELATIONSHIPS = SECTION___GET_SOURCE_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = SECTION___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Stereotype Application</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_STEREOTYPE_APPLICATION__STEREOTYPE = SECTION___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

  /**
   * The operation id for the '<em>Get Stereotype Applications</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_STEREOTYPE_APPLICATIONS = SECTION___GET_STEREOTYPE_APPLICATIONS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_TARGET_DIRECTED_RELATIONSHIPS = SECTION___GET_TARGET_DIRECTED_RELATIONSHIPS;

  /**
   * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = SECTION___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

  /**
   * The operation id for the '<em>Get Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_VALUE__STEREOTYPE_STRING = SECTION___GET_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Has Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___HAS_KEYWORD__STRING = SECTION___HAS_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Has Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___HAS_VALUE__STEREOTYPE_STRING = SECTION___HAS_VALUE__STEREOTYPE_STRING;

  /**
   * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = SECTION___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Applied</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___IS_STEREOTYPE_APPLIED__STEREOTYPE = SECTION___IS_STEREOTYPE_APPLIED__STEREOTYPE;

  /**
   * The operation id for the '<em>Is Stereotype Required</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___IS_STEREOTYPE_REQUIRED__STEREOTYPE = SECTION___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

  /**
   * The operation id for the '<em>Remove Keyword</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___REMOVE_KEYWORD__STRING = SECTION___REMOVE_KEYWORD__STRING;

  /**
   * The operation id for the '<em>Set Value</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___SET_VALUE__STEREOTYPE_STRING_OBJECT = SECTION___SET_VALUE__STEREOTYPE_STRING_OBJECT;

  /**
   * The operation id for the '<em>Unapply Stereotype</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___UNAPPLY_STEREOTYPE__STEREOTYPE = SECTION___UNAPPLY_STEREOTYPE__STEREOTYPE;

  /**
   * The operation id for the '<em>All Owned Elements</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___ALL_OWNED_ELEMENTS = SECTION___ALL_OWNED_ELEMENTS;

  /**
   * The operation id for the '<em>Must Be Owned</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___MUST_BE_OWNED = SECTION___MUST_BE_OWNED;

  /**
   * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SECTION___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SECTION___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = SECTION___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

  /**
   * The operation id for the '<em>Create Dependency</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___CREATE_DEPENDENCY__NAMEDELEMENT = SECTION___CREATE_DEPENDENCY__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Create Usage</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___CREATE_USAGE__NAMEDELEMENT = SECTION___CREATE_USAGE__NAMEDELEMENT;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_LABEL = SECTION___GET_LABEL;

  /**
   * The operation id for the '<em>Get Label</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_LABEL__BOOLEAN = SECTION___GET_LABEL__BOOLEAN;

  /**
   * The operation id for the '<em>All Namespaces</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___ALL_NAMESPACES = SECTION___ALL_NAMESPACES;

  /**
   * The operation id for the '<em>All Owning Packages</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___ALL_OWNING_PACKAGES = SECTION___ALL_OWNING_PACKAGES;

  /**
   * The operation id for the '<em>Is Distinguishable From</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = SECTION___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

  /**
   * The operation id for the '<em>Get Namespace</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_NAMESPACE = SECTION___GET_NAMESPACE;

  /**
   * The operation id for the '<em>Get Qualified Name</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___GET_QUALIFIED_NAME = SECTION___GET_QUALIFIED_NAME;

  /**
   * The operation id for the '<em>Separator</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___SEPARATOR = SECTION___SEPARATOR;

  /**
   * The operation id for the '<em>Is Compatible With</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = SECTION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

  /**
   * The operation id for the '<em>Is Template Parameter</em>' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER___IS_TEMPLATE_PARAMETER = SECTION___IS_TEMPLATE_PARAMETER;

  /**
   * The number of operations of the '<em>Chapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAPTER_OPERATION_COUNT = SECTION_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.ollabaca.on.uml.book.BookElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.ollabaca.on.uml.book.BookElement
   * @generated
   */
  EClass getBookElement();

  /**
   * Returns the meta object for the reference '{@link org.ollabaca.on.uml.book.BookElement#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Documentation</em>'.
   * @see org.ollabaca.on.uml.book.BookElement#getDocumentation()
   * @see #getBookElement()
   * @generated
   */
  EReference getBookElement_Documentation();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.uml.book.Book <em>Book</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Book</em>'.
   * @see org.ollabaca.on.uml.book.Book
   * @generated
   */
  EClass getBook();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.uml.book.Book#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see org.ollabaca.on.uml.book.Book#getParts()
   * @see #getBook()
   * @generated
   */
  EReference getBook_Parts();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.uml.book.Part <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Part</em>'.
   * @see org.ollabaca.on.uml.book.Part
   * @generated
   */
  EClass getPart();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.uml.book.Part#getChapters <em>Chapters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Chapters</em>'.
   * @see org.ollabaca.on.uml.book.Part#getChapters()
   * @see #getPart()
   * @generated
   */
  EReference getPart_Chapters();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.uml.book.Chapter <em>Chapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Chapter</em>'.
   * @see org.ollabaca.on.uml.book.Chapter
   * @generated
   */
  EClass getChapter();

  /**
   * Returns the meta object for class '{@link org.ollabaca.on.uml.book.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Section</em>'.
   * @see org.ollabaca.on.uml.book.Section
   * @generated
   */
  EClass getSection();

  /**
   * Returns the meta object for the reference list '{@link org.ollabaca.on.uml.book.Section#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see org.ollabaca.on.uml.book.Section#getElements()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link org.ollabaca.on.uml.book.Section#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.ollabaca.on.uml.book.Section#getSections()
   * @see #getSection()
   * @generated
   */
  EReference getSection_Sections();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BookFactory getBookFactory();

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
     * The meta object literal for the '{@link org.ollabaca.on.uml.book.impl.BookElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.uml.book.impl.BookElementImpl
     * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getBookElement()
     * @generated
     */
    EClass BOOK_ELEMENT = eINSTANCE.getBookElement();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOK_ELEMENT__DOCUMENTATION = eINSTANCE.getBookElement_Documentation();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.uml.book.impl.BookImpl <em>Book</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.uml.book.impl.BookImpl
     * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getBook()
     * @generated
     */
    EClass BOOK = eINSTANCE.getBook();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOK__PARTS = eINSTANCE.getBook_Parts();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.uml.book.impl.PartImpl <em>Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.uml.book.impl.PartImpl
     * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getPart()
     * @generated
     */
    EClass PART = eINSTANCE.getPart();

    /**
     * The meta object literal for the '<em><b>Chapters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PART__CHAPTERS = eINSTANCE.getPart_Chapters();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.uml.book.impl.ChapterImpl <em>Chapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.uml.book.impl.ChapterImpl
     * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getChapter()
     * @generated
     */
    EClass CHAPTER = eINSTANCE.getChapter();

    /**
     * The meta object literal for the '{@link org.ollabaca.on.uml.book.impl.SectionImpl <em>Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ollabaca.on.uml.book.impl.SectionImpl
     * @see org.ollabaca.on.uml.book.impl.BookPackageImpl#getSection()
     * @generated
     */
    EClass SECTION = eINSTANCE.getSection();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__ELEMENTS = eINSTANCE.getSection_Elements();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECTION__SECTIONS = eINSTANCE.getSection_Sections();

  }

} //BookPackage
