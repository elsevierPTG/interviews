package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		// int type is immutable so we are good
		private int count = 0;
		
		// Make sure the increment operation is atomic
		public synchronized int increment() {
			return ++count;
		}
		
		// Make sure the latest count value is returned
		public synchronized int getCount() {
			return count;
		}
		
		// Make sure reset is atomic
		public synchronized void resetCount() {
			count = 0;
		}

	}
}