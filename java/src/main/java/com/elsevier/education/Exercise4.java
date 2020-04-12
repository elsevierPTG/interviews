package com.elsevier.education;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * Counter was not thread safe in its implementation, as there were two atomic
 * methods in the increment method. So thread 1 could have gotten the count,
 * then before it incremented the value, thread 2 could have gotten the count.
 * Then thread 1 would have incremented, but thread 2 is unaware of this. Making
 * the increment method synchronized would have made it thread safe, but it
 * could have lead to thread starvation depending on how often the increment
 * method is called.  So a reentrantlock was introduced to avoid that behavior.
 * 
 */
public class Exercise4 {

	public static class Counter {
		
		/*
		 * ReentrantLock will allow the thread that has been waiting the longest
		 * to acquire the lock once it is released, avoiding starvation.
		 */
		static ReentrantLock rLock = new ReentrantLock(true);

		private int count = 0;

		/* Lock is acquired in a try-except block to ensure the lock is released
		 * in the event of an exception.
		 */
		public int increment() {
			try{
				rLock.lock();
				++count;
			}
			finally {
			rLock.unlock();
			}
			return count;
		}

		public int getCount() {
			return count;
		}

		public void resetCount() {
			try{
				rLock.lock();
			    count = 0;
			}
			finally {
				rLock.unlock();
			}
		}

	}
}