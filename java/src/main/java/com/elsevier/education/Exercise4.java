package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		
		//can also use  AutomicInteger 
		private int count = 0;
		
		public int synchronized increment() {// defining method 'synchronized' , so that count variable is thread-safe
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void synchronized resetCount() {// defining method 'synchronized' , so that count variable is thread-safe
			count = 0;
		}

	}
}
