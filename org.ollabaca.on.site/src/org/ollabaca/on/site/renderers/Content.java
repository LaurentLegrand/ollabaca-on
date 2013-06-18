package org.ollabaca.on.site.renderers;

import java.io.IOException;

import javax.servlet.ServletResponse;

public abstract class Content {
	
	final String type;
	
	protected Content(String type) {
		this.type = type;
	}

	public abstract void fill(ServletResponse response) throws IOException;

}
