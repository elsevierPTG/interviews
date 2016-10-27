package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
// private const - not able to create object from other 
//if it null only i will create object 
it can be thread safe if it is synchronized and if need we can override clone methode to prevent the cloning
*/
public class Exercise5 {
	
	public  class Singleton {
		
		public static instance = null; 
		
		private Singleton (){
		}	
	      
	      public Excecise5 synchronized static getInstance()
	      {
		 if (instance == null)
		 {
		       instance = new Excecise5();
		 }
		  return  instance;   
	     }
	   public void doSomeThing() {
			System.out.println("Doing something....");
	       }
	}
		
	public static void main(String a[]){
		Singleton st =  getInstance();
		st.doSomeThing();
	}
}
