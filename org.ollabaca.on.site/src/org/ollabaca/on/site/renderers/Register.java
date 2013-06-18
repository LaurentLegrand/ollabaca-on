package org.ollabaca.on.site.renderers;

public interface Register {
	
	void registerSiteRenderer(String path, SiteRenderer renderer);

	void registerTopicRenderer(String path, TopicRenderer renderer);

	void registerTypeRenderer(String path, TypeRenderer renderer);

}
