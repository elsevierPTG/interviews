package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
/**
 * 
 * @author swapnilkulkarni
 * @author swapnilkulkarni 
 * email - kulswapnil@gmail.com
 * cell - 267 844 5443
 * recuiter - collabera
 * No. 
 */
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
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
