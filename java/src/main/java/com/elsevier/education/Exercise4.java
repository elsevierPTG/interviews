package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 This class Counter is not thread safe because ++count is not an atomic operation. So two objects could
 be calling increment() and the first caller fetches the current value of count, increments it but before saving it
 the second caller fetches the original value and overwrites the newly saved one. Usually a static class is
 thread-safe, however count is not immutable. The solution is the use an AtomicInteger object which will guarantee that
 all threads are able to operate on Counter in a thread-safe manner. This is a Java 8 capability, otherwise we could use ThreadLocal
 or setup a synchronized block, although synchronized operations are more costly.

*/
public class Exercise4 {

	public static class Counter {

		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.incrementAndGet();
		}
		
		public int getCount() {
			return  count.get();
		}
		
		public void resetCount() {
			count.set(0);
		}

	}
}