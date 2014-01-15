package org.ollabaca.on.site.servlets;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Scope {
  private final String _path;
  
  public String getPath() {
    return this._path;
  }
  
  private final EObject _target;
  
  public EObject getTarget() {
    return this._target;
  }
  
  public Scope(final String path, final EObject target) {
    super();
    this._path = path;
    this._target = target;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_path== null) ? 0 : _path.hashCode());
    result = prime * result + ((_target== null) ? 0 : _target.hashCode());
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
    Scope other = (Scope) obj;
    if (_path == null) {
      if (other._path != null)
        return false;
    } else if (!_path.equals(other._path))
      return false;
    if (_target == null) {
      if (other._target != null)
        return false;
    } else if (!_target.equals(other._target))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
