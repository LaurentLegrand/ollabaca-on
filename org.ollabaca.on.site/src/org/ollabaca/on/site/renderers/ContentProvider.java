package org.ollabaca.on.site.renderers;

import org.eclipse.emf.ecore.EClass;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;

public interface ContentProvider {
	
	String onSite(Site self);
	
	String onTopic(Topic self);
	
	String onType(Site site, EClass type);

	void activate(Register register);

}
