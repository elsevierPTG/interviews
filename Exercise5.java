package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singeton instance=null;
		private Singleton(){ };
		public sincronized Singeton getInstance(){
			if (instance==null){
				instance=new Singeton();
			}
			return instance;
		}
		public void doSomething() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		//Singleton st = new Singleton();
		Singleton st =Singeton.getInstance();
		
		st.doSomeThing();
	}
}
