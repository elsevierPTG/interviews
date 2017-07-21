package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 No, Counter is not thread safe as it is possible for more than one thread to invoke each of the methods at the same time
 and the mutation of the field is not atomic.  E.g. Thread #1 could read count at the same time Thread #2 reads count and then
 both would attempt to write the same new value for count.

 To fix this you could mark increment() and resetCount() as synchronized, or you could use AtomicInteger instead of int.

 Despite that consumers of this thread could still result in thread-unsafe code if they depend on the result of getCount()
 before invoking either increment() or resetCount().  Depending on the purpose of this counter both methods could be modified
 to accept the expected current value and not mutate unless it matched, either within the synchronized block
 or via AtomicInteger#compareAndSet

*/
public class Exercise4 {

	public static class Counter {
		
		private final AtomicInteger count = new AtomicInteger(0);
		
		public synchronized int increment() {
			return count.incrementAndGet();
		}

		public int increment(int expected) {
			int updated = expected + 1;
			count.compareAndSet(expected, updated);
			return updated;
		}
		
		public int getCount() {
			return count.get();
		}
		
		public synchronized void resetCount(int expected) {
			count.compareAndSet(expected, 0);
		}

	}
}