package org.ollabaca.on.site.tools

import java.text.SimpleDateFormat
import java.util.Date
import java.util.List
import java.util.Set
import org.apache.commons.lang3.StringEscapeUtils
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.ollabaca.on.site.Site
import org.ollabaca.on.site.Topic
import org.pegdown.Extensions
import org.pegdown.LinkRenderer
import org.pegdown.PegDownProcessor

class SiteToHtml {
	
	public val Site site
	
	val processor = new PegDownProcessor(Extensions::WIKILINKS)
	
	val LinkRenderer linkRenderer
	
	var Set<ObjectRenderer> renderers// = newHashSet()
	
	
	new(Site site) {
		this.site = site
		linkRenderer = new SiteLinkRenderer(this.site)
		this.renderers = renderers
	}
	
	def html(Set<ObjectRenderer> renderers) {
		this.renderers = renderers
		
		val List<Topic> topics = newArrayList()
		val Set<EClass> types = newHashSet()
		
		site.topics.filter[!anonymous].forEach[{topics.add(it)  types.add(it.target.eClass)}]
		 
		'''
		<!DOCTYPE html>
		<html>
			<head>
				<title>«site.name»</title>
		<link rel="stylesheet" type="text/css" href="http://twitter.github.io/bootstrap/assets/css/bootstrap.css"/>

		<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
		<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
		<script src="http://twitter.github.io/bootstrap/assets/js/bootstrap.js"></script>


		<script>
			$(document).ready(function() {

				//$("body > *").not("header").not("footer").wrapAll("<div class='row-fluid'></div>");
				$("body > header").wrap("<div class='row-fluid'><div class='span12'></div></div>");
				$("body > footer").wrap("<div class='row-fluid'><div class='span12'></div></div>");
				$("body > *").wrapAll("<div class='container-fluid'></div>");

				$("nav").wrap("<div class='row-fluid'><div class='span12'></div></div>");
				//$("article").wrap("<div class='row-fluid'></div>");


				$("article > h1").wrap("<div class='row-fluid'><div class='span12 page-header'></div>");
					$("article aside").addClass("span3");
				$('article').each(function() {
					$(this).find('section').wrapAll("<div class='span9'></div>");
				});
				$('article').each(function() {
					$(this).find('.span3, .span9').wrapAll("<div class='row-fluid'></div>");
				});

//				$("article > section").wrapAll("<div class='span9'></div>");
//
//				$("article > *").not("h1").not("a").wrapAll("<div class='row-fluid'></div>");


				$(".breadcrumb").removeClass("breadcrumb");
				$("table").wrap("<div class='table' style='overflow: auto;'/>");
					$(".abstract").addClass("lead");

					$("article aside").addClass("well");

					// replace dl per ul
//					$("article aside dl").wrap("<ul class='nav nav-list'></ul>");
//					$("article aside dt").unwrap();
//					$("article aside dt").wrap("<li class='nav-header'></li>");
//					$("article aside dt:first-child").unwrap();
//					$("article aside dd").wrap("<li></li>");
//					$("article aside dd:first-child").unwrap();
//					$("article aside ul").addClass("nav nav-list");


//					$("article aside ul").addClass("breadcrumb");
//					$("article aside dl").addClass("dl-horizontal");
//				$(".type table").addClass("table-bordered");
//				$(".breadcrumb li").not(":last-child").append("<span class='divider'>/</span>");

				$(".nav-header").before("<li class='divider'></li>");

				$("table ul").addClass("inline")
				$("table li").not(":last-child").append("<span class='divider'>,</span>");
$("nav").addClass("well");
$("nav ul").addClass("nav nav-list");

				$(".properties > h1").nextAll().hide();
				$(".properties > h1").click(function() {
					$(this).nextAll().toggle('slow', function() {
						// Animation complete.
						});
					});

				});

			</script>
				
			</head>
			<body>
				<header>
					<h1>«site.name»</h1>
				</header>
				«nav»
«««				<div id=instances>
				«FOR e: topics.sortBy[name]»
					«e.article»
				«ENDFOR»
«««				</div>
«««				<div id=types>
«««				«FOR t: types BEFORE '<div>' AFTER '</div>'»
				«FOR t: types.sortBy[name]»
					«t.article(site.eResource.allContents.filter(t.instanceClass).filter(typeof(EObject)).toList)»
				«ENDFOR»
«««				</div>
				<footer>
					<p>«new SimpleDateFormat().format(new Date)»</p>
				</footer>
			</body>
		</html>
		'''
	}
	
	def nav() {
		'''
		<nav class="instance-tree">
		«FOR e: site.roots.sortBy[name] BEFORE "<ul>" AFTER "</ul>"»
			«nav(e)»
		«ENDFOR»
		</nav>
		'''
	}
	
	def nav(Topic self) {
		'''
		<li>
			«self.link»
			«FOR e: self.topics.filter[!anonymous].sortBy[name] BEFORE "<ul>" AFTER "</ul>"»
				«e.nav»
			«ENDFOR»
		</li>
		'''
	}
	
	def html(String self) {
		processor.markdownToHtml(self, linkRenderer)
	}
	
	def article(Topic self) {
		'''
		<article class="instance «self.target.eClass.name»">
			<a id="«self.name»"></a>
			<h1>«self.title»</h1>
			«self.aside»
			
				<section class="main">
					<section class="abstract">
						«self.^abstract.html»
					</section>
					<section class="documentation">
						«self.documentation.html»
					</section>
				</section>
				«FOR e:renderers»
					«e.section(self.target)»
				«ENDFOR»
				«self.target.properties»
		</article>
		'''
	}
	
