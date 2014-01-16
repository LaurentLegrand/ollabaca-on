package org.ollabaca.on.site.renderers;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.Element;
import org.ollabaca.on.site.renderers.Content;
import org.ollabaca.on.site.renderers.Text;

@SuppressWarnings("all")
public class Registry<E extends Element> {
  private final Map<String,Function1<? super E,? extends Content>> renderers = CollectionLiterals.<String, Function1<? super E,? extends Content>>newHashMap();
  
  public Function1<? super E,? extends Content> registerRenderer(final String path, final Function1<? super E,? extends Content> renderer) {
    Function1<? super E,? extends Content> _put = this.renderers.put(path, renderer);
    return _put;
  }
  
  public Content render(final String path, final E object) {
    Function1<? super E,? extends Content> renderer = this.renderers.get(path);
    boolean _equals = Objects.equal(renderer, null);
    if (_equals) {
      Text _text = new Text("text/plain", ("Renderer not found for path: " + path));
      return _text;
    }
    return renderer.apply(object);
  }
}
