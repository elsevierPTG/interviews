package com.elsevier.education;

public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		/**
		 * I did not think ++ is thread safe so I separated
                 * the equation and the return and refactored the implied increment by 1
		 */
		public int increment() {
                        counter = counter + 1;
			return this.counter
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
