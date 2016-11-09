package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
To implement Singleton pattern, we have different approaches

Private constructor to restrict instantiation of the class from other classes.
Private static variable of the same class that is the only instance of the class.
Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.

And a thread-safe singleton class is to make the global access method synchronized, so that only one thread can execute this method at a time
*/
public class Exercise5 {
	
	public static class Singleton {
		
	   private static Singleton instance;
    
           private Singleton(){}
    
	    public static synchronized Singleton getInstance(){
		if(instance == null){
		    instance = new Singleton();
		}
		return instance;
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
