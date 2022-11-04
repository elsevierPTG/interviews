package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/

// No because race conditions can be created as a result of Counter, which has a shared count variable that
// can be incremented. As a result, count is redefined as an AtomicInteger to prevent this from happening.

public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger();
		
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
}
