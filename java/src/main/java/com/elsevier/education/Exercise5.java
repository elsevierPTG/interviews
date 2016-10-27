package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
Answer: Simply made it create one instance at class load time and restrict constructor access
*/
public class Exercise5 {
	
	public static class Singleton {
		public final static Singleton INSTANCE = new Singleton();
		private Singleton() {
			//Made it private to avoid any instantiations from outside
		}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){

		Singleton.INSTANCE.doSomeThing();
	}
}
