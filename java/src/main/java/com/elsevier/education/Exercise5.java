package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public final static class Singleton {
		private final static Singleton st=new Singleton();
		public static Singleton getInstance(){
			if(st!=null){
				throw new IllegalStateException("Instance already created");
			}
			else{
				return st;
			}
		//Check is being done to explore whether an object is duplicated.
		//If yes,then singleton property is violated.
		private Singleton{
		}
		//We make constructor as private because: 1.We cannot create object outside of the class.
                //                                        2.Singleton cannot allow any duplication in creating the instance of the class.

		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton.getInstance().doSomething();
		
	}
}
