package org.ollabaca.on.site.util

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.Element

class Sites {

	public static val topic = new Transformer<EObject, Topic>([it.topic_fallback]);

	def static Topic topic_EObject(EObject object) {
		topic.transform(object)
	}

	static def dispatch Topic topic_fallback(EObject object) {
		object.site_Object.getTopic(object)
	}

	static def dispatch Topic topic_fallback(Void object) {
		null
	}

	static def dispatch Topic topic_fallback(Topic object) {
		object
	}

	//	@Local
	public static val ThreadLocal<Site> current = new ThreadLocal<Site>()

	//	public static val site = new Extension<Object, Site>([it.site_fallback]);
	def static Site site() {
		current.get()
	}

	def static Site site_Object(EObject object) {

		//		site.apply(object)
		current.get()
	}

	def static Type type_EClass(EClass object) {
		val n = object.instanceClassName
		return site().types.findFirst[it.name == n]
	}

//	static def dispatch Site site_fallback(EClass object) {
//		current.get()
//	}
//	
//	static def dispatch Site site_fallback(EObject object) {
//		object.eResource.contents.filter(typeof(Site)).head
//	}
//	
//	static def dispatch Site site_fallback(Object object) {
//		current.get()
//	}

	def static isTargetInstanceOf(Element element, Class<?> type) {
		return element instanceof Topic && type.isInstance((element as Topic).target)
	}
}
