package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {

		private Engine engine;

		/**
		 * Create a new {@code Car} with the given {@code Engine}.
		 * This constructor enables constructor injection of the dependency. We could also
		 * add a setter for the {@code Engine} to enable setter injection. Finally, we
		 * could use an {@code @Inject} annotation to have the container automatically
		 * inject the {@code Engine}, but that would take additional external configuration
		 * which varies depending on the DI framework in use.
		 * @param theEngine The {@code Engine} the car should have.}
		 */
		public Car(final Engine theEngine) {
			this.engine = theEngine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine {
		void spinWheels();
	}

	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine {
		public void spinWheels() {
			// Atomic batteries to power, turbines to speed, ready to move out! (RIP Adam West)
		}
	}
}