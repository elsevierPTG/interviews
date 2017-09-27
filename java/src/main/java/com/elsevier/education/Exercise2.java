package com.elsevier.education;

/**
 * The Car class now uses dependency injection to get the engine it needs to go.
 * There is now a GasEngine class and ElectricEngine class that implement the
 * Engine interface, which has a spinWheels method. Both of those classes
 * have no-op implementations of that method.
 */

public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine newEngine) {
			engine = newEngine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static interface Engine {
		public void spinWheels();
	}

	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}