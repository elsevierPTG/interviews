package com.elsevier.education;

import Test.Singleton;

/**
 * 
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method
 * should still call .doSomething().
 * 
 */
public class Exercise5 {

	public static class Singleton {

		private static Singleton singletonInstance;

		private Singleton() {}

		public static Singleton getInstance() {
			if (singletonInstance == null) {
				singletonInstance = new Singleton();
			}
			return singletonInstance;
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
