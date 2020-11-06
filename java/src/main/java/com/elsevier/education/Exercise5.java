package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton singleton;
		// private constructor to prevent object initialisation using new keyword
		private Singleton(){    
              	}
		public void doSomething() {
			System.out.println("Doing something....");
	    	}
		// object initialisation can be done only in this method as we have prevented from outside the class using private constructor
		public  static synchronized Singleton getInstance() { 
		     if(singleton==null){
			   singleton=new Singleton();
		     }
		     return singleton;
		 }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
