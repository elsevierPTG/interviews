package com.elsevier.education;

/**

DONE Is Counter thread-safe? If so, why, and if not, how can we fix it?

NO - fix is to make all methods of the object that touch count be synchronized
this will prevent more than one thread from trying to access count at the same time
we could also use synchronize blocks, in this simple example that seems unnecessary

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
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
}