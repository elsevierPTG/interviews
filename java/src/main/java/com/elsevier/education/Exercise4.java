package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
We can fix it by using sysnchronized keyword in the method or use Atomic Integer, which makes 
this ++ operation atomic and since atomic operations are thread-safe and saves cost of external synchronization.


*/
// this counter is not thread safe.
/**
because ++ (increment operator) is not an atomic operation and can be broken down into read, update and write operation. 
if multiple thread call getCount() approximately same time each of these three operation may coincide or overlap with each other
for example while thread 1 is updating value , thread 2 reads and still gets old value, which eventually let thread 2 override
thread 1 increment and one count is lost because multiple thread called it concurrently.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		//AtomicInteger atomicCount = new AtomicInteger( 0 );
  /*
     * This method thread-safe now because of locking and synchornization
     */
		public synchronized int increment() {
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
