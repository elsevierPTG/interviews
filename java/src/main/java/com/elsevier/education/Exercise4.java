package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int increment() {  // made this method as synchronized to make as thread safe.
			return ++count;
		}
		
		public synchronized int getCount() {  // made this method as synchronized to make as thread safe.
			return count;
		}
		
		public synchronized void resetCount() {  // made this method as synchronized to make as thread safe.
			count = 0;
		}

	}
}
