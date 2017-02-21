package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/

// The Counter is not thread-safe.
// In order to make it a thread-safe, we have to make increment and resetCount methods synchronized.
// The idea behind making these two functions synchronized is so that only one thread will be able to modify
// the count at one point of time.
public class Exercise4 {

	public class Counter {
		
		private int count = 0;
		
		// Make increment() synchronized.
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		// Make resetCount() synchronized.
		public synchronized void resetCount() {
			count = 0;
		}

	}
}
