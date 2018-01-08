package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		 private static Singleton st;
    /**
     * Create private constructor
     */
    private Singleton(){
         
    }
     /**
     * Create a static method to get instance.
     */
    public static Singleton getInstance(){
        if(st == null){
            st = new Singleton();
        }
        return myObj;
    }
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
