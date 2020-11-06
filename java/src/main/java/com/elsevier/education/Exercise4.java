package com.elsevier.education;

/**
@author - Todd Goglia 8/22/2017
Updated the counter class to be thread safe by making the count member volatile and adding synchronized to the method signatures. 
Probably could have left the getCount() method, but unless performance is a serious consideration what the hey...

*/
public class Exercise4 {

	public static class Counter {
		
		private volatile int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
	
		public synchronized int getCount() {
			return count;
		}
		
		public synchronized void resetCount() {
			count = 0;
		}

	}
}