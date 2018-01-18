package com.elsevier.education;

/**
 * 
 * There are multiple ways to implement a thread-safe singleton. 
 * In the first approach (commented), I synchronize the getInstance method and perform lazy instantiation of the instance. 
 * It ensures thread-safety by performing a class-level lock on every call to getInstance, assigning a new instance once and returning the same
 * instance otherwise. However, it is not efficient, as we have to obtain the lock every time we want access to the instance.
 * 
 * The second approach is to use a volatile variable, so we are directly accessing main memory. 
 * The result variable ensures we only access the volatile field once improving performance. 
 * 
 * @author JFracassi
 *
 */
public class Exercise5 {

	// Approach #1:

	//	public static class Singleton {
	//
	//		private static Singleton instance;
	//		
	//		private Singleton() {}
	//
	//		public static synchronized Singleton getInstance() {
	//			if (instance == null) {
	//				instance = new Singleton();
	//			}
	//			return instance;
	//		}
	//
	//		public void doSomething() {
	//			System.out.println("Doing something....");
	//		}
	//	}

	// Approach #2:

	public static class Singleton {

		private static volatile Singleton instance;
		private static Object mutex = new Object();

		private Singleton() {}

		public static Singleton getInstance() {
			Singleton result = instance;
			if (result == null) {
				synchronized(mutex) {
					result = instance;
					if (result==null) {
						instance = result = new Singleton();
					}
				}
			}
			return result;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
