package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	/**
	 * It's not thread-safe. Internal variable "count" can be randomly changed from multiple threads.
	 * To implement thread safety we can use synchronized modifier for methods or add mutex object
	 * and use synchronized statement
	 */
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
}