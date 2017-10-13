package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
Added synchronized where count is being modified, this class is now thread safe.
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		Object lock = new Object();
		
		public int increment() {
			synchronized (lock) {
				count++;
			}
			return count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			synchronized (lock) {
				count = 0;
			}
		}

	}
}