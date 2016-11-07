package com.elsevier.education;
import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
Answer: No, it is not,
	To have a better implementation of this, we should use AtomicInteger
*/
public class Exercise4 {

	public static class Counter {
		//Using AtomicInteger to make sure that the counter is thread safe
		private AtomicInteger count = new AtomicInteger(0);
		
		/**
		 * this will first increament the value and then return count
		 * @return
		 */
		public int increment() {
			return count.incrementAndGet();
		}
		
		/**
		 * getting the count directly
		 * @return
		 */
		public int getCount() {
			return count.get();
		}
		
		/**
		 * resetting the count to 0
		 */
		public void resetCount() {
			count.set(0);
		}

	}
}