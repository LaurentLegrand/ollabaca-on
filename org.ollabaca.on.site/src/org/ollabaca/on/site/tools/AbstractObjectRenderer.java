package org.ollabaca.on.site.tools;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractObjectRenderer implements ObjectRenderer {

	protected SiteRenderer siteRenderer;

	protected AbstractObjectRenderer(SiteRenderer siteRenderer) {
		this.siteRenderer = siteRenderer;
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
		return siteRenderer.escape(self);
	}

	protected String _print(Object self) {
		return null;
	}

}