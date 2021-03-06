package org.ollabaca.on.site.servlets

import java.util.Set
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.Type
import org.ollabaca.on.site.Workspace
import org.ollabaca.on.site.util.Component
import org.ollabaca.on.site.util.Sites

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*
import org.ollabaca.on.site.util.Levels

class Article extends Component {
	
	new() {
		super("article", #{}, null)
	}

	dispatch def CharSequence content_Element(Topic object) '''
		�val level = Levels::start�
		<a id="�object.name�"></a>
		<h�level�>�object.title.html�</h�level�>
		
		<section class="abstract">
			�object.^abstract.html�
		</section>
		<section class="documentation">
			�object.documentation.html�
		</section>
		
		<div class="features">
			�Features::features_EObject(object.target)�
		</div>
		<!-- �Levels::end� -->
	'''
	
	def dispatch CharSequence content_Element(Element object) ''''''

 	def dispatch CharSequence content_Element(Type object) {
		val Set<EObject> instances = newHashSet()
		val Set<EClass> types = newHashSet()
		instances.addAll(object.topics.map[target])
		
		val eClass = object.topics.head.target.eClass
		types.add(eClass)
		types.addAll(eClass.EAllSuperTypes)
		
		'''
		<a id="eClass:�object.name�"></a>
		<h1>�object.name�</h1>
		
		<h2>instances</h2>
		<table class="table table-condensed">
			<thead>
				<tr>
					<th><!-- topic id --></th>
				�FOR t: types�
					�IF t.EStructuralFeatures.size != 0�
					<th colspan="�t.EStructuralFeatures.size�">�t.name�</th>
					�ENDIF�
				�ENDFOR�
				</tr>
				<tr>
					<th><!-- topic id --></th>
				�FOR t: types�
					�FOR f: t.EStructuralFeatures�
						<th>�f.name.escape�</th>
					�ENDFOR�
				�ENDFOR�
				</tr>
			</thead>
			<tbody>
				�FOR i: instances�
					<tr>
					<td>
					�var topic = Sites::site.getTopic(i)�
					�IF topic != null�
						�topic.link_EObject�
					�ELSE�
						<!-- -->
					�ENDIF�
					</td>
					�FOR t: types�
						�FOR f: t.EStructuralFeatures �
							<td>�(i as EObject).eGet(f).notation_Object�</td>
						�ENDFOR�
					�ENDFOR�
					</tr>
				�ENDFOR�
			</tbody>
			<tfoot>
			</tfoot>
		</table>
		'''
	}

	dispatch def CharSequence content_Element(Workspace object) '''
		<div class="row">
			�FOR e : ResourcesPlugin::workspace.root.projects.filter[getFile("src-gen/instances.xmi").exists]�
				<p><a href="/site/pages/�e.name�">�e.name�</a></p>
			�ENDFOR�
		</div>
	'''
}
