package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
    public static class Singleton {
	
	// Making a private static final object, to avoid getInstance() from making synchronized.
        private static final Singleton OBJECT = new Singleton();

        public static Singleton getInstance() {
            return Singleton.OBJECT;
        }

        public void doSomething() {
            System.out.println("Doing something....");
        }
    }

    public static void main(final String a[]) {
        final Singleton st = Singleton.getInstance();
        st.doSomething();
    }
}
