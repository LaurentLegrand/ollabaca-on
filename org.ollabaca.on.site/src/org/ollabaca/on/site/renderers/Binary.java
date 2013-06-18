package org.ollabaca.on.site.renderers;

import java.io.IOException;

import javax.servlet.ServletResponse;

public class Binary extends Content {

	final byte[] content;

	public Binary(String type, byte[] content) {
		super(type);
		this.content = content;
	}

	@Override
	public void fill(ServletResponse response) throws IOException {
		response.setContentType(type);
		response.getOutputStream().write(content);
	}

}
