package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/

/**
 * Class is not thread safe. To fix we have to use Synchronized keyword
 * for increment and resetCount methods.
 */
public class Exercise4 {

	public static class Counter {
		
		private  int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public synchronized void resetCount() {
			count = 0;
		}

	}
}