package org.ollabaca.on.site.servlets

import org.pegdown.PegDownProcessor
import org.pegdown.Extensions

class Page {
		
	public val processor = new PegDownProcessor(Extensions::WIKILINKS)
	
	def title() {
		"site"
	}
	
	def head() {
		'''
		<head>
«««    <meta charset="utf-8">
			<title>«title»</title>
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
}			</style>
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
			«onLoad»
			
		</head>
		'''
	}
	
	def onLoad() {
		""
	}
	
	def render() {
		'''
		<!DOCTYPE html>
		<html lang="en">
			«head»
			<body>
				<div class="navbar navbar-inverse navbar-fixed-top">
					<div class="navbar-inner">
						<div class="container-fluid">
							<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							<a class="brand" href="/site">Home</a>
							<div class="nav-collapse collapse">
								<p class="navbar-text pull-right">
									Logged in as <a href="#" class="navbar-link">Username</a>
								</p>
								<ul class="nav">
«««									<li class="active"><a href="#">Home</a></li>
									<li><a href="#about">About</a></li>
									<li><a href="#contact">Contact</a></li>
								</ul>
							</div><!--/.nav-collapse -->
						</div>
					</div>
				</div>

				<div class="container-fluid">
					<div class='row-fluid'>
						<div class="span3 well">
							«aside»
						</div>
						<div id="content" class="span9">
							«content»
						</div>
					</div>
				</div>
			</body>
		</html>
		'''
	}
	
	def aside() { }
	
	def content() {}
	
}