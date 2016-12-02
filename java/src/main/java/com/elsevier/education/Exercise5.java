package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton st = null;
		/*constructor is made private to ensure it is not called outside of the class*/
		private Singleton(){
		}
		//synchronized to ensure thread-safety
		public static synchronized Singleton getInstance(){
			//create new instance only if st is null or return the old one
			if(st == null){
				st = new Singleton();
			}
			return st;
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
