package com.elsevier.education;

import java.util.concurrent.atomic.AtomicInteger;

/**
Candidate : Jin W. Chen
Email : JinWChen@yahoo.com
recruiter :
Linda Pham | Technical Recruiter
JOBSPRING PHILADELPHIA 
Office: (267) 765-6100

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
*/
public class Exercise4 {

	public static class Counter {
		
		private AtomicInteger count = new AtomicInteger(0);
		
		public int increment() {
			return count.incrementAndGet();
		}
		
		public int getCount() {
			return count.get();
		}
		
		public void resetCount() {
			count = new AtomicInteger(0);
		}
		
	}
	
}
