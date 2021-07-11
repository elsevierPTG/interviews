package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

 AM: This should do it getInstance for Indurstry standards and such.
*/


public class Exercise5 {

	public static class Singleton {

		private static Singleton myInstance = null;

		private Singleton() {

		}

		public static Singleton getInstance() {
			if(myInstance == null) {
				myInstance = new Singleton();
			}
			return myInstance;
		}

		public void doSomeThing() {
			System.out.println("Doing something....");
		}
	}

	public static void main(String a[]){
		Singleton x = Singleton.getInstance();
		x.doSomeThing();
	}
}
