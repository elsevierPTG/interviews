package com.elsevier.education;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
No. Serialize access to exposed methods. 

Alternative is to add keyword volatile to the count variable. This forces updates to the version of the variable in the heap, visible to all threads, to be made when local variable for thread is changed. Alternatively an atomic method could be used for incrementing.
*/

public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		// should be incremented only by one thread at a time because 
		// ++ operation in fact is more than one operation
		public synchronized int increment() {
			return ++count;
		}
		
		// current count is whatever it is whether one or another thread
		// is acting on the variable.
		public int getCount() {
			return count;
		}
		
		// the count variable should resettable by any thread
		public void resetCount() {
			count = 0;
		}
	}
	
}

