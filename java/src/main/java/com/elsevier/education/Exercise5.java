package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	/**
	 * Inner classes change the rules on being able to create the singleton.  So I moved it out into it's own class.
	 * @param a
	 */
		
	public static void main(String a[]){
		Singleton st = Singleton.instance();
//		Singleton stg = new Singleton();
		st.doSomething();
	}
}
