package com.elsevier.education;

/**
Candidate : Jin W. Chen
Email : JinWChen@yahoo.com
recruiter :
Linda Pham | Technical Recruiter
JOBSPRING PHILADELPHIA 
Office: (267) 765-6100

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
		
		private static Singleton singleton;
		
		public void doSomething() {
			System.out.println("Doing something....");
	    }
		
		public static synchronized Singleton getInstance( ) {
			if (singleton == null) {
				singleton = new Singleton();
			}
			return singleton;
		}
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
