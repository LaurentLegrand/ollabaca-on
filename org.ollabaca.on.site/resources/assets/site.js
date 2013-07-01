function myGraph(div, url) {
	
	width = 960;
	height = 500;

	var color = d3.scale.category20();

	var force = d3.layout.force()
					.charge(-500)
					.linkDistance(200)
					.size([width, height]);
	
	var svg = d3.select(div).select("svg")
				// .attr("width", "100%")
				.attr("height", height);
	
	var SIZE=16
	
	d3.json(url, function(error, graph) {
	    
			force
				.nodes(graph.nodes)
				.links(graph.links)
				.start();
	
			var link = svg.selectAll("line")
				.data(graph.links).enter()
					.append("line")
					.attr("marker-end", "url(#end)")
					.attr("class", function(d) { return d.type; });
	      // .style("stroke-width", function(d) { return
			// Math.sqrt(d.value); });
	
//			var node = svg.selectAll(".node")
//				.data(graph.nodes).enter()
//			.append("rect")
//				.attr("x", 0)
//				.attr("y", 0)
//				.attr("width", SIZE)
//				.attr("height", SIZE)
//				.attr("class", "node")
//				.style("fill", "green")
//				.attr("onload", function(d) {
//					d.element = this;
//				})
//				.call(force.drag);
			var node = svg.selectAll(".node")
			.data(graph.nodes).enter()
				.append("svg")
				.attr("width", 5)
				.attr("height", 5)
				.attr("class", "node")
				.style("fill", "orange")
				.style("opacity", 0.5)
				.attr("onload", function(d) {
					d.element = this;
				})
			.call(force.drag);
			
			
//	  // text(function(d) { return d.name; })//.attr("class", "node")
//	// .append("circle").attr("class", "node").attr("r", 5)
//					.style("fill", function(d) { return color(d.level); })
	  
//			node.append("circle")
//				.attr("r", 4);

			
			node.append("foreignObject").attr("height","100%").attr("width","100%")
//			.append("xhtml:body")
//				.style("color", "black")
//				 .style("font", "14px 'Helvetica Neue'")
				.append("xhtml:div")
				.attr("class", "foreign")
				.html(function(d) { return "<a class='btn btn-primary' href='" + d.href + "'>" + d.title + "</a>" })
				;
			
//			node.append("rect")
//				.attr("x", 0)
//				.attr("x", 0)
//				.attr("width", "100%")
//				.attr("height", "100%");
//				.attr("class", "node")
//				.style("fill", "green");

//			node.append("circle")
//				.attr("r", 10);
				//.attr("height", 10);
//			node.append("a")
//				.attr("xlink:href", function(d) { return d.href })
//				.append("text")
//					.attr("x", "50%")
//					.attr("y", "50%")
//					.style("baseline-shift", "-33%")
//					.style("text-anchor", "middle")
//					.style("stroke", "blue")
//					.text(function(d) { return d.title; });
//	  
//			node.append("title")
//				.text(function(d) { return d.title; });
	
			force.on("tick", function() {
				
				$(".foreign").each(function() {
					var self = this;
					$(this).parents("svg").first().attr("width", self.scrollWidth).attr("height", self.scrollHeight);
				});
				link.attr("x1", function(d) {
					var source = d.source.element.getBBox();
					var target = d.target.element.getBBox();
					var p = anchor(
							{
								 x: d.source.x + source.x,
								 y: d.source.y + source.y,
								 width: source.width,
								 height: source.height
							 }, 
							{
								 x: d.target.x + target.x + target.width / 2, 
								 y: d.target.y + target.y + target.height / 2
							}
						);
						return p.x;
					})
					.attr("y1", function(d) { 
						var source = d.source.element.getBBox();
						var target = d.target.element.getBBox();
						var p = anchor(
								{
									 x: d.source.x + source.x,
									 y: d.source.y + source.y,
									 width: source.width,
									 height: source.height
								 }, 
								{
									 x: d.target.x + target.x + target.width / 2, 
									 y: d.target.y + target.y + target.height / 2
								}
							);
						return p.y;
					})
					.attr("x2", function(d) {
						var source = d.source.element.getBBox();
						var target = d.target.element.getBBox();
						var p = anchor(
								{
									 x: d.target.x + target.x,
									 y: d.target.y + target.y,
									 width: target.width,
									 height: target.height
								 }, 
								{
									 x: d.source.x + source.x + source.width / 2, 
									 y: d.source.y + source.y + source.height / 2
								}
							);
						return p.x;
					})
					.attr("y2", function(d) { 
						var source = d.source.element.getBBox();
						var target = d.target.element.getBBox();
						var p = anchor(
								{
									 x: d.target.x + target.x,
									 y: d.target.y + target.y,
									 width: target.width,
									 height: target.height
								 }, 
								{
									 x: d.source.x + source.x + source.width / 2, 
									 y: d.source.y + source.y + source.height / 2
								}
							);
						return p.y;
					});
	
	// node.attr("cx", function(d) { return d.x; })
	// .attr("cy", function(d) { return d.y; });
	 node.attr("x", function(d) { return d.x; })
	 .attr("y", function(d) { return d.y; });
//				node.attr("transform", function(d) { return "translate(" + d.x + "," + d.y + ")"; });
			});
	});
	
};

function anchor(source, target) {
	
	if ((typeof source === 'undefined') || (typeof target === 'undefined')) {
//		console.log("SRC:" + src);
//		console.log("DEST:" + dest);
		return { x:0, y:0 };
	}
	
	var width = source.width / 2;
	var height = source.height / 2;
	
	// center x & y
	var cx = source.x + width;
	var cy = source.y + height;
	
	var angle = Math.atan2(target.y - cy, target.x - cx);
	
	var radius = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

	var cos = Math.cos(angle);
	var sin = Math.sin(angle);
	
	var out = {};
	var offsetx = Math.abs(cos * radius);
	var offsety = Math.abs(sin * radius);
	
	if (offsetx > width) {
		offsety = offsety * width / offsetx;
		offsetx = width;
	} else if (offsety > height) {
		offsetx = offsetx * height / offsety;
		offsety = height;
	}
	out.x = cx + signum(cos) * offsetx;
	out.y = cy + signum(sin) * offsety;
//	out.x = cx + signum(cos) * (Math.min(Math.abs(cos * radius), width));
//	out.y = cy + signum(sin) * (Math.min(Math.abs(sin * radius), height));
//	out.x = cx + cos * radius;
//	out.y = cy + sin * radius;
	
	return out;
}

function signum(num) {
	if (num == 0) {
		return 0;
	}
	if (num > 0) {
		return 1;
	}
	return -1;	
}