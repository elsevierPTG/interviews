package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

 TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
  Counter was not thread-safe because counter was shared mutable state and was used without synchronization. For
  most realistic loads atomicinteger performs better than synchronized and that's the idiom I've used. Counter is
  now thread-safe and concurrent.
 */
public class Exercise4 {

	public static class Counter {


		private final AtomicInteger count = new AtomicInteger(0);

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