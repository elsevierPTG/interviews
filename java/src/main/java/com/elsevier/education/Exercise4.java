package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 Honestly, I'm not 100% sure whether the pre-fix increment is atomic or not. I think it is not, so that could run us into trouble where the value is being incremented while other access is occurring

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public int increment() {
			synchronized (this) {
				return ++count;
			}
		}
		
		public int getCount() {
			synchronized (this) {
				return count;
			}
		}
		
		public void resetCount() {
			synchronized (this) {
				count = 0;
			}
		}

	}
}