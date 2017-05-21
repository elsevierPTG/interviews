package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Comments - I believe we can add 'synchronized' to java classes/methods to make them thread safe for a single JVM

I added that keyword below for the methods.

I was thinking that it may not even be necessary to add those modifiers to those methdos, 
because they are non-static methods, and it could be less likely that different threads would access the
same instances of the Counter class in order to access those methods, but didn't have time to test this.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
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