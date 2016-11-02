package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {

		private int count = 0;

		//making the method synchronized  will make the counter thread-sage
		public synchronized int increment() {
			return ++count;
		}
		//making the method synchronized  will make the counter thread-sage
		public synchronized int getCount() {
			return count;
		}
		//making the method synchronized  will make the counter thread-sage
		public synchronized void resetCount() {
			count = 0;
		}

	}
}