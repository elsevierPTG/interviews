package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

1. It is not threadsafe as multiple thread can access the increment(), resetCount() and getCount() at same time.
2. To make it threadsafe, we need to make increment(), resetCount() and getCount() methods synchronized
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
