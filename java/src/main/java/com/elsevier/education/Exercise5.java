package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

@author ArnelLalicon
	a. Created static variable to hold the Singleton instance object
	b. Created private Singleton constructor so that only the static method can instantiate
	c. Created static getSingletonInstance to returning the Singleton instance
	d. In the main method, called the static method for getting the Singleton instance
*/
public class Exercise5 {

	public static class Singleton {

		private static Singleton singletonInstance = new Singleton();

		private Singleton() {
			
		}

		public static Singleton getSingletonInstance() {
			return singletonInstance;
		}

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]) {
		Singleton st = Singleton.getSingletonInstance();
		st.doSomething();
	}
}
