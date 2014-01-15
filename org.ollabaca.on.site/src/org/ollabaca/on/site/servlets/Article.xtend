package org.ollabaca.on.site.servlets

import java.util.Set
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.Workspace
import org.ollabaca.on.site.util.HTag
import org.ollabaca.on.site.util.Sites

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class Article extends HTag {
	
	new() {
		super("article", #{}, null)
	}

	dispatch def CharSequence content_Element(Topic self) '''
		<a id="«self.name»"></a>
		<h1>«self.title.html»</h1>
		
		<section class="abstract">
			«self.^abstract.html»
		</section>
		<section class="documentation">
			«self.documentation.html»
		</section>
	'''
	
	def dispatch CharSequence content_Element(Element self) ''''''

 	def dispatch CharSequence content_Element(Type self) {
		val Set<EObject> instances = newHashSet()
		val Set<EClass> types = newHashSet()
		instances.addAll(self.topics.map[target])
		
		val eClass = self.topics.head.target.eClass
		types.add(eClass)
		types.addAll(eClass.EAllSuperTypes)
		
		'''
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
						«topic.link_EObject»
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
		'''
	}

	dispatch def CharSequence content_Element(Workspace self) '''
		<div class="row-fluid">
			«FOR e : ResourcesPlugin::workspace.root.projects.filter[getFile("src-gen/instances.xmi").exists]»
				<p><a href="/site/pages/«e.name»">«e.name»</a></p>
			«ENDFOR»
		</div>
	'''
}
