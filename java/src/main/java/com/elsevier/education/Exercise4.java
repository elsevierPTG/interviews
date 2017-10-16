package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 [aziring]  The Counter class is not thread safe.  If this class is static or a bean, then
 the class level attribute, count, could be modified by other threads.  To make this class
 thread safe, any method that modifies the value of count needs to be synchronized.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;

		/** Added synchronized to make thread safe **/
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}

		/** Added synchronized to make thread safe **/
		public synchronized void resetCount() {
			count = 0;
		}

	}
}