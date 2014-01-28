/**
 */
package org.ollabaca.on.mm.rest.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

import org.ollabaca.on.mm.rest.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ollabaca.on.mm.rest.RestPackage
 * @generated
 */
public class RestSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RestPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RestPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RestPackage.MIME_TYPE:
      {
        MimeType mimeType = (MimeType)theEObject;
        T result = caseMimeType(mimeType);
        if (result == null) result = caseClass(mimeType);
        if (result == null) result = caseEncapsulatedClassifier(mimeType);
        if (result == null) result = caseBehavioredClassifier(mimeType);
        if (result == null) result = caseStructuredClassifier(mimeType);
        if (result == null) result = caseClassifier(mimeType);
        if (result == null) result = caseNamespace(mimeType);
        if (result == null) result = caseRedefinableElement(mimeType);
        if (result == null) result = caseType(mimeType);
        if (result == null) result = caseTemplateableElement(mimeType);
        if (result == null) result = casePackageableElement(mimeType);
        if (result == null) result = caseNamedElement(mimeType);
        if (result == null) result = caseParameterableElement(mimeType);
        if (result == null) result = caseElement(mimeType);
        if (result == null) result = caseEModelElement(mimeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.HTTP_RESOURCE:
      {
        HttpResource httpResource = (HttpResource)theEObject;
        T result = caseHttpResource(httpResource);
        if (result == null) result = caseInterface(httpResource);
        if (result == null) result = caseClassifier(httpResource);
        if (result == null) result = caseNamespace(httpResource);
        if (result == null) result = caseRedefinableElement(httpResource);
        if (result == null) result = caseType(httpResource);
        if (result == null) result = caseTemplateableElement(httpResource);
        if (result == null) result = casePackageableElement(httpResource);
        if (result == null) result = caseNamedElement(httpResource);
        if (result == null) result = caseParameterableElement(httpResource);
        if (result == null) result = caseElement(httpResource);
        if (result == null) result = caseEModelElement(httpResource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.HTTP_METHOD:
      {
        HttpMethod httpMethod = (HttpMethod)theEObject;
        T result = caseHttpMethod(httpMethod);
        if (result == null) result = caseOperation(httpMethod);
        if (result == null) result = caseBehavioralFeature(httpMethod);
        if (result == null) result = caseParameterableElement(httpMethod);
        if (result == null) result = caseTemplateableElement(httpMethod);
        if (result == null) result = caseNamespace(httpMethod);
        if (result == null) result = caseFeature(httpMethod);
        if (result == null) result = caseRedefinableElement(httpMethod);
        if (result == null) result = caseNamedElement(httpMethod);
        if (result == null) result = caseElement(httpMethod);
        if (result == null) result = caseEModelElement(httpMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.DELETE:
      {
        DELETE delete = (DELETE)theEObject;
        T result = caseDELETE(delete);
        if (result == null) result = caseHttpMethod(delete);
        if (result == null) result = caseOperation(delete);
        if (result == null) result = caseBehavioralFeature(delete);
        if (result == null) result = caseParameterableElement(delete);
        if (result == null) result = caseTemplateableElement(delete);
        if (result == null) result = caseNamespace(delete);
        if (result == null) result = caseFeature(delete);
        if (result == null) result = caseRedefinableElement(delete);
        if (result == null) result = caseNamedElement(delete);
        if (result == null) result = caseElement(delete);
        if (result == null) result = caseEModelElement(delete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.GET:
      {
        GET get = (GET)theEObject;
        T result = caseGET(get);
        if (result == null) result = caseHttpMethod(get);
        if (result == null) result = caseOperation(get);
        if (result == null) result = caseBehavioralFeature(get);
        if (result == null) result = caseParameterableElement(get);
        if (result == null) result = caseTemplateableElement(get);
        if (result == null) result = caseNamespace(get);
        if (result == null) result = caseFeature(get);
        if (result == null) result = caseRedefinableElement(get);
        if (result == null) result = caseNamedElement(get);
        if (result == null) result = caseElement(get);
        if (result == null) result = caseEModelElement(get);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.HEAD:
      {
        HEAD head = (HEAD)theEObject;
        T result = caseHEAD(head);
        if (result == null) result = caseHttpMethod(head);
        if (result == null) result = caseOperation(head);
        if (result == null) result = caseBehavioralFeature(head);
        if (result == null) result = caseParameterableElement(head);
        if (result == null) result = caseTemplateableElement(head);
        if (result == null) result = caseNamespace(head);
        if (result == null) result = caseFeature(head);
        if (result == null) result = caseRedefinableElement(head);
        if (result == null) result = caseNamedElement(head);
        if (result == null) result = caseElement(head);
        if (result == null) result = caseEModelElement(head);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.POST:
      {
        POST post = (POST)theEObject;
        T result = casePOST(post);
        if (result == null) result = caseHttpMethod(post);
        if (result == null) result = caseOperation(post);
        if (result == null) result = caseBehavioralFeature(post);
        if (result == null) result = caseParameterableElement(post);
        if (result == null) result = caseTemplateableElement(post);
        if (result == null) result = caseNamespace(post);
        if (result == null) result = caseFeature(post);
        if (result == null) result = caseRedefinableElement(post);
        if (result == null) result = caseNamedElement(post);
        if (result == null) result = caseElement(post);
        if (result == null) result = caseEModelElement(post);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.OPTIONS:
      {
        OPTIONS options = (OPTIONS)theEObject;
        T result = caseOPTIONS(options);
        if (result == null) result = caseHttpMethod(options);
        if (result == null) result = caseOperation(options);
        if (result == null) result = caseBehavioralFeature(options);
        if (result == null) result = caseParameterableElement(options);
        if (result == null) result = caseTemplateableElement(options);
        if (result == null) result = caseNamespace(options);
        if (result == null) result = caseFeature(options);
        if (result == null) result = caseRedefinableElement(options);
        if (result == null) result = caseNamedElement(options);
        if (result == null) result = caseElement(options);
        if (result == null) result = caseEModelElement(options);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.HTTP_PARAMETER:
      {
        HttpParameter httpParameter = (HttpParameter)theEObject;
        T result = caseHttpParameter(httpParameter);
        if (result == null) result = caseParameter(httpParameter);
        if (result == null) result = caseConnectableElement(httpParameter);
        if (result == null) result = caseMultiplicityElement(httpParameter);
        if (result == null) result = caseTypedElement(httpParameter);
        if (result == null) result = caseParameterableElement(httpParameter);
        if (result == null) result = caseNamedElement(httpParameter);
        if (result == null) result = caseElement(httpParameter);
        if (result == null) result = caseEModelElement(httpParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.QUERY_PARAMETER:
      {
        QueryParameter queryParameter = (QueryParameter)theEObject;
        T result = caseQueryParameter(queryParameter);
        if (result == null) result = caseHttpParameter(queryParameter);
        if (result == null) result = caseParameter(queryParameter);
        if (result == null) result = caseConnectableElement(queryParameter);
        if (result == null) result = caseMultiplicityElement(queryParameter);
        if (result == null) result = caseTypedElement(queryParameter);
        if (result == null) result = caseParameterableElement(queryParameter);
        if (result == null) result = caseNamedElement(queryParameter);
        if (result == null) result = caseElement(queryParameter);
        if (result == null) result = caseEModelElement(queryParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.PATH_PARAMETER:
      {
        PathParameter pathParameter = (PathParameter)theEObject;
        T result = casePathParameter(pathParameter);
        if (result == null) result = caseHttpParameter(pathParameter);
        if (result == null) result = caseParameter(pathParameter);
        if (result == null) result = caseConnectableElement(pathParameter);
        if (result == null) result = caseMultiplicityElement(pathParameter);
        if (result == null) result = caseTypedElement(pathParameter);
        if (result == null) result = caseParameterableElement(pathParameter);
        if (result == null) result = caseNamedElement(pathParameter);
        if (result == null) result = caseElement(pathParameter);
        if (result == null) result = caseEModelElement(pathParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.FORM_PARAMETER:
      {
        FormParameter formParameter = (FormParameter)theEObject;
        T result = caseFormParameter(formParameter);
        if (result == null) result = caseHttpParameter(formParameter);
        if (result == null) result = caseParameter(formParameter);
        if (result == null) result = caseConnectableElement(formParameter);
        if (result == null) result = caseMultiplicityElement(formParameter);
        if (result == null) result = caseTypedElement(formParameter);
        if (result == null) result = caseParameterableElement(formParameter);
        if (result == null) result = caseNamedElement(formParameter);
        if (result == null) result = caseElement(formParameter);
        if (result == null) result = caseEModelElement(formParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.COOKIE_PARAMETER:
      {
        CookieParameter cookieParameter = (CookieParameter)theEObject;
        T result = caseCookieParameter(cookieParameter);
        if (result == null) result = caseHttpParameter(cookieParameter);
        if (result == null) result = caseParameter(cookieParameter);
        if (result == null) result = caseConnectableElement(cookieParameter);
        if (result == null) result = caseMultiplicityElement(cookieParameter);
        if (result == null) result = caseTypedElement(cookieParameter);
        if (result == null) result = caseParameterableElement(cookieParameter);
        if (result == null) result = caseNamedElement(cookieParameter);
        if (result == null) result = caseElement(cookieParameter);
        if (result == null) result = caseEModelElement(cookieParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.HEADER_PARAMETER:
      {
        HeaderParameter headerParameter = (HeaderParameter)theEObject;
        T result = caseHeaderParameter(headerParameter);
        if (result == null) result = caseHttpParameter(headerParameter);
        if (result == null) result = caseParameter(headerParameter);
        if (result == null) result = caseConnectableElement(headerParameter);
        if (result == null) result = caseMultiplicityElement(headerParameter);
        if (result == null) result = caseTypedElement(headerParameter);
        if (result == null) result = caseParameterableElement(headerParameter);
        if (result == null) result = caseNamedElement(headerParameter);
        if (result == null) result = caseElement(headerParameter);
        if (result == null) result = caseEModelElement(headerParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestPackage.HTTP_MESSAGE:
      {
        HttpMessage httpMessage = (HttpMessage)theEObject;
        T result = caseHttpMessage(httpMessage);
        if (result == null) result = caseClassifier(httpMessage);
        if (result == null) result = caseNamespace(httpMessage);
        if (result == null) result = caseRedefinableElement(httpMessage);
        if (result == null) result = caseType(httpMessage);
        if (result == null) result = caseTemplateableElement(httpMessage);
        if (result == null) result = casePackageableElement(httpMessage);
        if (result == null) result = caseNamedElement(httpMessage);
        if (result == null) result = caseParameterableElement(httpMessage);
        if (result == null) result = caseElement(httpMessage);
        if (result == null) result = caseEModelElement(httpMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mime Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mime Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMimeType(MimeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Resource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Resource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpResource(HttpResource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpMethod(HttpMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DELETE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DELETE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDELETE(DELETE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GET</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GET</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGET(GET object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HEAD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HEAD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHEAD(HEAD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>POST</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>POST</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePOST(POST object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OPTIONS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OPTIONS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOPTIONS(OPTIONS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpParameter(HttpParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQueryParameter(QueryParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathParameter(PathParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormParameter(FormParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cookie Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cookie Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCookieParameter(CookieParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeaderParameter(HeaderParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Http Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Http Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHttpMessage(HttpMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEModelElement(EModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace(Namespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRedefinableElement(RedefinableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterableElement(ParameterableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageableElement(PackageableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateableElement(TemplateableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifier(Classifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructuredClassifier(StructuredClassifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEncapsulatedClassifier(EncapsulatedClassifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehavioredClassifier(BehavioredClassifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(org.eclipse.uml2.uml.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehavioralFeature(BehavioralFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedElement(TypedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectableElement(ConnectableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicityElement(MultiplicityElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RestSwitch
