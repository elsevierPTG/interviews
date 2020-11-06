package com.elsevier.education;

/**
 * 
 * This class is made thread safe by making the variable counter volatile. 
 * (volatile variable is always read from the memory, not from the thread cache)
 * 
 * @author Mukul Das 
 * Email: m.das001@yahoo.com
 * Recruiter: Collabera
 * 
 * 
 */
public class Exercise4 {
	public static class Counter {
			
			private volatile int count = 0;
			
			public int increment() {
				return ++count;
			}
			
			public int getCount() {
				return count;
			}
			
			public void resetCount() {
				count = 0;
			}
	
		}
}
