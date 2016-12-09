package com.elsevier.education;

/**

 TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 */
public class Exercise4 {

	/**
	 * The Counter was NOT thread safe.
	 * Reduced the 2 step process of increment and get to a single get and made it thread safe with synchronized
	 * Reset is not synchronized because practically there is no need. If the counter is reset by any thread
	 * the next increment will be 1.
	 */
	public static class Counter {

		private int count = 0;

		public synchronized int getCount() {
			return ++count;
		}

		public void resetCount() {
			count = 0;
		}
	}
}