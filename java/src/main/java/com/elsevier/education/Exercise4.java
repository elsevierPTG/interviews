package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/


// The counter is not thread-safe. In order to make it a thread-safe we have to 
// make increment and resetCount operations synchronized. However making a method 
// synchronized is heavy and hence I feel like using AutomicInteger as a counter 
// for making it thread-safe without making methods synchronized.
public class Exercise4 {

	public class Counter {
		
		private final AtomicInteger count = new AtomicInteger();
		
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
