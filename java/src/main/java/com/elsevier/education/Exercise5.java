package com.elsevier.education;

/**
 TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().
 */
public class Exercise5 {

    public static class Singleton {
        private static Singleton instance = null;
        private Singleton() { //prevent direct usage of the default constructor
        }
        //the absence of any other constructors guarantees that the only way to get object(s) of the 
        //class Singleton is through the static getInstance() method
        public static synchronized Singleton getInstance() { //make sure getInstance() is thread safe
            if (null == instance) { // do not make new instances of the class if one exists already
                instance = new Singleton();
            }
            return instance;
        }
        public void doSomeThing() {
            System.out.println("Doing something....");
        }
    }

    public static void main(String a[]){
        Singleton st = new Singleton();
        st.doSomeThing();
    }
}