package com.elsevier.education;

/**
 * The purpose of this class is to show Singleton Example
*/
	
public class Singleton {

	   private static Singleton singleton = new Singleton( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private Singleton() { }

	   /* Static 'instance' method 
	    Private static variable of the same class that is the only instance of the class.
	    */
	   public static Singleton getInstance( ) {
	      return singleton;
	   }

	   /*Public static method that returns the instance of the class, this is the global access point for 
	    outer world to get the instance of the singleton class. */
	   protected static void doSomething( ) {
	      System.out.println("doSomething for singleton");
	   }
	}
	
 class SingletonDemo {

	   public static void main(String[] args) {
	      Singleton singletonObject = Singleton.getInstance( );
	      singletonObject.doSomething( );
	   }
	}
