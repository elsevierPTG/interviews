package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		/*
		 Data member "count" is not thread safe. Using "synchronized" keyword so that it will allow only one thread to access.
		 */
		public synchronized int increment() {
			return ++count;
		}
		
		/*
		 Data member "count" is not thread safe. Using "synchronized" keyword so that it will allow only one thread to access.
		 */
		public synchronized int getCount() {
			return count;
		}
		
		/*
		 Data member "count" is not thread safe. Using "synchronized" keyword so that it will allow only one thread to access.
		 */
		public synchronized void resetCount() {
			count = 0;
		}

	}
}
