package org.ollabaca.on.site.renderers;

import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.Type;
import org.ollabaca.on.site.renderers.Registry;

@SuppressWarnings("all")
public class Renderers {
  public final static Registry<Site> siteRenderers = new Registry<Site>();
  
  public final static Registry<Type> typeRenderers = new Registry<Type>();
  
  public final static Registry<Topic> topicRenderers = new Registry<Topic>();
}
