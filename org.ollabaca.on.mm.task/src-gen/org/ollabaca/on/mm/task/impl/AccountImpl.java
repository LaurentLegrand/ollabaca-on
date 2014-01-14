/**
 */
package org.ollabaca.on.mm.task.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import org.ollabaca.on.mm.task.Account;
import org.ollabaca.on.mm.task.TaskElement;
import org.ollabaca.on.mm.task.TaskPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.task.impl.AccountImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.AccountImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.AccountImpl#getNestedAccounts <em>Nested Accounts</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.task.impl.AccountImpl#getNestingAccount <em>Nesting Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccountImpl extends NamedElementImpl implements Account
{
  /**
   * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateParameter()
   * @generated
   * @ordered
   */
  protected TemplateParameter templateParameter;

  /**
   * The cached value of the '{@link #getNestedAccounts() <em>Nested Accounts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedAccounts()
   * @generated
   * @ordered
   */
  protected EList<Account> nestedAccounts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccountImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TaskPackage.Literals.ACCOUNT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getOwningTemplateParameter()
  {
    if (eContainerFeatureID() != TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER) return null;
    return (TemplateParameter)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter basicGetOwningTemplateParameter()
  {
    if (eContainerFeatureID() != TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER) return null;
    return (TemplateParameter)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter)
  {
    if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null))
    {
      if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newOwningTemplateParameter != null)
        msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getTemplateParameter()
  {
    if (templateParameter != null && templateParameter.eIsProxy())
    {
      InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
      templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
      if (templateParameter != oldTemplateParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskPackage.ACCOUNT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
      }
    }
    return templateParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter basicGetTemplateParameter()
  {
    return templateParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs)
  {
    TemplateParameter oldTemplateParameter = templateParameter;
    templateParameter = newTemplateParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaskPackage.ACCOUNT__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateParameter(TemplateParameter newTemplateParameter)
  {
    if (newTemplateParameter != templateParameter)
    {
      NotificationChain msgs = null;
      if (templateParameter != null)
        msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      if (newTemplateParameter != null)
        msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ACCOUNT__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Account> getNestedAccounts()
  {
    if (nestedAccounts == null)
    {
      nestedAccounts = new EObjectContainmentWithInverseEList<Account>(Account.class, this, TaskPackage.ACCOUNT__NESTED_ACCOUNTS, TaskPackage.ACCOUNT__NESTING_ACCOUNT);
    }
    return nestedAccounts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account getNestingAccount()
  {
    if (eContainerFeatureID() != TaskPackage.ACCOUNT__NESTING_ACCOUNT) return null;
    return (Account)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Account basicGetNestingAccount()
  {
    if (eContainerFeatureID() != TaskPackage.ACCOUNT__NESTING_ACCOUNT) return null;
    return (Account)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNestingAccount(Account newNestingAccount, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newNestingAccount, TaskPackage.ACCOUNT__NESTING_ACCOUNT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNestingAccount(Account newNestingAccount)
  {
    if (newNestingAccount != eInternalContainer() || (eContainerFeatureID() != TaskPackage.ACCOUNT__NESTING_ACCOUNT && newNestingAccount != null))
    {
      if (EcoreUtil.isAncestor(this, newNestingAccount))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newNestingAccount != null)
        msgs = ((InternalEObject)newNestingAccount).eInverseAdd(this, TaskPackage.ACCOUNT__NESTED_ACCOUNTS, Account.class, msgs);
      msgs = basicSetNestingAccount(newNestingAccount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TaskPackage.ACCOUNT__NESTING_ACCOUNT, newNestingAccount, newNestingAccount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCompatibleWith(ParameterableElement p)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTemplateParameter()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
      case TaskPackage.ACCOUNT__TEMPLATE_PARAMETER:
        if (templateParameter != null)
          msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
        return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
      case TaskPackage.ACCOUNT__NESTED_ACCOUNTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedAccounts()).basicAdd(otherEnd, msgs);
      case TaskPackage.ACCOUNT__NESTING_ACCOUNT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetNestingAccount((Account)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        return basicSetOwningTemplateParameter(null, msgs);
      case TaskPackage.ACCOUNT__TEMPLATE_PARAMETER:
        return basicSetTemplateParameter(null, msgs);
      case TaskPackage.ACCOUNT__NESTED_ACCOUNTS:
        return ((InternalEList<?>)getNestedAccounts()).basicRemove(otherEnd, msgs);
      case TaskPackage.ACCOUNT__NESTING_ACCOUNT:
        return basicSetNestingAccount(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        return eInternalContainer().eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
      case TaskPackage.ACCOUNT__NESTING_ACCOUNT:
        return eInternalContainer().eInverseRemove(this, TaskPackage.ACCOUNT__NESTED_ACCOUNTS, Account.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        if (resolve) return getOwningTemplateParameter();
        return basicGetOwningTemplateParameter();
      case TaskPackage.ACCOUNT__TEMPLATE_PARAMETER:
        if (resolve) return getTemplateParameter();
        return basicGetTemplateParameter();
      case TaskPackage.ACCOUNT__NESTED_ACCOUNTS:
        return getNestedAccounts();
      case TaskPackage.ACCOUNT__NESTING_ACCOUNT:
        if (resolve) return getNestingAccount();
        return basicGetNestingAccount();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)newValue);
        return;
      case TaskPackage.ACCOUNT__TEMPLATE_PARAMETER:
        setTemplateParameter((TemplateParameter)newValue);
        return;
      case TaskPackage.ACCOUNT__NESTED_ACCOUNTS:
        getNestedAccounts().clear();
        getNestedAccounts().addAll((Collection<? extends Account>)newValue);
        return;
      case TaskPackage.ACCOUNT__NESTING_ACCOUNT:
        setNestingAccount((Account)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)null);
        return;
      case TaskPackage.ACCOUNT__TEMPLATE_PARAMETER:
        setTemplateParameter((TemplateParameter)null);
        return;
      case TaskPackage.ACCOUNT__NESTED_ACCOUNTS:
        getNestedAccounts().clear();
        return;
      case TaskPackage.ACCOUNT__NESTING_ACCOUNT:
        setNestingAccount((Account)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        return basicGetOwningTemplateParameter() != null;
      case TaskPackage.ACCOUNT__TEMPLATE_PARAMETER:
        return templateParameter != null;
      case TaskPackage.ACCOUNT__NESTED_ACCOUNTS:
        return nestedAccounts != null && !nestedAccounts.isEmpty();
      case TaskPackage.ACCOUNT__NESTING_ACCOUNT:
        return basicGetNestingAccount() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TaskElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ParameterableElement.class)
    {
      switch (derivedFeatureID)
      {
        case TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER: return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
        case TaskPackage.ACCOUNT__TEMPLATE_PARAMETER: return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
        default: return -1;
      }
    }
    if (baseClass == PackageableElement.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TaskElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ParameterableElement.class)
    {
      switch (baseFeatureID)
      {
        case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return TaskPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER;
        case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return TaskPackage.ACCOUNT__TEMPLATE_PARAMETER;
        default: return -1;
      }
    }
    if (baseClass == PackageableElement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
    if (baseClass == TaskElement.class)
    {
      switch (baseOperationID)
      {
        default: return -1;
      }
    }
    if (baseClass == ParameterableElement.class)
    {
      switch (baseOperationID)
      {
        case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return TaskPackage.ACCOUNT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
        case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return TaskPackage.ACCOUNT___IS_TEMPLATE_PARAMETER;
        default: return -1;
      }
    }
    if (baseClass == PackageableElement.class)
    {
      switch (baseOperationID)
      {
        default: return -1;
      }
    }
    return super.eDerivedOperationID(baseOperationID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
    switch (operationID)
    {
      case TaskPackage.ACCOUNT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
        return isCompatibleWith((ParameterableElement)arguments.get(0));
      case TaskPackage.ACCOUNT___IS_TEMPLATE_PARAMETER:
        return isTemplateParameter();
    }
    return super.eInvoke(operationID, arguments);
  }

} //AccountImpl
