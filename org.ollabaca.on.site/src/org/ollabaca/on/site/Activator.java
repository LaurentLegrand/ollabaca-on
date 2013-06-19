package org.ollabaca.on.site;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.ollabaca.on.site.renderers.ContentProvider;
import org.ollabaca.on.site.renderers.LabelProvider;
import org.ollabaca.on.site.servlets.HttpServiceTracker;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public final String LABEL_PROVIDER_ID = "org.ollabaca.on.site.LabelProvider";

	public final String CONTENT_PROVIDER_ID = "org.ollabaca.on.site.ContentProvider";

	public static Activator instance;

	private HttpServiceTracker serviceTracker;

	private Context context;

	@Override
	public void start(BundleContext context) throws Exception {
		instance = this;
		System.out.println(this + ": activated");

		serviceTracker = new HttpServiceTracker(context);
		serviceTracker.open();

		this.context = new Context(
				this.load(LABEL_PROVIDER_ID, LabelProvider.class, new HashSet<LabelProvider>()), 
				this.load(CONTENT_PROVIDER_ID, ContentProvider.class, new HashSet<ContentProvider>()));
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

	public Context getContext() {
		return context;
	}

}
