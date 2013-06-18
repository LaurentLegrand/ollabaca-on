package org.ollabaca.on.site.renderers;

import java.io.IOException;

import javax.servlet.ServletResponse;

public class Text extends Content {
	
	final CharSequence content;
	
	public Text(String type, CharSequence content) {
		super(type);
		this.content = content;
	}
	
	@Override
	public void fill(ServletResponse response) throws IOException {
		response.setContentType(type);
		response.getWriter().write(this.content.toString());
	}

}
