/**
 */
package org.ollabaca.on.mm.book.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ollabaca.on.mm.book.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookFactoryImpl extends EFactoryImpl implements BookFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BookFactory init()
  {
    try
    {
      BookFactory theBookFactory = (BookFactory)EPackage.Registry.INSTANCE.getEFactory(BookPackage.eNS_URI);
      if (theBookFactory != null)
      {
        return theBookFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BookFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BookPackage.BOOK_ELEMENT: return createBookElement();
      case BookPackage.BOOK: return createBook();
      case BookPackage.PART: return createPart();
      case BookPackage.CHAPTER: return createChapter();
      case BookPackage.SECTION: return createSection();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookElement createBookElement()
  {
    BookElementImpl bookElement = new BookElementImpl();
    return bookElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Book createBook()
  {
    BookImpl book = new BookImpl();
    return book;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Part createPart()
  {
    PartImpl part = new PartImpl();
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Chapter createChapter()
  {
    ChapterImpl chapter = new ChapterImpl();
    return chapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Section createSection()
  {
    SectionImpl section = new SectionImpl();
    return section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BookPackage getBookPackage()
  {
    return (BookPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BookPackage getPackage()
  {
    return BookPackage.eINSTANCE;
  }

} //BookFactoryImpl
