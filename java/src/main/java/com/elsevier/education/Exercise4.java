package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?


 No this is not thread safe.
 This can be fixed by using synchronized and using an AtomicInteger

*/
public class Exercise4 {

	public static class Counter {

        private final AtomicInteger count =  new AtomicInteger();
		
		public synchronized void increment() {
			 count.getAndIncrement();
		}
		
		public synchronized int getCount() {
			return count.get();
		}
		
		public synchronized void resetCount() {
			count.set(0);
		}

	}
}