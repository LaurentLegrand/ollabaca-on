package org.ollabaca.on.site.tools;

import java.util.HashSet;
import java.util.Set;

public interface RendererFactory {
	
	public static Set<RendererFactory> factories = new HashSet<>();
	
	public ObjectRenderer newRenderer(SiteRenderer siteRenderer);

}
