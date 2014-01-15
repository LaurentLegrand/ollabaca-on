package org.ollabaca.on.site.servlets;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.ollabaca.on.site.Abbreviation;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Named;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.servlets.Link;
import org.ollabaca.on.site.util.HTag;
import org.ollabaca.on.site.util.Html;

@SuppressWarnings("all")
public class Aside extends HTag {
  public Aside() {
    super("aside", new Function0<Map<String,String>>() {
      public Map<String,String> apply() {
        Map<String,String> _xsetliteral = null;
        Map<String,String> _tempMap = Maps.<String, String>newHashMap();
        _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
        return _xsetliteral;
      }
    }.apply(), null);
  }
  
  protected CharSequence _content_Element(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Void self) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Type self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul class=\'nav nav-list\'>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<li class=\'nav-header\'>name</li><li>");
    String _name = self.getName();
    _builder.append(_name, "	");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Site self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _nav = this.nav(self);
    _builder.append(_nav, "");
    _builder.newLineIfNotEmpty();
    CharSequence _para_Site_tags = this.para_Site_tags(self);
    _builder.append(_para_Site_tags, "");
    _builder.newLineIfNotEmpty();
    CharSequence _para_Site_abbreviations = this.para_Site_abbreviations(self);
    _builder.append(_para_Site_abbreviations, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _content_Element(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul class=\'nav nav-list\'>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<li class=\'nav-header\'>type</li><li>");
    Type _type = self.getType();
    CharSequence _link_EObject = Link.link_EObject(_type);
    _builder.append(_link_EObject, "	");
    _builder.append("</li>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Topic> _ancestors = self.getAncestors();
      boolean _hasElements = false;
      for(final Topic e : _ancestors) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<li class=\'divider\'></li><li class=\'nav-header\'>ancestors</li>", "	");
        }
        _builder.append("<li>");
        CharSequence _link_EObject_1 = Link.link_EObject(e);
        _builder.append(_link_EObject_1, "	");
        _builder.append("</li>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Topic> _topics = self.getTopics();
      boolean _hasElements_1 = false;
      for(final Topic e_1 : _topics) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append("<li class=\'divider\'></li><li class=\'nav-header\'>children</li>", "	");
        }
        _builder.append("<li>");
        CharSequence _link_EObject_2 = Link.link_EObject(e_1);
        _builder.append(_link_EObject_2, "	");
        _builder.append("</li>");
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
          _builder.append("<li class=\'divider\'></li><li class=\'nav-header\'>see also</li>", "	");
        }
        _builder.append("<li>");
        CharSequence _link_EObject_3 = Link.link_EObject(e_2);
        _builder.append(_link_EObject_3, "	");
        _builder.append("</li>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _nav(final Site self) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<nav class=\"instance-tree\">");
    _builder.newLine();
    EList<Topic> _roots = self.getRoots();
    final Function1<Topic,String> _function = new Function1<Topic,String>() {
      public String apply(final Topic it) {
        String _name = it.getName();
        return _name;
      }
    };
    List<Topic> _sortBy = IterableExtensions.<Topic, String>sortBy(_roots, _function);
    final Function1<Topic,CharSequence> _function_1 = new Function1<Topic,CharSequence>() {
      public CharSequence apply(final Topic it) {
        CharSequence _nav = Aside.this.nav(it);
        return _nav;
      }
    };
    CharSequence _ul = Html.<Topic>ul(_sortBy, _function_1);
    _builder.append(_ul, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</nav>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _nav(final Topic self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _link_EObject = Link.link_EObject(self);
    _builder.append(_link_EObject, "");
    _builder.newLineIfNotEmpty();
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
    final Function1<Topic,CharSequence> _function_2 = new Function1<Topic,CharSequence>() {
      public CharSequence apply(final Topic it) {
        CharSequence _nav = Aside.this.nav(it);
        return _nav;
      }
    };
    CharSequence _ul = Html.<Topic>ul(_sortBy, _function_2);
    _builder.append(_ul, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence para_Site_tags(final Site self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Tag> _tags = self.getTags();
      boolean _hasElements = false;
      for(final Tag e : _tags) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<p>", "");
        } else {
          _builder.appendImmediate("&nbsp;", "");
        }
        CharSequence _link_EObject = Link.link_EObject(e);
        _builder.append(_link_EObject, "");
      }
      if (_hasElements) {
        _builder.append("</p>", "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence para_Site_abbreviations(final Site self) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Abbreviation> _abbreviations = self.getAbbreviations();
      boolean _hasElements = false;
      for(final Abbreviation e : _abbreviations) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("<p>", "");
        } else {
          _builder.appendImmediate("&nbsp;", "");
        }
        String _name = e.getName();
        _builder.append(_name, "");
      }
      if (_hasElements) {
        _builder.append("</p>", "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence content_Element(final Element self) {
    if (self instanceof Site) {
      return _content_Element((Site)self);
    } else if (self instanceof Topic) {
      return _content_Element((Topic)self);
    } else if (self instanceof Type) {
      return _content_Element((Type)self);
    } else if (self != null) {
      return _content_Element(self);
    } else if (self == null) {
      return _content_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public CharSequence nav(final Named self) {
    if (self instanceof Site) {
      return _nav((Site)self);
    } else if (self instanceof Topic) {
      return _nav((Topic)self);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
