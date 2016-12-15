package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 Counter is not thread-safe, for two primary reasons.  Incrementing count is not
 an atomic operation, and even if it were, there's no guarantee that count would
 be visible to all threads after updating.

 One way to fix this is by using AtomicInteger.  This class acts as a wrapper around
 int, ensuring that any operations surrounding it are atomic and visible.
 See the implementation below.

 @author Joseph Cosentino
*/
public class Exercise4 {

	public static class Counter {
		
		private final AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.getAndIncrement();
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count.set(0);
		}

	}
}