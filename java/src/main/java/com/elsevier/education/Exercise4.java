package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it? It is
 * not thread safe. One way to make Counter thread safe is, making its methods
 * synchronized Other way is replacing the int count field with AtomicInteger
 */
public class Exercise4 {

	public static class Counter {

		private int count = 0;

		public synchronized int increment() {
			return ++count;
		}

		public synchronized int getCount() {
			return count;
		}

		public synchronized void resetCount() {
			count = 0;
		}

	}

	/* Using AtomicInteger */

	public static class AtomicCounter {

		private AtomicInteger count = new AtomicInteger(0);

		public int increment() {
			return count.incrementAndGet();
		}

		public int getCount() {
			return count.get();
		}

		public void resetCount() {
			count.getAndSet(0);
		}

	}
}