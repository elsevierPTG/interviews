package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton st=null;
		private Singleton(){
			
		}
		public static synchronized Singleton getInstance(){
 			//Condition is to ensure that only one instance of object is created .
 			if(st == null){
 				st = new Singleton();
 			}
 			return st;
 		}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st =Singleton.getInstance();
		st.doSomeThing();
	}
}
