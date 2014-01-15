package org.ollabaca.on.site.servlets;

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.Workspace;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.HTag;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;

@SuppressWarnings("all")
public class Article extends HTag {
  public Article() {
    super("article", new Function0<Map<String,String>>() {
      public Map<String,String> apply() {
        Map<String,String> _xsetliteral = null;
        Map<String,String> _tempMap = Maps.<String, String>newHashMap();
        _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
        return _xsetliteral;
      }
    }.apply(), null);
  }
  
  protected CharSequence _content_Element(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a id=\"");
    String _name = self.getName();
    _builder.append(_name, "");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("<h1>");
    String _title = self.getTitle();
    String _html = Html.html(_title);
    _builder.append(_html, "");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<section class=\"abstract\">");
    _builder.newLine();
    _builder.append("\t");
    String _abstract = self.getAbstract();
    String _html_1 = Html.html(_abstract);
    _builder.append(_html_1, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</section>");
    _builder.newLine();
    _builder.append("<section class=\"documentation\">");
    _builder.newLine();
    _builder.append("\t");
    String _documentation = self.getDocumentation();
    String _html_2 = Html.html(_documentation);
    _builder.append(_html_2, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</section>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Type self) {
    CharSequence _xblockexpression = null;
    {
      final Set<EObject> instances = CollectionLiterals.<EObject>newHashSet();
      final Set<EClass> types = CollectionLiterals.<EClass>newHashSet();
      EList<Topic> _topics = self.getTopics();
      final Function1<Topic,EObject> _function = new Function1<Topic,EObject>() {
        public EObject apply(final Topic it) {
          EObject _target = it.getTarget();
          return _target;
        }
      };
      List<EObject> _map = ListExtensions.<Topic, EObject>map(_topics, _function);
      instances.addAll(_map);
      EList<Topic> _topics_1 = self.getTopics();
      Topic _head = IterableExtensions.<Topic>head(_topics_1);
      EObject _target = _head.getTarget();
      final EClass eClass = _target.eClass();
      types.add(eClass);
      EList<EClass> _eAllSuperTypes = eClass.getEAllSuperTypes();
      types.addAll(_eAllSuperTypes);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<a id=\"eClass:");
      String _name = self.getName();
      _builder.append(_name, "");
      _builder.append("\"></a>");
      _builder.newLineIfNotEmpty();
      _builder.append("<h1>");
      String _name_1 = self.getName();
      _builder.append(_name_1, "");
      _builder.append("</h1>");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("<h2>instances</h2>");
      _builder.newLine();
      _builder.append("<table>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<thead>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<tr>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<th><!-- topic id --></th>");
      _builder.newLine();
      {
        for(final EClass t : types) {
          {
            EList<EStructuralFeature> _eStructuralFeatures = t.getEStructuralFeatures();
            int _size = _eStructuralFeatures.size();
            boolean _notEquals = (_size != 0);
            if (_notEquals) {
              _builder.append("\t\t");
              _builder.append("<th colspan=\"");
              EList<EStructuralFeature> _eStructuralFeatures_1 = t.getEStructuralFeatures();
              int _size_1 = _eStructuralFeatures_1.size();
              _builder.append(_size_1, "		");
              _builder.append("\">");
              String _name_2 = t.getName();
              _builder.append(_name_2, "		");
              _builder.append("</th>");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("\t\t");
      _builder.append("</tr>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<tr>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<th><!-- topic id --></th>");
      _builder.newLine();
      {
        for(final EClass t_1 : types) {
          {
            EList<EStructuralFeature> _eStructuralFeatures_2 = t_1.getEStructuralFeatures();
            for(final EStructuralFeature f : _eStructuralFeatures_2) {
              _builder.append("\t\t");
              _builder.append("<th>");
              String _name_3 = f.getName();
              String _escape = Html.escape(_name_3);
              _builder.append(_escape, "		");
              _builder.append("</th>");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("\t\t");
      _builder.append("</tr>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</thead>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<tbody>");
      _builder.newLine();
      {
        for(final EObject i : instances) {
          _builder.append("\t\t");
          _builder.append("<tr>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("<td>");
          _builder.newLine();
          _builder.append("\t\t");
          Site _site = Sites.site();
          Topic topic = _site.getTopic(i);
          _builder.newLineIfNotEmpty();
          {
            boolean _notEquals_1 = (!Objects.equal(topic, null));
            if (_notEquals_1) {
              _builder.append("\t\t");
              CharSequence _link_EObject = Link.link_EObject(topic);
              _builder.append(_link_EObject, "		");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t\t");
              _builder.append("<!-- -->");
              _builder.newLine();
            }
          }
          _builder.append("\t\t");
          _builder.append("</td>");
          _builder.newLine();
          {
            for(final EClass t_2 : types) {
              {
                EList<EStructuralFeature> _eStructuralFeatures_3 = t_2.getEStructuralFeatures();
                for(final EStructuralFeature f_1 : _eStructuralFeatures_3) {
                  _builder.append("\t\t");
                  _builder.append("<td>");
                  Object _eGet = ((EObject) i).eGet(f_1);
                  CharSequence _notation_Object = Notation.notation_Object(_eGet);
                  _builder.append(_notation_Object, "		");
                  _builder.append("</td>");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.append("\t\t");
          _builder.append("</tr>");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("</tbody>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<tfoot>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</tfoot>");
      _builder.newLine();
      _builder.append("</table>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _content_Element(final Workspace self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row-fluid\">");
    _builder.newLine();
    {
      IWorkspace _workspace = ResourcesPlugin.getWorkspace();
      IWorkspaceRoot _root = _workspace.getRoot();
      IProject[] _projects = _root.getProjects();
      final Function1<IProject,Boolean> _function = new Function1<IProject,Boolean>() {
        public Boolean apply(final IProject it) {
          IFile _file = it.getFile("src-gen/instances.xmi");
          boolean _exists = _file.exists();
          return Boolean.valueOf(_exists);
        }
      };
      Iterable<IProject> _filter = IterableExtensions.<IProject>filter(((Iterable<IProject>)Conversions.doWrapArray(_projects)), _function);
      for(final IProject e : _filter) {
        _builder.append("\t");
        _builder.append("<p><a href=\"/site/pages/");
        String _name = e.getName();
        _builder.append(_name, "	");
        _builder.append("\">");
        String _name_1 = e.getName();
        _builder.append(_name_1, "	");
        _builder.append("</a></p>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence content_Element(final Element self) {
    if (self instanceof Topic) {
      return _content_Element((Topic)self);
    } else if (self instanceof Type) {
      return _content_Element((Type)self);
    } else if (self instanceof Workspace) {
      return _content_Element((Workspace)self);
    } else if (self != null) {
      return _content_Element(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}