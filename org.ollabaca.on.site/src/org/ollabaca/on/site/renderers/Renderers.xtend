package org.ollabaca.on.site.renderers

import org.apache.commons.lang3.StringEscapeUtils
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Activator
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.pegdown.Extensions
import org.pegdown.PegDownProcessor

import static org.ollabaca.on.site.renderers.Renderers.*

class Renderers {
	
	static val ThreadLocal<Renderers> current = new ThreadLocal<Renderers>();


	def static Renderers getCurrent() {
		return current.get();
	}
	
	def public static init(Site site) {
		current.set(new Renderers(site));
	}
	
	def public static dispose() {
		current.remove
	}
	
	
	public val Site site;
	
	private new(Site site) {
		this.site = site;
	}
	
	val processor = new PegDownProcessor(Extensions::WIKILINKS)
	
	 def static dispatch CharSequence label(Object self) {
		for (e: Activator::instance.context.labelProviders) {
			val res = e.label(self)
			if (res != null && res.length > 0) {
				return res
			}
		}
		fallback(self)
	}
	
	def static dispatch label(Iterable<?> self) {
		'''«FOR e: self BEFORE "<ul>"  AFTER "</ul>"»<li>«label(e as Object)»</li>«ENDFOR»'''
	}
	
	def static dispatch label(Void self) {
		"<code class='null'>null</code>"
	}
	
	def static String escape(String self) {
		StringEscapeUtils::escapeHtml4(self)
	}
	
	def static String escapeEcmaScript(String self) {
		StringEscapeUtils::escapeEcmaScript(self)
	}
	
	def static dispatch fallback(Object self) {
		escape(self.toString)
	}
	
	def static dispatch fallback(EObject self) {
		val topic = site.getTopic(self)
		if (topic == null) {
			escape(self.toString)
		} else {
			link(topic)
		}
	}
	
	def static site() {
		current.get().site
	}
	
	def static html(String self) {
		current.get().processor.markdownToHtml(self, new SiteLinkRenderer(site))
	}
		
	def static dispatch String href(Topic self, String path) {
		'''/site/«path»/«site.name»/topics/«self.name»'''
	}

	def static dispatch String href(Site self, String path) {
		'''/site/«path»/«self.name»'''
	}
	
	def static dispatch String href(EClass self, String path) {
		'''/site/«path»/«site.name»/types/«self.instanceClassName»'''
	}
	
	def static dispatch String href(Topic self) {
		href(self, "pages")
	}

	def static dispatch String href(Site self) {
		href(self, "pages")
	}
	
	def static dispatch String href(EClass self) {
		href(self, "pages")
	}
	
	def static dispatch link(Site self) {
		'''<a href="«href(self)»">«self.name»</a>'''
	}
	
	def static dispatch link(Topic self) {
		'''<a href="«href(self)»">«self.title»</a>'''
	}
	
	def static dispatch link(EClass self) {
		'''<a href="«href(self)»">«self.name»</a>'''		
	}
}