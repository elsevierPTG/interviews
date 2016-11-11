package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
	//removed the factory pattern and added Dependency Injection to create objects	
		private GasEngine engine;
		private ElectricEngine electricEngine;
		
		public Car(GasEngine engine, ElectricEngine electricEngine;) {
		this.engine = engine;
			this.electricEngine = electricEngine;
		}
		
		public void moveForward() {
			engine.spinWheels();
			electricEngine.spinWheels();
		}
	}
	
	public static class GasEngine extends Car {
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine extends car{
		public void spinWheels() {
			// no-op for now
		}
	}
}
