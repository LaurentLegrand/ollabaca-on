package org.ollabaca.on.site.servlets

import java.util.List
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.Element
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.util.HTag

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class Properties extends HTag {

	new() {
		super("div", #{ "class" -> "properties"}, null)
	}
	
	public static val Properties instance = new Properties()

	static def properties_Element(Element self) {
		instance.transform(self)
	}

	dispatch def CharSequence content_Element(Topic self) {
		val List<EClass> types = newArrayList()
		types.add(self.target.eClass)
		types.addAll(self.target.eClass.EAllSuperTypes)
		
		'''
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
									<th scope="row" rowspan="«t.EStructuralFeatures.size»">«t.link_EObject»</th>
								«ENDIF»
								<th scope="row">«f.name.escape»</th>
								<td>«self.target.eGet(f).notation_Object»</td>
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

	dispatch def CharSequence content_Element(Element self) ''''''

	dispatch def CharSequence content_Element(Void self) ''''''

}
