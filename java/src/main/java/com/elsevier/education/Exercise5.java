package com.elsevier.education;

/**
 *
 Steps for turning the class into a singleton:

 1) Add state containing the single instance
    - Final and static modifiers ensure that one instance is
      created and it cannot be changed/removed
 2) Add private constructor
    - This prevents new instances of the class from being created
 3) Add accessor method
    - Allows other classes to access the instance, since new ones
      cannot be created
 4) Make class final
    -  A subclass is technically an instance of its superclass,
       polymorphically speaking.

 @author Joseph Cosentino
*/
public final class Exercise5 {

    public static class Singleton {

        private static final Singleton INSTANCE = new Singleton();

        private Singleton() {

        }

        public static Singleton getInstance() {
            return INSTANCE;
        }

        public void doSomeThing() {
            System.out.println("Doing something....");
        }
    }

    public static void main(String a[]){
        Singleton st = Singleton.getInstance();
        st.doSomeThing();
    }
}
