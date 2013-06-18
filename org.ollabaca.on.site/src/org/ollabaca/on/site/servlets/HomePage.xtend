package org.ollabaca.on.site.servlets

import org.eclipse.core.resources.ResourcesPlugin

class HomePage extends Page {
	
	new() {
		
	}
	
	override content() {
		'''
		<div class="row-fluid">
			«FOR e: ResourcesPlugin::workspace.root.projects.filter[getFile("src-gen/instances.xmi").exists]»
			<p><a href="/site/pages/«e.name»">«e.name»</a></p>
			«ENDFOR»
		</div>
		'''
	}

}