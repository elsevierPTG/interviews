package com.elsevier.education;

/**
 *
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 * NOTES: static classes with mutable member variables are not threadsafe. FIX:
 * make count immutable.
 */
public class Exercise4 {

    public static class Counter {

        private final int count;

        public Counter(int count) {
            this.count = count;
        }

        public int increment() {
            return count+1;
        }

        public int getCount() {
            return count;
        }

    }
}
