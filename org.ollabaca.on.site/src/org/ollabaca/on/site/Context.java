package org.ollabaca.on.site;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.ollabaca.on.site.renderers.Content;
import org.ollabaca.on.site.renderers.ContentProvider;
import org.ollabaca.on.site.renderers.Register;
import org.ollabaca.on.site.renderers.SiteRenderer;
import org.ollabaca.on.site.renderers.Text;
import org.ollabaca.on.site.renderers.TopicRenderer;
import org.ollabaca.on.site.renderers.TypeRenderer;

public class Context implements Register {

	Map<String, SiteRenderer> siteRenderers = new HashMap<>();

	Map<String, TopicRenderer> topicRenderers = new HashMap<>();

	Map<String, TypeRenderer> typeRenderers = new HashMap<>();

	Set<ContentProvider> contentProviders = new HashSet<>();

	Context(Collection<ContentProvider> contentProviders) {
		this.contentProviders.addAll(contentProviders);

		// activate content providers
		for (ContentProvider e : this.contentProviders) {
			e.activate(this);
		}
	}

	public Set<ContentProvider> getContentProviders() {
		return contentProviders;
	}

	@Override
	public void registerSiteRenderer(String path, SiteRenderer renderer) {
		this.siteRenderers.put(path, renderer);
	}

	@Override
	public void registerTopicRenderer(String path, TopicRenderer renderer) {
		this.topicRenderers.put(path, renderer);
	}

	@Override
	public void registerTypeRenderer(String path, TypeRenderer renderer) {
		this.typeRenderers.put(path, renderer);
	}

	public SiteRenderer getSiteRenderer(final String path) {
		SiteRenderer renderer = this.siteRenderers.get(path);
		return (renderer != null) ? renderer : new SiteRenderer() {

			@Override
			public Content render(Site site) {
				return new Text("text/plain", "Renderer not found for path: "
						+ path);
			}
		};
	}

	public TopicRenderer getTopicRenderer(final String path) {
		TopicRenderer renderer = this.topicRenderers.get(path);
		return (renderer != null) ? renderer : new TopicRenderer() {

			@Override
			public Content render(Topic topic) {
				return new Text("text/plain", "Renderer not found for path: "
						+ path);
			}
		};
	}

	public TypeRenderer getTypeRenderer(final String path) {
		TypeRenderer renderer = this.typeRenderers.get(path);
		return (renderer != null) ? renderer : new TypeRenderer() {

			@Override
			public Content render(Type type) {
				return new Text("text/plain", "Renderer not found for path: "
						+ path);
			}
		};
	}
}
