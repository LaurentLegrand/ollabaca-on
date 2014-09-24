package org.ollabaca.on.site.util;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Content<E extends Object> {
  private final Function1<? super E, ? extends CharSequence> _body;
  
  public CharSequence apply(final E object) {
    Function1<? super E, ? extends CharSequence> _body = this.getBody();
    return _body.apply(object);
  }
  
  public Content(final Function1<? super E, ? extends CharSequence> body) {
    super();
    this._body = body;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._body== null) ? 0 : this._body.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Content<?> other = (Content<?>) obj;
    if (this._body == null) {
      if (other._body != null)
        return false;
    } else if (!this._body.equals(other._body))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public Function1<? super E, ? extends CharSequence> getBody() {
    return this._body;
  }
}
