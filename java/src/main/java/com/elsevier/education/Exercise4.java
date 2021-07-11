package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?


 No, race conditions are possible.  There's a few ways to solve this:

 <ul>
 	<li>use an {@link AtomicInteger}</li>
 	<li>use the <pre>synchronized</pre> keyword lock on the instance</li>
 	<li>use a {@link ReadWriteLock}</li>
 </ul>

 {@link AtomicInteger}'s are probably ideal for this test, because it will use
 intrinsic machine instructions

*/
public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.incrementAndGet();
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count.set(0);
		}

	}
}