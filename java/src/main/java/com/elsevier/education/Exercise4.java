package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		//use volatile to prevent cache issues
		private volatile int count = 0;
		
		// allow only one thread to increment the counter
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		// allow only one thread to reset the counter
		public synchronized void resetCount() {
			count = 0;
		}

	}
}