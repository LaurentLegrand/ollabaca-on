package org.ollabaca.on.site.util

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.Element

class Sites {

	public static val topic = new Extension<EObject, Topic>([it.topic_fallback]);

	def static Topic topic_EObject(EObject self) {
		topic.apply(self)
	}

	static def dispatch Topic topic_fallback(EObject self) {
		self.site_Object.getTopic(self)
	}

	static def dispatch Topic topic_fallback(Void self) {
		null
	}

	static def dispatch Topic topic_fallback(Topic self) {
		self
	}

	//	@Local
	public static val ThreadLocal<Site> current = new ThreadLocal<Site>()

	//	public static val site = new Extension<Object, Site>([it.site_fallback]);
	def static Site site() {
		current.get()
	}

	def static Site site_Object(EObject self) {

		//		site.apply(self)
		current.get()
	}

	def static Type type_EClass(EClass self) {
		val n = self.instanceClassName
		return site().types.findFirst[it.name == n]
	}

//	static def dispatch Site site_fallback(EClass self) {
//		current.get()
//	}
//	
//	static def dispatch Site site_fallback(EObject self) {
//		self.eResource.contents.filter(typeof(Site)).head
//	}
//	
//	static def dispatch Site site_fallback(Object self) {
//		current.get()
//	}

	def static isTargetInstanceOf(Element element, Class<?> type) {
		return element instanceof Topic && type.isInstance((element as Topic).target)
	}
}
