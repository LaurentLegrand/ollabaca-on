package org.ollabaca.on.site.renderers;

import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Tag;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;

public interface ContentProvider {
	
	String onSite(Site self);
	
	String onTopic(Topic self);
	
	String onTag(Tag self);
	
	String onType(Type type);

	void activate(Register register);

}
