package org.ollabaca.on.site.util;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Column<E extends Object> {
  private final String _name;
  
  private final Function1<? super E, ? extends CharSequence> _cell;
  
  public CharSequence apply(final E object) {
    Function1<? super E, ? extends CharSequence> _cell = this.getCell();
    return _cell.apply(object);
  }
  
  public Column(final String name, final Function1<? super E, ? extends CharSequence> cell) {
    super();
    this._name = name;
    this._cell = cell;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
    result = prime * result + ((this._cell== null) ? 0 : this._cell.hashCode());
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
    Column<?> other = (Column<?>) obj;
    if (this._name == null) {
      if (other._name != null)
        return false;
    } else if (!this._name.equals(other._name))
      return false;
    if (this._cell == null) {
      if (other._cell != null)
        return false;
    } else if (!this._cell.equals(other._cell))
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
  public String getName() {
    return this._name;
  }
  
  @Pure
  public Function1<? super E, ? extends CharSequence> getCell() {
    return this._cell;
  }
}
