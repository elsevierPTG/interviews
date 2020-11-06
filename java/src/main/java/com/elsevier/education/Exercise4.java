package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
//Counter is not thread-safe, multiple threads can access "count" value concurrently
//in increment, getCount, resetCount method.
//Added synchronized block for each method
//and then every thread should wait until previous thread release Counter instance.
public class Exercise4 {

	public static class Counter {

		private int count = 0;

		public int increment() {
		    synchronized (this) {
		        return ++count;
		    }
		}

		public int getCount() {
		    synchronized (this) {
		        return count;
            }
		}

		public void resetCount() {
		    synchronized (this) {
               count = 0;
            }
		}
	}
}