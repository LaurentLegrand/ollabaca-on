package org.ollabaca.on.site.servlets;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.servlets.Article;
import org.ollabaca.on.site.servlets.Aside;
import org.ollabaca.on.site.servlets.Breadcrumb;
import org.ollabaca.on.site.servlets.Properties;
import org.ollabaca.on.site.servlets.Title;
import org.ollabaca.on.site.util.Component;

@SuppressWarnings("all")
public class Page {
  public final static Page instance = new Function0<Page>() {
    public Page apply() {
      Page _page = new Page();
      return _page;
    }
  }.apply();
  
  public final static Component head = new Function0<Component>() {
    public Component apply() {
      Map<String,String> _xsetliteral = null;
      Map<String,String> _tempMap = Maps.<String, String>newHashMap();
      _tempMap.put("lang", "en");
      _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
      final Function1<Element,CharSequence> _function = new Function1<Element,CharSequence>() {
        public CharSequence apply(final Element it) {
          CharSequence _head_Element = Page.head_Element(it);
          return _head_Element;
        }
      };
      Component _component = new Component("head", _xsetliteral, _function);
      return _component;
    }
  }.apply();
  
  public final static Component body = new Function0<Component>() {
    public Component apply() {
      Map<String,String> _xsetliteral = null;
      Map<String,String> _tempMap = Maps.<String, String>newHashMap();
      _tempMap.put("lang", "en");
      _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
      final Function1<Element,CharSequence> _function = new Function1<Element,CharSequence>() {
        public CharSequence apply(final Element it) {
          CharSequence _body_Element = Page.body_Element(it);
          return _body_Element;
        }
      };
      Component _component = new Component("body", _xsetliteral, _function);
      return _component;
    }
  }.apply();
  
  public final static Component header = new Function0<Component>() {
    public Component apply() {
      Map<String,String> _xsetliteral = null;
      Map<String,String> _tempMap = Maps.<String, String>newHashMap();
      _tempMap.put("class", "");
      _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
      final Function1<Element,CharSequence> _function = new Function1<Element,CharSequence>() {
        public CharSequence apply(final Element it) {
          CharSequence _header_Element = Page.header_Element(it);
          return _header_Element;
        }
      };
      Component _component = new Component("header", _xsetliteral, _function);
      return _component;
    }
  }.apply();
  
  public final static Component breadcrumb = new Function0<Component>() {
    public Component apply() {
      Breadcrumb _breadcrumb = new Breadcrumb();
      return _breadcrumb;
    }
  }.apply();
  
  public final static Component aside = new Function0<Component>() {
    public Component apply() {
      Aside _aside = new Aside();
      return _aside;
    }
  }.apply();
  
  public final static Article article = new Function0<Article>() {
    public Article apply() {
      Article _article = new Article();
      return _article;
    }
  }.apply();
  
  public final static Component footer = new Function0<Component>() {
    public Component apply() {
      Map<String,String> _xsetliteral = null;
      Map<String,String> _tempMap = Maps.<String, String>newHashMap();
      _tempMap.put("class", "footer");
      _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
      final Function1<Element,CharSequence> _function = new Function1<Element,CharSequence>() {
        public CharSequence apply(final Element it) {
          CharSequence _footer_Element = Page.footer_Element(it);
          return _footer_Element;
        }
      };
      Component _component = new Component("footer", _xsetliteral, _function);
      return _component;
    }
  }.apply();
  
  public static CharSequence page_Element(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _transform = Page.head.transform(object);
    _builder.append(_transform, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _transform_1 = Page.body.transform(object);
    _builder.append(_transform_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence head_Element(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<title>");
    CharSequence _title_Element = Title.title_Element(object);
    _builder.append(_title_Element, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    _builder.newLine();
    _builder.append("<meta name=\"description\" content=\"\">");
    _builder.newLine();
    _builder.append("<meta name=\"author\" content=\"\">");
    _builder.newLine();
    _builder.append("<link href=\"/site/assets/bootstrap/css/bootstrap.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("<style type=\"text/css\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".parentOf {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("stroke: red;");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("stroke-width: 1.5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".seeAlso {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("stroke: blue;");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("stroke-width: 1.5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".node {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("backgroud-color: green;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("<script src=\"/site/assets/jquery/jquery-2.0.2.min.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"/site/assets/bootstrap/js/bootstrap.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"/site/assets/d3js/d3.v3.min.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"/site/assets/d3js/parsets/d3.parsets.js\"></script>");
    _builder.newLine();
    _builder.append("<script src=\"/site/assets/site.js\"></script>");
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(document).ready(function() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$(\"table\").wrap(\"<div class=\'table\' style=\'overflow: auto;\'/>\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence body_Element(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _transform = Page.header.transform(object);
    _builder.append(_transform, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\'row\'>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"col-md-3 well\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _transform_1 = Page.aside.transform(object);
    _builder.append(_transform_1, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div id=\"content\" class=\"col-md-9\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    CharSequence _transform_2 = Page.breadcrumb.transform(object);
    _builder.append(_transform_2, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _transform_3 = Page.article.transform(object);
    _builder.append(_transform_3, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    CharSequence _properties_Element = Properties.properties_Element(object);
    _builder.append(_properties_Element, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    CharSequence _transform_4 = Page.footer.transform(object);
    _builder.append(_transform_4, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence header_Element(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<nav class=\"navbar navbar-inverse navbar-static-top\" role=\"navigation\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Brand and toggle get grouped for better mobile display -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"navbar-header\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<span class=\"sr-only\">Toggle navigation</span>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<span class=\"icon-bar\"></span>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</button>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<a class=\"navbar-brand\" href=\"/site\">Home</a>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-5\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<p class=\"navbar-text navbar-right\">Signed in as <a href=\"#\" class=\"navbar-link\">...</a></p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</nav>");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence footer_Element(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
