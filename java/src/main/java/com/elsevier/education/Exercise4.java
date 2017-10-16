package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
	@author James Herndon james.herndon@gmail.com 
	Q: Is Counter thread-safe? If so, why, and if not, how can we fix it?
	A: No. It is susceptible to race conditions, it can be made thread safe using
	synchronize(), using a ReentrantLock, or an AtomicInteger, and presumably through
	more arcane mechanisms.
	
	Shown below is the AtomicInteger variation
*/
public class Exercise4 {

	public static class Counter {
		
		private static AtomicInteger count = new AtomicInteger(0);
		
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