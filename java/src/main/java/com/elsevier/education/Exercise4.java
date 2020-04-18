package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class SynchronizedCounter {
		
		// volatile will flush the variable directly to memory and will skip any thread
		// caching. Doing this alone will allow for race conditions. 
		private volatile int count = 0;
		
		// using synchronized methods will prevent multiple operation blocks from being
		// executed simultaneously, preventing race conditions
		public synchronized int increment() {
			return ++count;
		}
		
		public synchronized int getCount() {
			return count;
		}
		
		public synchronized void resetCount() {
			count = 0;
		}

	}
	
	public static class AtomicCounter {
		
		// AtomicInt allows atomic/single cycle/thread safe operations on an int
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.addAndGet(1);
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count.set(0);
		}

	}
}