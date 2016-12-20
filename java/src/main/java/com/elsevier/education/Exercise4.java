package com.elsevier.education;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
a)use Synchronized to restrict the multiple thread.
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public Synchronized int increment() {
			return ++count;
		}
		
		public Synchronized int getCount() {
			return count;
		}
		
		public Synchronized void resetCount() {
			count = 0;
		}

	}
}
