/**
 */
package org.ollabaca.on.gtbr.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;

import org.ollabaca.on.gtbr.*;

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
 * @see org.ollabaca.on.gtbr.GtbrPackage
 * @generated
 */
public class GtbrSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GtbrPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GtbrSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GtbrPackage.eINSTANCE;
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
      case GtbrPackage.ACCOUNTING_ELEMENT:
      {
        AccountingElement accountingElement = (AccountingElement)theEObject;
        T result = caseAccountingElement(accountingElement);
        if (result == null) result = casePackageableElement(accountingElement);
        if (result == null) result = caseNamedElement(accountingElement);
        if (result == null) result = caseParameterableElement(accountingElement);
        if (result == null) result = caseElement(accountingElement);
        if (result == null) result = caseEModelElement(accountingElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GtbrPackage.ACCOUNT:
      {
        Account account = (Account)theEObject;
        T result = caseAccount(account);
        if (result == null) result = caseAccountingElement(account);
        if (result == null) result = casePackageableElement(account);
        if (result == null) result = caseNamedElement(account);
        if (result == null) result = caseEModelElement(account);
        if (result == null) result = caseParameterableElement(account);
        if (result == null) result = caseElement(account);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GtbrPackage.ACCOUNTING_OPERATION:
      {
        AccountingOperation accountingOperation = (AccountingOperation)theEObject;
        T result = caseAccountingOperation(accountingOperation);
        if (result == null) result = caseAccountingElement(accountingOperation);
        if (result == null) result = casePackageableElement(accountingOperation);
        if (result == null) result = caseNamedElement(accountingOperation);
        if (result == null) result = caseParameterableElement(accountingOperation);
        if (result == null) result = caseElement(accountingOperation);
        if (result == null) result = caseEModelElement(accountingOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GtbrPackage.DEBIT:
      {
        Debit debit = (Debit)theEObject;
        T result = caseDebit(debit);
        if (result == null) result = caseAccountingOperation(debit);
        if (result == null) result = caseAccountingElement(debit);
        if (result == null) result = casePackageableElement(debit);
        if (result == null) result = caseNamedElement(debit);
        if (result == null) result = caseParameterableElement(debit);
        if (result == null) result = caseElement(debit);
        if (result == null) result = caseEModelElement(debit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GtbrPackage.CREDIT:
      {
        Credit credit = (Credit)theEObject;
        T result = caseCredit(credit);
        if (result == null) result = caseAccountingOperation(credit);
        if (result == null) result = caseAccountingElement(credit);
        if (result == null) result = casePackageableElement(credit);
        if (result == null) result = caseNamedElement(credit);
        if (result == null) result = caseParameterableElement(credit);
        if (result == null) result = caseElement(credit);
        if (result == null) result = caseEModelElement(credit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GtbrPackage.TRANSFER:
      {
        Transfer transfer = (Transfer)theEObject;
        T result = caseTransfer(transfer);
        if (result == null) result = caseAccountingElement(transfer);
        if (result == null) result = casePackageableElement(transfer);
        if (result == null) result = caseNamedElement(transfer);
        if (result == null) result = caseParameterableElement(transfer);
        if (result == null) result = caseElement(transfer);
        if (result == null) result = caseEModelElement(transfer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accounting Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accounting Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccountingElement(AccountingElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Account</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccount(Account object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accounting Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accounting Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccountingOperation(AccountingOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Debit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Debit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDebit(Debit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Credit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Credit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCredit(Credit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transfer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transfer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransfer(Transfer object)
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

} //GtbrSwitch
