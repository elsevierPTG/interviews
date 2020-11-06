package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

// Created Engine interface, which GasEngine and ElectricEngine both implement (and each can define
// spinWheels() differently. In the Car class, you can pass in either GasEngine or ElectricEngine. 
// Consequently, when moveForward() is called, the spinWheels() method will be called for the 
// appropriate engine.

public class Exercise2 {

	interface Engine {
		public void spinWheels();
	}

	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op
		}
	}

	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op
		}
	}

	public static class Car {
		
		private Engine engine;

		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
}
