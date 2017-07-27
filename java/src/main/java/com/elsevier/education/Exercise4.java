package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
Counter is not thread safe, as the methods are not synchronized. Two threads can access increment and resetCount and the data is
 inconsistent.
 Fix: Use Atomic Integer.
*/
public class Exercise4 {

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