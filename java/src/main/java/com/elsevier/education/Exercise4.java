package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * While it is possible to wrap each method with the synchronize keyword, a
 * cleaner option is to make the underlying variable thread safe
 * 
 * @author todd weber
 *
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