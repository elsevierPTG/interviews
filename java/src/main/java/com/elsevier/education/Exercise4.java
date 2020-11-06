package com.elsevier.education;

/**
* 1. Counter is not thread-safe, a single instance can be accessed by multiple threads.
* 2. One approach to make methods thread-safe is to add keyword synchronized.
* 3. synchronized keyword is not added to getCount() method to prevent unnecessary lock, because this method does not modify but only return
* "count" field.
* @author Boris Filipov
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public synchronized void resetCount() {
			count = 0;
		}

	}
}