package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 * <p>
 * John: No, this class is not threadsafe.  Below is a few different implementations that are thread safe
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

    /**
     * This works, but is likely a bad approach.  It uses a locking object to ensure single access to the counter.
     * The lock should be final, to ensure it cannot change.
     */
    public static class SynchronizedCounter {
        private final Object lock = new Object();
        private int count = 0;

        public int increment() {
            synchronized (lock) {
                return ++count;
            }
        }

        public int getCount() {
            synchronized (lock) {
                return count;
            }
        }

        public void resetCount() {
            synchronized (lock) {
                count = 0;
            }
        }
    }

    /**
     * Using an atomic reference ensures proper thread safety
     */
    public static class AtomicCounter {
        private AtomicInteger count = new AtomicInteger(0);

        public int increment() {
            return count.incrementAndGet(); // use increment and get to perform the increment before returning the value
        }

        public int getCount() {
            return count.intValue();
        }

        public void resetCount() {
            count.set(0);
        }
    }
}