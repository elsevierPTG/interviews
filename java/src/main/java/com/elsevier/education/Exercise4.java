package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * No, the counter is not threadsafe because count can be updated by increment and resetCount
 * by 2 different threads and return very inconsistent results.
 * to fix it, I'd use AtomicInteger instead of a primitive int as the counter type.
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