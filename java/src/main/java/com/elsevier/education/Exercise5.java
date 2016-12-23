package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		private Singleton()
		{}
		Static Singleton getInstance(){
			return new Singleton();
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
