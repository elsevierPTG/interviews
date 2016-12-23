package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine;
		
		public Car() {
		}
		
		public void moveForward(GasEngine engine) {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine extends car {
		public void spinWheels() {
			// no-op for now
		}
	}
}
