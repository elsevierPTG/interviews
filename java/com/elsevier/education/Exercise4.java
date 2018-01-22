package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
DHS:  It is not threak-safe as two thread can execute the increment at the same time and cause problem
we need to make this call synchronized

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		
		public  synchronized int increment() {
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