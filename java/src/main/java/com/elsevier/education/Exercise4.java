package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 It is not thread-safe, because the ++ operation is not atomic. The ++ operation requires reading a value, (the current
 value of the count), adding one to the value, and then writing back the newly increased value. While one thread
 is between the reading of the value and the writing of the value, another thread could, for example, update the value
 of the count. That update would then be overwritten with the (now incorrect, being 1 too small) value later written
 by the first thread. This is known as interleaving of threads.

 The way to fix it is to use synchronization. One approach would be to add the synchronized keyword to the
 "increment" method. I do that below. Another approach would be to use a datatype designed for the specifically
 (i.e. AtomicInteger). A synchronized code block could be used instead of the "synchronized" keyword, if more granular
 locking that doesn't rely on the intrinsic lock of the Counter class is desired.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int  increment() {
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