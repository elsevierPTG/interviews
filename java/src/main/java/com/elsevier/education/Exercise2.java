package com.elsevier.education;

/**
TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.
Updated the Car constructor to inject the dependency and also updated the moveForward method to change the dependency
*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine = null;
		
		public Car(GasEngine gasEngine) {
			this.engine = gasEngine;
		}
		
		public void moveForward(GasEngine engine) {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
