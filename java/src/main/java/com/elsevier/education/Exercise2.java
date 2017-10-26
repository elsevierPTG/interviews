package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		//private GasEngine engine = new GasEngine();
		//clostad 10-26-2017 use the @Inject annotation
		@Inject GasEngine engine;
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	// clostad 10-26-2017, created new class for Electric Engin
	public static class ElectricEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
