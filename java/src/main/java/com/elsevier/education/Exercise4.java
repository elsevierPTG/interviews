package com.elsevier.education;

/**
 *  * @author Dineshkumar Periyasamy mtrdinesh@gmail.com
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
No Counter is not thread safe, we need to make the variable count as volatile

Volatile will directly write into memory and behave as Synchronized block enclosure
*/
public class Exercise4 {

	public static class Counter {
		
		private volatile int count = 0;
		
		public int increment() {
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
