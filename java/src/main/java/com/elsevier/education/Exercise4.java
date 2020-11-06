package com.elsevier.education;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
*/
/**
 * Adding synchronized to this method will makes it thread-safe.
 *  When synchronized is added to a static method, the Class object is the object which is locked.
 * @author Safura
 *
 */
public class Exercise4 {

	public static class Counter {
		
		private static int count = 0;
		
		public static synchronized int increment() {
			return ++count;
		}
		
		public static synchronized int  getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}