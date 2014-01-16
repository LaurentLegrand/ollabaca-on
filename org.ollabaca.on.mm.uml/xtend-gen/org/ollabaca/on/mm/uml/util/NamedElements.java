package org.ollabaca.on.mm.uml.util;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.ollabaca.on.site.servlets.Link;

@SuppressWarnings("all")
public class NamedElements {
  public static CharSequence link_NamedElement(final NamedElement object) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Namespace> _allNamespaces = object.allNamespaces();
      List<Namespace> _reverse = ListExtensions.<Namespace>reverse(_allNamespaces);
      boolean _hasElements = false;
      for(final Namespace e : _reverse) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("::", "");
        }
        CharSequence _link_EObject = Link.link_EObject(e);
        _builder.append(_link_EObject, "");
      }
      if (_hasElements) {
        _builder.append("::", "");
      }
    }
    CharSequence _link_EObject_1 = Link.link_EObject(object);
    _builder.append(_link_EObject_1, "");
    return _builder;
  }
}
