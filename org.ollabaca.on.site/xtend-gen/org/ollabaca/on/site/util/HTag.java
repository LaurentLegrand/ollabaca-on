package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class HTag extends Template<Element> {
  /**
   * Tag attributes
   */
  public final Template<EObject> attributes = new Function0<Template<EObject>>() {
    public Template<EObject> apply() {
      final Function1<EObject,String> _function = new Function1<EObject,String>() {
        public String apply(final EObject it) {
          return "";
        }
      };
      Template<EObject> _template = new Template<EObject>(_function);
      return _template;
    }
  }.apply();
  
  /**
   * Before the start tag declaration
   */
  public final Template<EObject> beforeStart = new Function0<Template<EObject>>() {
    public Template<EObject> apply() {
      final Function1<EObject,String> _function = new Function1<EObject,String>() {
        public String apply(final EObject it) {
          return "";
        }
      };
      Template<EObject> _template = new Template<EObject>(_function);
      return _template;
    }
  }.apply();
  
  /**
   * After the start tag declaration and before the tag content
   */
  public final Template<EObject> afterStart = new Function0<Template<EObject>>() {
    public Template<EObject> apply() {
      final Function1<EObject,String> _function = new Function1<EObject,String>() {
        public String apply(final EObject it) {
          return "";
        }
      };
      Template<EObject> _template = new Template<EObject>(_function);
      return _template;
    }
  }.apply();
  
  /**
   * After the tag content and before the end tag declaration
   */
  public final Template<EObject> beforeEnd = new Function0<Template<EObject>>() {
    public Template<EObject> apply() {
      final Function1<EObject,String> _function = new Function1<EObject,String>() {
        public String apply(final EObject it) {
          return "";
        }
      };
      Template<EObject> _template = new Template<EObject>(_function);
      return _template;
    }
  }.apply();
  
  /**
   * After the end tag declaration
   */
  public final Template<EObject> afterEnd = new Function0<Template<EObject>>() {
    public Template<EObject> apply() {
      final Function1<EObject,String> _function = new Function1<EObject,String>() {
        public String apply(final EObject it) {
          return "";
        }
      };
      Template<EObject> _template = new Template<EObject>(_function);
      return _template;
    }
  }.apply();
  
  private final String name;
  
  private final Map<String,String> attrs;
  
  private final Function1<? super Element,? extends CharSequence> content;
  
  public HTag(final String name, final Map<String,String> attrs, final Function1<? super Element,? extends CharSequence> content) {
    this.name = name;
    this.attrs = attrs;
    this.content = content;
  }
  
  protected CharSequence doFallback(final Element self) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _beforeStart_Element = this.beforeStart_Element(self);
    _builder.append(_beforeStart_Element, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    _builder.append(this.name, "");
    _builder.append(" ");
    {
      Set<Entry<String,String>> _entrySet = this.attrs.entrySet();
      boolean _hasElements = false;
      for(final Entry<String, String> e : _entrySet) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ", "");
        }
        String _key = e.getKey();
        _builder.append(_key, "");
        _builder.append("=\"");
        String _value = e.getValue();
        _builder.append(_value, "");
        _builder.append("\"");
      }
    }
    CharSequence _attributes_Element = this.attributes_Element(self);
    _builder.append(_attributes_Element, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _afterStart_Element = this.afterStart_Element(self);
    _builder.append(_afterStart_Element, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content_Element = this.content_Element(self);
    _builder.append(_content_Element, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _beforeEnd_Element = this.beforeEnd_Element(self);
    _builder.append(_beforeEnd_Element, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</");
    _builder.append(this.name, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    CharSequence _afterEnd_Element = this.afterEnd_Element(self);
    _builder.append(_afterEnd_Element, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _beforeStart_Element(final Element self) {
    CharSequence _concat = this.beforeStart.concat(self);
    return _concat;
  }
  
  protected CharSequence _beforeStart_Element(final Topic self) {
    EObject _target = self.getTarget();
    CharSequence _concat = this.beforeStart.concat(_target);
    return _concat;
  }
  
  protected CharSequence _beforeStart_Element(final Void self) {
    return "";
  }
  
  protected CharSequence _afterStart_Element(final Element self) {
    CharSequence _concat = this.afterStart.concat(self);
    return _concat;
  }
  
  protected CharSequence _afterStart_Element(final Topic self) {
    EObject _target = self.getTarget();
    CharSequence _concat = this.afterStart.concat(_target);
    return _concat;
  }
  
  protected CharSequence _afterStart_Element(final Void self) {
    return "";
  }
  
  protected CharSequence _beforeEnd_Element(final Element self) {
    CharSequence _concat = this.beforeEnd.concat(self);
    return _concat;
  }
  
  protected CharSequence _beforeEnd_Element(final Topic self) {
    EObject _target = self.getTarget();
    CharSequence _concat = this.beforeEnd.concat(_target);
    return _concat;
  }
  
  protected CharSequence _beforeEnd_Element(final Void self) {
    return "";
  }
  
  protected CharSequence _afterEnd_Element(final Element self) {
    CharSequence _concat = this.afterEnd.concat(self);
    return _concat;
  }
  
  protected CharSequence _afterEnd_Element(final Topic self) {
    EObject _target = self.getTarget();
    CharSequence _concat = this.afterEnd.concat(_target);
    return _concat;
  }
  
  protected CharSequence _afterEnd_Element(final Void self) {
    return "";
  }
  
  protected CharSequence _attributes_Element(final Element self) {
    CharSequence _concat = this.attributes.concat(self);
    return _concat;
  }
  
  protected CharSequence _attributes_Element(final Topic self) {
    EObject _target = self.getTarget();
    CharSequence _concat = this.attributes.concat(_target);
    return _concat;
  }
  
  protected CharSequence _attributes_Element(final Void self) {
    return "";
  }
  
  public CharSequence content_Element(final Element self) {
    String _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(this.content, null));
      if (_notEquals) {
        return this.content.apply(self);
      }
      _xblockexpression = ("");
    }
    return _xblockexpression;
  }
  
  public CharSequence beforeStart_Element(final Element self) {
    if (self instanceof Topic) {
      return _beforeStart_Element((Topic)self);
    } else if (self != null) {
      return _beforeStart_Element(self);
    } else if (self == null) {
      return _beforeStart_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public CharSequence afterStart_Element(final Element self) {
    if (self instanceof Topic) {
      return _afterStart_Element((Topic)self);
    } else if (self != null) {
      return _afterStart_Element(self);
    } else if (self == null) {
      return _afterStart_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public CharSequence beforeEnd_Element(final Element self) {
    if (self instanceof Topic) {
      return _beforeEnd_Element((Topic)self);
    } else if (self != null) {
      return _beforeEnd_Element(self);
    } else if (self == null) {
      return _beforeEnd_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public CharSequence afterEnd_Element(final Element self) {
    if (self instanceof Topic) {
      return _afterEnd_Element((Topic)self);
    } else if (self != null) {
      return _afterEnd_Element(self);
    } else if (self == null) {
      return _afterEnd_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
  
  public CharSequence attributes_Element(final Element self) {
    if (self instanceof Topic) {
      return _attributes_Element((Topic)self);
    } else if (self != null) {
      return _attributes_Element(self);
    } else if (self == null) {
      return _attributes_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(self).toString());
    }
  }
}
