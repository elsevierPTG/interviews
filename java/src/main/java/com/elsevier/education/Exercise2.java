package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine en) {
			this.engine = en;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	//Seperate engine to be an interface, and inject the dependency through the constructor.
	public static interface Engine {
		public void spinWheels();
	}
	
	
	
	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine implements Engine{
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}

}