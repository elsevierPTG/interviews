package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton st = new Singleton();
		
	    public static Singleton getObject(){
	    	return st;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		
		Singleton st= Singleton.getObject();
		st.doSomething();
	}
}
