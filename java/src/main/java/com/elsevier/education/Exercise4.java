package com.elsevier.education;
import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
This Counter class works really well in single-threaded environment, 
but don't work at all when several threads access the same Counter instance.
We can solve the problem using synchronized at method level.
But locking is not a lightweight mechanism and have several disadvantages.
AtomicInteger class supports multi-threaded access and have a better scalability than synchronizing method
*/
public class Exercise4 {

	public static class Counter {
		
		private final AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
				return count.incrementAndGet();
			
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count = new AtomicInteger(0);
		}

	}
}