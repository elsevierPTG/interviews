package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	/**
	 * This counter is not safe for many reasons, for example, the statement count++
	 * is a shorthand for multiple operations: assignment and addition. The sequence of these
	 * can be disrupted by multiple threads executing it at the same time.
	 *
	 * The solution below is a practical one using the Java concurrent API. Implementing it
	 * from scratch would not fit the time frame of this test.
	 *
	 * Another quick solution would have been to to use the keyword synchronized, but that would have
	 * serialized the operations, which may or may not have achieved the goal based on the requirements.
	 *
	 */
	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.addAndGet(1);
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count.set(0);
		}

	}
}