package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

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
		
                //It's not thread-safe.
                //So we do the following to make it threadsafe:1.We can use synchronized modifier for all methods.
                //                                             2.Variable "count" can be randomly changed from multiple threads,so we need to maintain thread safety using synchronization.

	}
}
