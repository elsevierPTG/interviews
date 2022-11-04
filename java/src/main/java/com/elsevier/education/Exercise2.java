package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	/**
	 * Introduced Engine interface, implementedby GasEngine and ElectricEngine classes.
	 * Implementation specific instnce of the Engine is injected during the construction of the Car class.
	 * See main() method for 
	 * 
	 * @author Alex
	 *
	 */
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
		void spinWheels();
	}
	
	public static class GasEngine implements Engine {
		public void spinWheels() {
			System.out.println("Running on gas...");
		}
	}
	
	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			System.out.println("Running on electric power...");
		}
	}
	
	public static void main(String[] args) {
		new Car(new GasEngine()).moveForward(); // "Running on gas..."
		new Car(new ElectricEngine()).moveForward(); // "Running on electric power..."
	}
}