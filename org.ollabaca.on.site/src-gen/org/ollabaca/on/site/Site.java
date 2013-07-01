/**
 */
package org.ollabaca.on.site;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.Site#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Site#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.site.SitePackage#getSite()
 * @model
 * @generated
 */
public interface Site extends Named
{
  /**
   * Returns the value of the '<em><b>Topics</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.site.Topic}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topics</em>' containment reference list.
   * @see org.ollabaca.on.site.SitePackage#getSite_Topics()
   * @model containment="true"
   * @generated
   */
  EList<Topic> getTopics();

  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link org.ollabaca.on.site.Tag}.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Tag#getSite <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see org.ollabaca.on.site.SitePackage#getSite_Tags()
   * @see org.ollabaca.on.site.Tag#getSite
   * @model opposite="site" containment="true"
   * @generated
   */
  EList<Tag> getTags();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * Get or create a tag with a given name
   * <!-- end-model-doc -->
   * @model unique="false" nameUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%java.lang.String%> n = name;\n<%org.ollabaca.on.site.Site%> _this = this;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Tag%>> _tags = _this.getTags();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Tag%>,<%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Tag%>,<%java.lang.Boolean%>>()\n{\n\t\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Tag%> it)\n\t\t{\n\t\t\t<%java.lang.String%> _name = it.getName();\n\t\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_name, n);\n\t\t\treturn <%java.lang.Boolean%>.valueOf(_equals);\n\t\t}\n\t};\n<%org.ollabaca.on.site.Tag%> tag = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Tag%>>findFirst(_tags, _function);\nboolean _equals = <%com.google.common.base.Objects%>.equal(tag, null);\nif (_equals)\n{\n\t<%org.ollabaca.on.site.Tag%> _createTag = <%org.ollabaca.on.site.SiteFactory%>.eINSTANCE.createTag();\n\ttag = _createTag;\n\ttag.setName(name);\n\t<%org.ollabaca.on.site.Site%> _this_1 = this;\n\t<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Tag%>> _tags_1 = _this_1.getTags();\n\t_tags_1.add(tag);\n}\nreturn tag;'"
   * @generated
   */
  Tag getOrCreateTag(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model unique="false" nameUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.ollabaca.on.site.Topic%> _xblockexpression = null;\n{\n\tfinal <%java.lang.String%> n = name;\n\t<%org.ollabaca.on.site.Site%> _this = this;\n\t<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> _topics = _this.getTopics();\n\tfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>,<%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>,<%java.lang.Boolean%>>()\n\t{\n\t\t\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Topic%> it)\n\t\t\t{\n\t\t\t\t<%java.lang.String%> _name = it.getName();\n\t\t\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_name, n);\n\t\t\t\treturn <%java.lang.Boolean%>.valueOf(_equals);\n\t\t\t}\n\t\t};\n\t<%org.ollabaca.on.site.Topic%> _findFirst = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>findFirst(_topics, _function);\n\t_xblockexpression = (_findFirst);\n}\nreturn _xblockexpression;'"
   * @generated
   */
  Topic getTopic(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * Get the root topics
   * <!-- end-model-doc -->
   * @model kind="operation" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.ollabaca.on.site.Site%> _this = this;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> _topics = _this.getTopics();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>,<%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>,<%java.lang.Boolean%>>()\n{\n\t\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Topic%> it)\n\t\t{\n\t\t\tboolean _and = false;\n\t\t\t<%org.ollabaca.on.site.Topic%> _parent = it.getParent();\n\t\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_parent, null);\n\t\t\tif (!_equals)\n\t\t\t{\n\t\t\t\t_and = false;\n\t\t\t} else\n\t\t\t{\n\t\t\t\tboolean _isAnonymous = it.isAnonymous();\n\t\t\t\tboolean _not = (!_isAnonymous);\n\t\t\t\t_and = (_equals && _not);\n\t\t\t}\n\t\t\treturn <%java.lang.Boolean%>.valueOf(_and);\n\t\t}\n\t};\n<%java.lang.Iterable%><<%org.ollabaca.on.site.Topic%>> _filter = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>filter(_topics, _function);\n<%java.util.List%><<%org.ollabaca.on.site.Topic%>> _list = <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>toList(_filter);\n<%org.eclipse.emf.common.util.BasicEList%><<%org.ollabaca.on.site.Topic%>> _basicEList = new <%org.eclipse.emf.common.util.BasicEList%><<%org.ollabaca.on.site.Topic%>>(_list);\nreturn _basicEList;'"
   * @generated
   */
  EList<Topic> getRoots();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * *
   * Get topic which target ...
   * <!-- end-model-doc -->
   * @model unique="false" targetUnique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.ecore.EObject%> t = target;\n<%org.ollabaca.on.site.Site%> _this = this;\n<%org.eclipse.emf.common.util.EList%><<%org.ollabaca.on.site.Topic%>> _topics = _this.getTopics();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>,<%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%org.ollabaca.on.site.Topic%>,<%java.lang.Boolean%>>()\n{\n\t\tpublic <%java.lang.Boolean%> apply(final <%org.ollabaca.on.site.Topic%> it)\n\t\t{\n\t\t\t<%org.eclipse.emf.ecore.EObject%> _target = it.getTarget();\n\t\t\tboolean _equals = <%com.google.common.base.Objects%>.equal(_target, t);\n\t\t\treturn <%java.lang.Boolean%>.valueOf(_equals);\n\t\t}\n\t};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%org.ollabaca.on.site.Topic%>>findFirst(_topics, _function);'"
   * @generated
   */
  Topic getTopic(EObject target);

} // Site
