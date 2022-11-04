package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
Multiple ways to create a thread-safe singleton, one way to do it is synchronize the getInstance, other way is to use a volatile variable
*/
public class Exercise5 {
	
	public static class Singleton {

		private static volatile Singleton singletonObj;
		private static Object mutex = new Object();

		private Singleton() {}

		public static Singleton getSingletonObj() {
			Singleton testObj = singletonObj;
			if (testObj == null) {
				synchronized(mutex) {
					testObj = singletonObj;
					if (testObj==null) {
						singletonObj = testObj = new Singleton();
					}
				}
			}
			return testObj;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.getSingletonObj();
		st.doSomething();
	}
}
