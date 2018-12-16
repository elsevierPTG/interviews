package com.elsevier.education;

/**
Counter is not thread-safe. This is because 2 or more threads can simultaneously invoke incremement()
and resetCount() methods that modify the count instance variable. 
This can be fixed by converting these 2 methods into synchronized methods. 
*/
public class Exercise4 {
	public static class Counter {
		
		private int count = 0;
		
		/**
		 * Allows only one thread at a time to increment the count
		 * @return updated counter
		 */
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		/**
		 * Allows only one thread at a time to reset the count
		 */
		public synchronized void resetCount() {
			count = 0;
		}

	}
}