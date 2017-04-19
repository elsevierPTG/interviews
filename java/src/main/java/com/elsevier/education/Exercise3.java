package com.elsevier.education;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
 
 Everytime the hashcode is called generator.nextInt() generates new value. So same object inserting twice in Set would have a different hashcode. 
 Changed hashcode method

*/
public class Exercise3 {

  public static class Person {
  
    private Integer id;
    
    public Person(int newId) {
      id = newId;
    }
    
    public int hashCode() {
      return id.hashCode();
    }
    
    public boolean equals(Object other) {
      return id.equals(((Person)other).id);
    }
  }
}
