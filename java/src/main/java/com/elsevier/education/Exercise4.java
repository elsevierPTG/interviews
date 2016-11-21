package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		/**
		 * synchronized method will be allowed to access one thread at a time. hence it is threadsafe now.
		 */
		public synchronized int increment() {
			return ++count;
		}
		/**
		 * synchronized method will be allowed to access one thread at a time. hence it is threadsafe now.
		 */
		public synchronized int getCount() {
			return count;
		}
		/**
		 * synchronized method will be allowed to access one thread at a time. hence it is threadsafe now.
		 */
		public synchronized void resetCount() {
			count = 0;
		}

	}
}
