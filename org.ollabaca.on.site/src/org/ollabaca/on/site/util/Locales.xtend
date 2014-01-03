package org.ollabaca.on.site.util

import java.util.Locale

/**
 * Utility class that manages current locale
 */
class Locales {
	
	//	@Local
	static val ThreadLocal<Locale> current = new ThreadLocal<Locale>()
	
	public static def set(Locale locale) {
		current.set(locale)
	}
	
	public static def unset() {
		current.remove
	}
	
	/**
	 * Returns the registered locale or the default one
	 */
	public static def Locale get() {
		val locale = current.get()
		if (locale != null) {
			return locale
		}
		return Locale::^default
	}

}