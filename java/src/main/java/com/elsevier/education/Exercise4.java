package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?.
 */
public class Exercise4 {

  public static class Counter {

    /**
     * Using an AtomicInteger will guarantee atomicity. NOTE: Atomicity can also be be achieved by
     * using synchronized blocks when getting or changing the value of count.
     */
    private AtomicInteger count = new AtomicInteger(0);

    /**
     * Atomically increment the count and return its new value.
     * @return the count
     */
    public int increment() {
      return count.incrementAndGet();
    }

    /**
     * Atomically get the count.
     * @return the count
     */
    public int getCount() {
      return count.get();
    }

    /**
     * Atomically set the count to 0.
     */
    public void resetCount() {
      count.set(0);
    }
  }
}