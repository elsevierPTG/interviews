package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

The only way I know to make this more thread safe is to synchronize the
setters of the class, increment and resetCount so multiple threads 
accessing it won't be able to screw up each other's counters.  I know 
of nothing else to do to improve it.

*/
public class Exercise4
{
	public static class Counter
	{
		private int count = 0;
		
		synchronized public int increment()
		{
			return(++count);
		}
		
		public int getCount()
		{
			return(count);
		}
		
		synchronized public void resetCount()
		{
			count = 0;
		}
	}
}