package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance;

		//static method to return an existing instane of the Singleton class, if already initialized
	    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
			}

			return instance;
		}

		public void  doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Exercise5.Singleton st = new Exercise5.Singleton().getInstance();
		st.doSomeThing();
	}
}
