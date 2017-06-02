package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
Make the constructor private and return the singleton through a getInstance method
*/
public class Exercise5 {
	private static Exercise5 singleton = new Exercise5( );

	/**
	 *  Make the constructor private
	 */
	private Exercise5() { }

	/**
	 * accessor method for the Singleton
	 * @return
     */
	public static Exercise5 getInstance( ) {
		return singleton;
	}

    /**
     *  make method protected
     */
	protected static void doSomething( ) {
		System.out.println("Doing Something ... ");
	}

	public static void main(String[] args) {
		Exercise5 st = Exercise5.getInstance( );
		st.doSomething( );
	}
}
