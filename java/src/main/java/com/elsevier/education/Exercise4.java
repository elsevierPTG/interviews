package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

  Is Counter thread-safe? If so, why, and if not, how can we fix it?

  This was not thread safe because it has shared mutable state that could create race conditions.

  I used an AtomicInteger to fix this.  Other solutions could be using synchronized methods or blocks,
  or possibly by declaring count as volatile.

*/
public class Exercise4 {

  public static class Counter {

    private AtomicInteger count = new AtomicInteger();

    public int increment() {
      return count.incrementAndGet();
    }

    public int getCount() {
      return count.get();
    }

    public void resetCount() {
      count.set(0);
    }

  }
}
