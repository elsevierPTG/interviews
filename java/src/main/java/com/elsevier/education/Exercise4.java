package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		// Counter is not thread safe . It could be made thread safe  by making the code syncronized.
		public Syncronized int increment() {
			return ++count;
		}
		
		public Syncronized int getCount() {
			return count;
		}
		
		public Syncronized void resetCount() {
			count = 0;
		}

	}
}
