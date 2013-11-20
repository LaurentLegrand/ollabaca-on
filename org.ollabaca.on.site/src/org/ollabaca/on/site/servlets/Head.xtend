package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.util.Template

class Head extends Template<Element> {

	public static val Head instance = new Head()

	static def head_Element(Element self) {
		instance.apply(self)
	}

	override def CharSequence doFallback(Element self) '''
		<head>
			<title>«Title::title_Element(self)»</title>
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<meta name="description" content="">
			<meta name="author" content="">
			<link href="/site/assets/bootstrap/css/bootstrap.css" rel="stylesheet">
			<style type="text/css">
				body {
					padding-top: 60px;
					padding-bottom: 40px;
				}
				.sidebar-nav {
					padding: 9px 0;
				}
		
				@media (max-width: 980px) {
			/* Enable use of floated navbar text */
			.navbar-text.pull-right {
			float: none;
			padding-left: 5px;
			padding-right: 5px;
			}
			}
			.parentOf {
				stroke: red;
				 stroke-width: 1.5px;
			}
			
			.seeAlso {
				stroke: blue;
				 stroke-width: 1.5px;
			}
			
			.node {
				backgroud-color: green;
			}
		
		</style>
			<link href="/site/assets/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
			<script src="/site/assets/jquery/jquery-2.0.2.min.js"></script>
			<script src="/site/assets/bootstrap/js/bootstrap.js"></script>
			<script src="/site/assets/d3js/d3.v3.min.js"></script>
			<script src="/site/assets/d3js/parsets/d3.parsets.js"></script>
			<script src="/site/assets/site.js"></script>
			<script>
				$(document).ready(function() {
					$("table").wrap("<div class='table' style='overflow: auto;'/>");
				});
				
			</script>
			
			«OnLoad::onLoad_Element(self)»
			
		</head>
	'''
}