package com.elsevier.education;

/**
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 */
public class Exercise4 {
    /**
     * The counter was not thread safe, because it was incrementing and returning in 2 different methods,
     * so the responsibility lied on the caller to synchronize them.
     * I changed getCount to synchronized and increment inside that method.
     */
    public static class Counter {

        private int count = 0;

        public synchronized int getCount() {
            return ++count;
        }

        public void resetCount() {
            count = 0;
        }

    }
}