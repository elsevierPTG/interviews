package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

/**
 * 
 * @author swapnilkulkarni
 * @author swapnilkulkarni 
 * email - kulswapnil@gmail.com
 * cell - 267 844 5443
 * recuiter - collabera
 * Created object of the class
 * Added private constructor, so that no one else can instatiate the class
 * added static method to return instance of class
 * made the doSomething method as static so that main method can call it.
 *  */
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton singleton = new Singleton( );
    	    
		private Singleton() { }

    	    public static Singleton getInstance( ) {
		      return singleton;
		   }
	   
		public static void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
