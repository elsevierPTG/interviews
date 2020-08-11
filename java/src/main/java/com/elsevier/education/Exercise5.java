package com.elsevier.education;

import java.util.Random;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
        //Create the single instance
        private static Singleton instance = null;

        private static Random generator = new java.util.Random();
        private Integer rn;


        //Private constructor to prevent it from being instantiated elsewhere
        private Singleton(){
        	rn = generator.nextInt();
        }

        //Method to retrieve the singleton
        public static Singleton getInstance(){
        	if(instance == null){
        		instance = new Singleton();
        	}
        	return instance;
        }

		private static void doSomething() {
			System.out.println("Doing something....");
	    }

	    //For unit testing
	    public Integer returnSomething(){
	    	return rn;
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
