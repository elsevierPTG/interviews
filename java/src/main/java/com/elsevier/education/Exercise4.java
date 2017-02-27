package com.elsevier.education;
import java.util.concurrent.atomic.AtomicInteger;
/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {
	/**The java.util.concurrent.atomic package provides very useful classes that support lock-free and 
	thread-safe programming on single variables.
	*/
	public static class Counter {
		
		private int count = 0;
		private static AtomicInteger at = new AtomicInteger(0);
		
		public int increment() {
			count=at.incrementAndGet();;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
