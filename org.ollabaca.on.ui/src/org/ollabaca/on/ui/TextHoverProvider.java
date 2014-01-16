package org.ollabaca.on.ui;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.ollabaca.on.model.Import;
import org.ollabaca.on.model.Instance;
import org.ollabaca.on.model.Slot;
import org.ollabaca.on.util.Units;

public class TextHoverProvider extends DefaultEObjectHoverProvider  {

	Units units = new Units();

	@Override
	protected String getFirstLine(EObject o) {
		EModelElement element = null;
		if (o instanceof Import) {
			Import object = (Import) o;
			element = units.getPackage(object);
		} else if (o instanceof Instance) {
			Instance object = (Instance) o;
			element = units.getClassifier(object);
		} else if (o instanceof Slot) {
			Slot object = (Slot) o;
			element = units.getFeature(object);
		}

		if (element != null) {
			String doc = units.getDocumentation(element);
			if (doc != null) {
				return doc;
			}

		}
		return super.getFirstLine(o);
	}

}
