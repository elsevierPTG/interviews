package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

It was not thread safe because multiple thread can enter into increment and resentCount methods and update the count so 
it should be in synchronized block

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public int increment() {
			synchronized(this) { return ++count; }
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			synchronized(this) { count = 0; }
		}

	}
}
