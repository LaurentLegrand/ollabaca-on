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
	
	val Site site
	
	val processor = new PegDownProcessor(Extensions::WIKILINKS)
	
	val LinkRenderer linkRenderer
	
	
	new(Site site) {
		this.site = site
		linkRenderer = new SiteLinkRenderer(this.site)
	}
	
	def html() {
		
		val List<Topic> topics = newArrayList()
		val Set<EClass> types = newHashSet()
		
		site.topics.filter[!anonymous].forEach[{topics.add(it)  types.add(it.target.eClass)}]
		 
		'''
		<!DOCTYPE html>
		<html>
			<head>
				<title>�site.name�</title>
			</head>
			<body>
				<header>
					<h1>�site.name�</h1>
					�nav�
				</header>
				<div id=instances>
				�FOR e: topics.sortBy[name]�
					�e.article�
				�ENDFOR�
				</div>
				<div id=types>
				�FOR t: types BEFORE '<div>' AFTER '</div>'�
					�t.article(site.eResource.allContents.filter(t.instanceClass).toList)�
				�ENDFOR�
				</div>
				<footer>
					<p>�new SimpleDateFormat().format(new Date)�</p>
				</footer>
			</body>
		</html>
		'''
	}
	
	def nav() {
		'''
		<nav>
		�FOR e: site.roots.sortBy([name]) BEFORE "<ul>" AFTER "</ul>"�
			�nav(e)�
		�ENDFOR�
		</nav>
		'''
	}
	
	def nav(Topic self) {
		'''
		<li>
			�self.link�
			�FOR e: self.topics.filter[!anonymous].sortBy([name]) BEFORE "<ul>" AFTER "</ul>"�
				�e.nav�
			�ENDFOR�
		</li>
		'''
	}
	
	def html(String self) {
		processor.markdownToHtml(self, linkRenderer)
	}
	
	def article(Topic self) {
		'''
		<article class="�self.target.eClass.name�">
			<section class="main">
			<a id="�self.name�"></a>
			<h1>�self.title�</h1>
			�self.aside�
			
			�self.documentation.html�
			</section>
���			�FOR e: Activator::instance.renderers�
���				�e.toSection(self, processor, renderer)�
���			�ENDFOR�
			�self.target.features�
		</article>
		'''
	}
	
	def aside(Topic self) {
		'''
		<aside>
			<p>type: <a href="#eClass:�self.target.eClass.name�">�self.target.eClass.name�</a></p>
			<p>path: �FOR e: self.ancestorsAndSelf SEPARATOR "/"�<a href="#�e.name�">�e.title�</a>�ENDFOR�</p>
			�FOR e: self.topics BEFORE "<p>children: " SEPARATOR ", " AFTER "</p>"�<a href="#�e.name�">�e.title�</a>�ENDFOR�
			�FOR e: self.see BEFORE "<p>see: " SEPARATOR ", " AFTER "</p>"�<a href="#�e.name�">�e.title�</a>�ENDFOR�
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
	
	def features(EObject self) {
		val List<EClass> types = newArrayList()
		types.add(self.eClass)
		types.addAll(self.eClass.EAllSuperTypes)
		
		
		'''
		<section class="features">
			<h1>Features</h1>
		<table border=1>
			<thead>
				<tr><th>Class</th><th>Name</th><th>Value</th></tr>
			</thead>
			<tbody>
				�FOR t: types�
					�IF t.EStructuralFeatures.size != 0�
						�FOR f: t.EStructuralFeatures�
							<tr>
								�IF t.EStructuralFeatures.indexOf(f) == 0�
									<th rowspan="�t.EStructuralFeatures.size�">�t.name�</th>
								�ENDIF�
								<th>�f.name.escape�</th>
								<td>�self.eGet(f).print�</td>
							</tr>
						�ENDFOR�
					�ENDIF�
				�ENDFOR�
			</tbody>
			<tfoot>
			</tfoot>
		</table>
		</section>
		'''
	}
	
	
	def article(EClass type, List<?> instances) {
		val List<EClass> types = newArrayList()
		types.add(type)
		types.addAll(type.EAllSuperTypes)
		
		'''
		<article>
			<a id="eClass:�type.name�"></a>
			<h1>�type.name�</h1>
		<table border=1>
			<thead>
				<tr>
				�FOR t: types�
					�IF t.EStructuralFeatures.size != 0�
					<th colspan="�t.EStructuralFeatures.size�">�t.name�</th>
					�ENDIF�
				�ENDFOR�
				</tr>
				<tr>
				�FOR t: types�
					�FOR f: t.EStructuralFeatures�
						<th>�f.name.escape�</th>
					�ENDFOR�
				�ENDFOR�
				</tr>
			</thead>
			<tbody>
				�FOR i: instances�
					<tr>
					�FOR t: types�
						�FOR f: t.EStructuralFeatures �
							<td>�(i as EObject).eGet(f).print�</td>
						�ENDFOR�
					�ENDFOR�
					</tr>
				�ENDFOR�
			</tbody>
			<tfoot>
			</tfoot>
		</table>
		</article>
		'''
	}
	
	def dispatch print(Void self) {
		"<null>"
	}
	
	def dispatch print(Object self) {
		self.toString.escape
	}
	
	def dispatch print(EObject self) {
		val topic = self.topic
		if (topic == null) {
			self.toString.escape
		} else {
			'''<a href="#�topic.name�">�topic.title�</a>'''
		}
	}
	
	def dispatch print(Iterable<?> self) {
		'''�FOR e: self BEFORE "[ " SEPARATOR ", " AFTER " ]"��(e as Object).print��ENDFOR�'''
	}
	
	def link(Topic self) {
		'''<a href="#�self.name�">�self.title�</a>'''
	}
	
}