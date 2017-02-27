package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton st =  null;
		//Constructor is made private to prevent any other class from instantiating.
		private Singleton(){
		}
			
		public static synchronized Singleton getInstance(){
			//create new instance only if st is null
			if(st == null)	{
				st = new Singleton();
			}
			return st;
		}
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = new Singleton.getInstance();
		st.doSomeThing();
	}
}
