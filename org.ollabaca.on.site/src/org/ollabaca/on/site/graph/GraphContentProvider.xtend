package org.ollabaca.on.site.graph

import org.ollabaca.on.site.renderers.ContentProvider
import org.eclipse.emf.ecore.EClass
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.ollabaca.on.site.renderers.Register

import static extension org.ollabaca.on.site.renderers.Renderers.*
import org.ollabaca.on.site.renderers.Text
import java.io.StringWriter
import java.util.List
import javax.json.Json

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
				</div>
				<div class="tab-pane" id="«TYPES»">
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