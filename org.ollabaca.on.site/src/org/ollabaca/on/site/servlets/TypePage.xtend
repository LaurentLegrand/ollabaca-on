package org.ollabaca.on.site.servlets

import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site

class TypePage extends SitePage {
	
	val String type
	
	new(Site site, String type) {
		super(site)
		this.type = type
	}
	
	override title() {
		site.name + ":" + type
	}
	
	override aside() {
		'''
		<aside>
			<ul class='nav nav-list'>
				<li class='nav-header'>name</li><li>«type.substring(type.lastIndexOf(".") + 1)»</li>
«««				«FOR e: topic.ancestors BEFORE "<li class='divider'></li><li class='nav-header'>ancestors</li>"»<li>«e.link»</li>«ENDFOR»
«««				«FOR e: topic.topics  BEFORE "<li class='divider'></li><li class='nav-header'>children</li>"»<li>«e.link»</li>«ENDFOR»
«««				«FOR e: topic.see BEFORE "<li class='divider'></li><li class='nav-header'>see also</li>"»<li>«e.link»</li>«ENDFOR»
			</ul>
		</aside>
		'''
	}
	
	override content() {
		'''
		<div class='row-fluid'>
			<div class="span12">
				«table»
			</div>
		</div>
		'''
	}
	
	def table() {
		
		val Set<EObject> instances = newHashSet()
		val Set<EClass> types = newHashSet()
		site.topics.map[target].filter[it.eClass.instanceClassName.equals(type)].forEach[instances.add(it) types.add(it.eClass) types.addAll(it.eClass.EAllSuperTypes)]
		
		'''
		<article class="type">
			<a id="eClass:«type»"></a>
			<h1>«type»</h1>
			
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
						«var topic = site.getTopic(i)»
						«IF topic != null»
							«topic.link»
						«ELSE»
							<!-- -->
						«ENDIF»
						</td>
						«FOR t: types»
							«FOR f: t.EStructuralFeatures »
								<td>«(i as EObject).eGet(f).print»</td>
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
		
}