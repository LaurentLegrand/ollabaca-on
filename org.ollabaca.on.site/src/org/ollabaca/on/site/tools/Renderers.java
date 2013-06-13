package org.ollabaca.on.site.tools;

import java.util.HashSet;
import java.util.Set;

import org.ollabaca.on.site.Site;

public class Renderers {
	
	static Set<ObjectRenderer> newRenderers(SiteRenderer siteRenderer) {
		Set<ObjectRenderer> renderers = new HashSet<>();
		
		for (RendererFactory e: RendererFactory.factories) {
			renderers.add(e.newRenderer(siteRenderer));
		}
		return renderers;
	}
	
	static public SiteToHtml newSiteToHtml(Site site) {
		SiteToHtml siteToHtml = new SiteToHtml(site);
		siteToHtml.setOjectRenderers(newRenderers(siteToHtml));
		return siteToHtml;
	}
	
	static public MultiPageSiteRenderer newMultiPageSiteRenderer(Site site) {
		MultiPageSiteRenderer renderer = new MultiPageSiteRenderer(site);
		renderer.setOjectRenderers(newRenderers(renderer));
		return renderer;
	}

}
