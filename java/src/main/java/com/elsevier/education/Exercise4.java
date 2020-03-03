package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 * Answer: This is not thread-safe. While variable "count" is an {@code int}, and {@code int}'s are atomic
 *   in Java, the ++count operation is not atomic: first it reads the value, then it writes  back a new value. To make
 *   thread safe, can use one of Java built-in libraries that deal with synchronization, {@link java.util.concurrent.atomic.AtomicInteger}
 *   in this case. Changes have been made.
 *   An alternative is to qualify count with "volatile", but the ++count still would not be atomic, therefore need to
 *   synchronize around it. Create a second class to illustrate this approach.

*/
public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.incrementAndGet();
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count.set(0);
		}
	}


	public static class CounterTwo {

		private volatile int count = 0;

		public synchronized int increment() {
			return ++count;
		}

		public int getCount() {
			return count;
		}


		/**
		 * Careful here. Do not assume that just because [@code int}'s are atomic, that a change made by one thread
		 * will be visible by another. The Java Memory Model (and the architectural model), make no guarantees
		 * as to the ordering of how things are done with respect to processors and cache, etc...
		 * Not to worry, since we declared "count" as volatile, change made by one thread are guaranteed to be visible to
		 * other threads
		 */
		public void resetCount() {
			count = 0;
		}

	}
}