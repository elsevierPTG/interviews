package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}

//This is not optimal but keeps the Exercise5 Class from accessing private constructs of the nested class.  
//Inner classes are not static so they cannot have static methods, which breaks the Single pattern. 
//This really should be in its own file, but for simplicity, I left it in the same file with the default visibility.

class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		super();
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Doing something....");
    }
}

