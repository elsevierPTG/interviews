package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 ---
 Class was not thread-safe, as it would have been possible for one thread to
 invoke {@code resetCount()} while another thread invoked {@code increment()},
 causing the first thread to see a value of 1 after the reset. Added {@code synchronized}
 locks to both methods, blocking on the instance, which will prevent this.

*/
public class Exercise4 {

	public static class Counter {

		private int count = 0;

		public int increment() {
		    synchronized(this) {
				return ++count;
			}
		}

		public int getCount() {
			return count;
		}

		public void resetCount() {
		    synchronized(this) {
				count = 0;
			}
		}

	}
}