package com.elsevier.education;

/**
TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
*/

/**
 * The Counter class is not thread-safe
 *
 * @author Karen Rainsford
 * @date   16-Mar-2017
 */
public class Exercise4 {

	public static class Counter {

		/* final makes count immutable; which is thread-safe */
		private final int count;

		/* added constructor to intialize count */
		public Counter() {
			count = 0;
		}

		/* added synchronized because ++ is not an atomic operation
		*  and allows for only one thread to execute the increment method at a time
		* */
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