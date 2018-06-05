package com.elsevier.education;

import java.util.ArrayList;

/**
 * It is not thread-safe.
 * The field 'count' and/or it's associated critical regions need to be made thread-safe.
 * Opted to use the 'volatile' keyword because it will make access to 'count' atomic.
 * Made 'count' static for shared field.
*/
public class Exercise4 {

	public static class Counter {
		
		// Make atomic. Previously wasn't a "shared" region, now is static.
		private static volatile int count = 0;
		private Object changeLock = new Object();
		
		public int increment() {
			synchronized(changeLock) {
				++count;
			}
			return count;
		}
		
		// Should not need synchronized because of volatile.
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			synchronized(changeLock) {
				count = 0;
			}
		}

	}
	
	// Quick checks.
	public static void main(String args[]) {
		Exercise4 exercise = new Exercise4();
		ArrayList<Thread> counters = new ArrayList<>();
		
		for (int i=0; i < 4; i++) {
			counters.add(new Thread(exercise.new CounterThread()));
			counters.get(i).setName("Thread-"+i);
			counters.get(i).start();
		}
		
		try {
			for (int i=0; i < 4; i++) {
				counters.get(i).join();
				System.out.println(String.format("main waited on: %s: alive? %s", counters.get(i).getName(), counters.get(i).isAlive()));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	// Quick checks
	public class CounterThread extends Counter implements Runnable {
		
		@Override
		public void run() {
			while(getCount() < 4) {
				try {
					System.out.println( String.format("%s before sees: %d", Thread.currentThread().getName(), getCount()) );
					Thread.sleep(1 + new java.util.Random().nextInt(10) * 1000);
					increment();
					System.out.println( String.format("%s after sees: %d", Thread.currentThread().getName(), getCount()) );
				} catch (InterruptedException e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		}
		
	}
}