package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Counter is not thread-safe, because race conditions can be created as a result of Counter, which has a shared count variable that
can be incremented and resetted. As a result, count is redefined as an AtomicInteger to prevent this from happening.
AtomicInteger class which will guarantee that all threads are able to operate on Counter in a thread-safe manner. This is a Java 8 capability, 
otherwise we could use Synchonized blocks which is costly.
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
			count.set(0);;
		}

	}
}