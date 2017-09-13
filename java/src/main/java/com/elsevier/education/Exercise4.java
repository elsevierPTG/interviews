package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

1- No.
2- Counter is not a thread safe class.
3- Because count is a shared variable when two or more threads call the getCount().
4- To fix this issue we have to syncronize the shared data.

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		//synchorized the increment()
		public synchorized int increment() {
			return ++count;
		}
		
		//directly acessing the shared data call from synchorized method.
		public int getCount() {
			//return count;
			return increment();
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
