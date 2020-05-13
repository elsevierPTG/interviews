package com.elsevier.education;

/**
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 *
 * The original counter is not thread-safe because the increment method is not atomic.
 * It is equivalent to ...
 *
 * public int increment() {
 *     count = count + 1
 * 	   return count;
 * }
 *
 * The class may be made thread-safe by making it into the monitor pattern (Tony Hoare),
 * with private properties and critical sections on methods. There is no need to make the count
 * property volatile, because the synchronized keyword guarantees visibility if a lock is used
 * for both reading and writing. The implicit lock object is the instance of the Counter class.
 *
 * Note: Java provides an AtomicInteger class for this purpose with arguably more appropriate and
 * useful API semantics. My inclination would be to deprecate or remove this class (less moving parts).
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