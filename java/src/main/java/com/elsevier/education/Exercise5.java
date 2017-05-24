package com.elsevier.education;

/**
* Classic Singleton implementation
* @author Boris Filipov
*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance = null;
		private Singleton() {
		}
		public static Singleton getInstance() {
		      if(instance == null) {
		         instance = new Singleton();
		      }
		      return instance;
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