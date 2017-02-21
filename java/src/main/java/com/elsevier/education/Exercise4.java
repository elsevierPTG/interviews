package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

/**   
No, the counter is not threadsafe because counter can be updated by increment() and resetCount() methods,  
by 2 different threads and return very inconsistent results.  
To fix this, I'd use AtomicInteger instead of a primitive int as the counter type. */ 
import java.util.concurrent.atomic.AtomicInteger;
public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
		
		public int increment() {
			return count.incrementAndGet(); 		
}
		
		public synchronized int getCount() {
			return count.get(); 		
}
		
		public synchronized void resetCount() {
			count.set(0); 		
}

	}
}
