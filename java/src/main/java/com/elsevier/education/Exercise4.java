package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

 Absolutely not. I would start by suggesting this -> https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/atomic/AtomicInteger.html

 I would hesitate to use the synchronized keyword, unless someone believed that they are God and capable of reasoning about
 endless temporal situations. Not interested in going there until someone can prove why the locking behavior of AtomicInteger is 'bad'.
 Generally I've found threading/concurrency solutions are problems in and of themselves, often failing to even adress the true underlying
 problem trying to be 'solved'.

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