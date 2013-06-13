package org.ollabaca.on.site.tools

import java.util.Set
import org.apache.commons.lang3.StringEscapeUtils
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.pegdown.Extensions
import org.pegdown.LinkRenderer
import org.pegdown.PegDownProcessor

abstract class SiteRenderer {
	
	public val Site site
	
	val processor = new PegDownProcessor(Extensions::WIKILINKS)
	
	val LinkRenderer linkRenderer
	
	protected var Set<ObjectRenderer> objectRenderers = newHashSet()
	
	new(Site site) {
		this.site = site
		this.linkRenderer = new SiteLinkRenderer(this)
	}
	
	def setOjectRenderers(Set<ObjectRenderer> set) {
		this.objectRenderers.addAll(set)
	}
	
	def topic(EObject self) {
		site.getTopic(self)
	}
	
	def String href(Topic self)
	
	def String href(Site self)
	
	def section(Topic self) {
		'''
		<hr></hr>
		«FOR e:objectRenderers»
			«e.section(self.target)»
		«ENDFOR»
		'''
	}
	
	def dispatch print(Void self) {
		"<code class='null'>null</code>"
	}
	
	def dispatch print(Object self) {
		for (e: objectRenderers) {
			val res = e.print(self)
			if (res != null && res.length > 0) {
				return res
			}
		}
		self.printFallback
	}
	
	def dispatch printFallback(Object self) {
		self.toString.escape
	}
	
	def dispatch printFallback(EObject self) {
		val topic = self.topic
		if (topic == null) {
			self.toString.escape
		} else {
			'''<a href="«topic.href»">«topic.title»</a>'''
		}
	}
	
	def dispatch print(Iterable<?> self) {
		'''«FOR e: self BEFORE "<ul>"  AFTER "</ul>"»<li>«(e as Object).print»</li>«ENDFOR»'''
	}
	
	def html(String self) {
		processor.markdownToHtml(self, linkRenderer)
	}
	
	def escape(String self) {
		StringEscapeUtils::escapeHtml4(self)
	}
	
	
}