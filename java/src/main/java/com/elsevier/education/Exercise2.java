package com.elsevier.education;

/**
* 1. GasEngine class and ElectricEngine class are implementing the same interface to provide abstraction
* 2. Dependency Injection implemented by passing engine interface thru the constructor
* @author Boris Filipov 
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
	
	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
	public static interface Engine {
		public void spinWheels();
	}
}