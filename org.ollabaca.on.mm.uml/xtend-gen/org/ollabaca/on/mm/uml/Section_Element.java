package org.ollabaca.on.mm.uml;

import org.eclipse.uml2.uml.Element;
import org.eclipse.xtend2.lib.StringConcatenation;
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
  public final static Section_Element instance = new Section_Element();
  
  public static CharSequence section_Element(final Element object) {
    return Section_Element.instance.transform(object);
  }
  
  public CharSequence doFallback(final Element object) {
    CharSequence _ref_Object = Ref.ref_Object(object);
    String _string = _ref_Object.toString();
    Topic _pic_EObject = Sites.topic_EObject(object);
    String _title = _pic_EObject.getTitle();
    CharSequence _span = Html.span(_title);
    String _string_1 = _span.toString();
    final Function1<Element, String> _function = new Function1<Element, String>() {
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
    final Function1<Element, CharSequence> _function_1 = new Function1<Element, CharSequence>() {
      public CharSequence apply(final Element it) {
        return Section_Element_OwnedElements.section_Element_OwnedElements(it);
      }
    };
    return Layout_Element.<Element>layout_Element(_string, _string_1, object, _function, _function_1);
  }
}
