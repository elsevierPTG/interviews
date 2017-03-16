package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {
	
	/**
	 * 
	 * No, Counter is not thread-safe because multiple threads can read or write Counter object at the same time. 
	 * Thus causes memory consistency errors. To solve the problem, we change all methods to synchronized methods.
	 * Synchronized methods establishes happens-before relationship and solve the memory consistency errors.
	 * 
	 */
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