package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
	private static Singleton singleton = new  Singleton();		
		protected static void doSomeThing() {
			System.out.println("Doing something....");
	    }
		private Singleton(){
		}
		publis static Singleton getInstance(){
		return singleton;
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
