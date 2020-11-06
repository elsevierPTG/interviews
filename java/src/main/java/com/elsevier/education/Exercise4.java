package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Answer:
While most operations on primitives are atomic (and thread safe), increment() could be written as follows:

count = count + 1;
return count;

If two threads call the same Counter instance at nearly the same instant, 
one thread may see count returned having been incremented twice.

Easiest fix is to add 'synchronized' keyword.

Note: the getCount() method should always be used if the exact count is needed at any instance.
If two threads do call at nearly the same time, now with 'synchronized', you 'properly' hid the other
update. Truly, if you have multiple threads updating the count quite quickly, you will only ever get a lower
bound on the current count, even with getCount().  It might be increased again before your code even uses the returned value!
*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		//returns count after the callers update
		public synchronized int increment() { //updated with synchronized
			return ++count;
		}
		
		//returns the current count
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
