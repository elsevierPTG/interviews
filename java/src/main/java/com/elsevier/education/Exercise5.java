package com.elsevier.education;


/**
 * 
 * This class is refactored to implement the class to be singleton.
 * -- contructor private
 * -- create a static instance and return that with a  method.
 * @author Mukul Das 
 * Email: m.das001@yahoo.com
 * Recruiter: Collabera
 * 
 * 
 */
public class Exercise5 {
		public static class Singleton {
			private Singleton(){
				
			}
			
			private static Singleton singleInstance = null;
			
			public static Singleton getSingeton() {
				
				if(singleInstance == null) {
					singleInstance = new Singleton();
				}
				return singleInstance;
			}
			
			
			
			public void doSomething() {
				System.out.println("Doing something....");
		    }
		}
			
		
}

