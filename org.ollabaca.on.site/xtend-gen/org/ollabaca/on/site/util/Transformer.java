package org.ollabaca.on.site.util;

import com.google.common.base.Objects;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class Transformer<I extends Object, O extends Object> {
  private final Function1<? super I,? extends O> fallback;
  
  protected final SortedMap<Class<? extends I>,Function1<? super I,? extends O>> transformers = new Function0<SortedMap<Class<? extends I>,Function1<? super I,? extends O>>>() {
    public SortedMap<Class<? extends I>,Function1<? super I,? extends O>> apply() {
      final Comparator<Class<? extends I>> _function = new Comparator<Class<? extends I>>() {
        public int compare(final Class<? extends I> a, final Class<? extends I> b) {
          boolean _equals = Objects.equal(a, b);
          if (_equals) {
            return 0;
          }
          boolean _isAssignableFrom = a.isAssignableFrom(b);
          if (_isAssignableFrom) {
            return 1;
          }
          return (-1);
        }
      };
      TreeMap<Class<? extends I>,Function1<? super I,? extends O>> _treeMap = new TreeMap<Class<? extends I>, Function1<? super I, ? extends O>>(_function);
      return _treeMap;
    }
  }.apply();
  
  public Transformer() {
    this.fallback = null;
  }
  
  public Transformer(final Function1<? super I,? extends O> fallback) {
    this.fallback = fallback;
  }
  
  public Function1<? super I,? extends O> register(final Class<? extends I> type, final Function1<? super I,? extends O> transformer) {
    Function1<? super I,? extends O> _put = this.transformers.put(type, transformer);
    return _put;
  }
  
  public O transform(final I object) {
    Set<Map.Entry<Class<? extends I>,Function1<? super I,? extends O>>> _entrySet = this.transformers.entrySet();
    for (final Map.Entry<Class<? extends I>,Function1<? super I,? extends O>> e : _entrySet) {
      try {
        Class<? extends I> _key = e.getKey();
        boolean _isInstance = _key.isInstance(object);
        if (_isInstance) {
          Function1<? super I,? extends O> _value = e.getValue();
          final O o = _value.apply(object);
          boolean _notEquals = (!Objects.equal(o, null));
          if (_notEquals) {
            return o;
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
      return this.doFallback(object);
    } catch (final Throwable _t_1) {
      if (_t_1 instanceof IllegalArgumentException) {
        final IllegalArgumentException ex_1 = (IllegalArgumentException)_t_1;
        ex_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t_1);
      }
    }
    return null;
  }
  
  protected O doFallback(final I object) {
    boolean _notEquals = (!Objects.equal(this.fallback, null));
    if (_notEquals) {
      return this.fallback.apply(object);
    }
    return null;
  }
}
