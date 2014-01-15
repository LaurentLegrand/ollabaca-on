package org.ollabaca.on.site.util;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Content<E extends Object> {
  private final Function1<? super E,? extends CharSequence> _body;
  
  public Function1<? super E,? extends CharSequence> getBody() {
    return this._body;
  }
  
  public CharSequence apply(final E self) {
    Function1<? super E,? extends CharSequence> _body = this.getBody();
    CharSequence _apply = _body.apply(self);
    return _apply;
  }
  
  public Content(final Function1<? super E,? extends CharSequence> body) {
    super();
    this._body = body;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_body== null) ? 0 : _body.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Content other = (Content) obj;
    if (_body == null) {
      if (other._body != null)
        return false;
    } else if (!_body.equals(other._body))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}