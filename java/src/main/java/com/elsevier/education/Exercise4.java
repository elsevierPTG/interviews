package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		//this method need to synchronize as two thread can simultaneously access the count. one can be updating and other might read
		//giving inconsistence results.

		public int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		//this method need to synchronize as two thread can simultaneously access the count. one can be updating and other might read
		//giving inconsistence results.

		public void resetCount() {
			count = 0;
		}

	}
}
