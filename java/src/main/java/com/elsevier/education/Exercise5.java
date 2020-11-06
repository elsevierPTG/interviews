package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
			
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}


class Singleton {
	
	private static Singleton instance = new Singleton();

	// declare constructor as private 
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return instance;
    }
	  
	public void doSomeThing() {
		System.out.println("Doing something....");
    }
}

