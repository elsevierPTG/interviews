package com.elsevier.education;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.elsevier.education.Exercise2.Car;
import com.elsevier.education.Exercise2.ElectricEngine;
import com.elsevier.education.Exercise2.GasEngine;

public class Exercise2Test {

	/**
	 * testing Electric car. Result should indicate a proper Electric Engine
	 * sound
	 */
	@Test
	public void testElectricCar() {
		Car car = new Car(new ElectricEngine());
		String sound = car.moveForward();
		assertTrue("This is an Electric Car. It should go whirr", sound.contains("whirr"));
	}

	/**
	 * testing Gas car. Result should indicate a proper Gas Engine sound
	 */
	@Test
	public void testGasCar() {
		Car car = new Car(new GasEngine());
		String sound = car.moveForward();
		assertTrue("This is a Gas Car. It should go Vroom", sound.contains("vroom"));
	}
}
