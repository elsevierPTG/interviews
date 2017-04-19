package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
  
  public static class Singleton {
    
    private final static Singleton singleton = new Singleton();
  
    private Singleton() {
    }
    
    public void doSomething() {
      System.out.println("Doing something....");
    }
    
    public static Singleton getInstance(){
      return singleton;
    }
  }
    
  public static void main(String a[]){
    Singleton st = Singleton.getInstance();
    st.doSomething();
  }
}
