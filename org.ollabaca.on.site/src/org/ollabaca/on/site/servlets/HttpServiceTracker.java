package org.ollabaca.on.site.servlets;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.http.HttpService;
import org.osgi.util.tracker.ServiceTracker;

@SuppressWarnings("rawtypes")
public class HttpServiceTracker extends ServiceTracker {

	@SuppressWarnings("unchecked")
	public HttpServiceTracker(BundleContext context) {
		super(context, HttpService.class.getName(), null);
	}

	public Object addingService(ServiceReference reference) {
		HttpService httpService = (HttpService) super.addingService(reference);
		if (httpService == null)
			return null;

		try {
			httpService.registerServlet("/site", new SiteServlet(), null,
					null);
			httpService.registerResources("/site/assets", "/assets", null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return httpService;
	}

}
