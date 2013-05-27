package org.ollabaca.on.site.tools;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.tools.SiteLinkRenderer;
import org.pegdown.Extensions;
import org.pegdown.LinkRenderer;
import org.pegdown.PegDownProcessor;

@SuppressWarnings("all")
public class SiteToHtml {
  private final Site site;
  
  private final PegDownProcessor processor = new Function0<PegDownProcessor>() {
    public PegDownProcessor apply() {
      PegDownProcessor _pegDownProcessor = new PegDownProcessor(Extensions.WIKILINKS);
      return _pegDownProcessor;
    }
  }.apply();
  
  private final LinkRenderer linkRenderer;
  
  public SiteToHtml(final Site site) {
    this.site = site;
    SiteLinkRenderer _siteLinkRenderer = new SiteLinkRenderer(this.site);
    this.linkRenderer = _siteLinkRenderer;
  }
  
  public CharSequence html() {
    CharSequence _xblockexpression = null;
    {
      final List<Topic> topics = CollectionLiterals.<Topic>newArrayList();
      final Set<EClass> types = CollectionLiterals.<EClass>newHashSet();
      EList<Topic> _topics = this.site.getTopics();
      final Function1<Topic,Boolean> _function = new Function1<Topic,Boolean>() {
          public Boolean apply(final Topic it) {
            boolean _isAnonymous = it.isAnonymous();
            boolean _not = (!_isAnonymous);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<Topic> _filter = IterableExtensions.<Topic>filter(_topics, _function);
      final Procedure1<Topic> _function_1 = new Procedure1<Topic>() {
          public void apply(final Topic it) {
            {
              topics.add(it);
              EObject _target = it.getTarget();
              EClass _eClass = _target.eClass();
              types.add(_eClass);
            }
          }
        };
      IterableExtensions.<Topic>forEach(_filter, _function_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<!DOCTYPE html>");
      _builder.newLine();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<title>");
      String _name = this.site.getName();
      _builder.append(_name, "		");
      _builder.append("</title>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<body>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<header>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<h1>");
      String _name_1 = this.site.getName();
      _builder.append(_name_1, "			");
      _builder.append("</h1>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      CharSequence _nav = this.nav();
      _builder.append(_nav, "			");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("</header>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<div id=instances>");
      _builder.newLine();
      {
        final Function1<Topic,String> _function_2 = new Function1<Topic,String>() {
            public String apply(final Topic it) {
              String _name = it.getName();
              return _name;
            }
          };
        List<Topic> _sortBy = IterableExtensions.<Topic, String>sortBy(topics, _function_2);
        for(final Topic e : _sortBy) {
          _builder.append("\t\t");
          CharSequence _article = this.article(e);
          _builder.append(_article, "		");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<div id=types>");
      _builder.newLine();
      {
        boolean _hasElements = false;
        for(final EClass t : types) {
          if (!_hasElements) {
            _hasElements = true;
            _builder.append("<div>", "		");
          }
          _builder.append("\t\t");
          Resource _eResource = this.site.eResource();
          TreeIterator<EObject> _allContents = _eResource.getAllContents();
          Class<? extends Object> _instanceClass = t.getInstanceClass();
          Iterator<? extends Object> _filter_1 = Iterators.filter(_allContents, _instanceClass);
          List<? extends Object> _list = IteratorExtensions.toList(_filter_1);
          CharSequence _article_1 = this.article(t, _list);
          _builder.append(_article_1, "		");
          _builder.newLineIfNotEmpty();
        }
        if (_hasElements) {
          _builder.append("</div>", "		");
        }
      }
      _builder.append("\t\t");
      _builder.append("</div>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<footer>");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("<p>");
      SimpleDateFormat _simpleDateFormat = new SimpleDateFormat();
      Date _date = new Date();
      String _format = _simpleDateFormat.format(_date);
      _builder.append(_format, "			");
      _builder.append("</p>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("</footer>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("</body>");
      _builder.newLine();
      _builder.append("</html>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence nav() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<nav>");
    _builder.newLine();
    {
      EList<Topic> _roots = this.site.getRoots();
      final Function1<Topic,String> _function = new Function1<Topic,String>() {
          public String apply(final Topic it) {
            String _name = it.getName();
            return _name;
          }
        };
      List<Topic> _sortBy = IterableExtensions.<Topic, String>sortBy(_roots, _function);
      boolean _hasElements = false;
      for(final Topic e : _sortBy) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<ul>", "");
        }
        CharSequence _nav = this.nav(e);
        _builder.append(_nav, "");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("</ul>", "");
      }
    }
    _builder.append("</nav>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence nav(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<li>");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _link = this.link(self);
    _builder.append(_link, "	");
    _builder.newLineIfNotEmpty();
    {
      EList<Topic> _topics = self.getTopics();
      final Function1<Topic,Boolean> _function = new Function1<Topic,Boolean>() {
          public Boolean apply(final Topic it) {
            boolean _isAnonymous = it.isAnonymous();
            boolean _not = (!_isAnonymous);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<Topic> _filter = IterableExtensions.<Topic>filter(_topics, _function);
      final Function1<Topic,String> _function_1 = new Function1<Topic,String>() {
          public String apply(final Topic it) {
            String _name = it.getName();
            return _name;
          }
        };
      List<Topic> _sortBy = IterableExtensions.<Topic, String>sortBy(_filter, _function_1);
      boolean _hasElements = false;
      for(final Topic e : _sortBy) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<ul>", "	");
        }
        _builder.append("\t");
        CharSequence _nav = this.nav(e);
        _builder.append(_nav, "	");
        _builder.newLineIfNotEmpty();
      }
      if (_hasElements) {
        _builder.append("</ul>", "	");
      }
    }
    _builder.append("</li>");
    _builder.newLine();
    return _builder;
  }
  
  public String html(final String self) {
    String _markdownToHtml = this.processor.markdownToHtml(self, this.linkRenderer);
    return _markdownToHtml;
  }
  
  public CharSequence article(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<article class=\"");
    EObject _target = self.getTarget();
    EClass _eClass = _target.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<section class=\"main\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<a id=\"");
    String _name_1 = self.getName();
    _builder.append(_name_1, "	");
    _builder.append("\"></a>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<h1>");
    String _title = self.getTitle();
    _builder.append(_title, "	");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _aside = this.aside(self);
    _builder.append(_aside, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _documentation = self.getDocumentation();
    String _html = this.html(_documentation);
    _builder.append(_html, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</section>");
    _builder.newLine();
    _builder.append("\t");
    EObject _target_1 = self.getTarget();
    CharSequence _features = this.features(_target_1);
    _builder.append(_features, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</article>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence aside(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<aside>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<p>type: <a href=\"#eClass:");
    EObject _target = self.getTarget();
    EClass _eClass = _target.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "	");
    _builder.append("\">");
    EObject _target_1 = self.getTarget();
    EClass _eClass_1 = _target_1.eClass();
    String _name_1 = _eClass_1.getName();
    _builder.append(_name_1, "	");
    _builder.append("</a></p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<p>path: ");
    {
      EList<Topic> _ancestorsAndSelf = self.getAncestorsAndSelf();
      boolean _hasElements = false;
      for(final Topic e : _ancestorsAndSelf) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("/", "	");
        }
        _builder.append("<a href=\"#");
        String _name_2 = e.getName();
        _builder.append(_name_2, "	");
        _builder.append("\">");
        String _title = e.getTitle();
        _builder.append(_title, "	");
        _builder.append("</a>");
      }
    }
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Topic> _topics = self.getTopics();
      boolean _hasElements_1 = false;
      for(final Topic e_1 : _topics) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("<p>children: ", "	");
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("<a href=\"#");
        String _name_3 = e_1.getName();
        _builder.append(_name_3, "	");
        _builder.append("\">");
        String _title_1 = e_1.getTitle();
        _builder.append(_title_1, "	");
        _builder.append("</a>");
      }
      if (_hasElements_1) {
        _builder.append("</p>", "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Topic> _see = self.getSee();
      boolean _hasElements_2 = false;
      for(final Topic e_2 : _see) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
          _builder.append("<p>see: ", "	");
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("<a href=\"#");
        String _name_4 = e_2.getName();
        _builder.append(_name_4, "	");
        _builder.append("\">");
        String _title_2 = e_2.getTitle();
        _builder.append(_title_2, "	");
        _builder.append("</a>");
      }
      if (_hasElements_2) {
        _builder.append("</p>", "	");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</aside>");
    _builder.newLine();
    return _builder;
  }
  
  public String escape(final String self) {
    String _escapeHtml4 = StringEscapeUtils.escapeHtml4(self);
    return _escapeHtml4;
  }
  
  public String getTopicTitle(final EObject self, final String name) {
    Resource _eResource = self.eResource();
    TreeIterator<EObject> _allContents = _eResource.getAllContents();
    Iterator<Topic> _filter = Iterators.<Topic>filter(_allContents, Topic.class);
    final Function1<Topic,Boolean> _function = new Function1<Topic,Boolean>() {
        public Boolean apply(final Topic t) {
          String _name = t.getName();
          boolean _equals = Objects.equal(_name, name);
          return Boolean.valueOf(_equals);
        }
      };
    Topic t = IteratorExtensions.<Topic>findFirst(_filter, _function);
    boolean _equals = Objects.equal(t, null);
    if (_equals) {
      return ("topic not found: " + name);
    } else {
      return t.getTitle();
    }
  }
  
  public Topic topic(final EObject self) {
    Topic _topic = this.site.getTopic(self);
    return _topic;
  }
  
  public CharSequence features(final EObject self) {
    CharSequence _xblockexpression = null;
    {
      final List<EClass> types = CollectionLiterals.<EClass>newArrayList();
      EClass _eClass = self.eClass();
      types.add(_eClass);
      EClass _eClass_1 = self.eClass();
      EList<EClass> _eAllSuperTypes = _eClass_1.getEAllSuperTypes();
      types.addAll(_eAllSuperTypes);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<section class=\"features\">");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<h1>Features</h1>");
      _builder.newLine();
      _builder.append("<table border=1>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<thead>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<tr><th>Class</th><th>Name</th><th>Value</th></tr>");
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
                      _builder.append("<th rowspan=\"");
                      EList<EStructuralFeature> _eStructuralFeatures_3 = t.getEStructuralFeatures();
                      int _size_1 = _eStructuralFeatures_3.size();
                      _builder.append(_size_1, "			");
                      _builder.append("\">");
                      String _name = t.getName();
                      _builder.append(_name, "			");
                      _builder.append("</th>");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("<th>");
                  String _name_1 = f.getName();
                  String _escape = this.escape(_name_1);
                  _builder.append(_escape, "			");
                  _builder.append("</th>");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t");
                  _builder.append("\t");
                  _builder.append("<td>");
                  Object _eGet = self.eGet(f);
                  CharSequence _print = this.print(_eGet);
                  _builder.append(_print, "			");
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
      _builder.append("</section>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence article(final EClass type, final List<? extends Object> instances) {
    CharSequence _xblockexpression = null;
    {
      final List<EClass> types = CollectionLiterals.<EClass>newArrayList();
      types.add(type);
      EList<EClass> _eAllSuperTypes = type.getEAllSuperTypes();
      types.addAll(_eAllSuperTypes);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<article>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<a id=\"eClass:");
      String _name = type.getName();
      _builder.append(_name, "	");
      _builder.append("\"></a>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("<h1>");
      String _name_1 = type.getName();
      _builder.append(_name_1, "	");
      _builder.append("</h1>");
      _builder.newLineIfNotEmpty();
      _builder.append("<table border=1>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<thead>");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("<tr>");
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
      {
        for(final EClass t_1 : types) {
          {
            EList<EStructuralFeature> _eStructuralFeatures_2 = t_1.getEStructuralFeatures();
            for(final EStructuralFeature f : _eStructuralFeatures_2) {
              _builder.append("\t\t");
              _builder.append("<th>");
              String _name_3 = f.getName();
              String _escape = this.escape(_name_3);
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
        for(final Object i : instances) {
          _builder.append("\t\t");
          _builder.append("<tr>");
          _builder.newLine();
          {
            for(final EClass t_2 : types) {
              {
                EList<EStructuralFeature> _eStructuralFeatures_3 = t_2.getEStructuralFeatures();
                for(final EStructuralFeature f_1 : _eStructuralFeatures_3) {
                  _builder.append("\t\t");
                  _builder.append("<td>");
                  Object _eGet = ((EObject) i).eGet(f_1);
                  CharSequence _print = this.print(_eGet);
                  _builder.append(_print, "		");
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
      _builder.append("</article>");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _print(final Void self) {
    return "<null>";
  }
  
  protected CharSequence _print(final Object self) {
    String _string = self.toString();
    String _escape = this.escape(_string);
    return _escape;
  }
  
  protected CharSequence _print(final EObject self) {
    CharSequence _xblockexpression = null;
    {
      final Topic topic = this.topic(self);
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equal(topic, null);
      if (_equals) {
        String _string = self.toString();
        String _escape = this.escape(_string);
        _xifexpression = _escape;
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<a href=\"#");
        String _name = topic.getName();
        _builder.append(_name, "");
        _builder.append("\">");
        String _title = topic.getTitle();
        _builder.append(_title, "");
        _builder.append("</a>");
        _xifexpression = _builder;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _print(final Iterable<? extends Object> self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final Object e : self) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("[ ", "");
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _print = this.print(((Object) e));
        _builder.append(_print, "");
      }
      if (_hasElements) {
        _builder.append(" ]", "");
      }
    }
    return _builder;
  }
  
  public CharSequence link(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<a href=\"#");
    String _name = self.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    String _title = self.getTitle();
    _builder.append(_title, "");
    _builder.append("</a>");
    return _builder;
  }
  
  public CharSequence print(final Object self) {
    if (self instanceof EObject) {
      return _print((EObject)self);
    } else if (self instanceof Iterable) {
      return _print((Iterable<? extends Object>)self);
    } else if (self == null) {
      return _print((Void)null);
    } else if (self != null) {
      return _print(self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
