package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		/* is not an atomic operation and can be broken down into read, update and write operation. 
		if multiple thread call getCount() approximately same time each of these three operation may coincide or overlap
		with each other */
	
		private int count = 0;
		
		public int increment() {
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

Solution:

public class Exercise4 {

	public static class Counter {
		private int count;
   		 AtomicInteger atomicCount = new AtomicInteger( 0 );

  
    /*
     * This method thread-safe now because of locking and synchornization
     */
    public synchronized int getCount(){
        return count++;
    }
  
    /*
     * This method is thread-safe because count is incremented atomically
     */
    public int getCountAtomically(){
        return atomicCount.incrementAndGet();
    }
