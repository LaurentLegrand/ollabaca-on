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

	static def ref_Object(Object self) {
		instance.transform(self)
	}
	
	static def Scope scope(String path, EObject target) {
		new Scope(path, target)
	}

	def dispatch CharSequence doFallback(Void self) {
		"null"
	}

	def dispatch CharSequence doFallback(EObject self) {
		ref_Object(new Scope("pages", self))
	}

	def dispatch CharSequence doFallback(Scope self) {
		path(self.path, self.target)
	}

	def dispatch String path(String scope, Site self) {
		'''/site/«scope»/«self.name»'''
	}

	def dispatch String path(String scope, Topic self) {
		'''/site/«scope»/«Sites::site.name»/topics/«self.name»'''
	}

	def dispatch String path(String scope, Tag self) {
		'''/site/«scope»/«Sites::site.name»/tags/«self.name»'''
	}

	def dispatch String path(String scope, EObject self) {
		'''/site/«scope»/«Sites::site.name»/unknwon/«self»'''
	}

	def dispatch String path(String scope, Type self) {
		'''/site/«scope»/«Sites::site.name»/types/«self.name»'''
	}
}
