package org.ollabaca.on.site;

import java.util.Map;

public interface SitePlugin {
	
	/**
	 * 
	 * @return the list of resources to register
	 */
	public Map<String, String> activate();

}
