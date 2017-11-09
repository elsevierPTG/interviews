package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Answer: No, it is not currently threadsafe.
The initial implementaion has a race condition whereby someone could be accessing the getter while the increment is
being run. This would result in undesiralbe output. See below for the fix.

*/
public class Exercise4 {

	public static class Counter {

		private int count = 0;

        // Make sure we lock this down when incrementing so that we don't try to access the variable in flight
		public synchronized int increment() {
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
