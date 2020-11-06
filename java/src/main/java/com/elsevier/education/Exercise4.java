package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
-- counter is not thread safe
--- synchronize using synchronized method

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
		
		public void resetCount() {
			count = 0;
		}

	}
}