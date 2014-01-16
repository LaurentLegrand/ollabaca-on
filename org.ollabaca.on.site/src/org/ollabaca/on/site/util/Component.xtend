package org.ollabaca.on.site.util

import org.ollabaca.on.site.Element
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Topic
import java.util.Map

/**
 * 
 */
class Component extends Template<Element> {
	
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
	
	override protected doFallback(Element object) '''
		«object.beforeStart_Element»
		<«name» «FOR e: attrs.entrySet SEPARATOR " "»«e.key»="«e.value»"«ENDFOR»«object.attributes_Element»>
			«object.afterStart_Element»
			«object.content_Element»
			«object.beforeEnd_Element»
		</«name»>
		«object.afterEnd_Element»
	'''
	
	def dispatch beforeStart_Element(Element object) {
		beforeStart.concat(object)
	}
	
	def dispatch beforeStart_Element(Topic object) {
		beforeStart.concat(object.target)
	}
	
	def dispatch beforeStart_Element(Void object) {
		""
	}
	
	def dispatch afterStart_Element(Element object) {
		afterStart.concat(object)
	}
	
	def dispatch afterStart_Element(Topic object) {
		afterStart.concat(object.target)
	}
	
	def dispatch afterStart_Element(Void object) {
		""
	}
	
	def dispatch beforeEnd_Element(Element object) {
		beforeEnd.concat(object)
	}
	
	def dispatch beforeEnd_Element(Topic object) {
		beforeEnd.concat(object.target)
	}
	
	def dispatch beforeEnd_Element(Void object) {
		""
	}
	
	def dispatch afterEnd_Element(Element object) {
		afterEnd.concat(object)
	}
	
	def dispatch afterEnd_Element(Topic object) {
		afterEnd.concat(object.target)
	}
	
	def dispatch afterEnd_Element(Void object) {
		""
	}
	
	def dispatch attributes_Element(Element object) {
		attributes.concat(object)
	}
	
	def dispatch attributes_Element(Topic object) {
		attributes.concat(object.target)
	}
	
	def dispatch attributes_Element(Void object) {
		""
	}
	
	def CharSequence content_Element(Element object) {
		if (content != null) {
			return content.apply(object)
		}
		""
	}
}