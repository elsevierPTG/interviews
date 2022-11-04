package com.elsevier.education;

/**

 TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 Changes made:
 1) make class Singleton non-static and in a separate file with the class definition
 2) add a private constructor Singleton(){} to class Singleton
 3) add a getInstance() method to class Singleton that returns a object of Singleton
 4) change the main method Singleton st = new Singleton(); statement to Singleton st = Singleton.getInstance();
 5) move the Singleton code to it's own file Singleton.java
 */
public class Exercise5 {

	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
