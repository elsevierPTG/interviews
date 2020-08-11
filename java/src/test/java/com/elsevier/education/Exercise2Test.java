package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise2.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class Exercise2Test {

    @Test
    public void testAsElement() {
        Car gasCar = CarFactory.GasCar();
        Car electricCar = CarFactory.ElectricCar();

        //Make sure both cars operate the same
        assertEquals(gasCar.moveForward(), electricCar.moveForward());

        //Make sure the correct engine types were injected
        assertEquals(gasCar.getEngineType(), "GasEngine");
        assertEquals(electricCar.getEngineType(), "ElectricEngine");
    }
}
