package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car() {
		}
		
		public void setEngine(Engine engine) {
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
		
		@Override
		public void spinWheels() {
			// no-op for now
			System.out.println("Gas Engine spin wheel");
		}
		
	}
	
	public static class ElectricEngine implements Engine {
		
		@Override
		public void spinWheels() {
			// no-op for now
			System.out.println("Electric Engine spin wheel");
		}
	}
	
	public static void main(String[] args) {
		Car carWithGasEngine = new Car();
		carWithGasEngine.setEngine(new GasEngine());
		carWithGasEngine.moveForward();
		
		Car carWithElectricEngine = new Car();
		carWithElectricEngine.setEngine(new ElectricEngine());
		carWithElectricEngine.moveForward();
	}
}