package com.elsevier.education;

/**
 * I've create an {@code Engine} interface, and created children {@link GasEngine} and
 * {@link ElectricEngine} classes.
 * Unfortunately I'm not familiar enough with how native Java injection annotations, though I know what injection
 * is, and have use a similar injections framework extensively before, namely Oracle ATg eCommerce Nucleus, and to a lesser
 * extend, Spring. However I did try my best to at least indicate the way to accomplish it (annotated constructor
 * with @Inject).
TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;


		@Inject
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine {
		void spinWheels();
	}


	public static class GasEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
}