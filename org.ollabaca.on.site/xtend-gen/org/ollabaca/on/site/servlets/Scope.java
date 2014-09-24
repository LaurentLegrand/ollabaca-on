package org.ollabaca.on.site.servlets;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Scope {
  private final String _path;
  
  private final EObject _target;
  
  public Scope(final String path, final EObject target) {
    super();
    this._path = path;
    this._target = target;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._path== null) ? 0 : this._path.hashCode());
    result = prime * result + ((this._target== null) ? 0 : this._target.hashCode());
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
    Scope other = (Scope) obj;
    if (this._path == null) {
      if (other._path != null)
        return false;
    } else if (!this._path.equals(other._path))
      return false;
    if (this._target == null) {
      if (other._target != null)
        return false;
    } else if (!this._target.equals(other._target))
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
  public String getPath() {
    return this._path;
  }
  
  @Pure
  public EObject getTarget() {
    return this._target;
  }
}
