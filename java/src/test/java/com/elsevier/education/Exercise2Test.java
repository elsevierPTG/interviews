package com.elsevier.education;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elsevier.education.Exercise2.Car;
import com.elsevier.education.Exercise2.ElectricEngine;
import com.elsevier.education.Exercise2.GasEngine;

public class Exercise2Test {
	
	
	@Test
	public void canGetGasCarBean(){
		try(final ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring/carEngine.xml");){
			final Car gasCar = (Car) ctx.getBean("gasCar");
			assertNotNull(gasCar);
			gasCar.moveForward();
			assertTrue(GasEngine.class.isInstance(gasCar.engine));
		}
	}
	
	@Test
	public void canGetElectricCarBean(){
		try(final ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring/carEngine.xml");){		final Car electricCar = (Car) ctx.getBean("electricCar");
			assertNotNull(electricCar);
			electricCar.moveForward();
			assertTrue(ElectricEngine.class.isInstance(electricCar.engine));
		}
	}
}
