package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?



 No, Counter is not thread-safe, because ++count and count = 0 are both
	 operations that can be interrupted by the OS's scheduler- setting a new
	 value is actually a three step process of reading the value, completing the
	 operations to update the value, and then assigning the new value to the
	 variable- so multiple threads accessing a Counter object could produce
	inconsistent results.

	The simplest way to make Counter thread-safe would be to use the
	synchronized keyword with increment() and resetCount(). The JVM
	ensures that Synchronized methods are only accessed by one thread at a time
	by acquiring a lock on the method's object.
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