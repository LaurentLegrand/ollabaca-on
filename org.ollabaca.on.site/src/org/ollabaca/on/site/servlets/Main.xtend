package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.util.Template
import org.eclipse.emf.ecore.EObject
import org.eclipse.core.resources.ResourcesPlugin
import org.ollabaca.on.site.Tag

import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.util.Sites
import java.util.List
import org.eclipse.emf.ecore.EClass
import java.util.Set

class Main extends Template<EObject> {

	public static val Main instance = new Main()

	static def main_EObject(EObject self) {
		instance.apply(self)
	}

	dispatch def CharSequence doFallback(Tag self) '''
		<nav>
		«ul(self.topics, #[], content([it.link]))»
		</nav>
	'''

	dispatch def CharSequence doFallback(Topic self) '''
		<!-- breadcumb -->
		<ul class="breadcrumb">
			<li>«Sites::site.link» <span class="divider">/</span></li>
			«FOR e: self.ancestors»
				<li>«e.link» <span class="divider">/</span></li>
			«ENDFOR»
			<li class="active">«self.title.html»</li>
		</ul>
		
		<article class="instance «self.target.eClass.name»">
			<a id="«self.name»"></a>
			<h1>«self.title.html»</h1>
			
			
				<section class="main">
					<section class="abstract">
						«self.^abstract.html»
					</section>
					<section class="documentation">
						«self.documentation.html»
					</section>
				</section>
«««				«renderer.section(topic)»
		</article>
		
		«self.target.properties»
	'''

	dispatch def CharSequence doFallback(EObject self) ''''''

	dispatch def CharSequence doFallback(Void self) '''
		<div class="row-fluid">
			«FOR e : ResourcesPlugin::workspace.root.projects.filter[getFile("src-gen/instances.xmi").exists]»
				<p><a href="/site/pages/«e.name»">«e.name»</a></p>
			«ENDFOR»
		</div>
	'''

 	dispatch def CharSequence doFallback(EClass self) {
		val Set<EObject> instances = newHashSet()
		val Set<EClass> types = newHashSet()
		val type = self
		Sites::site.topics.map[target].filter[it.eClass == type].forEach[
			instances.add(it)
			types.add(it.eClass)
			types.addAll(it.eClass.EAllSuperTypes)
		]
		
		'''
		<article class="type">
			<a id="eClass:«self.name»"></a>
			<h1>«self.name»</h1>
			
			<h2>instances</h2>
			<table>
				<thead>
					<tr>
						<th><!-- topic id --></th>
					«FOR t: types»
						«IF t.EStructuralFeatures.size != 0»
						<th colspan="«t.EStructuralFeatures.size»">«t.name»</th>
						«ENDIF»
					«ENDFOR»
					</tr>
					<tr>
						<th><!-- topic id --></th>
					«FOR t: types»
						«FOR f: t.EStructuralFeatures»
							<th>«f.name.escape»</th>
						«ENDFOR»
					«ENDFOR»
					</tr>
				</thead>
				<tbody>
					«FOR i: instances»
						<tr>
						<td>
						«var topic = Sites::site.getTopic(i)»
						«IF topic != null»
							«topic.link»
						«ELSE»
							<!-- -->
						«ENDIF»
						</td>
						«FOR t: types»
							«FOR f: t.EStructuralFeatures »
								<td>«(i as EObject).eGet(f).notation_Object»</td>
							«ENDFOR»
						«ENDFOR»
						</tr>
					«ENDFOR»
				</tbody>
				<tfoot>
				</tfoot>
			</table>
		</article>
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
								<td>«self.eGet(f).notation_Object»</td>
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