	def aside(Topic self) {
		'''
		<aside>
«««			<dl>
«««				<dt>path</dt>
«««				<dd><ul class="breadcrumb">«FOR e: self.ancestors»<li><a href="#«e.name»">«e.title»</a></li>«ENDFOR»<li>«self.title»</li></ul></dd>
«««				<dt>type</dt>
«««				<dd><a href="#eClass:«self.target.eClass.name»">«self.target.eClass.name»</a></dd>
«««				«FOR e: self.topics BEFORE "<dt>children</dt><dd><ul>" AFTER "</ul></dd>"»<li><a href="#«e.name»">«e.title»</a></li>«ENDFOR»
«««				«FOR e: self.see BEFORE "<dt>see also</dt><dd><ul>" AFTER "</ul></dd>"»<li><a href="#«e.name»">«e.title»</a></li>«ENDFOR»
«««			</dl>
			<ul class='nav nav-list'>
				<li class='nav-header'>type</li><li><a href="#eClass:«self.target.eClass.name»">«self.target.eClass.name»</a></li>
				«FOR e: self.ancestors BEFORE "<li class='nav-header'>ancestors</li>"»<li><a href="#«e.name»">«e.title»</a></li>«ENDFOR»
				«FOR e: self.topics  BEFORE "<li class='nav-header'>children</li>"»<li><a href="#«e.name»">«e.title»</a></li>«ENDFOR»
				«FOR e: self.see BEFORE "<li class='nav-header'>see also</li>"»<li><a href="#«e.name»">«e.title»</a></li>«ENDFOR»
			</ul>
		</aside>
		'''
	}
	
	def escape(String self) {
		StringEscapeUtils::escapeHtml4(self)
	}
	
	def getTopicTitle(EObject self, String name) {
		var Topic t = self.eResource.allContents.filter(typeof(Topic)).findFirst([Topic t | t.name == name])
		if (t == null) {
			return "topic not found: " + name 
		} else {
			return t.title
		}
	}
	
	def topic(EObject self) {
		site.getTopic(self)
	}
	
	def properties(EObject self) {
		val List<EClass> types = newArrayList()
		types.add(self.eClass)
		types.addAll(self.eClass.EAllSuperTypes)
		
		
		'''
		<section class="properties">
			<h1>Properties</h1>
		<table>
			<caption>Properties</caption>
			<thead>
				<tr><th scope="col">Class</th><th scope="col">Name</th><th scope="col">Value</th></tr>
			</thead>
			<tbody>
				«FOR t: types»
					«IF t.EStructuralFeatures.size != 0»
						«FOR f: t.EStructuralFeatures»
							<tr>
								«IF t.EStructuralFeatures.indexOf(f) == 0»
									<th scope="row" rowspan="«t.EStructuralFeatures.size»">«t.name»</th>
								«ENDIF»
								<th scope="row">«f.name.escape»</th>
								<td>«self.eGet(f).print»</td>
							</tr>
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
			</tbody>
			<tfoot>
			</tfoot>
		</table>
		</section>
		'''
	}
	
	
	def article(EClass type, List<EObject> instances) {
		val List<EClass> types = newArrayList()
		types.add(type)
		types.addAll(type.EAllSuperTypes)
		
		'''
		<article class="type">
			<a id="eClass:«type.name»"></a>
			<h1>«type.name»</h1>
			<table>
				<thead>
					<tr>
						<th><!-- topic id --></th>
					«FOR t: types»
						«IF t.EStructuralFeatures.size != 0»
						<th colspan="«t.EStructuralFeatures.size»">«t.name»</th>
						«ENDIF»
					«ENDFOR»
					</tr>
					<tr>
						<th><!-- topic id --></th>
					«FOR t: types»
						«FOR f: t.EStructuralFeatures»
							<th>«f.name.escape»</th>
						«ENDFOR»
					«ENDFOR»
					</tr>
				</thead>
				<tbody>
					«FOR i: instances»
						<tr>
						<td>
						«IF i.topic != null»
							<a href="#«i.topic.name»">«i.topic.title»</a>
						«ELSE»
							<!-- -->
						«ENDIF»
						</td>
						«FOR t: types»
							«FOR f: t.EStructuralFeatures »
								<td>«(i as EObject).eGet(f).print»</td>
							«ENDFOR»
						«ENDFOR»
						</tr>
					«ENDFOR»
				</tbody>
				<tfoot>
				</tfoot>
			</table>
		</article>
		'''
	}
	
	def dispatch print(Void self) {
		"<code class='null'>null</code>"
	}
	
	def dispatch print(Object self) {
		for (e: renderers) {
			val res = e.print(self)
			if (res != null && res.length > 0) {
				return res
			}
		}
		self.printFallback
	}
	
	def dispatch printFallback(Object self) {
		self.toString.escape
	}
	
	def dispatch printFallback(EObject self) {
		val topic = self.topic
		if (topic == null) {
			self.toString.escape
		} else {
			'''<a href="#«topic.name»">«topic.title»</a>'''
		}
	}
	
	def dispatch print(Iterable<?> self) {
		'''«FOR e: self BEFORE "<ul>"  AFTER "</ul>"»<li>«(e as Object).print»</li>«ENDFOR»'''
	}
	
	def link(Topic self) {
		'''<a href="#«self.name»">«self.title»</a>'''
	}
	
}