package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Attr;
import org.ollabaca.on.site.util.Column;
import org.ollabaca.on.site.util.Content;
import org.ollabaca.on.site.util.DefaultLinkRenderer;
import org.ollabaca.on.site.util.InlineSerializer;
import org.ollabaca.on.site.util.Sites;
import org.pegdown.Extensions;
import org.pegdown.PegDownProcessor;
import org.pegdown.ast.RootNode;

@SuppressWarnings("all")
public class Html {
  private final static PegDownProcessor processor = new PegDownProcessor(Extensions.WIKILINKS);
  
  private final static DefaultLinkRenderer linkRenderer = new DefaultLinkRenderer();
  
  public static String html(final String object) {
    String _markdownToHtml = Html.processor.markdownToHtml(object, Html.linkRenderer);
    String _replace = _markdownToHtml.replace("{{info}}", "<div class=\'alert alert-info\'>");
    String _replace_1 = _replace.replace("{{/info}}", "</div>");
    String _replace_2 = _replace_1.replace("{{warning}}", "<div class=\'alert alert-warning\'>");
    return _replace_2.replace("{{/warning}}", "</div>");
  }
  
  protected static CharSequence _span(final Void object) {
    return "null";
  }
  
  protected static CharSequence _span(final CharSequence object) {
    String _string = object.toString();
    return Html._span(_string);
  }
  
  protected static CharSequence _span(final String object) {
    char[] _charArray = object.toCharArray();
    final RootNode node = Html.processor.parseMarkdown(_charArray);
    InlineSerializer _inlineSerializer = new InlineSerializer(Html.linkRenderer);
    final String span = _inlineSerializer.toHtml(node);
    return span;
  }
  
  public static <E extends Object> Attr<E> attr(final String name, final Function1<? super E, ? extends CharSequence> value) {
    return new Attr<E>(name, value);
  }
  
  public static <E extends Object> Content<E> content(final Function1<? super E, ? extends CharSequence> body) {
    return new Content<E>(body);
  }
  
  public static <E extends Object> Column<E> column(final String name, final Function1<? super E, ? extends CharSequence> cell) {
    return new Column<E>(name, cell);
  }
  
  public static <E extends Object> CharSequence tag(final E object, final String name, final Function1<? super E, ? extends CharSequence> content) {
    Content<E> _content = Html.<E>content(content);
    return Html.<E>tag(object, name, Collections.<Attr<E>>unmodifiableList(CollectionLiterals.<Attr<E>>newArrayList()), Collections.<Content<E>>unmodifiableList(CollectionLiterals.<Content<E>>newArrayList(_content)));
  }
  
