package com.elsevier.education;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.elsevier.education.Exercise2.Car;
import com.elsevier.education.Exercise2.ElectricEngine;
import com.elsevier.education.Exercise2.Engine;
import com.elsevier.education.Exercise2.GasEngine;

public class Exercise2Test {

    @Test
    public void testDifferentOutput() {
    	Engine gasEngine = new GasEngine();
    	Engine electricEngine = new ElectricEngine();
    	
		Car sentra = new Car(gasEngine);
		Car tesla = new Car(electricEngine);

		assertEquals(sentra.getEngine(), gasEngine);
		assertEquals(tesla.getEngine(), electricEngine);
    }
    
}
