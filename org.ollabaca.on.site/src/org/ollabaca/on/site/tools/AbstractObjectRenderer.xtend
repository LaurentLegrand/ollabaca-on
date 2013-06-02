package org.ollabaca.on.site.tools

	
import org.eclipse.emf.ecore.EObject

public abstract class AbstractObjectRenderer implements ObjectRenderer {
	
	protected val SiteToHtml siteToHtml
	
	protected new(SiteToHtml siteToHtml) {
		this.siteToHtml = siteToHtml
	}
	
	def dispatch section(Void self) {
		""
	}
	
	def dispatch section(Object self) {
		""
	}
		
	
	def dispatch section(EObject self) {
		""
	}
	
	def String escape(String self) {
		siteToHtml.escape(self)
	}

}