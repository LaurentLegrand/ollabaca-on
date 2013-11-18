package org.ollabaca.on.site.graph

import java.io.StringWriter
import java.util.List
import javax.json.Json
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Tag
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.renderers.ContentProvider
import org.ollabaca.on.site.renderers.Register
import org.ollabaca.on.site.renderers.Text

import static org.ollabaca.on.site.util.Sites.*

import static extension org.ollabaca.on.site.renderers.Renderers.*
import static extension org.ollabaca.on.site.util.Html.*

class GraphContentProvider implements ContentProvider {
	
	static val String TAB = "graph-tab"
	
	static val String INSTANCES = "graph-instances"
	
	static val String TYPES = "graph-types"
	

	override activate(Register register) {
		
		register.registerSiteRenderer(INSTANCES, [instancesToJSon]);	
		register.registerSiteRenderer(TYPES, [typesToJSon]);	
	}
	
	override onSite(Site self) {
		'''
		<style>
		.parentOf {
			stroke: red;
		  stroke-width: 1.5px;
		}
		
		.seeAlso {
			stroke: blue;
		  stroke-width: 1.5px;
		}
		
		.extends {
			stroke: green;
		  stroke-width: 1.5px;
		}
		</style>
		<script>
		$(document).ready(function() {
			$("#content").append("«tabs.escapeEcmaScript»");
			
			$('#«TAB» a').click(function (e) {
				e.preventDefault();
				$(this).tab('show');
			});
			
			myGraph("#«INSTANCES»", "«self.href(INSTANCES)»"); 
			myGraph("#«TYPES»", "«self.href(TYPES)»"); 
		});
		</script>
		'''
	}
	
	def String tabs() {
		'''
		<div class="tabbable">
			<ul id="«TAB»" class="nav nav-tabs">
				<li class="active"><a href="#«INSTANCES»" data-toggle="tab">Instances</a></li>
				<li><a href="#«TYPES»" data-toggle="tab">Types</a></li>
				
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="«INSTANCES»">
					<svg xmlns="http://www.w3.org/2000/svg">
						<defs>
							<marker id="end" refX="10" refY="5" markerUnits="userSpaceOnUse" markerWidth="10" markerHeight="10" orient="auto">
								<path d="M 0 10 L 10 5 L 0 0 L 0 10" fill="white" stroke="black" stroke-width="1"/>
							</marker>
						</defs>
					</svg>
				</div>
				<div class="tab-pane" id="«TYPES»">
					<svg xmlns="http://www.w3.org/2000/svg">
						<defs>
							<marker id="end" refX="10" refY="5" markerUnits="userSpaceOnUse" markerWidth="10" markerHeight="10" orient="auto">
								<path d="M 0 10 L 10 5 L 0 0 L 0 10" fill="white" stroke="black" stroke-width="1"/>
							</marker>
						</defs>
					</svg>
				</div>
			</div>
		</div>
    	'''
	}
	
	override onTopic(Topic self) {
		""
	}
	
	override onType(Site site, EClass type) {
		""
	}

	override onTag(Tag self) {
		""
	}
	
	
	
	def Text instancesToJSon(Site self) {
		return new Text("text/json", instances(self));
	}
	
	def Text typesToJSon(Site self) {
		return new Text("text/json", types(self));
	}
	
	def instances(Site self) {
		val List<Topic> nodes = newArrayList
		
		site.topics.filter[!anonymous].forEach[
			if (!nodes.contains(it)) {
				nodes.add(it)
			}
		]
		
		val out = new StringWriter
		val graph = Json::createGenerator(out)
		
		graph.writeStartObject
			.writeStartArray("nodes")
				nodes.forEach[
					graph.writeStartObject
						.write("href", it.href)
						.write("name", it.name)
						.write("title", it.title)
						.write("level", it.ancestors.size)
					.writeEnd
				]
			graph.writeEnd // end nodes
			
			.writeStartArray("links")
				nodes.forEach[parent |
					parent.topics.filter[!anonymous].forEach[ child |
						graph.writeStartObject
							.write("source", nodes.indexOf(parent))
							.write("target", nodes.indexOf(child))
							.write("type", "parentOf")
						.writeEnd
					]
					// see also links
					parent.see.forEach[ child |
						graph.writeStartObject
							.write("source", nodes.indexOf(parent))
							.write("target", nodes.indexOf(child))
							.write("type", "seeAlso")
						.writeEnd
					]
				]
			graph.writeEnd // end links
		graph.writeEnd.close
		return out.toString
		
	}
	
	def types(Site self) {
		val List<EClass> nodes = newArrayList
		site.topics.forEach[fill(nodes, it.target.eClass)]
		
		val out = new StringWriter
		val graph = Json::createGenerator(out)
		
		graph.writeStartObject
			.writeStartArray("nodes")
				nodes.forEach[
					graph.writeStartObject
						.write("href", it.href)
						.write("name", it.name)
						.write("title", it.name)
						.write("level", 1)
					.writeEnd		
				]
			graph.writeEnd // end nodes
			
			.writeStartArray("links")
			nodes.forEach[from | 
				from.ESuperTypes.forEach[ to |
					graph.writeStartObject
						.write("source", nodes.indexOf(from))
						.write("target", nodes.indexOf(to))
						.write("type", "extends")
					.writeEnd
				]
			]
			graph.writeEnd // end links
		graph.writeEnd.close
		return out.toString
	}
		
	def void fill(List<EClass> list, EClass self) {
		if (list.contains(self)) {
			return
		}
		
		list.add(self)
		self.EAllSuperTypes.forEach[fill(list, it)]
	}
	
	
}