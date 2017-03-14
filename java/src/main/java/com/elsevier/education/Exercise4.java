package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		//Added AtomicInteger to acheive the synchronization
		private AtomicInteger count = new AtomicInteger(0);
		//Added incremenrAndGet method to get a value added by 1
		public int increment() {
			return count.incrementAndGet();
		}
		//Added get methos to get the value
		public int getCount() {
			return count.get();
		}
		//Added set method to set the value
		public void resetCount() {
			count.set(0);
		}

	}
}
