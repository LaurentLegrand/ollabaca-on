package org.ollabaca.on.site.util

import org.ollabaca.on.site.Element
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Topic
import java.util.Map

/**
 * 
 */
class HTag extends Template<Element> {
	
	/**
	 * Tag attributes
	 */
	public val attributes = new Template<EObject>([""]);
	
	/**
	 * Before the start tag declaration
	 */
	public val beforeStart = new Template<EObject>([""]);
	
	/**
	 * After the start tag declaration and before the tag content
	 */
	public val afterStart = new Template<EObject>([""]);
	
	/**
	 * After the tag content and before the end tag declaration
	 */
	public val beforeEnd = new Template<EObject>([""]);
	
	/**
	 * After the end tag declaration
	 */
	public val afterEnd = new Template<EObject>([""]);
	
	val String name
	
	val Map<String, String> attrs
	
	val (Element) => CharSequence content
	
	new(String name, Map<String, String> attrs, (Element) => CharSequence content) {
		this.name = name
		this.attrs = attrs
		this.content = content
	}
	
	override protected doFallback(Element self) '''
		«self.beforeStart_Element»
		<«name» «FOR e: attrs.entrySet SEPARATOR " "»«e.key»="«e.value»"«ENDFOR»«self.attributes_Element»>
			«self.afterStart_Element»
			«self.content_Element»
			«self.beforeEnd_Element»
		</«name»>
		«self.afterEnd_Element»
	'''
	
	def dispatch beforeStart_Element(Element self) {
		beforeStart.concat(self)
	}
	
	def dispatch beforeStart_Element(Topic self) {
		beforeStart.concat(self.target)
	}
	
	def dispatch beforeStart_Element(Void self) {
		""
	}
	
	def dispatch afterStart_Element(Element self) {
		afterStart.concat(self)
	}
	
	def dispatch afterStart_Element(Topic self) {
		afterStart.concat(self.target)
	}
	
	def dispatch afterStart_Element(Void self) {
		""
	}
	
	def dispatch beforeEnd_Element(Element self) {
		beforeEnd.concat(self)
	}
	
	def dispatch beforeEnd_Element(Topic self) {
		beforeEnd.concat(self.target)
	}
	
	def dispatch beforeEnd_Element(Void self) {
		""
	}
	
	def dispatch afterEnd_Element(Element self) {
		afterEnd.concat(self)
	}
	
	def dispatch afterEnd_Element(Topic self) {
		afterEnd.concat(self.target)
	}
	
	def dispatch afterEnd_Element(Void self) {
		""
	}
	
	def dispatch attributes_Element(Element self) {
		attributes.concat(self)
	}
	
	def dispatch attributes_Element(Topic self) {
		attributes.concat(self.target)
	}
	
	def dispatch attributes_Element(Void self) {
		""
	}
	
	def CharSequence content_Element(Element self) {
		if (content != null) {
			return content.apply(self)
		}
		""
	}
}