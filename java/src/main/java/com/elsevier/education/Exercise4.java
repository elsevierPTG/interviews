package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 no, objects live on the heap while methods live on the stack,
 	the counter is static so one instance will be shared among threads.

 we can fix this by using the java concurrent packate and swtich it to an AtomicInteger
 we also could have used synchronized blocks.

*/
public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
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