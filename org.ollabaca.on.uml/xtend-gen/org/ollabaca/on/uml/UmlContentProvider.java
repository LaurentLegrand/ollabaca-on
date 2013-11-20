package org.ollabaca.on.uml;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.renderers.Content;
import org.ollabaca.on.site.renderers.ContentProvider;
import org.ollabaca.on.site.renderers.Register;
import org.ollabaca.on.site.renderers.Text;
import org.ollabaca.on.site.renderers.TopicRenderer;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.servlets.Scope;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.uml.BookToHtml;
import org.ollabaca.on.uml.Section_Element;
import org.ollabaca.on.uml.Section_Element_OwnedElements;
import org.ollabaca.on.uml.book.Book;

@SuppressWarnings("all")
public class UmlContentProvider implements ContentProvider {
  private final static String PATH = "uml";
  
  private final static String BOOK = "uml-book";
  
  private final static BookToHtml bookToHtml = new Function0<BookToHtml>() {
    public BookToHtml apply() {
      BookToHtml _bookToHtml = new BookToHtml();
      return _bookToHtml;
    }
  }.apply();
  
  public String onSite(final Site self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String onTopic(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("$(document).ready(function() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(\"#properties\").before(\"<div id=\'");
    _builder.append(UmlContentProvider.PATH, "	");
    _builder.append("\'></div>\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("$(\"#");
    _builder.append(UmlContentProvider.PATH, "	");
    _builder.append("\").load(\"");
    Scope _scope = Ref.scope(UmlContentProvider.PATH, self);
    CharSequence _ref_Object = Ref.ref_Object(_scope);
    _builder.append(_ref_Object, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String onType(final Type self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String onTag(final Tag self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public void activate(final Register register) {
    final TopicRenderer _function = new TopicRenderer() {
      public Content render(final Topic it) {
        Text _section = UmlContentProvider.this.toSection(it);
        return _section;
      }
    };
    register.registerTopicRenderer(UmlContentProvider.PATH, _function);
    final TopicRenderer _function_1 = new TopicRenderer() {
      public Content render(final Topic it) {
        Text _book = UmlContentProvider.this.toBook(it);
        return _book;
      }
    };
    register.registerTopicRenderer(UmlContentProvider.BOOK, _function_1);
  }
  
  public Text toSection(final Topic self) {
    EObject _target = self.getTarget();
    if ((_target instanceof Book)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<a href=\"");
      Scope _scope = Ref.scope(UmlContentProvider.BOOK, self);
      CharSequence _ref_Object = Ref.ref_Object(_scope);
      _builder.append(_ref_Object, "");
      _builder.append("\" target=\"_blank\">Read more...</a\">");
      String text = _builder.toString();
      Text _text = new Text("text/html", text);
      return _text;
    }
    EObject _target_1 = self.getTarget();
    CharSequence _section = this.section(_target_1);
    Text _text_1 = new Text("text/html", _section);
    return _text_1;
  }
  
  public Text toBook(final Topic self) {
    EObject _target = self.getTarget();
    CharSequence _html_Book = UmlContentProvider.bookToHtml.html_Book(((Book) _target));
    Text _text = new Text("text/html", _html_Book);
    return _text;
  }
  
  protected CharSequence _section(final EObject self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _section(final Element self) {
    CharSequence _section_Element = Section_Element.section_Element(self);
    return _section_Element;
  }
  
  protected CharSequence _section(final org.eclipse.uml2.uml.Package self) {
    CharSequence _xblockexpression = null;
    {
      final List<List<Topic>> rows = CollectionLiterals.<List<Topic>>newArrayList();
      int i = 0;
      List<Topic> current = null;
      EList<PackageableElement> _packagedElements = self.getPackagedElements();
      for (final PackageableElement e : _packagedElements) {
        {
          Site _site = Sites.site();
          Topic t = _site.getTopic(e);
          boolean _notEquals = (!Objects.equal(t, null));
          if (_notEquals) {
            int _modulo = (i % 3);
            boolean _equals = (_modulo == 0);
            if (_equals) {
              ArrayList<Topic> _newArrayList = CollectionLiterals.<Topic>newArrayList();
              current = _newArrayList;
              rows.add(current);
            }
            current.add(t);
            int _plus = (i + 1);
            i = _plus;
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<section class=\"");
      EClass _eClass = self.eClass();
      String _name = _eClass.getName();
      _builder.append(_name, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      {
        for(final List<Topic> r : rows) {
          _builder.append("<div class=\"row-fluid\">");
          _builder.newLine();
          {
            for(final Topic t : r) {
              _builder.append("<div class=\"span4\">");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("<h3>");
              String _title = t.getTitle();
              _builder.append(_title, "	");
              _builder.append(": ");
              Type _type = t.getType();
              CharSequence _link_EObject = Link.link_EObject(_type);
              _builder.append(_link_EObject, "	");
              _builder.append("</h3>");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              String _abstract = t.getAbstract();
              String _html = Html.html(_abstract);
              _builder.append(_html, "	");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("<a class=\"btn\" href=\"");
              CharSequence _ref_Object = Ref.ref_Object(t);
              _builder.append(_ref_Object, "	");
              _builder.append("\">View details »</a>");
              _builder.newLineIfNotEmpty();
              _builder.append("</div>");
              _builder.newLine();
            }
          }
          _builder.append("</div>");
          _builder.newLine();
        }
      }
      _builder.append("</section>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _section(final Classifier self) {
    CharSequence _section_Element_OwnedElements = Section_Element_OwnedElements.section_Element_OwnedElements(self);
    return _section_Element_OwnedElements;
  }
  
  public CharSequence define(final Property self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<dt>");
    CharSequence _notation_Object = Notation.notation_Object(self);
    _builder.append(_notation_Object, "");
    _builder.append("</dt>");
    _builder.newLineIfNotEmpty();
    _builder.append("<dd>");
    CharSequence _doc = this.doc(self);
    _builder.append(_doc, "");
    _builder.append("</dd>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence define(final Operation self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<dt>");
    CharSequence _notation_Object = Notation.notation_Object(self);
    _builder.append(_notation_Object, "");
    _builder.append("</dt>");
    _builder.newLineIfNotEmpty();
    _builder.append("<dd>");
    CharSequence _doc = this.doc(self);
    _builder.append(_doc, "");
    _builder.append("</dd>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence print(final Association self, final org.eclipse.uml2.uml.Type context) {
    CharSequence _xifexpression = null;
    EList<org.eclipse.uml2.uml.Type> _endTypes = self.getEndTypes();
    int _size = _endTypes.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<Property> _ownedEnds = self.getOwnedEnds();
        for(final Property e : _ownedEnds) {
          CharSequence _define = this.define(e);
          _builder.append(_define, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        EList<Property> _ownedEnds_1 = self.getOwnedEnds();
        final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
          public Boolean apply(final Property it) {
            org.eclipse.uml2.uml.Type _type = it.getType();
            boolean _notEquals = (!Objects.equal(_type, context));
            return Boolean.valueOf(_notEquals);
          }
        };
        Iterable<Property> _filter = IterableExtensions.<Property>filter(_ownedEnds_1, _function);
        for(final Property e_1 : _filter) {
          CharSequence _define_1 = this.define(e_1);
          _builder_1.append(_define_1, "");
          _builder_1.newLineIfNotEmpty();
        }
      }
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence doc(final Element self) {
    CharSequence _xblockexpression = null;
    {
      Site _site = Sites.site();
      final Topic topic = _site.getTopic(self);
      CharSequence _xifexpression = null;
      boolean _notEquals = (!Objects.equal(topic, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<div>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("<div class=\"abstract\">");
        String _abstract = topic.getAbstract();
        String _html = Html.html(_abstract);
        _builder.append(_html, "	");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<div>");
        String _documentation = topic.getDocumentation();
        String _html_1 = Html.html(_documentation);
        _builder.append(_html_1, "	");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("</div>");
        _builder.newLine();
        _xifexpression = _builder;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _link(final Element self) {
    Site _site = Sites.site();
    final Topic topic = _site.getTopic(self);
    boolean _notEquals = (!Objects.equal(topic, null));
    if (_notEquals) {
      return Link.link_EObject(topic);
    } else {
      return Notation.notation_Object(self);
    }
  }
  
  protected CharSequence _link(final Void self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<code>null</code>");
    return _builder;
  }
  
  public CharSequence section(final EObject self) {
    if (self instanceof Classifier) {
      return _section((Classifier)self);
    } else if (self instanceof org.eclipse.uml2.uml.Package) {
      return _section((org.eclipse.uml2.uml.Package)self);
    } else if (self instanceof Element) {
      return _section((Element)self);
    } else if (self != null) {
      return _section(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public CharSequence link(final Element self) {
    if (self != null) {
      return _link(self);
    } else if (self == null) {
      return _link((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
