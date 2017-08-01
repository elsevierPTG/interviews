package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

/**
 * If new engine type is added, Engine can be abstracted to that sub engine type
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
	
	public static class GasEngine extends Engine {
		public void spinWheels() {
			System.out.println("This is a Gas engine");
		}
	}

	public static class ElectricEngine extends Engine {
		public void spinWheels() {
			System.out.println("This is a Electric engine");
		}
	}

	public static abstract class Engine {
		public abstract void spinWheels();
	}

	public static void main(String[] args) {
		Car electricCar = new Car(new ElectricEngine());
		electricCar.engine.spinWheels();

		Car gasCar = new Car(new GasEngine());
		gasCar.engine.spinWheels();
	}
}