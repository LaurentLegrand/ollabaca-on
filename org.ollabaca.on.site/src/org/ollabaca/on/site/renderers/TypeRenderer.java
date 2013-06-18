package org.ollabaca.on.site.renderers;

import org.eclipse.emf.ecore.EClass;
import org.ollabaca.on.site.Site;

public interface TypeRenderer {

	Content render(Site site, EClass self);

}
