package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4  {

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

// Counter is not thread safe. If two or more threads try to access Counter class the increment() function 
// get corrupted. To fix this we need to either used locks or threadsafe collections like Conurrent hashmap.
