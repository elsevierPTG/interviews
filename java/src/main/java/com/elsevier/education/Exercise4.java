package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

this is not a thread safe to make it thread safe we can use Atomic integer which
is lock-free thread-safe 

*/
public class Exercise4 {

    public static class Counter {
        
        private AtomicInteger count = new AtomicInteger(0);
        
        public int increment() {
            return count.incrementAndGet();
        }
        
        public int getCount() {
            return getCount();
        }
        
        public void resetCount() {
            count.set(0);
        }

    }
}