package org.ollabaca.on.site.util

class Template<E> extends Extension<E, CharSequence> {
	
	public new() {
		super()
	}
	
	public new((E) => CharSequence fallback) {
		super(fallback)
	} 
	
}