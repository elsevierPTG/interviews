package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	/**
	 * This counter is not thread safe.  There are a couple of ways to make it safe, you could use a synchronized block,
	 * synchronized methods, or a semaphore or the atomics packages.
	 */
	public static class Counter {

		private int count = 0;
		
		public int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}