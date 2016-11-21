package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4  extends Thread{

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
	public void run(){
		increment();
}
