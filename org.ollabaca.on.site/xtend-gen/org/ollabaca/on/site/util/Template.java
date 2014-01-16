package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.ollabaca.on.site.util.Transformer;

@SuppressWarnings("all")
public class Template<E extends Object> extends Transformer<E,CharSequence> {
  public Template() {
    super();
  }
  
  public Template(final Function1<? super E,? extends CharSequence> fallback) {
    super(fallback);
  }
  
  /**
   * Call all transformers and the callback and concat all non null results
   */
  public CharSequence concat(final E object) {
    StringBuilder _stringBuilder = new StringBuilder();
    final StringBuilder builder = _stringBuilder;
    Set<Map.Entry<Class<? extends E>,Function1<? super E,? extends CharSequence>>> _entrySet = this.transformers.entrySet();
    for (final Map.Entry<Class<? extends E>,Function1<? super E,? extends CharSequence>> e : _entrySet) {
      try {
        Class<? extends E> _key = e.getKey();
        boolean _isInstance = _key.isInstance(object);
        if (_isInstance) {
          Function1<? super E,? extends CharSequence> _value = e.getValue();
          final CharSequence o = _value.apply(object);
          boolean _notEquals = (!Objects.equal(o, null));
          if (_notEquals) {
            builder.append(o);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof IllegalArgumentException) {
          final IllegalArgumentException ex = (IllegalArgumentException)_t;
          ex.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    try {
      final CharSequence o_1 = this.doFallback(object);
      boolean _notEquals_1 = (!Objects.equal(o_1, null));
      if (_notEquals_1) {
        builder.append(o_1);
      }
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof IllegalArgumentException) {
        final IllegalArgumentException ex_1 = (IllegalArgumentException)_t_1;
        ex_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t_1);
      }
    }
    return builder;
  }
}
