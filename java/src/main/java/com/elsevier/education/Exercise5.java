package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 java 8 style to enum.  Otherwise would have had the double syncronized check on the instance and a get instances method
 to return the single instance

*/
public class Exercise5 {
	
	public enum Singleton {
		INSTANCE;
		public static void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton.doSomething();
	}
}
