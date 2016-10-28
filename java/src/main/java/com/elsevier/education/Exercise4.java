package com.company;

/**
 * Created by Yash Gupta
 * This Counter class wasn't thread safe previously, so now fixing it
 */
public class Exercise4 {

    public static class Counter {

        private int count = 0;

        public synchronized int increment() {
            return ++count;
        }

        public int getCount() {
            return count;
        }

        public synchronized void resetCount() {
            count = 0;
        }

    }
}
