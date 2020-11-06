package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
This counter is not thread-safe because two  thread can modify the count simultaneously.
 We can fix this by adding the synchronized keyword to the blocks which reads or modifies
 the count variable.
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;

		/**
		 * count variable is being modified
         * use synchronized to make it thread safe
		 * @return
         */
		public  int increment() {
			synchronized(this){
				return ++count;
			}
		}

		/**
		 * count is being read -
         * use synchronized to make it thread safe
		 * @return
         */
		
		public int getCount() {
			synchronized(this) {
				return count;
			}
		}

		/**
		 * count is being reset -
         * use synchronized to make it thread safe
		 */
		public void resetCount() {
			synchronized(this) {
				count = 0;
			}
		}
	}
}
