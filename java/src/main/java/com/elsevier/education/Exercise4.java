package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 Answer: No the class Counter is not thread-safe, since while one thread could be updating state, by changing int count
 value by invoking increment or resetCount, another thread could be reading count using getCount()
 The class Counter can be made thread-safe by
 1) making the class immutable, by making class final, removing increment and resetCount methods, making
 private final int count; and adding a constructor
 public Counter(int count) {
 this.count = count;
 }
 2) Make field count volatile:  private volatile int count = 0;
 3) make the three methods synchronized as below
 public synchronized int increment() { return ++count; }
 public synchronized int getCount() { return count; }
 public synchronized void resetCount() { count = 0; }

*/
public class Exercise4 {

	public static final class Counter {
		
//		private int count = 0;
//
//		public int increment() {
//			return ++count;
//		}
//
//		public int getCount() {
//			return count;
//		}
//
//		public void resetCount() {
//			count = 0;
//		}
		//With the first approach:
		private final int count;
		public Counter(int count) {
			this.count = count;
		}

		public  int getCount() { return count; }

	}
}