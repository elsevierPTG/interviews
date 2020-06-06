package com.elsevier.education;

import com.elsevier.education.Engine;

/**

DONE refactor the Car to use dependency injection of the engine (wrote test case to demonstrate)
DONE allow use of either a gas engine or electric engine (create an appropriate abstraction)
DONE make sure we have no-op implementations of the gas engine and electric engine

FIX - pass the engine in the Car constructor - that makes the caller of Car configure the engine type, instead of the car class

*/
public class Exercise2 {

	
	
	public static class Car {
		
		private Engine engine;
		
		public Car(Engine anEngine) {
			engine = anEngine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
		
		public String getEngineType() {
			return engine.getType();
		}
	}
}