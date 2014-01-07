package org.ollabaca.on.site.renderers

import java.util.Map
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Element
import java.util.Set

class Registry<E extends Element> {
	
	val Set<Pair<(E) => Boolean, (E) => CharSequence>> loaders = newHashSet();	

	val Map<String, (E) => Content> renderers = newHashMap()
	
	def registerRenderer(String path, (E) => Content renderer) {
		renderers.put(path, renderer)
	}
	
	def registerLoader((E) => Boolean filter, (E) => CharSequence loader) {
		loaders.add(new Pair<(E) => Boolean, (E) => CharSequence>(filter, loader))
	}
	
	def CharSequence load(E self) {
		'''
		«FOR e: loaders»
			«IF e.key.apply(self)»
				«e.value.apply(self)»
			«ENDIF»
		«ENDFOR»
		'''
	}
	
	def Content render(String path, E self) {
		var renderer = renderers.get(path);
		
		if (renderer == null) {
			return new Text("text/plain", "Renderer not found for path: " + path)
		}
		
		return renderer.apply(self)		
	}
}


class Renderers {
	
	public static val Registry<Site> siteRenderers = new Registry<Site>()
	
	public static val Registry<Type> typeRenderers = new Registry<Type>()
	
	public static val Registry<Topic> topicRenderers = new Registry<Topic>()
		
}