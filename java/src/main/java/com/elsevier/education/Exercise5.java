package com.elsevier.education;

/**
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method
 * should still call .doSomething().
 */
public class Exercise5 {

    public static class Singleton {

	private static Singleton obj; // static enforces only one instance of
				      // the variable obj

	/*
	 * Provide a public getInstance() method that creates the object if it's
	 * null (not created) for the first time. The subsequent calls to this
	 * method simply returns the same obj, there by keeping only one memory
	 * allocation and allowing singleton, i.e single instance of the object.
	 * This helps to control single object creation.
	 */
	public static Singleton getInstance() {
	    if (obj == null) {
		obj = new Singleton();
	    }
	    return obj;
	}

	/*
	 * Make the constructor private such that nobody other than this class
	 * can call it to create the object
	 */
	private Singleton() {
	}

	public void doSomething() {
	    System.out.println("Doing something....");
	}
    }

    public static void main(String a[]) {
	Singleton st = Singleton.getInstance();
	st.doSomething();
	Singleton st1 = Singleton.getInstance();
	st1.doSomething();
	if (st == st1) {
	    System.out.println("Yay!! Single instance of singleton");
	} else {
	    System.out.println("NOT Single instance of singleton");
	}
    }
}