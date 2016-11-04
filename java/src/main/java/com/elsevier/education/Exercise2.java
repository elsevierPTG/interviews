package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public interface Engine {
		default void spinWheels() {
			// no-op for now
		}
	}

	public static class Car {
		
		private final Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine implements Engine {}

	public static class ElectricEngine implements Engine {}

	public static void main(String[] args) {
		Car veryEfficientCar = new Car(new GasEngine());
		veryEfficientCar.moveForward();

		Car tesla = new Car(new ElectricEngine());
		tesla.moveForward();
	}
}