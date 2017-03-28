package com.elsevier.education;

/**

DONE: Is Counter thread-safe? If so, why, and if not, how can we fix it?

EXPLANATION: Counter is NOT thread-safe: because the "increment" method is not
atomic, a thread which is trying to "getCount" while another thread is "incrementing"
might return a stale value.

One possible solution (among many!) is to make every method which uses the mutable
"count" instance variable synchronized.

*/
public class Exercise4 {

	public static class Counter {

		private int count = 0;

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
