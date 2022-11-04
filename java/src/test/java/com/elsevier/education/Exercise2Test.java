package com.elsevier.education;

import java.util.*;
import com.elsevier.education.Exercise2.Car;
import com.elsevier.education.Engine;
import com.elsevier.education.ElectricEngine;
import com.elsevier.education.GasEngine;
import static org.junit.Assert.*;
import org.junit.Test;

/**
*	test injection with a positive and negative test case of the engine type
*   the car's reported engine type should match what we installed at construction time
*    @author Andrew Lewis
*/

public class Exercise2Test {

    @Test
    public void testCarDependencyInjection() {

		ElectricEngine ee = new ElectricEngine();
		Car myCar = new Car(ee);
		GasEngine ge = new GasEngine();

        assertEquals(myCar.getEngineType(), "electric");
        assertNotEquals(myCar.getEngineType(), ge.getType() );   }
}
