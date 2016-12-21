package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.
We accomplish the above as follows:
 - create an interface Engine
 - modify GasEngine class to implement the Engine interface
 - create ElectricEngine which implements Engine interface
 - nodify car to use the Engine interface instead of a specific engine
*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine mEngine) {
			this.engine = mEngine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	// Gas engine class
	public static class GasEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	// Electric engine class
	public static class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	// Engine interface
	public interface Engine
	{
		public void spinWheels();
	}
}