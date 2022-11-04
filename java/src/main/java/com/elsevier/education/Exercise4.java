package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Counter is not thread-safe since two or more threads can access a single instance
of Counter.  One way to fix it is to make the methods synchronized. 

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
}