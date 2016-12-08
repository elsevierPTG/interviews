package com.elsevier.education;


/**
 * TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 */
public class Exercise5 {

    public static class Singleton {
        // create private instance
        private static final Singleton instance = new Singleton();

        // make default constructor private
        private Singleton() {
        }

        public void doSomeThing() {
            System.out.println("Doing something....");
        }
    }

    public static void main(String a[]) {
        Singleton st = Singleton.instance;
        st.doSomeThing();
    }
}
