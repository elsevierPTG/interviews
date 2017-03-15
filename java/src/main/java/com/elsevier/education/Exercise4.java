package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		
		// creating  atomic integer to achieve thread safe
		private AtomicInteger count=new AtomicInteger(0);
		public int increment() {
			//incrementandget is thread safe which return updated value
			return count.incrementAndGet();
		}
		
		public int getCount() {
			// count.get is used to make it thread safe
			return count.get();
		}
		
		public void resetCount() {
			// count.set() is used to make it thread safe
			count.set(0);
		}

	}
}
