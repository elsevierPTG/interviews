package com.elsevier.education;

/**
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 */
public class Exercise5 {

	/**
	 * Storing a static instance reference. Whenever a Singleton is needed this will be supplied.
	 * Making the constructor private so the class cannot be initiated
	 */
	public static class Singleton {
		private static Singleton instance = new Singleton();

		private Singleton() {
		}

		public static Singleton getInstance() {
			return instance;
		}

		public void doSomeThing() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]) {
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}