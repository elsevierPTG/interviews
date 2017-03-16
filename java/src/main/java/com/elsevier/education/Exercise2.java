package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private interface Engine {
			void displayEngine();
		}
		
		private class GasEngine implements Engine {
			void displayEngine() {
				System.out.println("This is a gas engine");
			}
		}

		private class ElectricEngine implements Engine{
			void displayEngine() {
				System.out.println("This is a electric engine");
			}
		}
		
		private Engine engine;
		
		/**
		 * @param - GasEngine 
		 * Inject the dependency of engine at run time.
		 */
		public Car(Engine ge) {
			engine = ge;
		}
		
		/**
		 * @param - or, we can create a setter method
		 * Create a setter method.
		 */
		public void setGasEngine(Engine ge) {
			engine = ge;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}