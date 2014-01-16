package org.ollabaca.on.mm.book.site

import org.eclipse.uml2.uml.Element
import org.eclipse.uml2.uml.NamedElement
import org.ollabaca.on.site.util.Levels

import static extension org.ollabaca.on.site.servlets.Notation.*
import static extension org.ollabaca.on.site.util.Html.*
import static extension org.ollabaca.on.site.util.Sites.*
import org.ollabaca.on.mm.book.Book
import org.ollabaca.on.mm.uml.Section_Element

class Page_Book {
	
	static def page_Book(Book self) {
		Levels::reset
		'''
		<!DOCTYPE html>
		<html>
		<head>
			<link href="/site/assets/bootstrap/css/bootstrap.css" rel="stylesheet">
			<style>
				body {
					counter-reset: part chapter;
				}
				section.level-1 {
					counter-increment: part;
				}
				section.level-2 {
					counter-increment: chapter;
					counter-reset: section-3;
				}
				section.level-3 {
					counter-increment: section-3;
					counter-reset: section-4;
				}
				section.level-4 {
					counter-increment: section-4;
					counter-reset: section-5;
				}
				
				section.level-5 {
					counter-increment: section-5;
				}
				
				h1.marker:after {
					content: "Part " counter(part, upper-roman);
				}
				
				h2.marker:after {
					content: "Chapter " counter(chapter);
				}
				
				h3.marker:after {
					content: counter(section-3);
				}
				
				h4.marker:after {
					content: counter(section-3) "." counter(section-4);
				}
				
				h5.marker:after {
					content: counter(section-3) "." counter(section-4) "." counter(section-5);
				}
				
			</style>
		</head>
		<body>
			<div class="container-fluid">
				«Section_Element.section_Element(self)»
			</div>
		</body>
		</html>
		'''
	}
		
	static def CharSequence title_Element(Element self) {
		val topic = self.topic_EObject
		if (topic != null) {
			return topic.title.span
		} else if (self instanceof NamedElement) { 
			return (self as NamedElement).name.span
		}
		"<undef>".escape
	}
	
	static def link(Element self) {
		val topic = site.getTopic(self)
		if (topic != null) {
			'''<a href="#«self.id»">«self.title_Element»</a>'''
		} else {
			return self.notation_Object
		}
	}
	
	static def String id(Object self) {
		Long::toHexString(System::identityHashCode(self))
	}
	
	static def dispatch boolean isEmpty(String self) {
		self.trim().length == 0
	}
	
	static def dispatch boolean isEmpty(Void self) {
		true
	}
}