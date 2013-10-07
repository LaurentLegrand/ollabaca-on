package org.ollabaca.on;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.ollabaca.on.model.Container;
import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.ModelPackage;
import org.ollabaca.on.model.Unit;
import org.ollabaca.on.util.Units;

public class QualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider implements IQualifiedNameConverter {
	
	Units units = new Units();
	
	QualifiedName qualifiedName(Instance self) {
		List<String> list = new ArrayList<>();
		for (Instance i: units.getAncestorsAndSelf(self)) {
			list.addAll(Arrays.asList(i.getName().split("\\/")));
		}
		
		/*
		 * Verify that the container 
		 */
//		Container container = units.getUnit(self).getContainer();
//		if (container != null) {
//			List<INode> nodes = NodeModelUtils.findNodesForFeature(container, ModelPackage.Literals.CONTAINER__INSTANCE);			
//			if (nodes.size() != 0) {
//				list.addAll(0, this.parse(nodes.get(0).getText()));
//			}
//		}
		
		Unit unit = units.getUnit(self);
		List<INode> nodes = NodeModelUtils.findNodesForFeature(unit, ModelPackage.Literals.UNIT__PARENT);
		if (nodes.size() != 0) {
			list.addAll(0, this.parse(nodes.get(0).getText()));
		}
		
		QualifiedName qn = QualifiedName.create(list);
		System.out.println(qn + ":" + self);
		return qn;
	}

	@Override
	public String toString(QualifiedName name) {
		return "/" + name.toString("/");
	}

	@Override
	public QualifiedName toQualifiedName(String qualifiedNameAsText) {
		return QualifiedName.create(this.parse(qualifiedNameAsText));
	}
	
	List<String> parse(String name) {
		List<String> list = new ArrayList<>();
		for (String s: name.split("\\/")) {
			if (s.length() != 0) {
				list.add(s);
			}
		}		
		return list;
	}
	
	/*@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		QualifiedName name = super.getFullyQualifiedName(obj);
		System.out.println(name + ":" + obj);
		return name;
	}*/

}
