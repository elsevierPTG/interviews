package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/

/**
 * 
 * @author Rohini Byrishetty
 * By using the AtomicInteger from java.util.concurrent package, var can be incremented concurrently in thread-safe manner
 *
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
  			count.set(0);
  		}
  
  	}