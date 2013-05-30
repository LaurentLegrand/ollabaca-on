/**
 */
package org.ollabaca.on.site.impl;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ollabaca.on.site.SitePackage;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.ollabaca.on.site.impl.TopicImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopicImpl extends NamedImpl implements Topic
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
   * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<Tag> tags;

  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Topic parent;

  /**
   * The cached value of the '{@link #getTopics() <em>Topics</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopics()
   * @generated
   * @ordered
   */
  protected EList<Topic> topics;

  /**
   * The cached value of the '{@link #getSee() <em>See</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSee()
   * @generated
   * @ordered
   */
  protected EList<Topic> see;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EObject target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopicImpl()
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
    return SitePackage.Literals.TOPIC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.TOPIC__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.TOPIC__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.TOPIC__DOCUMENTATION, oldDocumentation, documentation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Tag> getTags()
  {
    if (tags == null)
    {
      tags = new EObjectResolvingEList<Tag>(Tag.class, this, SitePackage.TOPIC__TAGS);
    }
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Topic getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Topic)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitePackage.TOPIC__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Topic basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(Topic newParent, NotificationChain msgs)
  {
    Topic oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SitePackage.TOPIC__PARENT, oldParent, newParent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Topic newParent)
  {
    if (newParent != parent)
    {
      NotificationChain msgs = null;
      if (parent != null)
        msgs = ((InternalEObject)parent).eInverseRemove(this, SitePackage.TOPIC__TOPICS, Topic.class, msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, SitePackage.TOPIC__TOPICS, Topic.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.TOPIC__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getTopics()
  {
    if (topics == null)
    {
      topics = new EObjectWithInverseResolvingEList<Topic>(Topic.class, this, SitePackage.TOPIC__TOPICS, SitePackage.TOPIC__PARENT);
    }
    return topics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getSee()
  {
    if (see == null)
    {
      see = new EObjectResolvingEList<Topic>(Topic.class, this, SitePackage.TOPIC__SEE);
    }
    return see;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitePackage.TOPIC__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(EObject newTarget)
  {
    EObject oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.TOPIC__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnonymous()
  {
    boolean _or = false;
    Topic _this = this;
    String _name = _this.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals)
    {
      _or = true;
    } else
    {
      Topic _this_1 = this;
      String _name_1 = _this_1.getName();
      String _trim = _name_1.trim();
      int _length = _trim.length();
      boolean _equals_1 = (_length == 0);
      _or = (_equals || _equals_1);
    }
    return _or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getAncestorsAndSelf()
  {
    BasicEList<Topic> _basicEList = new BasicEList<Topic>();
    final EList<Topic> list = _basicEList;
    Topic e = this;
    boolean _notEquals = (!Objects.equal(e, null));
    boolean _while = _notEquals;
    while (_while)
    {
      {
        list.add(0, e);
        Topic _parent = e.getParent();
        e = _parent;
      }
      boolean _notEquals_1 = (!Objects.equal(e, null));
      _while = _notEquals_1;
    }
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getAncestors()
  {
    BasicEList<Topic> _basicEList = new BasicEList<Topic>();
    final EList<Topic> list = _basicEList;
    Topic _this = this;
    Topic e = _this.getParent();
    boolean _notEquals = (!Objects.equal(e, null));
    boolean _while = _notEquals;
    while (_while)
    {
      {
        list.add(0, e);
        Topic _parent = e.getParent();
        e = _parent;
      }
      boolean _notEquals_1 = (!Objects.equal(e, null));
      _while = _notEquals_1;
    }
    return list;
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
      case SitePackage.TOPIC__PARENT:
        if (parent != null)
          msgs = ((InternalEObject)parent).eInverseRemove(this, SitePackage.TOPIC__TOPICS, Topic.class, msgs);
        return basicSetParent((Topic)otherEnd, msgs);
      case SitePackage.TOPIC__TOPICS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopics()).basicAdd(otherEnd, msgs);
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
      case SitePackage.TOPIC__PARENT:
        return basicSetParent(null, msgs);
      case SitePackage.TOPIC__TOPICS:
        return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
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
      case SitePackage.TOPIC__TITLE:
        return getTitle();
      case SitePackage.TOPIC__ABSTRACT:
        return getAbstract();
      case SitePackage.TOPIC__DOCUMENTATION:
        return getDocumentation();
      case SitePackage.TOPIC__TAGS:
        return getTags();
      case SitePackage.TOPIC__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case SitePackage.TOPIC__TOPICS:
        return getTopics();
      case SitePackage.TOPIC__SEE:
        return getSee();
      case SitePackage.TOPIC__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case SitePackage.TOPIC__TITLE:
        setTitle((String)newValue);
        return;
      case SitePackage.TOPIC__ABSTRACT:
        setAbstract((String)newValue);
        return;
      case SitePackage.TOPIC__DOCUMENTATION:
        setDocumentation((String)newValue);
        return;
      case SitePackage.TOPIC__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends Tag>)newValue);
        return;
      case SitePackage.TOPIC__PARENT:
        setParent((Topic)newValue);
        return;
      case SitePackage.TOPIC__TOPICS:
        getTopics().clear();
        getTopics().addAll((Collection<? extends Topic>)newValue);
        return;
      case SitePackage.TOPIC__SEE:
        getSee().clear();
        getSee().addAll((Collection<? extends Topic>)newValue);
        return;
      case SitePackage.TOPIC__TARGET:
        setTarget((EObject)newValue);
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
      case SitePackage.TOPIC__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case SitePackage.TOPIC__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case SitePackage.TOPIC__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
        return;
      case SitePackage.TOPIC__TAGS:
        getTags().clear();
        return;
      case SitePackage.TOPIC__PARENT:
        setParent((Topic)null);
        return;
      case SitePackage.TOPIC__TOPICS:
        getTopics().clear();
        return;
      case SitePackage.TOPIC__SEE:
        getSee().clear();
        return;
      case SitePackage.TOPIC__TARGET:
        setTarget((EObject)null);
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
      case SitePackage.TOPIC__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case SitePackage.TOPIC__ABSTRACT:
        return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
      case SitePackage.TOPIC__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
      case SitePackage.TOPIC__TAGS:
        return tags != null && !tags.isEmpty();
      case SitePackage.TOPIC__PARENT:
        return parent != null;
      case SitePackage.TOPIC__TOPICS:
        return topics != null && !topics.isEmpty();
      case SitePackage.TOPIC__SEE:
        return see != null && !see.isEmpty();
      case SitePackage.TOPIC__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
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
      case SitePackage.TOPIC___IS_ANONYMOUS:
        return isAnonymous();
      case SitePackage.TOPIC___GET_ANCESTORS_AND_SELF:
        return getAncestorsAndSelf();
      case SitePackage.TOPIC___GET_ANCESTORS:
        return getAncestors();
    }
    return super.eInvoke(operationID, arguments);
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
    result.append(')');
    return result.toString();
  }

} //TopicImpl
