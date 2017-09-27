package com.elsevier.education;

/**
 * No, the Counter class was not thread-safe The ++ operator is not
 * atomic, so it's possible that a thread would see an out-of-date value of the
 * count field and incorrectly use that.
 *
 * I've fixed this by adding the synchronized keyword to the methods to ensure
 * that only one thread may access them at a time. I've also maked the count
 * field as volatile so that writes and reads for it are atomic.
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