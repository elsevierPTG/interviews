package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		

		private AtomicInteger count = new AtomicInteger(0);
		
		public Counter(AtomicInteger count) {
		    this.count = count;
		}
		
		public void increment() {
			count.incrementAndGet();
		}
		
		public AtomicInteger getCount() {
			return count;	
		}
		
		public void resetCount() {
			count.set(0);
		}

	}
}