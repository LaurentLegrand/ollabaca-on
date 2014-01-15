package org.ollabaca.on.site.renderers;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.renderers.Registry;

@SuppressWarnings("all")
public class Renderers {
  public final static Registry<Site> siteRenderers = new Function0<Registry<Site>>() {
    public Registry<Site> apply() {
      Registry<Site> _registry = new Registry<Site>();
      return _registry;
    }
  }.apply();
  
  public final static Registry<Type> typeRenderers = new Function0<Registry<Type>>() {
    public Registry<Type> apply() {
      Registry<Type> _registry = new Registry<Type>();
      return _registry;
    }
  }.apply();
  
  public final static Registry<Topic> topicRenderers = new Function0<Registry<Topic>>() {
    public Registry<Topic> apply() {
      Registry<Topic> _registry = new Registry<Topic>();
      return _registry;
    }
  }.apply();
}
