package org.ollabaca.on.site.servlets

import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Tag
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.util.Sites
import org.ollabaca.on.site.util.Template

@Data
class Scope {
	val String path;

	val EObject target;
}

class Ref extends Template<Object> {

	public static val Ref instance = new Ref()

	static def ref_Object(Object object) {
		instance.transform(object)
	}
	
	static def Scope scope(String path, EObject target) {
		new Scope(path, target)
	}

	def dispatch CharSequence doFallback(Void object) {
		"null"
	}

	def dispatch CharSequence doFallback(EObject object) {
		ref_Object(new Scope("pages", object))
	}

	def dispatch CharSequence doFallback(Scope object) {
		path(object.path, object.target)
	}

	def dispatch String path(String scope, Site object) {
		'''/site/«scope»/«object.name»'''
	}

	def dispatch String path(String scope, Topic object) {
		'''/site/«scope»/«Sites::site.name»/topics/«object.name»'''
	}

	def dispatch String path(String scope, Tag object) {
		'''/site/«scope»/«Sites::site.name»/tags/«object.name»'''
	}

	def dispatch String path(String scope, EObject object) {
		val topic = Sites::topic_EObject(object)
		if (topic == null) {
			'''#404/«scope»/«object»'''
		} else {
			path(scope, topic)
		}
	}

	def dispatch String path(String scope, Type object) {
		'''/site/«scope»/«Sites::site.name»/types/«object.name»'''
	}
}
