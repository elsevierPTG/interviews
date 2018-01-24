package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 * 
 * the original implementation was NOT thread safe. there are many methods for making this Counter thread safe.
 * aside from the Atomics, which I prefer for readability more than anything, one could also use synchronized execution blocks.
 * using atomics is also safer because it prevents later modification that might introduce non-thread-safe behaviour
 * because other operations weren't put into synchronized blocks.
 */
public class Exercise4 {

	public static class Counter {
		
		private final AtomicInteger count;
		
		public Counter(){
			count = new AtomicInteger(0);
		}
		
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