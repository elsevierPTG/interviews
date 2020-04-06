package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/

/**
 * The code is not truly thread safe because the value of the counter can be modified
 * by several threads independenly.
 *
 * We can help make it thread safe by making the methods increment() and resetCount() synchronized.
 */
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
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