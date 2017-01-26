package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
This class is not thread-safe because at the same time different threads can call different methods
and change value of count. We need to make all methods synchronized to be thread-safe 
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized  int increment() {
			return ++count;
		}
		
		public synchronized int getCount() {
			return count;
		}
		
		public synchronized  void resetCount() {
			count = 0;
		}

	}
}