package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
/**
 * Adding synchronized to static method so that the Class object is locked.
 *
 */
public class Exercise4 {

	public static class Counter {

		private static int count = 0;

		public static synchronized int increment() {
			return ++count;
		}

		public static synchronized int  getCount() {
			return count;
		}

		public void resetCount() {
			count = 0;
		}

	}
}