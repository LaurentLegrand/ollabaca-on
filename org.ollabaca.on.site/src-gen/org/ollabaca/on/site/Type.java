/**
 */
package org.ollabaca.on.site;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ollabaca.on.site.Type#getTopics <em>Topics</em>}</li>
 *   <li>{@link org.ollabaca.on.site.Type#getSite <em>Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ollabaca.on.site.SitePackage#getType()
 * @model
 * @generated
 */
public interface Type extends Named
{
  /**
   * Returns the value of the '<em><b>Topics</b></em>' reference list.
   * The list contents are of type {@link org.ollabaca.on.site.Topic}.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Topic#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topics</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topics</em>' reference list.
   * @see org.ollabaca.on.site.SitePackage#getType_Topics()
   * @see org.ollabaca.on.site.Topic#getType
   * @model opposite="type"
   * @generated
   */
  EList<Topic> getTopics();

  /**
   * Returns the value of the '<em><b>Site</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.ollabaca.on.site.Site#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Site</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Site</em>' container reference.
   * @see #setSite(Site)
   * @see org.ollabaca.on.site.SitePackage#getType_Site()
   * @see org.ollabaca.on.site.Site#getTypes
   * @model opposite="types" transient="false"
   * @generated
   */
  Site getSite();

  /**
   * Sets the value of the '{@link org.ollabaca.on.site.Type#getSite <em>Site</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Site</em>' container reference.
   * @see #getSite()
   * @generated
   */
  void setSite(Site value);

} // Type
