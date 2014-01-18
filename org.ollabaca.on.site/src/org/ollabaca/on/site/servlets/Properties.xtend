package org.ollabaca.on.site.servlets

import java.util.List
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.util.Component

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class Properties extends Component {

	new() {
		super("div", #{ "class" -> "properties"}, null)
	}
	
	public static val Properties instance = new Properties()

	static def properties_Element(Element object) {
		instance.transform(object)
	}

	dispatch def CharSequence content_Element(Topic object) {
		val List<EClass> types = newArrayList()
		types.add(object.target.eClass)
		types.addAll(object.target.eClass.EAllSuperTypes)
		
		'''
		<table class="table table-condensed">
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
									<th scope="row" rowspan="«t.EStructuralFeatures.size»">«t.link_EObject»</th>
								«ENDIF»
								<th scope="row">«f.name.escape»</th>
								<td>«object.target.eGet(f).notation_Object»</td>
							</tr>
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
			</tbody>
			<tfoot>
			</tfoot>
		</table>
		'''
	}

	dispatch def CharSequence content_Element(Element object) ''''''

	dispatch def CharSequence content_Element(Void object) ''''''

}
