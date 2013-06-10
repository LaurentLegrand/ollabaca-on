package org.ollabaca.on.site.tools;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractObjectRenderer implements ObjectRenderer {

	protected SiteToHtml siteToHtml;

	protected AbstractObjectRenderer(SiteToHtml siteToHtml) {
		this.siteToHtml = siteToHtml;
	}

	protected String _section(Void self) {
		return "";
	}

	protected String _section(Object self) {
		return "";
	}

	protected String _section(EObject self) {
		return "";
	}

	public String escape(String self) {
		return siteToHtml.escape(self);
	}

	protected String _print(Object self) {
		return null;
	}

}