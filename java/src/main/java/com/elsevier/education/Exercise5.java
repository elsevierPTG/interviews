package com.elsevier.education;

import com.elsevier.education.singleton.*;
/**
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
*/
public class Exercise5 {
	
	public static void main(String a[]){
//		Singleton st = new Singleton();  // must move Singleton class to another package, 
		                                 // otherwise, default constructor is accessible    
		Singleton st = Singleton.newInstance();
		st.doSomeThing();
	}
}
