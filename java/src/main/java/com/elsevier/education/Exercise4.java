package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 A.L. Counter is not thread safe as certain methods modify the value of a class-scope variable.
 The solution presented here uses the AtomicInteger class.
 Alternatively we could specify "synchronized" for every such method.
 */
public class Exercise4 {

    public static class Counter {

        private static AtomicInteger count = new AtomicInteger(0);

        public int increment() {
            return count.getAndIncrement();
        }

        public int getCount() {
            return count.get();
        }

        public void resetCount() {
            count.set(0);
        }

    }
}