package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.servlets.Ref;
import org.ollabaca.on.site.util.Sites;
import org.pegdown.LinkRenderer;
import org.pegdown.ast.WikiLinkNode;

@SuppressWarnings("all")
public class DefaultLinkRenderer extends LinkRenderer {
  public LinkRenderer.Rendering render(final WikiLinkNode object) {
    String _text = object.getText();
    String _substring = _text.substring(1);
    final String key = _substring.replaceAll("/", ".");
    Site _site = Sites.site();
    final Topic topic = _site.getTopic(key);
    boolean _equals = Objects.equal(topic, null);
    if (_equals) {
      return new LinkRenderer.Rendering("#", ("Not found: " + key));
    } else {
      CharSequence _ref_Object = Ref.ref_Object(topic);
      String _string = _ref_Object.toString();
      String _title = topic.getTitle();
      CharSequence _notation_Object = Notation.notation_Object(_title);
      String _string_1 = _notation_Object.toString();
      return new LinkRenderer.Rendering(_string, _string_1);
    }
  }
}
