package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		//It is not thread safe because instance variable "count" value can be randomly changed by calling multiple threads.
		//Added synchronized keyword in below methods to ensure only one thread is accessing at a time.
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
