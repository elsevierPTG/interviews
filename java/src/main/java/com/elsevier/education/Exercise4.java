package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 static instance, no way it is thread safe without some lock or syncronized mechanisim..

*/
public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.getAndAdd(1);
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {count.set(0); }

	}
}