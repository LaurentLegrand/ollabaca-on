package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Component extends Template<Element> {
  /**
   * Tag attributes
   */
  public final Template<EObject> attributes = new Template<EObject>(new Function1<EObject, String>() {
    public String apply(final EObject it) {
      return "";
    }
  });
  
  /**
   * Before the start tag declaration
   */
  public final Template<EObject> beforeStart = new Template<EObject>(new Function1<EObject, String>() {
    public String apply(final EObject it) {
      return "";
    }
  });
  
  /**
   * After the start tag declaration and before the tag content
   */
  public final Template<EObject> afterStart = new Template<EObject>(new Function1<EObject, String>() {
    public String apply(final EObject it) {
      return "";
    }
  });
  
  /**
   * After the tag content and before the end tag declaration
   */
  public final Template<EObject> beforeEnd = new Template<EObject>(new Function1<EObject, String>() {
    public String apply(final EObject it) {
      return "";
    }
  });
  
  /**
   * After the end tag declaration
   */
  public final Template<EObject> afterEnd = new Template<EObject>(new Function1<EObject, String>() {
    public String apply(final EObject it) {
      return "";
    }
  });
  
  private final String name;
  
  private final Map<String, String> attrs;
  
  private final Function1<? super Element, ? extends CharSequence> content;
  
  public Component(final String name, final Map<String, String> attrs, final Function1<? super Element, ? extends CharSequence> content) {
    this.name = name;
    this.attrs = attrs;
    this.content = content;
  }
  
  protected CharSequence doFallback(final Element object) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _beforeStart_Element = this.beforeStart_Element(object);
    _builder.append(_beforeStart_Element, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    _builder.append(this.name, "");
    _builder.append(" ");
    {
      Set<Map.Entry<String, String>> _entrySet = this.attrs.entrySet();
      boolean _hasElements = false;
      for(final Map.Entry<String, String> e : _entrySet) {
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
    CharSequence _attributes_Element = this.attributes_Element(object);
    _builder.append(_attributes_Element, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _afterStart_Element = this.afterStart_Element(object);
    _builder.append(_afterStart_Element, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _content_Element = this.content_Element(object);
    _builder.append(_content_Element, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _beforeEnd_Element = this.beforeEnd_Element(object);
    _builder.append(_beforeEnd_Element, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</");
    _builder.append(this.name, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    CharSequence _afterEnd_Element = this.afterEnd_Element(object);
    _builder.append(_afterEnd_Element, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _beforeStart_Element(final Element object) {
    return this.beforeStart.concat(object);
  }
  
  protected CharSequence _beforeStart_Element(final Topic object) {
    EObject _target = object.getTarget();
    return this.beforeStart.concat(_target);
  }
  
  protected CharSequence _beforeStart_Element(final Void object) {
    return "";
  }
  
  protected CharSequence _afterStart_Element(final Element object) {
    return this.afterStart.concat(object);
  }
  
  protected CharSequence _afterStart_Element(final Topic object) {
    EObject _target = object.getTarget();
    return this.afterStart.concat(_target);
  }
  
  protected CharSequence _afterStart_Element(final Void object) {
    return "";
  }
  
  protected CharSequence _beforeEnd_Element(final Element object) {
    return this.beforeEnd.concat(object);
  }
  
  protected CharSequence _beforeEnd_Element(final Topic object) {
    EObject _target = object.getTarget();
    return this.beforeEnd.concat(_target);
  }
  
  protected CharSequence _beforeEnd_Element(final Void object) {
    return "";
  }
  
  protected CharSequence _afterEnd_Element(final Element object) {
    return this.afterEnd.concat(object);
  }
  
  protected CharSequence _afterEnd_Element(final Topic object) {
    EObject _target = object.getTarget();
    return this.afterEnd.concat(_target);
  }
  
  protected CharSequence _afterEnd_Element(final Void object) {
    return "";
  }
  
  protected CharSequence _attributes_Element(final Element object) {
    return this.attributes.concat(object);
  }
  
  protected CharSequence _attributes_Element(final Topic object) {
    EObject _target = object.getTarget();
    return this.attributes.concat(_target);
  }
  
  protected CharSequence _attributes_Element(final Void object) {
    return "";
  }
  
  public CharSequence content_Element(final Element object) {
    String _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(this.content, null));
      if (_notEquals) {
        return this.content.apply(object);
      }
      _xblockexpression = "";
    }
    return _xblockexpression;
  }
  
  public CharSequence beforeStart_Element(final Element object) {
    if (object instanceof Topic) {
      return _beforeStart_Element((Topic)object);
    } else if (object != null) {
      return _beforeStart_Element(object);
    } else if (object == null) {
      return _beforeStart_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public CharSequence afterStart_Element(final Element object) {
    if (object instanceof Topic) {
      return _afterStart_Element((Topic)object);
    } else if (object != null) {
      return _afterStart_Element(object);
    } else if (object == null) {
      return _afterStart_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public CharSequence beforeEnd_Element(final Element object) {
    if (object instanceof Topic) {
      return _beforeEnd_Element((Topic)object);
    } else if (object != null) {
      return _beforeEnd_Element(object);
    } else if (object == null) {
      return _beforeEnd_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public CharSequence afterEnd_Element(final Element object) {
    if (object instanceof Topic) {
      return _afterEnd_Element((Topic)object);
    } else if (object != null) {
      return _afterEnd_Element(object);
    } else if (object == null) {
      return _afterEnd_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
  
  public CharSequence attributes_Element(final Element object) {
    if (object instanceof Topic) {
      return _attributes_Element((Topic)object);
    } else if (object != null) {
      return _attributes_Element(object);
    } else if (object == null) {
      return _attributes_Element((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object).toString());
    }
  }
}
