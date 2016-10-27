package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
// synchronized - if it is - thread afe
*/
public class Exercise4 {

	public  class Counter {
		
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
