package org.ollabaca.on.mm.uml;

import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.mm.uml.Body_Element;
import org.ollabaca.on.mm.uml.Layout_Element;
import org.ollabaca.on.mm.uml.Section_Element_OwnedElements;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.util.Html;
import org.ollabaca.on.site.util.Sites;
import org.ollabaca.on.site.util.Template;

@SuppressWarnings("all")
public class Section_Element extends Template<Element> {
  public final static Section_Element instance = new Function0<Section_Element>() {
    public Section_Element apply() {
      Section_Element _section_Element = new Section_Element();
      return _section_Element;
    }
  }.apply();
  
  public static CharSequence section_Element(final Element self) {
    CharSequence _transform = Section_Element.instance.transform(self);
    return _transform;
  }
  
  public CharSequence doFallback(final Element self) {
    CharSequence _ref_Object = Ref.ref_Object(self);
    String _string = _ref_Object.toString();
    Topic _pic_EObject = Sites.topic_EObject(self);
    String _title = _pic_EObject.getTitle();
    CharSequence _span = Html.span(_title);
    String _string_1 = _span.toString();
    final Function1<Element,String> _function = new Function1<Element,String>() {
      public String apply(final Element it) {
        StringConcatenation _builder = new StringConcatenation();
        CharSequence _documentation_EObject = Html.documentation_EObject(it);
        _builder.append(_documentation_EObject, "");
        _builder.newLineIfNotEmpty();
        CharSequence _body_Element = Body_Element.body_Element(it);
        _builder.append(_body_Element, "");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    };
    final Function1<Element,CharSequence> _function_1 = new Function1<Element,CharSequence>() {
      public CharSequence apply(final Element it) {
        CharSequence _section_Element_OwnedElements = Section_Element_OwnedElements.section_Element_OwnedElements(it);
        return _section_Element_OwnedElements;
      }
    };
    CharSequence _layout_Element = Layout_Element.<Element>layout_Element(_string, _string_1, self, _function, _function_1);
    return _layout_Element;
  }
}
