package com.elsevier.education;

/**
 * 
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method
 * should still call .doSomething().
 * 
 * 1. declared the constructor as private, so that can not be instantiated outside.
 * 2. declared the private static instance variable
 * 3. provided the helper method getInstance to create the instance of Singleton class or return one if it is already created
 * 4. used double checking along with synchronized block to avoid the expensiveness of synchronized methods.
 * 
 */
public class Exercise5 {

	public static class Singleton {

		private static Singleton singletonInstance = null;

		private Singleton() {

		}

		public static Singleton getInstance() {
			if (singletonInstance == null) {
				synchronized (Singleton.class) {
					if (singletonInstance == null)
						singletonInstance = new Singleton();
				}
			}
			return singletonInstance;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]) {
		Singleton st = Singleton.getInstance();
		st.doSomething();		
	}
}
