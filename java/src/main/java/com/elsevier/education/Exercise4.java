package com.elsevier.education;

/**

 TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 class was not threadsafe because multiple threads could have interacted with the count variable and
 received differing values or caused the value to change. Defining the methods as synchronized and the
 count member variable as volatile will allow java and the compiler to account for this.

 A better way to handle this might be to have the count variable be an AtomicInteger which (I believe)
 handles most of these threading cases.
 */
public class Exercise4 {

	public static class Counter {

		private volatile int count = 0;

		public synchronized int increment() {
			return ++count;
		}

		public synchronized int getCount() {
			return count;
		}

		public synchronized void resetCount() {
			count = 0;
		}

	}
}