package org.ollabaca.on.site.util;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Attr<E extends Object> {
  private final String _name;
  
  public String getName() {
    return this._name;
  }
  
  private final Function1<? super E,? extends CharSequence> _value;
  
  public Function1<? super E,? extends CharSequence> getValue() {
    return this._value;
  }
  
  public CharSequence apply(final E self) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = this.getName();
    _builder.append(_name, "");
    _builder.append("=\"");
    Function1<? super E,? extends CharSequence> _value = this.getValue();
    CharSequence _apply = _value.apply(self);
    _builder.append(_apply, "");
    _builder.append("\"");
    return _builder;
  }
  
  public Attr(final String name, final Function1<? super E,? extends CharSequence> value) {
    super();
    this._name = name;
    this._value = value;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_name== null) ? 0 : _name.hashCode());
    result = prime * result + ((_value== null) ? 0 : _value.hashCode());
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
    Attr other = (Attr) obj;
    if (_name == null) {
      if (other._name != null)
        return false;
    } else if (!_name.equals(other._name))
      return false;
    if (_value == null) {
      if (other._value != null)
        return false;
    } else if (!_value.equals(other._value))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}