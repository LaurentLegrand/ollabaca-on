package org.ollabaca.on.site.servlets;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Component;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Properties extends Component {
  public Properties() {
    super("div", new Function0<Map<String,String>>() {
      public Map<String,String> apply() {
        Map<String,String> _xsetliteral = null;
        Map<String,String> _tempMap = Maps.<String, String>newHashMap();
        _tempMap.put("class", "properties");
        _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
        return _xsetliteral;
      }
    }.apply(), null);
  }
  
  public final static Properties instance = new Function0<Properties>() {
    public Properties apply() {
      Properties _properties = new Properties();
      return _properties;
    }
  }.apply();
  
  public static CharSequence properties_Element(final Element object) {
    CharSequence _transform = Properties.instance.transform(object);
    return _transform;
  }
  
  protected CharSequence _content_Element(final Topic object) {
    CharSequence _xblockexpression = null;
    {
      final List<EClass> types = CollectionLiterals.<EClass>newArrayList();
      EObject _target = object.getTarget();
      EClass _eClass = _target.eClass();
      types.add(_eClass);
      EObject _target_1 = object.getTarget();
      EClass _eClass_1 = _target_1.eClass();
      EList<EClass> _eAllSuperTypes = _eClass_1.getEAllSuperTypes();
      types.addAll(_eAllSuperTypes);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<table class=\"table table-condensed\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<caption>Properties</caption>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<thead>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<tr><th scope=\"col\">Class</th><th scope=\"col\">Name</th><th scope=\"col\">Value</th></tr>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</thead>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<tbody>");
      _builder.newLine();
      {
        for(final EClass t : types) {
          {
            EList<EStructuralFeature> _eStructuralFeatures = t.getEStructuralFeatures();
            int _size = _eStructuralFeatures.size();
            boolean _notEquals = (_size != 0);
            if (_notEquals) {
              {
                EList<EStructuralFeature> _eStructuralFeatures_1 = t.getEStructuralFeatures();
                for(final EStructuralFeature f : _eStructuralFeatures_1) {
                  _builder.append("\t\t");
                  _builder.append("<tr>");
                  _builder.newLine();
                  {
                    EList<EStructuralFeature> _eStructuralFeatures_2 = t.getEStructuralFeatures();
                    int _indexOf = _eStructuralFeatures_2.indexOf(f);
                    boolean _equals = (_indexOf == 0);
                    if (_equals) {
                      _builder.append("\t\t");
                      _builder.append("\t");
                      _builder.append("<th scope=\"row\" rowspan=\"");
                      EList<EStructuralFeature> _eStructuralFeatures_3 = t.getEStructuralFeatures();
                      int _size_1 = _eStructuralFeatures_3.size();
                      _builder.append(_size_1, "\t\t\t");
                      _builder.append("\">");
                      CharSequence _link_EObject = Link.link_EObject(t);
                      _builder.append(_link_EObject, "\t\t\t");
                      _builder.append("</th>");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("<th scope=\"row\">");
                  String _name = f.getName();
                  String _escape = Html.escape(_name);
                  _builder.append(_escape, "\t\t\t");
                  _builder.append("</th>");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("<td>");
                  EObject _target_2 = object.getTarget();
                  Object _eGet = _target_2.eGet(f);
                  CharSequence _notation_Object = Notation.notation_Object(_eGet);
                  _builder.append(_notation_Object, "\t\t\t");
                  _builder.append("</td>");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  _builder.append("</tr>");
                  _builder.newLine();
                }
              }
            }
          }
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
  
  protected CharSequence _content_Element(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Void object) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence content_Element(final Element object) {
    if (object instanceof Topic) {
      return _content_Element((Topic)object);
    } else if (object != null) {
      return _content_Element(object);
    } else if (object == null) {
      return _content_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
