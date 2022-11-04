package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 1. Created Engine interface to abstract different types of engines
 2. Changed field type from GasEngine to Engine to allow for abstracted engine types
 3. Pass the engine instance as a dependency to the constructor rather than having the class instantiate a particular type of engine
    Could also use field injection via @AutoWired or @Inject depending on container, but constructor injection is my preference due to
    being container agnostic, requiring all dependencies to be resolved prior to instantiating the consumer and simplifying mocking

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
		void spinWheels();
	}
	
	public static class GasEngine implements Engine {
		@Override public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine {
		@Override public void spinWheels() {
			// no-op for now
		}
	}
}