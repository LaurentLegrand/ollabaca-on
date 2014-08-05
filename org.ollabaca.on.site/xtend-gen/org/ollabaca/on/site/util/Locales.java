package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import java.util.Locale;

/**
 * Utility class that manages current locale
 */
@SuppressWarnings("all")
public class Locales {
  private final static ThreadLocal<Locale> current = new ThreadLocal<Locale>();
  
  public static void set(final Locale locale) {
    Locales.current.set(locale);
  }
  
  public static void unset() {
    Locales.current.remove();
  }
  
  /**
   * Returns the registered locale or the default one
   */
  public static Locale get() {
    final Locale locale = Locales.current.get();
    boolean _notEquals = (!Objects.equal(locale, null));
    if (_notEquals) {
      return locale;
    }
    return Locale.getDefault();
  }
}
