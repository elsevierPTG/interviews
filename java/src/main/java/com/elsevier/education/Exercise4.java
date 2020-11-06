package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/

/**
 * Counter class is thread safe because it is declared static, however
 * the instance variable count and the methods of incrementing the count variable is not
 * because multiple threads can call the methods which can change the instance variable
 * The solution to this would be either to set synchronization the methods by adding synchronized keyword
 * or to set the instance variable count to be final and increment method to synchronized.
 * 
 */
public class Exercise4 {

	public static class Counter {
		
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