package com.elsevier.education;

/**
	@author James Herndon james.herndon@gmail.com 
	@version 1.01 Reimplemented Singleton as a singleton

 	Objective:Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

	Solution: Add a static member instance
	
	Obligatory advice to avoid singletons at all costs.
	
*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance = null;
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		public static Singleton getInstance() { 
			if (instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}

		
	public static void main(String a[]){
		Exercise5 ex5 = new Exercise5();
		
		Singleton st = Exercise5.Singleton.getInstance();
		st.doSomething();
	}
}
