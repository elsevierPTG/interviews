package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	// implement clonable interface for clone not support Exception//
	public static class Singleton implements clonable {
		//create private static reference  //
		private static Singleton st=new Singleton();
		//create private constructor//
		private Singleton(){}
		// make a method as synchronized and instance or factory merthod
		public Synchronized Singleton doSomeThing() {
			if{
				st=new Singleton();
			
			System.out.println("Doing something....");
			}
			
			else {
				return st;
			}
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton();
		st.doSomeThing();
	}
}
