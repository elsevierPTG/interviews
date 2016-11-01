package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		Singleton s=null;
		private Singleton(){
			
		}
		
		public static Singleton getSingleton(Singleton s){
			
			if(s==null){
				
			s=new Singleton();
				
				
			}		
			
		return s;	
		}
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st =Singleton.getSingleton();
		st.doSomeThing();
	}
}
