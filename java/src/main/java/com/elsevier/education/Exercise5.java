package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public class Singleton {

		public static final Singleton singleton = new Singleton();

		private Singleton(){}

		public static Singleton getInstance(){
			if(singleton!=null){
				return singleton;
			}
		}
	
		
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
