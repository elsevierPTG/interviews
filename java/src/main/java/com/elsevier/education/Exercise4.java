package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

It is not thread safe. If two threads access 'count', reading or updating it,
they may get thread-local cached versions of it.

*/
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