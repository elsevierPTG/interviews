package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
The AtomicInteger class provides you with a int variable which can be read and written atomically, and which also contains advanced atomic operations

and an atomic counter (incrementAndGet(), etc) that can be used by many threads concurrently
*/

import java.util.concurrent.atomic.AtomicInteger;
public class Exercise4 {
public static class Counter {

private AtomicInteger count = new AtomicInteger(0);
	
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
