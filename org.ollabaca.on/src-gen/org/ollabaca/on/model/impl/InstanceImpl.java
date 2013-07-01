/**
 */
package org.ollabaca.on.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.ModelPackage;
import org.ollabaca.on.model.Slot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ollabaca.on.model.impl.InstanceImpl#getSlots <em>Slots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends ValueImpl implements Instance
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected static final String ABSTRACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected String abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getSee() <em>See</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSee()
   * @generated
   * @ordered
   */
  protected EList<Instance> see;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<String> tags;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlots()
   * @generated
   * @ordered
   */
  protected EList<Slot> slots;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstanceImpl()
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
    return ModelPackage.Literals.INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(String newAbstract)
  {
    String oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Instance> getSee()
  {
    if (see == null)
    {
      see = new EObjectResolvingEList<Instance>(Instance.class, this, ModelPackage.INSTANCE__SEE);
    }
    return see;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTags()
  {
    if (tags == null)
    {
      tags = new EDataTypeEList<String>(String.class, this, ModelPackage.INSTANCE__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.INSTANCE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Slot> getSlots()
  {
    if (slots == null)
    {
      slots = new EObjectContainmentEList<Slot>(Slot.class, this, ModelPackage.INSTANCE__SLOTS);
    }
    return slots;
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
      case ModelPackage.INSTANCE__SLOTS:
        return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ModelPackage.INSTANCE__TITLE:
        return getTitle();
      case ModelPackage.INSTANCE__ABSTRACT:
        return getAbstract();
      case ModelPackage.INSTANCE__DOCUMENTATION:
        return getDocumentation();
      case ModelPackage.INSTANCE__SEE:
        return getSee();
      case ModelPackage.INSTANCE__TAGS:
        return getTags();
      case ModelPackage.INSTANCE__NAME:
        return getName();
      case ModelPackage.INSTANCE__TYPE:
        return getType();
      case ModelPackage.INSTANCE__SLOTS:
        return getSlots();
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
      case ModelPackage.INSTANCE__TITLE:
        setTitle((String)newValue);
        return;
      case ModelPackage.INSTANCE__ABSTRACT:
        setAbstract((String)newValue);
        return;
      case ModelPackage.INSTANCE__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case ModelPackage.INSTANCE__SEE:
        getSee().clear();
        getSee().addAll((Collection<? extends Instance>)newValue);
        return;
      case ModelPackage.INSTANCE__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends String>)newValue);
        return;
      case ModelPackage.INSTANCE__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.INSTANCE__TYPE:
        setType((String)newValue);
        return;
      case ModelPackage.INSTANCE__SLOTS:
        getSlots().clear();
        getSlots().addAll((Collection<? extends Slot>)newValue);
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
      case ModelPackage.INSTANCE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case ModelPackage.INSTANCE__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case ModelPackage.INSTANCE__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case ModelPackage.INSTANCE__SEE:
        getSee().clear();
        return;
      case ModelPackage.INSTANCE__TAGS:
        getTags().clear();
        return;
      case ModelPackage.INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelPackage.INSTANCE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ModelPackage.INSTANCE__SLOTS:
        getSlots().clear();
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
      case ModelPackage.INSTANCE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case ModelPackage.INSTANCE__ABSTRACT:
        return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
      case ModelPackage.INSTANCE__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case ModelPackage.INSTANCE__SEE:
        return see != null && !see.isEmpty();
      case ModelPackage.INSTANCE__TAGS:
        return tags != null && !tags.isEmpty();
      case ModelPackage.INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelPackage.INSTANCE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case ModelPackage.INSTANCE__SLOTS:
        return slots != null && !slots.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(", tags: ");
    result.append(tags);
    result.append(", name: ");
    result.append(name);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //InstanceImpl
