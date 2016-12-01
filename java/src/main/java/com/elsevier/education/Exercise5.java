package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static final Singleton singleton = new Singleton();
      
      		private Singleton(){
      		}
      
      		public static Singleton getInstance(){
        		return singleton;
      		}
      
		public void doSomeThing() {
			System.out.println("Doing something....");
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
