package com.elsevier.education;

/**
 TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 */
public class Exercise4 {

    public static class Counter {

        private int count = 0;

        // make sure only one thread at a time can modify the count variable.
        public synchronized int increment() {
            return ++count;
        }

        public int getCount() {
            return count;
        }
        // make sure only one thread at a time can reset the count.
        public synchronized void resetCount() {
            count = 0;
        }

    }
}