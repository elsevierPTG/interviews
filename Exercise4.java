package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {

		// ensure thread retrieves latest value by making volatile
		volatile private int count = 0;

		// synchronize updates to count
		public int synchronized increment() {
			return ++count;
		}


		public int getCount() {
			return count;
		}

		// synchronize updates to count
		public void synchronized resetCount() {
			count = 0;
		}

	}
}