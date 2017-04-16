package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The Counter class uses AtomicInteger to ensure thread safety. I prefer not to
 * use synchronized methods due to the issues with bottle necking and
 * performance overhead
 */
public class Exercise4 {

	public static class Counter {

		private AtomicInteger count = new AtomicInteger(0);

		public int increment() {
			return count.incrementAndGet();
		}

		public int getCount() {
			return count.get();
		}

		public void resetCount() {
			count.set(0);
		}

	}
}