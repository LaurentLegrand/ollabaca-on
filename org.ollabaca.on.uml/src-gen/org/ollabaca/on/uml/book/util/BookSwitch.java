/**
 */
package org.ollabaca.on.uml.book.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.ExecutionEnvironment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;

import org.ollabaca.on.uml.book.*;

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
 * @see org.ollabaca.on.uml.book.BookPackage
 * @generated
 */
public class BookSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BookPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BookPackage.eINSTANCE;
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
      case BookPackage.BOOK_ELEMENT:
      {
        BookElement bookElement = (BookElement)theEObject;
        T result = caseBookElement(bookElement);
        if (result == null) result = casePackageableElement(bookElement);
        if (result == null) result = caseNamedElement(bookElement);
        if (result == null) result = caseParameterableElement(bookElement);
        if (result == null) result = caseElement(bookElement);
        if (result == null) result = caseEModelElement(bookElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.BOOK:
      {
        Book book = (Book)theEObject;
        T result = caseBook(book);
        if (result == null) result = caseBookElement(book);
        if (result == null) result = casePackageableElement(book);
        if (result == null) result = caseNamedElement(book);
        if (result == null) result = caseParameterableElement(book);
        if (result == null) result = caseElement(book);
        if (result == null) result = caseEModelElement(book);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.PART:
      {
        Part part = (Part)theEObject;
        T result = casePart(part);
        if (result == null) result = caseBookElement(part);
        if (result == null) result = casePackageableElement(part);
        if (result == null) result = caseNamedElement(part);
        if (result == null) result = caseParameterableElement(part);
        if (result == null) result = caseElement(part);
        if (result == null) result = caseEModelElement(part);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.CHAPTER:
      {
        Chapter chapter = (Chapter)theEObject;
        T result = caseChapter(chapter);
        if (result == null) result = caseSection(chapter);
        if (result == null) result = caseBookElement(chapter);
        if (result == null) result = casePackageableElement(chapter);
        if (result == null) result = caseNamedElement(chapter);
        if (result == null) result = caseParameterableElement(chapter);
        if (result == null) result = caseElement(chapter);
        if (result == null) result = caseEModelElement(chapter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.SECTION:
      {
        Section section = (Section)theEObject;
        T result = caseSection(section);
        if (result == null) result = caseBookElement(section);
        if (result == null) result = casePackageableElement(section);
        if (result == null) result = caseNamedElement(section);
        if (result == null) result = caseParameterableElement(section);
        if (result == null) result = caseElement(section);
        if (result == null) result = caseEModelElement(section);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.TIER:
      {
        Tier tier = (Tier)theEObject;
        T result = caseTier(tier);
        if (result == null) result = caseNode(tier);
        if (result == null) result = caseClass(tier);
        if (result == null) result = caseDeploymentTarget(tier);
        if (result == null) result = caseEncapsulatedClassifier(tier);
        if (result == null) result = caseBehavioredClassifier(tier);
        if (result == null) result = caseStructuredClassifier(tier);
        if (result == null) result = caseClassifier(tier);
        if (result == null) result = caseNamespace(tier);
        if (result == null) result = caseRedefinableElement(tier);
        if (result == null) result = caseType(tier);
        if (result == null) result = caseTemplateableElement(tier);
        if (result == null) result = casePackageableElement(tier);
        if (result == null) result = caseNamedElement(tier);
        if (result == null) result = caseParameterableElement(tier);
        if (result == null) result = caseElement(tier);
        if (result == null) result = caseEModelElement(tier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.FRONT:
      {
        Front front = (Front)theEObject;
        T result = caseFront(front);
        if (result == null) result = caseTier(front);
        if (result == null) result = caseNode(front);
        if (result == null) result = caseClass(front);
        if (result == null) result = caseDeploymentTarget(front);
        if (result == null) result = caseEncapsulatedClassifier(front);
        if (result == null) result = caseBehavioredClassifier(front);
        if (result == null) result = caseStructuredClassifier(front);
        if (result == null) result = caseClassifier(front);
        if (result == null) result = caseNamespace(front);
        if (result == null) result = caseRedefinableElement(front);
        if (result == null) result = caseType(front);
        if (result == null) result = caseTemplateableElement(front);
        if (result == null) result = casePackageableElement(front);
        if (result == null) result = caseNamedElement(front);
        if (result == null) result = caseParameterableElement(front);
        if (result == null) result = caseElement(front);
        if (result == null) result = caseEModelElement(front);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.MIDDLE:
      {
        Middle middle = (Middle)theEObject;
        T result = caseMiddle(middle);
        if (result == null) result = caseTier(middle);
        if (result == null) result = caseNode(middle);
        if (result == null) result = caseClass(middle);
        if (result == null) result = caseDeploymentTarget(middle);
        if (result == null) result = caseEncapsulatedClassifier(middle);
        if (result == null) result = caseBehavioredClassifier(middle);
        if (result == null) result = caseStructuredClassifier(middle);
        if (result == null) result = caseClassifier(middle);
        if (result == null) result = caseNamespace(middle);
        if (result == null) result = caseRedefinableElement(middle);
        if (result == null) result = caseType(middle);
        if (result == null) result = caseTemplateableElement(middle);
        if (result == null) result = casePackageableElement(middle);
        if (result == null) result = caseNamedElement(middle);
        if (result == null) result = caseParameterableElement(middle);
        if (result == null) result = caseElement(middle);
        if (result == null) result = caseEModelElement(middle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.BACK:
      {
        Back back = (Back)theEObject;
        T result = caseBack(back);
        if (result == null) result = caseTier(back);
        if (result == null) result = caseNode(back);
        if (result == null) result = caseClass(back);
        if (result == null) result = caseDeploymentTarget(back);
        if (result == null) result = caseEncapsulatedClassifier(back);
        if (result == null) result = caseBehavioredClassifier(back);
        if (result == null) result = caseStructuredClassifier(back);
        if (result == null) result = caseClassifier(back);
        if (result == null) result = caseNamespace(back);
        if (result == null) result = caseRedefinableElement(back);
        if (result == null) result = caseType(back);
        if (result == null) result = caseTemplateableElement(back);
        if (result == null) result = casePackageableElement(back);
        if (result == null) result = caseNamedElement(back);
        if (result == null) result = caseParameterableElement(back);
        if (result == null) result = caseElement(back);
        if (result == null) result = caseEModelElement(back);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BookPackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = caseExecutionEnvironment(environment);
        if (result == null) result = caseNode(environment);
        if (result == null) result = caseClass(environment);
        if (result == null) result = caseDeploymentTarget(environment);
        if (result == null) result = caseEncapsulatedClassifier(environment);
        if (result == null) result = caseBehavioredClassifier(environment);
        if (result == null) result = caseStructuredClassifier(environment);
        if (result == null) result = caseClassifier(environment);
        if (result == null) result = caseNamespace(environment);
        if (result == null) result = caseRedefinableElement(environment);
        if (result == null) result = caseType(environment);
        if (result == null) result = caseTemplateableElement(environment);
        if (result == null) result = casePackageableElement(environment);
        if (result == null) result = caseNamedElement(environment);
        if (result == null) result = caseParameterableElement(environment);
        if (result == null) result = caseElement(environment);
        if (result == null) result = caseEModelElement(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
  public T caseBookElement(BookElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Book</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Book</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBook(Book object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePart(Part object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Chapter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Chapter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChapter(Chapter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSection(Section object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTier(Tier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Front</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Front</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFront(Front object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Middle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Middle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMiddle(Middle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Back</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Back</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBack(Back object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
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
   * Returns the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentTarget(DeploymentTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execution Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecutionEnvironment(ExecutionEnvironment object)
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

} //BookSwitch
