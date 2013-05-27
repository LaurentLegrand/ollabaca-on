package org.ollabaca.on.ui;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.ollabaca.on.model.Import;
import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.Slot;
import org.ollabaca.on.util.Units;

public class DocumentationProvider implements IEObjectDocumentationProvider {

	Units units = new Units();

	public String getDocumentation(EObject o) {
		EModelElement element = null;
		if (o instanceof Import) {
			Import self = (Import) o;
			element = units.getPackage(self);
		} else if (o instanceof Instance) {
			Instance self = (Instance) o;
			element = units.getClassifier(self);
		} else if (element instanceof Slot) {
			Slot self = (Slot) element;
			element = units.getFeature(self);
		}

		if (element != null) {
			String doc = units.getDocumentation(element);
			if (doc != null) {
				return doc;
			}

		}
		return null;
	}

}
