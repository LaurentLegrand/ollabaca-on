package org.ollabaca.on.site.servlets

import org.ollabaca.on.site.Element
import org.ollabaca.on.site.util.Component

class Page {

	public static val Page instance = new Page()
	
	public static val Component head = new Component("head", #{ "lang" -> "en" }, [it.head_Element])
	
	public static val Component body = new Component("body", #{ "lang" -> "en" }, [it.body_Element])
	
	public static val Component header = new Component("header", #{ "class" -> "" }, [it.header_Element])
	
	public static val Component breadcrumb = new Breadcrumb()

	public static val Component aside = new Aside()

	public static val Article article = new Article()

	public static val Component footer = new Component("footer", #{ "class" -> "footer" }, [it.footer_Element])
	
	static def page_Element(Element object) '''
		<!DOCTYPE html>
		<html lang="en">
			«head.transform(object)»
			«body.transform(object)»
		</html>
	'''
	
	static def head_Element(Element object) '''
		<title>«Title::title_Element(object)»</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<meta name="author" content="">
		<link href="/site/assets/bootstrap/css/bootstrap.css" rel="stylesheet">
		<link href="/site/assets/site.css" rel="stylesheet">
		
		<style type="text/css">

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
	'''


	static def CharSequence body_Element(Element object) '''
		«header.transform(object)»
		
		<div class="container">
			<div class='row'>
				<div class="col-md-3 well">
					«aside.transform(object)»
				</div>
				<div id="content" class="col-md-9">
					«breadcrumb.transform(object)»
					«article.transform(object)»
					«Properties::properties_Element(object)»
				</div>
			</div>
		</div>

		«footer.transform(object)»
	'''

	static def CharSequence header_Element(Element object) '''
		<nav class="navbar navbar-inverse navbar-static-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/site">Home</a>
			</div>
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-5">
				<p class="navbar-text navbar-right">Signed in as <a href="#" class="navbar-link">...</a></p>
			</div>
		</nav>
	'''
	
	static def CharSequence footer_Element(Element object) '''
	'''

}
