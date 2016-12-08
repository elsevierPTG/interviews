package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
*/
public class Exercise4 {

	public static class Counter {
		//Using atomic operation for thread safety
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			//return ++count;
			return count.incrementAndGet();
		}
		
		public int getCount() {
			//return count;
			return count.get();
		}
		
		public void resetCount() {
			//count = 0;
			count.set(0);
		}
	}
}
