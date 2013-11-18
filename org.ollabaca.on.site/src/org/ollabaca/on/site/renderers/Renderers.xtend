package org.ollabaca.on.site.renderers

import org.eclipse.emf.ecore.EObject

import static org.ollabaca.on.site.util.Html.*
import static org.ollabaca.on.site.util.Sites.*

class Renderers {
	
//	static val ThreadLocal<Renderers> current = new ThreadLocal<Renderers>();
//
//	def static Renderers getCurrent() {
//		return current.get();
//	}
//	
//	def public static init(Site site) {
//		current.set(new Renderers(site));
//	}
//	
//	def public static dispose() {
//		current.remove
//	}
//	
//	
//	public val Site site;
//	
//	private new(Site site) {
//		this.site = site;
//	}
//	
//	val processor = new PegDownProcessor(Extensions::WIKILINKS)
	
//	 def static dispatch CharSequence label(Object self) {
//		for (e: Activator::instance.context.labelProviders) {
//			val res = e.label(self)
//			if (res != null && res.length > 0) {
//				return res
//			}
//		}
//		fallback(self)
//	}
//	
//	def static dispatch CharSequence label(Iterable<?> self) {
//		'''«FOR e: self BEFORE "<ul>"  AFTER "</ul>"»<li>«label(e as Object)»</li>«ENDFOR»'''
//	}
//	
//	def static dispatch label(Void self) {
//		"<code class='null'>null</code>"
//	}
	
	
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
	
//	def static getSite() {
//		current.get().site
//	}
//	
//	def static html(String self) {
//		current.get().processor.markdownToHtml(self, new SiteLinkRenderer(getSite))
//	}
		
}