package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it

This is not thread safe since ++ is atomic operator and can be broken down to write, read and update. 
These 3 operation might be done at the same time.

*/
public class Exercise4 {

  public static class Counter {

    AtomicInteger count = new AtomicInteger();
    
    public synchronized int increment() {
      return count.addAndGet(1);
    }
    
    public int getCount() {
      return count.get();
    }
    
    public void resetCount() {
      count.set(0);
    }

  }
}
