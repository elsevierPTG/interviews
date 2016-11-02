package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine.
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {

		//private GasEngine engine = new GasEngine();
		private Engine engine;

		//Creation of car object with the required engines
		public Car(Engine engine) {
			this.engine = en;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	//Creating a seperate engine interface for injecting through through the constructor.
	public static interface Engine {
	 	public void spinWheels();
 	}


	//Creating the implementation of the Engines
	public static class GasEngine implements Engine  {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine  {
			public void spinWheels() {
				// no-op for now
			}
	}
}