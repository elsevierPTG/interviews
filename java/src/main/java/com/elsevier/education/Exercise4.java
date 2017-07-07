package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 No, Counter is not thread-safe, because ++count is an
 operation that can be interrupted by the OS's scheduler- setting a new
 value is actually a three step process of reading the value, completing the
 operations to update the value, and then assigning the new value to the
 variable- so multiple threads accessing a Counter object could produce
 inconsistent results.

 The simplest way to make Counter threadsafe is to make the increment()
 method synchronized. The JVM ensures that Synchronized methods are only
 accessed by one thread at a time
 by acquiring a lock on the method's object, and since both threads are
 passed the same ThreadRunner object, t2 must wait for t1 to finish
 running increment() before it can run it.

 Another way would be to use AtomicInteger rather than int for count, which
 has an atomic increment method.
	*/
public class Exercise4 {

	public static class Counter {

		private int count = 0;

		public 	int increment() {
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