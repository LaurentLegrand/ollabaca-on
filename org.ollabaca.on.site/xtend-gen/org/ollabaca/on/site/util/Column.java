package org.ollabaca.on.site.util;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Column<E extends Object> {
  private final String _name;
  
  public String getName() {
    return this._name;
  }
  
  private final Function1<? super E,? extends CharSequence> _cell;
  
  public Function1<? super E,? extends CharSequence> getCell() {
    return this._cell;
  }
  
  public CharSequence apply(final E self) {
    Function1<? super E,? extends CharSequence> _cell = this.getCell();
    CharSequence _apply = _cell.apply(self);
    return _apply;
  }
  
  public Column(final String name, final Function1<? super E,? extends CharSequence> cell) {
    super();
    this._name = name;
    this._cell = cell;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_name== null) ? 0 : _name.hashCode());
    result = prime * result + ((_cell== null) ? 0 : _cell.hashCode());
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
    Column other = (Column) obj;
    if (_name == null) {
      if (other._name != null)
        return false;
    } else if (!_name.equals(other._name))
      return false;
    if (_cell == null) {
      if (other._cell != null)
        return false;
    } else if (!_cell.equals(other._cell))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
