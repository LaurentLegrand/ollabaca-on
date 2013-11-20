package org.ollabaca.on.uml.util

import java.util.List
import org.eclipse.uml2.uml.Property
import org.eclipse.uml2.uml.Type

class Types {

	static def List<Property> getAssociationEnds(Type self) {
		val List<Property> list = newArrayList()
		for (a : self.associations) {
			if (a.endTypes.size == 1) { // the same type is involved on all ends
				list.addAll(a.ownedEnds)
			} else {
				for (e : a.ownedEnds) {
					if (e.type != self) {
						list.add(e)
					}
				}
			}
		}
		return list;
	}

}
