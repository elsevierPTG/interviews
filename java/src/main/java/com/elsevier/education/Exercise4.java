package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 Answer:
 No - as the setter can be accessed by any thread that has handle to this Counter.
 Synchronize increment() to let only one thread access and increment the value
 I didn't synchronize getter as the call wouldn't affect the existing value. There might be the case where the value might be inconsistent as the setter might have affected in between. If you want to avoid that too, then synchronize getter as well.
 I went for statement level synchronization to localize the affect. However, in below methods, the affect is negligible as its just one-liner

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public int increment() {
			synchronized (Exercise3.class){
				++count;
			}
			return count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			synchronized (Exercise3.class){
				count = 0;
			}
		}
	}
}