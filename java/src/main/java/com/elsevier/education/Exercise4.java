package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

If reading/writing an integer primitive in the JVM is atomic, then this class may already
be thread-safe...

Otherwise, the original class is not thread-safe because the object state ("count") could be
read or written by any number of threads concurrently.  For example, one thread could be
reading "count" when only some of it's parts (bytes) have been updated by the increment 
operator from another thread.

To remediate, there's at least two options:

1.) replace "int count" with "AtomicInteger" and use it's ops.
2.) use synchronized methods to guard the "count" 

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

    public static class Counter2 {

        protected AtomicInteger count = new AtomicInteger(0);

        public int increment() {
            return count.incrementAndGet();
        }

        public int getCount() {
            return count.intValue();
        }

        public void resetCount() {
            count.set(0);
        }
    }
    
    public static class Counter3 {
        
        private int count = 0;
        
        public synchronized int increment() {
            return ++count;
        }
        
        public synchronized int getCount() {
            return count;
        }
        
        public synchronized void resetCount() {
            count = 0;
        }
    }
}