package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		private static Singleton instance;
		private Singleton(){}
		
		private static Singleton getInstance()
		{
			if(instance==null)
			{
				synchronized(Singleton.class)
				{
					if(instance == null)
					{
						instance = new Singleton();
					}
				}
			}
			return instance;
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
