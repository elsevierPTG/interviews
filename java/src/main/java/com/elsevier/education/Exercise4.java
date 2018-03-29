package com.elsevier.education;
import java.util.concurrent.atomic.AtomicInteger;
/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 AM: Orginal code was not Thread-Safe but AtomicInteger is.
*/
public class Exercise4 {

	public static class Counter {

		private AtomicInteger counter = new AtomicInteger(0);
		
		public int increment() {
			return counter.incrementAndGet();
		}
		
		public int getCount() {
			return counter.intValue();
		}
		
		public void resetCount() {
			counter.set(0);
		}

	}
}