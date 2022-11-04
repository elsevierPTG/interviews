package com.elsevier.education;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
ANSWER No, it's not thread-safe. We can fix it by using synchronized blocks or methods. 
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		// synchronized method
		public synchronized int increment() {
			return ++count;
		}
		
		// synchronized method
		public synchronized int getCount() {
			return count;
		}
		
		// synchronized method
		public synchronized void resetCount() {
			count = 0;
		}

	}
}