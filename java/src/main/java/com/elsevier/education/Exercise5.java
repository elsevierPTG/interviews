package com.elsevier.education;

/**
 *  * @author Dineshkumar Periyasamy mtrdinesh@gmail.com
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
Convert the constructor to private, so that outside the class no one can create object apart from getInstance method
Make get instance singleton by adding synchronized block
*/
public class Exercise5 {
	
	public static class Singleton {
		Singleton st = null;
		private Singleton(){}
		public static Singleton getInstance()
		{
			synchronized () {
				if(null== st)
				{
					st = new Singleton();
				}
				return st;
			}
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
