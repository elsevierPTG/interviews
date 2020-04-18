package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine {
		void spinWheels();
	}

	public class GasEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}

	public class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}



}