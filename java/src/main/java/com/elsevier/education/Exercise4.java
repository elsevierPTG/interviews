package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

The counter is not thread safe, count variable can be changed any time between the read and any increment operation.

We can add the synchronized keyword to the increment operation.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		/**
		 * Read and increment operation are thread safe now with synchronized keyword.
		 * 
		 * @return
		 */
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