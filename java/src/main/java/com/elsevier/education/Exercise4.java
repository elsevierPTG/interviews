package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Lavkesh:
  Counter class is not thread safe. 
  To make counter class thread safe, we need to do below change.
  1. Synchronized all method which accessing counter
  2. Make counter variable volatile, so that JVm will read and write counter value from main memory not from thread cache.
  
*/
public class Exercise4 {

	public static class Counter {
		
		private volatile int count = 0;
		
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