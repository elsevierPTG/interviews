package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		/* Synchronized method for thread safe */
		public Synchronized int increment() {
			return count++;
		}
		
		public Synchronized int getCount() {
			return count.getIncrement();
		}
		
		public Synchronized void resetCount() {
			return count = 0;
		}

	}
}
