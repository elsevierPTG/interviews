package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

My experience with no-op using java 8 is somewhat limited. When we moved to
java 8 at my previous job we were told not to use specific features in production code.
Hopefully that will not be a deal breaker.

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

	public interface Engine {
		public void spinWheels();
	}

	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
}