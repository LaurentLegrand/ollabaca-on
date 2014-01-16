package org.ollabaca.on.mm.uml

import org.eclipse.uml2.uml.Element
import org.ollabaca.on.site.util.Levels

class Layout_Element {
	
	static def <E extends Element> CharSequence layout_Element(String id, String title, E self, (E) => CharSequence body, (E) => CharSequence subsection) '''
		«val level = Levels::start»
		<section id="«id»" class="level-«level» «self.eClass.name»">
			<div class="row-fluid">
				<div class="span2">
					<h«level» class="marker text-right">&nbsp;</h«level»>
				</div>
				<div class="span10">
					<h«level»>«title»</h«level»>
					«IF body != null»
						«body.apply(self)»
					«ENDIF»
				</div>
			</div>
			«IF subsection != null»
				«subsection.apply(self)»
			«ENDIF»
		</section>
		<!-- «Levels::end» -->
	'''	
	
}