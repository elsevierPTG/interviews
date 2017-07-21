package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Explanation : Counter is NOT thread-safe as multiple threads can access the methods at the same time which changes the value of the count variable.
 			  This will lead to access issues and there will be dirty reads of the values.
 			  We will need to add the modifier volatile to the count variable which will make the access to it synchronized (as if having a synchronized block of code).
 			  
 			  Making only the methods 'increment' and 'resetCount' synchronized will not serve full purpose as some thread might be calling increment at exactly the same time some
 			  other thread is calling resetCount leading to not having proper values read by the caller(s).

*/
public class Exercise4 {

	public static class Counter {
		
		private volatile int count = 0;
		
		public int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}