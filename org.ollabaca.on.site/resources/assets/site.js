function myGraph(div, url) {
	
	width = 960;
	height = 500;

	var color = d3.scale.category20();

	var force = d3.layout.force()
					.charge(-500)
					.linkDistance(30)
					.size([width, height]);
	
	var svg = d3.select(div).append("svg")
				// .attr("width", "100%")
				.attr("height", height);
	
	d3.json(url, function(error, graph) {
	    
			force
				.nodes(graph.nodes)
				.links(graph.links)
				.start();
	
			var link = svg.selectAll("line")
				.data(graph.links).enter()
					.append("line")
					.attr("class", function(d) { return d.type; });
	      // .style("stroke-width", function(d) { return
			// Math.sqrt(d.value); });
	
			var node = svg.selectAll(".node")
				.data(graph.nodes).enter()
					.append("g").attr("class", "node")
	  // text(function(d) { return d.name; })//.attr("class", "node")
	// .append("circle").attr("class", "node").attr("r", 5)
					.style("fill", function(d) { return color(d.level); })
					.call(force.drag);
	  
			node.append("circle")
				.attr("r", 5);
	
			node.append("a")
				.attr("xlink:href", function(d) { return d.href })
				.append("text")
					.attr("x", 8)
					.attr("y", ".31em")
		// .attr("class", "shadow")
					.text(function(d) { return d.title; });
	  
			node.append("title")
				.text(function(d) { return d.title; });
	
			force.on("tick", function() {
				link.attr("x1", function(d) { return d.source.x; })
					.attr("y1", function(d) { return d.source.y; })
					.attr("x2", function(d) { return d.target.x; })
					.attr("y2", function(d) { return d.target.y; });
	
	// node.attr("cx", function(d) { return d.x; })
	// .attr("cy", function(d) { return d.y; });
	// node.attr("x", function(d) { return d.x; })
	// .attr("y", function(d) { return d.y; });
				node.attr("transform", function(d) { return "translate(" + d.x + "," + d.y + ")"; });
			});
	});
	
};
