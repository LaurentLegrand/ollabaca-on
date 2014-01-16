package org.ollabaca.on.mm.uml.util;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Types {
  public static List<Property> getAssociationEnds(final Type object) {
    final List<Property> list = CollectionLiterals.<Property>newArrayList();
    EList<Association> _associations = object.getAssociations();
    for (final Association a : _associations) {
      EList<Type> _endTypes = a.getEndTypes();
      int _size = _endTypes.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        EList<Property> _ownedEnds = a.getOwnedEnds();
        list.addAll(_ownedEnds);
      } else {
        EList<Property> _ownedEnds_1 = a.getOwnedEnds();
        for (final Property e : _ownedEnds_1) {
          Type _type = e.getType();
          boolean _notEquals = (!Objects.equal(_type, object));
          if (_notEquals) {
            list.add(e);
          }
        }
      }
    }
    return list;
  }
}
