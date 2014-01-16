package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.ollabaca.on.site.Site;
import org.ollabaca.on.site.Topic;
import org.ollabaca.on.site.servlets.Notation;
import org.ollabaca.on.site.util.Sites;
import org.pegdown.LinkRenderer;
import org.pegdown.ast.WikiLinkNode;

@SuppressWarnings("all")
public class LocalLinkRenderer extends LinkRenderer {
  public LinkRenderer.Rendering render(final WikiLinkNode object) {
    String _text = object.getText();
    String _substring = _text.substring(1);
    final String key = _substring.replaceAll("/", ".");
    Site _site = Sites.site();
    final Topic topic = _site.getTopic(key);
    boolean _equals = Objects.equal(topic, null);
    if (_equals) {
      LinkRenderer.Rendering _rendering = new LinkRenderer.Rendering("#", ("Not found: " + key));
      return _rendering;
    } else {
      EObject _target = topic.getTarget();
      String _plus = ("#" + _target);
      String _title = topic.getTitle();
      CharSequence _notation_Object = Notation.notation_Object(_title);
      String _string = _notation_Object.toString();
      LinkRenderer.Rendering _rendering_1 = new LinkRenderer.Rendering(_plus, _string);
      return _rendering_1;
    }
  }
}
