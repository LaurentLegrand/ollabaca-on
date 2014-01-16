/**
 */
package org.ollabaca.on.uml.rest.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Element;
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
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

import org.ollabaca.on.uml.rest.*;

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
 * @see org.ollabaca.on.uml.rest.RestPackage
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
