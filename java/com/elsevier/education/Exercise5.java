package com.elsevier.education;

/**

DHS Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private Singleton _instance = getInstance();
		  public Singleton() {
		      // Exists only to defeat instantiation.
		   } 
	
		   public  Singleton getInstance() {
			      if(_instance == null) {
			    	  _instance = new Singleton();
			      }
			      return _instance;
			   }	
		   
		   public void doSomething() {
			   System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]) {
		Singleton st = new Singleton();
		st.doSomething();
	}
}
