package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {

  /**
   * Using an enum to create a Singleton guarantees that there will only be one instance (cannot
   * create another instance even with reflection).
   */
  public static enum Singleton {

    INSTANCE;

    private Singleton() {
      // Any initializations here...
    }

    public void doSomething() {
      System.out.println("Doing something....");
    }
  }

  public static void main(String a[]) {
    Singleton st = Singleton.INSTANCE;
    st.doSomething();
  }
}
