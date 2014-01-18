/**
 */
package org.ollabaca.on.mm.gtbr.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

import org.ollabaca.on.mm.gtbr.Account;
import org.ollabaca.on.mm.gtbr.AccountingElement;
import org.ollabaca.on.mm.gtbr.GtbrPackage;
import org.ollabaca.on.mm.gtbr.Record;

import org.ollabaca.on.mm.org.Agent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.AccountImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.AccountImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.AccountImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.AccountImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.AccountImpl#getRecords <em>Records</em>}</li>
 *   <li>{@link org.ollabaca.on.mm.gtbr.impl.AccountImpl#getBalance <em>Balance</em>}</li>
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
   * The cached value of the '{@link #getInstitution() <em>Institution</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstitution()
   * @generated
   * @ordered
   */
  protected Agent institution;

  /**
   * The cached value of the '{@link #getHolder() <em>Holder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHolder()
   * @generated
   * @ordered
   */
  protected Agent holder;

  /**
   * The cached value of the '{@link #getRecords() <em>Records</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecords()
   * @generated
   * @ordered
   */
  protected EList<Record> records;

  /**
   * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBalance()
   * @generated
   * @ordered
   */
  protected static final double BALANCE_EDEFAULT = 0.0;

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
    return GtbrPackage.Literals.ACCOUNT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter getOwningTemplateParameter()
  {
    if (eContainerFeatureID() != GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER) return null;
    return (TemplateParameter)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter basicGetOwningTemplateParameter()
  {
    if (eContainerFeatureID() != GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER) return null;
    return (TemplateParameter)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter)
  {
    if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null))
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
      eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
      eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent getInstitution()
  {
    if (institution != null && institution.eIsProxy())
    {
      InternalEObject oldInstitution = (InternalEObject)institution;
      institution = (Agent)eResolveProxy(oldInstitution);
      if (institution != oldInstitution)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtbrPackage.ACCOUNT__INSTITUTION, oldInstitution, institution));
      }
    }
    return institution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetInstitution()
  {
    return institution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstitution(Agent newInstitution)
  {
    Agent oldInstitution = institution;
    institution = newInstitution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNT__INSTITUTION, oldInstitution, institution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent getHolder()
  {
    if (holder != null && holder.eIsProxy())
    {
      InternalEObject oldHolder = (InternalEObject)holder;
      holder = (Agent)eResolveProxy(oldHolder);
      if (holder != oldHolder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GtbrPackage.ACCOUNT__HOLDER, oldHolder, holder));
      }
    }
    return holder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetHolder()
  {
    return holder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHolder(Agent newHolder)
  {
    Agent oldHolder = holder;
    holder = newHolder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GtbrPackage.ACCOUNT__HOLDER, oldHolder, holder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Record> getRecords()
  {
    if (records == null)
    {
      records = new EObjectWithInverseResolvingEList<Record>(Record.class, this, GtbrPackage.ACCOUNT__RECORDS, GtbrPackage.RECORD__ACCOUNT);
    }
    return records;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getBalance()
  {
    double b = 0;
    EList<Record> _records = this.getRecords();
    final Function1<Record,Date> _function = new Function1<Record,Date>()
    {
      public Date apply(final Record it)
      {
        Date _date = it.getDate();
        return _date;
      }
    };
    List<Record> _sortBy = IterableExtensions.<Record, Date>sortBy(_records, _function);
    for (final Record e : _sortBy)
    {
      double _apply = e.apply(b);
      b = _apply;
    }
    return b;
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
      case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
      case GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER:
        if (templateParameter != null)
          msgs = ((InternalEObject)templateParameter).eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
        return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
      case GtbrPackage.ACCOUNT__RECORDS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecords()).basicAdd(otherEnd, msgs);
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
      case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        return basicSetOwningTemplateParameter(null, msgs);
      case GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER:
        return basicSetTemplateParameter(null, msgs);
      case GtbrPackage.ACCOUNT__RECORDS:
        return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
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
      case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        return eInternalContainer().eInverseRemove(this, UMLPackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
      case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        if (resolve) return getOwningTemplateParameter();
        return basicGetOwningTemplateParameter();
      case GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER:
        if (resolve) return getTemplateParameter();
        return basicGetTemplateParameter();
      case GtbrPackage.ACCOUNT__INSTITUTION:
        if (resolve) return getInstitution();
        return basicGetInstitution();
      case GtbrPackage.ACCOUNT__HOLDER:
        if (resolve) return getHolder();
        return basicGetHolder();
      case GtbrPackage.ACCOUNT__RECORDS:
        return getRecords();
      case GtbrPackage.ACCOUNT__BALANCE:
        return getBalance();
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
      case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)newValue);
        return;
      case GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER:
        setTemplateParameter((TemplateParameter)newValue);
        return;
      case GtbrPackage.ACCOUNT__INSTITUTION:
        setInstitution((Agent)newValue);
        return;
      case GtbrPackage.ACCOUNT__HOLDER:
        setHolder((Agent)newValue);
        return;
      case GtbrPackage.ACCOUNT__RECORDS:
        getRecords().clear();
        getRecords().addAll((Collection<? extends Record>)newValue);
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
      case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        setOwningTemplateParameter((TemplateParameter)null);
        return;
      case GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER:
        setTemplateParameter((TemplateParameter)null);
        return;
      case GtbrPackage.ACCOUNT__INSTITUTION:
        setInstitution((Agent)null);
        return;
      case GtbrPackage.ACCOUNT__HOLDER:
        setHolder((Agent)null);
        return;
      case GtbrPackage.ACCOUNT__RECORDS:
        getRecords().clear();
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
      case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER:
        return basicGetOwningTemplateParameter() != null;
      case GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER:
        return templateParameter != null;
      case GtbrPackage.ACCOUNT__INSTITUTION:
        return institution != null;
      case GtbrPackage.ACCOUNT__HOLDER:
        return holder != null;
      case GtbrPackage.ACCOUNT__RECORDS:
        return records != null && !records.isEmpty();
      case GtbrPackage.ACCOUNT__BALANCE:
        return getBalance() != BALANCE_EDEFAULT;
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
    if (baseClass == ParameterableElement.class)
    {
      switch (derivedFeatureID)
      {
        case GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER: return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
        case GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER: return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
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
    if (baseClass == AccountingElement.class)
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
    if (baseClass == ParameterableElement.class)
    {
      switch (baseFeatureID)
      {
        case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return GtbrPackage.ACCOUNT__OWNING_TEMPLATE_PARAMETER;
        case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return GtbrPackage.ACCOUNT__TEMPLATE_PARAMETER;
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
    if (baseClass == AccountingElement.class)
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
    if (baseClass == ParameterableElement.class)
    {
      switch (baseOperationID)
      {
        case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return GtbrPackage.ACCOUNT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
        case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return GtbrPackage.ACCOUNT___IS_TEMPLATE_PARAMETER;
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
    if (baseClass == AccountingElement.class)
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
      case GtbrPackage.ACCOUNT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
        return isCompatibleWith((ParameterableElement)arguments.get(0));
      case GtbrPackage.ACCOUNT___IS_TEMPLATE_PARAMETER:
        return isTemplateParameter();
    }
    return super.eInvoke(operationID, arguments);
  }

} //AccountImpl
