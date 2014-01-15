package org.ollabaca.on.site.util

class Template<E> extends Transformer<E, CharSequence> {

	public new() {
		super()
	}

	public new((E) => CharSequence fallback) {
		super(fallback)
	}

	/**
	 * Call all transformers and the callback and concat all non null results
	 */
	def CharSequence concat(E self) {
		val builder = new StringBuilder
		for (e : transformers.entrySet) {
			try {
				if (e.key.isInstance(self)) {
					val o = e.value.apply(self)
					if (o != null) {
						builder.append(o)
					}
				}
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace
			}
		}
		try {
			val o = self.doFallback
			if (o != null) {
				builder.append(o)
			}
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace
		}
		return builder
	}

}
