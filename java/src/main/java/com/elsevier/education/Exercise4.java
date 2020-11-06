package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
Counter is not thread-safe because while write operation, read is also accessible to the counter.
To fix it, lock or synchronized are good approaches. 
Here I use ReadWriteLock which has better performance than synchronized.

*/
public class Exercise4 {

	public static class Counter {
		
		ReadWriteLock lock = new ReentranctReadWriteLock();
		private int count = 0;
		
		public void increment() {
			lock.writeLock().lock();
			try {
				++count;
			} finally {
				lock.writeLock().unlock();
			}
			
		}
		
		public int getCount() {
			lock.readLock().lock();
			try {
				return count;
			} finally {
				lock.readLock().unlock();
			}
		}
		
		public void resetCount() {
			lock.writeLock().lock();
			try {
				count = 0;
			} finally {
				lock.writeLock().unlock();
			}
		}

	}
}
