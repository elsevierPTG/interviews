package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton singleton = new Singleton( );
		//create a private constructor preventing any other class from instantiating.
		private Singleton()
		{
		}
		  /* Static 'instance' method */
                 public static Singleton getInstance( ) {
                 return singleton;
                 }
		//modified to protected from public
		protected void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//removed new operator from main method used getinstance to simply return the instance
		Singleton st = Singleton.getInstance( );
		st.doSomeThing();
	}
}
