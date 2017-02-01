package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 The car class now allows the engine to be injected during construction instead of having a hard dependency in the class.
 I picked an interface for the Engine class because the different types of Engines will spinWheels differently and
 there are no commonalities between then for the no-op methods. Gas Engine will use combustion to turn the wheels while
 an Electric will use electric motors
*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
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