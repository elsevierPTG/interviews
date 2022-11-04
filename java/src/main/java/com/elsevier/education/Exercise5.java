package com.elsevier.education;

/**

I moved Singleton into its own class because here, even though its constructor was private,
it was accessible to this class.

*/
public class Exercise5 {
			
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomething();
	}
}
