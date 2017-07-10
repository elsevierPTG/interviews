package com.elsevier.education;  
/**  
TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().   
*/ 
public class Exercise5 {  
	public static class Singleton implements Serializabe { 
 		Singleton st = null;
 		private Singleton() {
 		} 
		public static Singleton getSingleton() { 
			if(st == null) { 
				st = new Singleton(); 
			} 
			return st; 
 		}
 		public void doSomething() {  
			System.out.println("Doing something....");  
		} 
           
		public Object readObject() {
			// do nothing to prevent recreation of object
		}
	}  
	public static void main(String a[]) {
		Singleton st = Singleton.getSingleton(); 
		st.doSomeThing();  
	} 
} 
