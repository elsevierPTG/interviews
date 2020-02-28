package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 //There is a really cool library out there called lombok https://projectlombok.org/ which uses an annotation for this
 //by actually adding the byte code to the class file but not muddying up the java.
 //I did assume that you wanted to see the implemtation tho.

*/
public class Exercise5 {


	public static class Singleton {

		private static Singleton singleton;
		private Singleton(){}
		public static Singleton getInstance(){
			if(singleton == null){
				singleton = new Singleton();
			}
			return singleton;
		}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}
