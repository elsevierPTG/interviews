package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	/**
	 * This counter example is not thread-safe due to the fact that the count
	 * member is not protected from "dirty reads" by another thread at the time
	 * the value pf count is being incremented by another thread. Use
	 * AtomicInteger to improve thread safety.
	 * 
	 * @author Rai Singh
	 * 
	 * Recruiter: Linda Pham, Jobspring Partners
	 *
	 */
	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.incrementAndGet();
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count = new AtomicInteger(0);
		}

	}
}