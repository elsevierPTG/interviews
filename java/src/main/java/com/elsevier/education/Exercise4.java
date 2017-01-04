package com.elsevier.education;

/**
TODO Is Counter thread-safe? NO

If so, why, and if not, how can we fix it?  
    * add an member object to use as a read/write lock
    * synchronize on this object
    * it is insufficient to simply make these methods synchronized
        because increment and resetCount could be running concurrently
        and result in unexpected behavior. need to synchronize btwn 
        methods
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		private Object rwlock = new Object();
			
		
		public int increment() {
			synchronized (rwlock) {
				++count;
			}
			return count;
		}
		
		public int getCount() {
			synchronized (rwlock) {
				return count;
			}
		}
		
		public void resetCount() {
			synchronized (rwlock) {
				count = 0;	
			}
		}
	}
}
