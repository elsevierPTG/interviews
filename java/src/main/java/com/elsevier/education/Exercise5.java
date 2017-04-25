package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

to make this class singleton making constructor private and getInstance method which is lazy loaded when needed
*/
public class Exercise5 {
    
    public static class Singleton {
        
        private static Singleton instance = new Singleton();
        
        private Singleton() {
        }
        public static Singleton getInstance() {
            return instance;
        }

        public void doSomething() {
            System.out.println("Doing something....");
        }
    }
        
    public static void main(String a[]){
        Singleton st = Singleton.getInstance();
        st.doSomething();
    }
}
