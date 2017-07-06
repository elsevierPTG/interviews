package com.elsevier.education;
import static org.junit.Assert.*;
import org.junit.Test;
import com.elsevier.education.Exercise2.*;
/**
 * Created by davenportj on 7/6/2017.
 */
public class Exercise2Test {
  @Test
  public void createCarTest() {
    Car car1 = new Car(new GasEngine());
    car1.moveForward();
    Car car2 = new Car(new ElectricEngine());
    car2.moveForward();
  }

}