package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public final static class Singleton {
        private final static Singleton st = new Singleton();
	
	//Check is done to explore whether the object is already created.
	//If yes,then an IllegalStateException is thrown as it violates singleton properties. 
        public static Singleton getInstance() {

        if(st!=null){
        throw new IllegalStateException("Instance already created");
        }
        else
        {
        return st;
        }
        
	//We make constructor as private because: 
	//1.We cannot create object outside of the class.
        //2.Singleton cannot allow any duplication in creating the instance of the class.
        private Singleton() {}

        


        public void doSomeThing() {
        System.out.println("Doing something....");
        }
        }
        public static void main(String a[]){
        Singleton.getInstance().doSomeThing();
        }
}
