package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.util.Template

import static extension org.ollabaca.on.site.util.Html.*
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.util.Sites
import java.text.NumberFormat
import org.ollabaca.on.site.util.Locales
import java.util.Date
import java.text.DateFormat

class Notation extends Template<Object> {

	public static val Notation instance = new Notation()

	static def notation_Object(Object object) {
		instance.transform(object)
	}

	def dispatch CharSequence doFallback(EObject object) {
		val topic = Sites::topic_EObject(object)
		if (topic == null) {
			object.toString
		} else {
			Link::link_EObject(topic)
		}
	}

	def dispatch CharSequence doFallback(Element object) {
		Link::link_EObject(object)
	}

	def dispatch CharSequence doFallback(Object object) {
		object.toString
	}

	def dispatch CharSequence doFallback(Iterable<?> object) {
		'''«FOR e : object BEFORE "<ul>" AFTER "</ul>"»<li>«e.notation_Object»</li>«ENDFOR»'''
	}

	def dispatch CharSequence doFallback(String object) {
		object.span
	}

	def dispatch CharSequence doFallback(Void object) {
		"<code class='null'>null</code>"
	}
	
	def dispatch CharSequence doFallback(Number object) {
		NumberFormat::getInstance(Locales::get).format(object)
	}

	def dispatch CharSequence doFallback(Date object) {
		DateFormat::getDateTimeInstance(DateFormat::SHORT, DateFormat::FULL, Locales::get).format(object)
	}
}
