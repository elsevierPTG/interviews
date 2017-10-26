package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
   private static Singleton singleton = new Singleton( );

   /* A private Constructor prevents any other
    * class from instantiating.
    */
   private Singleton() { }

   /* Static 'instance' method */
   public static Singleton getInstance( ) {
      return singleton;
   }

   /* Other methods protected by singleton-ness */
   protected static void doSomething( ) {
      System.out.println("Doing something...."));
   }
	
   public class Singleton {

     public static void main(String[] args) {
        Singleton tmp = Singleton.getInstance( );
        tmp.doSometing( );
     }
   }
}
