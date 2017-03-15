package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	/**
	 * In Java, primitives and Objects are not inherently thread-safe.
	 * If 2 threads read the value of a primitive. One thread increments the
	 * value by 1 and the other thread increments the value by 2. Then the
	 * threads will be out of sync.
	 * <p>
	 * There are several ways to address this behavior.
	 * <p>
	 * One way is to use the built-in classes from the concurrent library.
	 * AtomicInteger is a built-in int wrapper that is thread-safe.
	 *
	 */
	public static class Counter {

		private AtomicInteger count = new AtomicInteger();

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