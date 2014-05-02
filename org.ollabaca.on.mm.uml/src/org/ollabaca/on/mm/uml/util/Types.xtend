package org.ollabaca.on.mm.uml.util

import java.util.List
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type

class Types {

	static def List<Property> getAssociationEnds(Type object) {
		val List<Property> list = newArrayList()
		for (a : object.associations) {
			if (a.endTypes.size == 1) { // the same type is involved on all ends
				list.addAll(a.memberEnds)
			} else {
				for (e : a.memberEnds) {
					if (e.type != object) {
						list.add(e)
					}
				}
			}
		}
		return list;
	}

}
