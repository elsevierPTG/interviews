package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {
	/* Counter is not thread safe because the ++ operatior is not atomic: it is made up of several operations
	      Get previous value
	      Increment value
	      Write value

	   Thus you could have the following situation:
	   Value is 5
	   Thread 1: access value (5)
	   Thread 2: access value (5)
	   Thread 1: increment value (6)
	   Thread 2: increment value (6)
	   Thread 2: write value (6)
	   Thread 1: write value (6)
	   In the end, you'd expect to get 7, but you'd instead get 6.  

	   Similarly:
	   Thread 1: get value (6)
	   Thread 2: resetCount (0)
	   Thread 1: increment value (7)
	   Thread 1: write value (7)

	   You would expect the value to be zero because the increment operation ran "before" the resetCount, but due to the timing, the reset counter got overwritten*/

	public static class Counter {
		//One way to make this thread safe is use the synchonized keyword on the non-atomic methods. This method leaves count alone
		private int count = 0;
		
		//The other way is to use Java's atomic class instead
		private AtomicInteger atomcount = new AtomicInteger(0);


		//Synchonized methods
		public synchronized int increment() {
			return ++count;
		}
		
		//no need for synchonized here because accessing is one operation
		public int getCount() {
			return count;
		}

		public synchronized void resetCount() {
			count = 0;
		}

		//Atomic methods
		public int incrementAtomic(){
			return atomcount.incrementAndGet();
		}

		public int getCountAtomic(){
			return atomcount.get();
		}

		public void restCountAtomic(){
			atomcount.set(0);
		}

	}
}