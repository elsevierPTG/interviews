package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
ANS: Not thread-safe, fix included.
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		//below method is not threadsafe as chances for multiple threads to invoke to get different values of count in different stages
		/*public int increment() {
			return ++count;
		}*/
		
		//fix - use 'synchronized' keyword to put a lock on this method, so that it can be accessed only one thread at a time.
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
