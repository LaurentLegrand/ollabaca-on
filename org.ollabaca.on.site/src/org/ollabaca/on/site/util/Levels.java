package org.ollabaca.on.site.util;

import java.util.concurrent.atomic.AtomicInteger;

public class Levels {

	static ThreadLocal<AtomicInteger> level = new ThreadLocal<AtomicInteger>() {

		protected AtomicInteger initialValue() {
			return new AtomicInteger(0);
		};

	};

	public static int start() {
		return level.get().incrementAndGet();
	}

	public static int end() {
		return level.get().decrementAndGet();
	}

	public static int current() {
		return level.get().get();
	}

	public static void reset() {
		level.remove();
	}

}
