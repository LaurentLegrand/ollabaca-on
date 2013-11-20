package org.ollabaca.on.uml.util

import org.eclipse.uml2.uml.DeployedArtifact
import org.eclipse.uml2.uml.Deployment
import org.eclipse.uml2.uml.DeploymentSpecification
import org.eclipse.uml2.uml.Node
import org.eclipse.uml2.uml.Property
import org.ollabaca.on.uml.book.Environment

import static extension org.ollabaca.on.site.servlets.Link.*
import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*

class Environments {

	static def CharSequence table_Environment_Nodes(Environment self) {
		table(
			self.eAllContents.filter(typeof(Node)).toIterable, 
			#[],
			#[
				column("Name", [Node it | it.name]),
				column("Attributes", [Node it | dl(it.attributes, [Property it | it.notation_Object], [Property it | it.documentation_EObject])]),
				column("Deployed Elements", [Node it | ul(it.deployedElements, [it.link_EObject])]), // TODO local link!
				column("Comment", [Node it | it.documentation_EObject])
			]
		)	
	}
	
	static def CharSequence table_Environment_Deployments(Environment self) {
		table(
			self.eAllContents.filter(typeof(Deployment)).toIterable, 
			#[], 
			#[
				column("Location", [Deployment it | it.location.name]),
				column("Deployed Artifacts", [Deployment it | ul(it.deployedArtifacts, [DeployedArtifact it | it.link_EObject])]), // TODO local link!
				column("Configuration", [Deployment it | ul(it.configurations, [DeploymentSpecification it | '''
					<li>
						<dl>
							<dt>Deployment Location</dt>
							<dd><code>«it.deploymentLocation»</code></dd>
							<dt>Execution Location</dt>
							<dd><code>«it.executionLocation»</code></dd>
						</dl>
					</li>
				'''])])
			]
		)
	}
}
