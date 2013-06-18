package org.ollabaca.on.site.servlets

import java.io.StringWriter
import java.util.List
import javax.json.Json
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic

class EPackageToJSon {
	
	val Site site
	
	new(Site site) {
		this.site = site
	}
	
	def render() {
		val out = new StringWriter
		
		val List<Topic> topics = newArrayList
		
		site.topics.filter[!anonymous].forEach[
			if (!topics.contains(it)) {
				topics.add(it)
			}
		]
		
		val graph = Json::createGenerator(out)
		
		graph.writeStartObject
			.writeStartArray("nodes")
				topics.forEach[
					graph.writeStartObject
						.write("name", it.name)
						.write("title", it.title)
						.write("level", it.ancestors.size)
					.writeEnd
				]
			graph.writeEnd // end nodes
			.writeStartArray("links")

				topics.forEach[parent |
					parent.topics.filter[!anonymous].forEach[ child |
						graph.writeStartObject
							.write("source", topics.indexOf(parent))
							.write("target", topics.indexOf(child))
							.write("type", "parentOf")
						.writeEnd
					]
					// see also links
					parent.see.forEach[ child |
						graph.writeStartObject
							.write("source", topics.indexOf(parent))
							.write("target", topics.indexOf(child))
							.write("type", "seeAlso")
						.writeEnd
					]
				]
			graph.writeEnd // end links
		graph.writeEnd.close
		return out.toString
	}
	
}