package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
// Counter class is not thread-safe. ++ operator is used for incrementing count, which when accessed by multiple threads will result 
// in different values. 
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		// All methods are declared synchronized so that value of count when accessed by multiple threads, will not change.
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
