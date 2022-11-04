package com.elsevier.education;



/**
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
*/
/**
 * Make constructor as private. So that we cannot create an object outside of the class.
 *	Create public method "getInstance" which returns the same instance throughout the application and also make the method "synchronized" which makes the method thread safe.
 *	Singleton pattern helps us to keep only one instance of a class at any time.
 * @author Safura
 *
 */
public class Exercise5 {	
	
	public static class Singleton {
		
		private static Singleton myObj;
	    /**
	     * Create private constructor
	     */
	    private Singleton(){
	         
	    }
	    /**
	     * Create a static method to get instance.
	     */
	    public static synchronized Singleton getInstance(){
	        if(myObj == null){
	            myObj = new Singleton();
	        }
	        return myObj;
	    }

		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}