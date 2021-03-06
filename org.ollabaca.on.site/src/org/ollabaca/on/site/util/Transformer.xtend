package org.ollabaca.on.site.util

import java.util.SortedMap
import java.util.TreeMap

class Transformer<I, O> {

	val (I)=>O fallback

	protected val SortedMap<Class<? extends I>, (I)=>O> transformers = new TreeMap(
		[ Class<? extends I> a, b | // most specific class, first
			if (a == b) {
				return 0
			}
			if (a.isAssignableFrom(b)) {
				return 1
			}
			return -1
		])

	public new() {
		this.fallback = null
	}

	public new((I)=>O fallback) {
		this.fallback = fallback
	}

	public def register(Class<? extends I> type, (I)=>O transformer) {
		transformers.put(type, transformer)
	}

	public def O transform(I object) {
		for (e : transformers.entrySet) {
			try {
				if (e.key.isInstance(object)) {
					val o = e.value.apply(object)
					if (o != null) {
						return o
					}
				}
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace
			}
		}
		try {
			return object.doFallback
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace
		}
		return null
	}

	protected def O doFallback(I object) {
		if (this.fallback != null) {
			return this.fallback.apply(object)
		}
	}

}
