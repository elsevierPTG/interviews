package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 No its not, We can fix it by using an AtomicInteger. An operation needs to be atomic to be thread safe

 private AtomicInteger c = new AtomicInteger(0);

 increment
 c.incrementAndGet()

 get
 c.get()

 reset
 c.set(0)
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}