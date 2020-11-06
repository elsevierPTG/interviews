package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

@author ArnelLalicon
	a. Counter is not thread-safe because resetCount() can be called by one thread while another thread can call increment()
	simultaneously. Thus resulting to unexpected values.
	b. By adding synchronized method, only one thread can get into the object at a time until that synchronized has finished execution.
	By then, another thread can use the object.
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public synchronized void resetCount() {
			count = 0;
		}

	}
}
