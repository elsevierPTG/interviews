package com.elsevier.education;

/**
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 * <p>
 * John: Tricky, because the main method will be able to access the private constructor.  Can make it a sibling class
 */
public class Exercise5 {

    public static void main(String a[]) {
        Singleton st = Singleton.getInstance();
        st.doSomething();
    }
}

class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    void doSomething() {
        System.out.println("Doing something....");
    }

    static Singleton getInstance() {
        return INSTANCE;
    }
}
