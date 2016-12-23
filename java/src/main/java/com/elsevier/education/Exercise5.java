package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public  static class Singleton {

              private static Singleton single;

              private Singleton (){ 
                if(single!=null){
                 throw new IllegalAccessException("Instance already created") ;             

                 }

            public static Singleton getSingleton(){

            if(single==null){
              return new Singleton ();
              } 
           }


		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton single = Singleton.getSingleton(); 
		single.doSomeThing();
	}
}

