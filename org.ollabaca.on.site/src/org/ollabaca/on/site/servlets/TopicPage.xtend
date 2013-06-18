package org.ollabaca.on.site.servlets

import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Activator
import static extension org.ollabaca.on.site.renderers.Renderers.*

class TopicPage extends SitePage {
	
	val Topic topic
	
	new(Site site, Topic topic) {
		super(site)
		this.topic = topic
	}
	
	override title() {
		site.name + ":" + topic.title
	}
	
	override content() {
		'''
		«breadcrumb»
		«article»
		«topic.target.properties»
		'''
	}
	
	override onLoad() {
		'''
		«FOR e: Activator::instance.context.contentProviders»
			«e.onTopic(topic)»
		«ENDFOR»
		'''
	}
	
	def article() {
		'''
		<article class="instance «topic.target.eClass.name»">
			<a id="«topic.name»"></a>
			<h1>«topic.title»</h1>
			
			
				<section class="main">
					<section class="abstract">
						«topic.^abstract.html»
					</section>
					<section class="documentation">
						«topic.documentation.html»
					</section>
				</section>
«««				«renderer.section(topic)»
		</article>
		'''		
	}
	
	def breadcrumb() {
		'''
		<ul class="breadcrumb">
			<li>«site.link» <span class="divider">/</span></li>
			«FOR e: topic.ancestors»
				<li>«e.link» <span class="divider">/</span></li>
			«ENDFOR»
			<li class="active">«topic.title.escape»</li>
		</ul>
		'''
	}
	
	override aside() {
		'''
		<aside>
			<ul class='nav nav-list'>
				<li class='nav-header'>type</li><li>«topic.target.eClass.link»</li>
				«FOR e: topic.ancestors BEFORE "<li class='divider'></li><li class='nav-header'>ancestors</li>"»<li>«e.link»</li>«ENDFOR»
				«FOR e: topic.topics  BEFORE "<li class='divider'></li><li class='nav-header'>children</li>"»<li>«e.link»</li>«ENDFOR»
				«FOR e: topic.see BEFORE "<li class='divider'></li><li class='nav-header'>see also</li>"»<li>«e.link»</li>«ENDFOR»
			</ul>
		</aside>
		'''
	}	
	
	def properties(EObject self) {
		val List<EClass> types = newArrayList()
		types.add(self.eClass)
		types.addAll(self.eClass.EAllSuperTypes)
		
		'''
		<section id="properties" class="properties">
			<h2>Properties</h2>
		<table class="table">
			<caption>Properties</caption>
			<thead>
				<tr><th scope="col">Class</th><th scope="col">Name</th><th scope="col">Value</th></tr>
			</thead>
			<tbody>
				«FOR t: types»
					«IF t.EStructuralFeatures.size != 0»
						«FOR f: t.EStructuralFeatures»
							<tr>
								«IF t.EStructuralFeatures.indexOf(f) == 0»
									<th scope="row" rowspan="«t.EStructuralFeatures.size»">«t.link»</th>
								«ENDIF»
								<th scope="row">«f.name.escape»</th>
								<td>«self.eGet(f).label»</td>
							</tr>
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
			</tbody>
			<tfoot>
			</tfoot>
		</table>
		</section>
		'''
	}
		
}