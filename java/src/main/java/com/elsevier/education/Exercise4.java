package com.elsevier.education;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

No, it is prone to race conditions as mutiple threads can access the variable out of sequence due to thread scheduling. 

1)  We can synchronized all three methods increment method.  -- not the best locking scheme.
2)  We can use a synchronized block within each method using the same object as a monitor. -- this is better but is still not optimal.
3)  Atomic Integers can provide thread safety within a single update but is still prone to race conditions across thread.
4)  We can use a ReentrantReadWriteLock in each method -- best option.
5)  Volatile variables only provide the same visibility guarantee as Atomic Integers with at the VM level.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		private final ReadWriteLock lock = new ReentrantReadWriteLock();
		private final Lock writeLock = lock.writeLock();
		private final Lock readLock = lock.readLock();
		
		public int increment() {
			try {
				writeLock.tryLock();
				return ++count;
			} finally {
				writeLock.unlock();
			}
		}
		
		public int getCount() {
			try {
				readLock.tryLock();
				return count;
			} finally {
				writeLock.unlock();
			}
		}

		public void resetCount() {
			try {
				writeLock.tryLock();
				count = 0;
			} finally {
				writeLock.unlock();
			}
		}
	}
}