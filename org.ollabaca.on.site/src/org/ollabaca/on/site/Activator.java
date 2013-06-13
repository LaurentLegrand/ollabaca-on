package org.ollabaca.on.site;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.ollabaca.on.site.servlets.HttpServiceTracker;
import org.ollabaca.on.site.tools.RendererFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public final String RENDERER_FACTORY_ID = "org.ollabaca.on.site.RendererFactory";

	public static Activator instance;

	//Set<RendererFactory> factories = new HashSet<>();
	
	private HttpServiceTracker serviceTracker;


	@Override
	public void start(BundleContext context) throws Exception {
		this.load(RENDERER_FACTORY_ID, RendererFactory.class, RendererFactory.factories);
		instance = this;
		System.out.println(this + ": activated");
		
		 serviceTracker = new HttpServiceTracker(context);
         serviceTracker.open();

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		RendererFactory.factories.clear();
		
		serviceTracker.close();
        serviceTracker = null;

	}

	<E> void load(String id, Class<E> type, Collection<E> instances) {
		IConfigurationElement[] elements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(id);
		try {
			for (IConfigurationElement e : elements) {
				final Object o = e.createExecutableExtension("class");
				System.out.println(this + ": " + o);
				if (type.isInstance(o)) {
					instances.add(type.cast(o));
				}
			}
		} catch (CoreException ex) {
			// TODO
			System.out.println(ex.getMessage());
		}

	}

}
