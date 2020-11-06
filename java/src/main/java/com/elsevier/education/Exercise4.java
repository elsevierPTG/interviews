package com.elsevier.education;

/**
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 * making the variable count as volatile makes sure that each thread increments the value writes it in the main memory
 * rather then CPU cache (Incase of multi core processors) synchronized method will make sure the method is called by one thread at a time
 */
public class Exercise4 {

    public static class Counter {

        private volatile int count = 0;

        public synchronized int increment() {
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