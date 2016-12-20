package com.elsevier.education;

/**
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method
 * should still call .doSomething().
 */
public class Exercise5 {

	public static class Singleton {

		// eager initialization of the class. 
		private static final Singleton INSTANCE = new Singleton();

		private Singleton() {

		}

		// marking static final so that sub class cannot override.
		public static final Singleton getInstance() {
			return INSTANCE;
		}

		public void doSomeThing() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]) {
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
