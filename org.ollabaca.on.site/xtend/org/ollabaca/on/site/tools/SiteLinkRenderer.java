package org.ollabaca.on.site.tools;

import com.google.common.base.Objects;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.pegdown.LinkRenderer;
import org.pegdown.LinkRenderer.Rendering;
import org.pegdown.ast.WikiLinkNode;

@SuppressWarnings("all")
public class SiteLinkRenderer extends LinkRenderer {
  private final Site site;
  
  public SiteLinkRenderer(final Site site) {
    this.site = site;
  }
  
  public Rendering render(final WikiLinkNode node) {
    String _text = node.getText();
    String _substring = _text.substring(1);
    final String key = _substring.replaceAll("/", ".");
    final Topic topic = this.site.getTopic(key);
    boolean _equals = Objects.equal(topic, null);
    if (_equals) {
      String _plus = ("Not found: " + key);
      Rendering _rendering = new Rendering("#", _plus);
      return _rendering;
    } else {
      String _plus_1 = ("#" + key);
      String _title = topic.getTitle();
      Rendering _rendering_1 = new Rendering(_plus_1, _title);
      return _rendering_1;
    }
  }
}
