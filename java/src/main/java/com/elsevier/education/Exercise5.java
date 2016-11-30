package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
               
         private static Singleton singletonObject; 

         private Singleton(){      // created private constructor in order to create object from outside.
	 }

	public static Singleton getInstance() { // This method will create the new object if not exist already.
		if(singleton != null){ 
		       return singleton;
		}
		else{
		       return new Singleton();
		}

	    }
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance(); // calling the getInstance method rather than creating every time.
		st.doSomeThing();
	}
}
