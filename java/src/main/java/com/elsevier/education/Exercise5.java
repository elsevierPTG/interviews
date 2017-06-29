package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	

		
	public static void main(String a[]){
        Exercise5Singleton st = Exercise5Singleton.getInstance();
		st.doSomeThing();
	}
}
