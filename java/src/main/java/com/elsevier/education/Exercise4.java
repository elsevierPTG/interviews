package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 
No it is not, there is no locking to the count variable so conceivably two threads
could attempt to modify count at the same time.
Labeling the methods as synchronized should ensure that only one thread is modifying
count at any given time.


*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		synchronized public int increment() {
			return ++count;
		}
		
		synchronized public int getCount() {
			return count;
		}
		
		synchronized public void resetCount() {
			count = 0;
		}

	}
}