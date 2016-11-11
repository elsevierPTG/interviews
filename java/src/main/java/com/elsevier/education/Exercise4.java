package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
It is not.  We can fix it by adding the 'synchronized' keyword to the methods

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		//adding 'synchronized' for thread safety
		public synchronized int increment() {
			return ++count;
		}
		
		//adding 'synchronized' for thread safety
		public synchronized int getCount() {
			return count;
		}
		
		//adding 'synchronized' for thread safety
		public synchronized void resetCount() {
			count = 0;
		}

	}
}
