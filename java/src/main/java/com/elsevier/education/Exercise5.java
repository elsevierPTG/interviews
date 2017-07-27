package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {

		private static Singleton singleton = new Singleton();

		/*
		private constructor to avoid client to use constructor
		 */
		private Singleton(){}

        /**
         * This is eager initialization of singleton class.
         * @return
         */
		public static Singleton getInstance(){
			return singleton;
		}

		public void doSomething() {
			System.out.println("Doing something....");
	    }

    }
		
	public static void main(String a[]){
		Singleton.getInstance().doSomething();
	}
}
