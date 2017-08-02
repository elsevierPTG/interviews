package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

Note:

To create a singleton at least in Java, one needs a static entry holding an instance 
to the class instance as well as a static getter to access that entry and the constructor
to be private.  I did just that and changed the calling mechanism in main() to act 
accordingly as well.
*/
public class Exercise5
{	
	public static class Singleton
	{
		private static Singleton mObjSingleton = null;
		
		private Singleton()
		{ }
		
		public void doSomething()
		{
			System.out.println("Doing something....");
	    }
		
		public static Singleton getSingleton()
		{
			if(mObjSingleton == null)
				mObjSingleton = new Singleton();
			
			return(mObjSingleton);
		}
	}
	
	public static void main(String a[])
	{
		Singleton.getSingleton().doSomeThing();
	}
}