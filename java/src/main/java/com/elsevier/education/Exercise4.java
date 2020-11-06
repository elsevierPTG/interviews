package com.elsevier.education;

/**

Adding synchronized will locki access to shared data while it is being operated on by a thread,
 so if we have more than concurrent call for same function has "synchronized", first one will be excute then the others will be in queue waiting
 for calling the function, which give last updated value.

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