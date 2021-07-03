package com.elsevier.education;

/**

DONE: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

EXPLANATION: This is a standard design pattern. I add a private static final variable
which refers to the Singleton instance, a private default constructor for creating this
instance, and a public static method which "gets" (returns) the instance.

*/
public class Exercise5 {

	public static class Singleton {
		private static final Singleton instance = new Singleton();

		private Singleton() {
			// no-op (for now!)
		}

		public static Singleton getInstance() {
			return instance;
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
