package com.elsevier.education;

import java.util.Objects;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 There's lots of ways to do Dependency Injection.  In real projects, you'll probably want to use something like Spring or
 Guice or CDI.

 However, for the purposes of this exercise and the sake of simplicity, you can just use inject an {@link Engine} to the constructor
 for the Car
*/
public class Exercise2 {

	public interface Engine {
		void spinWheels();
	}

	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class Car {
		
		private final Engine engine;

		public Car(Engine engine) {
			this.engine = Objects.requireNonNull(engine, "engine cannot be null");
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

}