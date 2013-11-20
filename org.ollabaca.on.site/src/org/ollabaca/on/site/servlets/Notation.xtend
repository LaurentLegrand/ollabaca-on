package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.util.Template

import static extension org.ollabaca.on.site.util.Html.*
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.util.Sites

class Notation extends Template<Object> {

	public static val Notation instance = new Notation()

	static def notation_Object(Object self) {
		instance.apply(self)
	}

	def dispatch CharSequence doFallback(EObject self) {
		val topic = Sites::topic_EObject(self)
		if (topic == null) {
			self.toString
		} else {
			Link::link_EObject(topic)
		}
	}

	def dispatch CharSequence doFallback(Element self) {
		Link::link_EObject(self)
	}

	def dispatch CharSequence doFallback(Object self) {
		self.toString
	}

	def dispatch CharSequence doFallback(Iterable<?> self) {
		'''«FOR e : self BEFORE "<ul>" AFTER "</ul>"»<li>«e.notation_Object»</li>«ENDFOR»'''
	}

	def dispatch CharSequence doFallback(String self) {
		self.span
	}

	def dispatch CharSequence doFallback(Void self) {
		"<code class='null'>null</code>"
	}

}
