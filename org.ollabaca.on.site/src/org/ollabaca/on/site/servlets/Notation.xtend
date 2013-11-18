package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.util.Template
import org.eclipse.emf.ecore.EObject
import static extension org.ollabaca.on.site.util.Html.*

class Notation extends Template<Object> {

	public static val Notation instance = new Notation()

	static def notation_Object(Object self) {
		instance.apply(self)
	}

	def dispatch CharSequence doFallback(EObject self) {
		link(self)
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
