package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
/**
 * Counter is not thread-safe. One thread could use increment or resetCount to affect what another
 * sees when trying to call getCount.
 *
 * To fix this we could mark the `count` variable as volatile, so Java knows it could be used
 * by multiple threads, and won't copy the value between them.
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