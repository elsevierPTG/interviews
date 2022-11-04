package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

NO, Between the call to increment the old integer and retrieve it, another thread could access the Counter
We can either use synchronize blocks, or use the thread-safe AtomicInteger

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