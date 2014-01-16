package org.ollabaca.on.mm.uml

import org.eclipse.uml2.uml.Element
import org.ollabaca.on.site.util.Html
import org.ollabaca.on.site.util.Template

import static extension org.ollabaca.on.mm.uml.Body_Element.*
import static extension org.ollabaca.on.site.servlets.Ref.*
import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.site.util.Sites.*

class Section_Element extends Template<Element> {
	
	public static val instance = new Section_Element()

	static def section_Element(Element object) {
		instance.transform(object)
	}

	override CharSequence doFallback(Element object) {

		Layout_Element.layout_Element(object.ref_Object.toString, object.topic_EObject.getTitle.span.toString, object,
			[
				'''
					«Html::documentation_EObject(it)»
					«it.body_Element»
				'''
			], [Section_Element_OwnedElements::section_Element_OwnedElements(it)]);
	
	}
}