  public static <E extends Object> CharSequence tag(final E object, final String name, final List<Attr<E>> attributes, final List<Content<E>> contents) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    _builder.append(name, "");
    _builder.append(" ");
    {
      for(final Attr<E> e : attributes) {
        _builder.append(" ");
        CharSequence _apply = e.apply(object);
        _builder.append(_apply, "");
        _builder.append(" ");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      for(final Content<E> e_1 : contents) {
        CharSequence _apply_1 = e_1.apply(object);
        _builder.append(_apply_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</");
    _builder.append(name, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static <E extends Object> CharSequence dl(final Iterable<? extends E> object, final Function1<? super E, ? extends CharSequence> term, final Function1<? super E, ? extends CharSequence> definition) {
    Content<E> _content = Html.<E>content(term);
    Content<E> _content_1 = Html.<E>content(definition);
    return Html.<E>dl(object, Collections.<Attr<Iterable<? extends E>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends E>>>newArrayList()), _content, _content_1);
  }
  
  public static <E extends Object> CharSequence dl(final Iterable<? extends E> object, final List<Attr<Iterable<? extends E>>> attributes, final Content<E> term, final Content<E> definition) {
    CharSequence _xblockexpression = null;
    {
      boolean _isEmpty = IterableExtensions.isEmpty(object);
      if (_isEmpty) {
        return "";
      }
      final Function1<Iterable<? extends E>, String> _function = new Function1<Iterable<? extends E>, String>() {
        public String apply(final Iterable<? extends E> it) {
          StringConcatenation _builder = new StringConcatenation();
          {
            for(final E e : it) {
              _builder.append(" ");
              CharSequence _definition = Html.<E>definition(e, term, definition);
              _builder.append(_definition, "");
              _builder.append(" ");
            }
          }
          return _builder.toString();
        }
      };
      Content<Iterable<? extends E>> _content = Html.<Iterable<? extends E>>content(_function);
      _xblockexpression = Html.<Iterable<? extends E>>tag(object, "dl", attributes, 
        Collections.<Content<Iterable<? extends E>>>unmodifiableList(CollectionLiterals.<Content<Iterable<? extends E>>>newArrayList(_content)));
    }
    return _xblockexpression;
  }
  
  public static <E extends Object> CharSequence definition(final E object, final Content<E> term, final Content<E> definition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<dt>");
    CharSequence _apply = term.apply(object);
    _builder.append(_apply, "");
    _builder.append("</dt>");
    _builder.newLineIfNotEmpty();
    _builder.append("<dd>");
    CharSequence _apply_1 = definition.apply(object);
    _builder.append(_apply_1, "");
    _builder.append("</dd>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static <E extends Object> CharSequence ol(final Iterable<? extends E> object, final Function1<? super E, ? extends CharSequence> item) {
    Content<E> _content = Html.<E>content(item);
    return Html.<E>ol(object, Collections.<Attr<Iterable<? extends E>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends E>>>newArrayList()), _content);
  }
  
  public static <E extends Object> CharSequence ol(final Iterable<? extends E> object, final List<Attr<Iterable<? extends E>>> attributes, final Content<E> item) {
    return Html.<E>list(object, "ol", attributes, item);
  }
  
  public static <E extends Object> CharSequence ul(final Iterable<? extends E> object, final Function1<? super E, ? extends CharSequence> item) {
    Content<E> _content = Html.<E>content(item);
    return Html.<E>ul(object, Collections.<Attr<Iterable<? extends E>>>unmodifiableList(CollectionLiterals.<Attr<Iterable<? extends E>>>newArrayList()), _content);
  }
  
  public static <E extends Object> CharSequence ul(final Iterable<? extends E> object, final List<Attr<Iterable<? extends E>>> attributes, final Content<E> item) {
    return Html.<E>list(object, "ul", attributes, item);
  }
  
  public static <E extends Object> CharSequence list(final Iterable<? extends E> object, final String name, final List<Attr<Iterable<? extends E>>> attributes, final Content<E> item) {
    CharSequence _xblockexpression = null;
    {
      boolean _isEmpty = IterableExtensions.isEmpty(object);
      if (_isEmpty) {
        return "";
      }
      final Function1<Iterable<? extends E>, String> _function = new Function1<Iterable<? extends E>, String>() {
        public String apply(final Iterable<? extends E> it) {
          StringConcatenation _builder = new StringConcatenation();
          {
            for(final E e : it) {
              _builder.append("<li>");
              CharSequence _apply = item.apply(e);
              _builder.append(_apply, "");
              _builder.append("</li>");
              _builder.newLineIfNotEmpty();
            }
          }
          return _builder.toString();
        }
      };
      Content<Iterable<? extends E>> _content = Html.<Iterable<? extends E>>content(_function);
      _xblockexpression = Html.<Iterable<? extends E>>tag(object, name, attributes, 
        Collections.<Content<Iterable<? extends E>>>unmodifiableList(CollectionLiterals.<Content<Iterable<? extends E>>>newArrayList(_content)));
    }
    return _xblockexpression;
  }
  
  public static <E extends Object> CharSequence table(final Iterable<? extends E> list, final List<Attr<Iterable<? extends E>>> attributes, final List<Column<E>> columns) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("<table class=\"table\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tr>");
    _builder.newLine();
    {
      for(final Column<E> c : columns) {
        _builder.append("\t");
        _builder.append("<th>");
        String _name = c.getName();
        _builder.append(_name, "\t");
        _builder.append("</th>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tbody>");
    _builder.newLine();
    {
      for(final E e : list) {
        _builder.append("\t");
        _builder.append("<tr>");
        _builder.newLine();
        {
          for(final Column<E> c_1 : columns) {
            _builder.append("\t");
            _builder.append("<td>");
            Function1<? super E, ? extends CharSequence> _cell = c_1.getCell();
            CharSequence _apply = _cell.apply(e);
            _builder.append(_apply, "\t");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  public static String escape(final String object) {
    return StringEscapeUtils.escapeHtml4(object);
  }
  
  public static String escapeEcmaScript(final String object) {
    return StringEscapeUtils.escapeEcmaScript(object);
  }
  
  public static CharSequence abstract_EObject(final EObject object) {
    final Topic topic = Sites.topic_EObject(object);
    boolean _notEquals = (!Objects.equal(topic, null));
    if (_notEquals) {
      String _abstract = topic.getAbstract();
      return Html.html(_abstract);
    }
    return "";
  }
  
  public static CharSequence documentation_EObject(final EObject object) {
    String _xblockexpression = null;
    {
      final Topic topic = Sites.topic_EObject(object);
      boolean _notEquals = (!Objects.equal(topic, null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<div class=\"abstract\">");
        String _abstract = topic.getAbstract();
        String _html = Html.html(_abstract);
        _builder.append(_html, "");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        _builder.append("<div class=\"documentation\">");
        String _documentation = topic.getDocumentation();
        String _html_1 = Html.html(_documentation);
        _builder.append(_html_1, "");
        _builder.append("</div>");
        _builder.newLineIfNotEmpty();
        return _builder;
      }
      _xblockexpression = "";
    }
    return _xblockexpression;
  }
  
  public static CharSequence span(final CharSequence object) {
    if (object instanceof String) {
      return _span((String)object);
    } else if (object != null) {
      return _span(object);
    } else if (object == null) {
      return _span((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
