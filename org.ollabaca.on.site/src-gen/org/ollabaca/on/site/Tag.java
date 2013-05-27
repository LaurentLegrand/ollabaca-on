/**
 */
package org.ollabaca.on.site;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.Tag#getTopics <em>Topics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.site.SitePackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends Named
{
  /**
   * Returns the value of the '<em><b>Topics</b></em>' reference list.
   * The list contents are of type {@link org.ollabaca.on.site.Topic}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topics</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topics</em>' reference list.
   * @see org.ollabaca.on.site.SitePackage#getTag_Topics()
   * @model
   * @generated
   */
  EList<Topic> getTopics();

} // Tag
