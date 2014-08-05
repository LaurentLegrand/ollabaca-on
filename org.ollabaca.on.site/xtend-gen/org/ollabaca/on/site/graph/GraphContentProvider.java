package org.ollabaca.on.site.graph;

import java.io.StringWriter;
import java.util.List;
import java.util.function.Consumer;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.renderers.Content;
import org.ollabaca.on.site.renderers.Renderers;
import org.ollabaca.on.site.renderers.Text;
import org.ollabaca.on.site.servlets.Page;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.servlets.Scope;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class GraphContentProvider {
  private final static String TAB = "graph-tab";
  
  private final static String INSTANCES = "graph-instances";
  
  private final static String TYPES = "graph-types";
  
  public static Function1<? super Site, ? extends Content> register() {
    Function1<? super Site, ? extends Content> _xblockexpression = null;
    {
      final Function1<EObject, CharSequence> _function = new Function1<EObject, CharSequence>() {
        public CharSequence apply(final EObject it) {
          CharSequence _xifexpression = null;
          if ((it instanceof Site)) {
            _xifexpression = GraphContentProvider.head_Site(((Site) it));
          }
          return _xifexpression;
        }
      };
      Page.head.beforeEnd.register(Site.class, _function);
      final Function1<Site, Text> _function_1 = new Function1<Site, Text>() {
        public Text apply(final Site it) {
          return GraphContentProvider.instancesToJSon(it);
        }
      };
      Renderers.siteRenderers.registerRenderer(GraphContentProvider.INSTANCES, _function_1);
      final Function1<Site, Text> _function_2 = new Function1<Site, Text>() {
        public Text apply(final Site it) {
          return GraphContentProvider.typesToJSon(it);
        }
      };
      _xblockexpression = Renderers.siteRenderers.registerRenderer(GraphContentProvider.TYPES, _function_2);
    }
    return _xblockexpression;
  }
  
  public static CharSequence head_Site(final Site object) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<style>");
    _builder.newLine();
    _builder.append(".parentOf {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("stroke: red;");
    _builder.newLine();
    _builder.append("  ");
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
    _builder.append("  ");
    _builder.append("stroke-width: 1.5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append(".extends {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("stroke: green;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("stroke-width: 1.5px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("$(document).ready(function() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(\"#content\").append(\"");
    String _tabs = GraphContentProvider.tabs();
    String _escapeEcmaScript = Html.escapeEcmaScript(_tabs);
    _builder.append(_escapeEcmaScript, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("$(\'#");
    _builder.append(GraphContentProvider.TAB, "\t");
    _builder.append(" a\').click(function (e) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("e.preventDefault();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("$(this).tab(\'show\');");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("myGraph(\"#");
    _builder.append(GraphContentProvider.INSTANCES, "\t");
    _builder.append("\", \"");
    Scope _scope = Ref.scope(GraphContentProvider.INSTANCES, object);
    CharSequence _ref_Object = Ref.ref_Object(_scope);
    _builder.append(_ref_Object, "\t");
    _builder.append("\"); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("myGraph(\"#");
    _builder.append(GraphContentProvider.TYPES, "\t");
    _builder.append("\", \"");
    Scope _scope_1 = Ref.scope(GraphContentProvider.TYPES, object);
    CharSequence _ref_Object_1 = Ref.ref_Object(_scope_1);
    _builder.append(_ref_Object_1, "\t");
    _builder.append("\"); ");
    _builder.newLineIfNotEmpty();
    _builder.append("});");
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    return _builder;
  }
  
  public static String tabs() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"tabbable\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ul id=\"");
    _builder.append(GraphContentProvider.TAB, "\t");
    _builder.append("\" class=\"nav nav-tabs\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<li class=\"active\"><a href=\"#");
    _builder.append(GraphContentProvider.INSTANCES, "\t\t");
    _builder.append("\" data-toggle=\"tab\">Instances</a></li>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<li><a href=\"#");
    _builder.append(GraphContentProvider.TYPES, "\t\t");
    _builder.append("\" data-toggle=\"tab\">Types</a></li>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"tab-content\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"tab-pane active\" id=\"");
    _builder.append(GraphContentProvider.INSTANCES, "\t\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<svg xmlns=\"http://www.w3.org/2000/svg\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<defs>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<marker id=\"end\" refX=\"10\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"10\" markerHeight=\"10\" orient=\"auto\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<path d=\"M 0 10 L 10 5 L 0 0 L 0 10\" fill=\"white\" stroke=\"black\" stroke-width=\"1\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</marker>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</defs>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</svg>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"tab-pane\" id=\"");
    _builder.append(GraphContentProvider.TYPES, "\t\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<svg xmlns=\"http://www.w3.org/2000/svg\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<defs>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<marker id=\"end\" refX=\"10\" refY=\"5\" markerUnits=\"userSpaceOnUse\" markerWidth=\"10\" markerHeight=\"10\" orient=\"auto\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<path d=\"M 0 10 L 10 5 L 0 0 L 0 10\" fill=\"white\" stroke=\"black\" stroke-width=\"1\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</marker>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</defs>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</svg>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static Text instancesToJSon(final Site object) {
    String _instances = GraphContentProvider.instances(object);
    return new Text("text/json", _instances);
  }
  
  public static Text typesToJSon(final Site object) {
    String _types = GraphContentProvider.types(object);
    return new Text("text/json", _types);
  }
  
  public static String instances(final Site object) {
    final List<Topic> nodes = CollectionLiterals.<Topic>newArrayList();
    Site _site = Sites.site();
    EList<Topic> _topics = _site.getTopics();
    final Function1<Topic, Boolean> _function = new Function1<Topic, Boolean>() {
      public Boolean apply(final Topic it) {
        boolean _isAnonymous = it.isAnonymous();
        return Boolean.valueOf((!_isAnonymous));
      }
    };
    Iterable<Topic> _filter = IterableExtensions.<Topic>filter(_topics, _function);
    final Consumer<Topic> _function_1 = new Consumer<Topic>() {
      public void accept(final Topic it) {
        boolean _contains = nodes.contains(it);
        boolean _not = (!_contains);
        if (_not) {
          nodes.add(it);
        }
      }
    };
    _filter.forEach(_function_1);
    final StringWriter out = new StringWriter();
    final JsonGenerator graph = Json.createGenerator(out);
    JsonGenerator _writeStartObject = graph.writeStartObject();
    _writeStartObject.writeStartArray("nodes");
    final Consumer<Topic> _function_2 = new Consumer<Topic>() {
      public void accept(final Topic it) {
        JsonGenerator _writeStartObject = graph.writeStartObject();
        CharSequence _ref_Object = Ref.ref_Object(it);
        String _string = _ref_Object.toString();
        JsonGenerator _write = _writeStartObject.write("href", _string);
        String _name = it.getName();
        JsonGenerator _write_1 = _write.write("name", _name);
        String _title = it.getTitle();
        JsonGenerator _write_2 = _write_1.write("title", _title);
        EList<Topic> _ancestors = it.getAncestors();
        int _size = _ancestors.size();
        JsonGenerator _write_3 = _write_2.write("level", _size);
        _write_3.writeEnd();
      }
    };
    nodes.forEach(_function_2);
    JsonGenerator _writeEnd = graph.writeEnd();
    _writeEnd.writeStartArray("links");
    final Consumer<Topic> _function_3 = new Consumer<Topic>() {
      public void accept(final Topic parent) {
        EList<Topic> _topics = parent.getTopics();
        final Function1<Topic, Boolean> _function = new Function1<Topic, Boolean>() {
          public Boolean apply(final Topic it) {
            boolean _isAnonymous = it.isAnonymous();
            return Boolean.valueOf((!_isAnonymous));
          }
        };
        Iterable<Topic> _filter = IterableExtensions.<Topic>filter(_topics, _function);
        final Consumer<Topic> _function_1 = new Consumer<Topic>() {
          public void accept(final Topic child) {
            JsonGenerator _writeStartObject = graph.writeStartObject();
            int _indexOf = nodes.indexOf(parent);
            JsonGenerator _write = _writeStartObject.write("source", _indexOf);
            int _indexOf_1 = nodes.indexOf(child);
            JsonGenerator _write_1 = _write.write("target", _indexOf_1);
            JsonGenerator _write_2 = _write_1.write("type", "parentOf");
            _write_2.writeEnd();
          }
        };
        _filter.forEach(_function_1);
        EList<Topic> _see = parent.getSee();
        final Consumer<Topic> _function_2 = new Consumer<Topic>() {
          public void accept(final Topic child) {
            JsonGenerator _writeStartObject = graph.writeStartObject();
            int _indexOf = nodes.indexOf(parent);
            JsonGenerator _write = _writeStartObject.write("source", _indexOf);
            int _indexOf_1 = nodes.indexOf(child);
            JsonGenerator _write_1 = _write.write("target", _indexOf_1);
            JsonGenerator _write_2 = _write_1.write("type", "seeAlso");
            _write_2.writeEnd();
          }
        };
        _see.forEach(_function_2);
      }
    };
    nodes.forEach(_function_3);
    graph.writeEnd();
    JsonGenerator _writeEnd_1 = graph.writeEnd();
    _writeEnd_1.close();
    return out.toString();
  }
  
  public static String types(final Site object) {
    final List<EClass> nodes = CollectionLiterals.<EClass>newArrayList();
    Site _site = Sites.site();
    EList<Topic> _topics = _site.getTopics();
    final Consumer<Topic> _function = new Consumer<Topic>() {
      public void accept(final Topic it) {
        EObject _target = it.getTarget();
        EClass _eClass = _target.eClass();
        GraphContentProvider.fill(nodes, _eClass);
      }
    };
    _topics.forEach(_function);
    final StringWriter out = new StringWriter();
    final JsonGenerator graph = Json.createGenerator(out);
    JsonGenerator _writeStartObject = graph.writeStartObject();
    _writeStartObject.writeStartArray("nodes");
    final Consumer<EClass> _function_1 = new Consumer<EClass>() {
      public void accept(final EClass it) {
        JsonGenerator _writeStartObject = graph.writeStartObject();
        CharSequence _ref_Object = Ref.ref_Object(it);
        String _string = _ref_Object.toString();
        JsonGenerator _write = _writeStartObject.write("href", _string);
        String _name = it.getName();
        JsonGenerator _write_1 = _write.write("name", _name);
        String _name_1 = it.getName();
        JsonGenerator _write_2 = _write_1.write("title", _name_1);
        JsonGenerator _write_3 = _write_2.write("level", 1);
        _write_3.writeEnd();
      }
    };
    nodes.forEach(_function_1);
    JsonGenerator _writeEnd = graph.writeEnd();
    _writeEnd.writeStartArray("links");
    final Consumer<EClass> _function_2 = new Consumer<EClass>() {
      public void accept(final EClass from) {
        EList<EClass> _eSuperTypes = from.getESuperTypes();
        final Consumer<EClass> _function = new Consumer<EClass>() {
          public void accept(final EClass to) {
            JsonGenerator _writeStartObject = graph.writeStartObject();
            int _indexOf = nodes.indexOf(from);
            JsonGenerator _write = _writeStartObject.write("source", _indexOf);
            int _indexOf_1 = nodes.indexOf(to);
            JsonGenerator _write_1 = _write.write("target", _indexOf_1);
            JsonGenerator _write_2 = _write_1.write("type", "extends");
            _write_2.writeEnd();
          }
        };
        _eSuperTypes.forEach(_function);
      }
    };
    nodes.forEach(_function_2);
    graph.writeEnd();
    JsonGenerator _writeEnd_1 = graph.writeEnd();
    _writeEnd_1.close();
    return out.toString();
  }
  
  public static void fill(final List<EClass> list, final EClass object) {
    boolean _contains = list.contains(object);
    if (_contains) {
      return;
    }
    list.add(object);
    EList<EClass> _eAllSuperTypes = object.getEAllSuperTypes();
    final Consumer<EClass> _function = new Consumer<EClass>() {
      public void accept(final EClass it) {
        GraphContentProvider.fill(list, it);
      }
    };
    _eAllSuperTypes.forEach(_function);
  }
}
