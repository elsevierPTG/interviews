package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

Explanation : here the getInstance method acts as the Factory for generating the specified Object's instance and thus injecting the dependency.
			  having an interface provides with the needed abstraction for the implementing Classes of this Type. This way all of the implementing
			  classes of type Engine need to have the functionality of spinning wheels.

*/
public class Exercise2 {

	public static class Car {
		
		public Car() {
		}
		
		private Engine engine = getInstance("gas");
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static getInstance(String engineType) {
		if("gas".equalsIgnoreCase(engineType)) {
			return new GasEngine();
		}
		else {
			return new ElectricEngine();
		}
	}

	public interface Engine {
		void spinWheels();
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