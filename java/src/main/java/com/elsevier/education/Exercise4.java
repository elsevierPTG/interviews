package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

 TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 <p>
 No the Counter was not thread safe.
 Why?: This is because the two threads can make the call to increment and getCount and could access counter object at once.
 We can make the count Atomic so that the operations are atomic or was can create a synchronized block.
 </p>
 */
public class Exercise4 {

	public static class Counter {

		private AtomicInteger count;

		public Counter() {
			this.count = new AtomicInteger();
		}

		public Counter(final int count) {
			this.count = new AtomicInteger(count);
		}

		public int increment() {
			return this.count.incrementAndGet();
		}

		public int getCount() {
			return this.count.get();
		}

		public void resetCount() {
			this.count.set(0);
		}

	}
}
