package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public final static class Singleton {
		private final static Singleton INSTANCE = new Singleton();

		public static Singleton getInstance() {
			return INSTANCE;
		}

		private Singleton() {}

		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton.getInstance().doSomeThing();
	}
}
