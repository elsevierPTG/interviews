package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		//modified engine field to use the interface 'Engine'
		private Engine engine;
		
		//modify constructor to take dependency injected engine
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	//All dependency injected engines must follow this interface
	public interface Engine {
		public void spinWheels();
	}
	
	//have GasEngine implement Engine interface
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
	//have ElectricEngine implement Engine interface
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
