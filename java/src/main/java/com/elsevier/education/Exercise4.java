package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		  AtomicInteger count = new AtomicInteger(0); 


		
		public int increment() {
			count.incrementAndGet();
		}
		
		public int getCount() {
			return count.get()
		}
		
		public void resetCount() {
			count.set(0);
		}

	}
}
