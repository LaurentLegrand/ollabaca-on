package org.ollabaca.on.site;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.ollabaca.on.site.graph.GraphContentProvider;
import org.ollabaca.on.site.servlets.HttpServiceTracker;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public final String SITE_PLUGIN_ID = "org.ollabaca.on.site.SitePlugin";

	public final String CONTENT_PROVIDER_ID = "org.ollabaca.on.site.ContentProvider";

	public static Activator instance;

	private HttpServiceTracker serviceTracker;

	@Override
	public void start(BundleContext context) throws Exception {
		instance = this;
		System.out.println(this + ": activated");

		serviceTracker = new HttpServiceTracker(context);
		serviceTracker.open();

		for (SitePlugin plugin: this.load(SITE_PLUGIN_ID, SitePlugin.class, new HashSet<SitePlugin>())) {
			for (Entry<String, String> resource : plugin.activate().entrySet()) {
				System.out.println(resource);
				serviceTracker.getService().registerResources(resource.getKey(), resource.getValue(), null);
			}
		}
		GraphContentProvider.register();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		serviceTracker.close();
		serviceTracker = null;
		context = null;
	}

	<E> Collection<E> load(String id, Class<E> type, Collection<E> instances) {
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
		return instances;
	}

}
