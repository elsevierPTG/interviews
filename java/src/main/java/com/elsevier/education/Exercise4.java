package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * Incrementing a variable is not a thread-safe atomic operation. 
 * We can use AtomicInteger to ensure the increment is atomic.
 * 
 * @author JFracassi
 *
 */
public class Exercise4 {

	public static class Counter {
		
		private final AtomicInteger count = new AtomicInteger(0);
				
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