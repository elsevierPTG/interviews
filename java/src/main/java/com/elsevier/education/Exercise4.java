package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Ans: Currently, the Counter Class is not thread-safe
because while 1 thread might be incrementing or getting the count
for a counter object, another thread might reset the count
This can cause getCount to return the wrong count depending on which
happens first.
The simplest way to make it thread safe is to simply make all of the methods
synchronized using public int synchronized or public void synchronized respectively   
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