package com.elsevier.education;

/**

DONE: refactor the Car to use dependency injection of the engine
DONE: allow use of either a gas engine or electric engine (create an appropriate abstraction)
DONE: make sure we have no-op implementations of the gas engine and electric engine

EXPLANATIONs:
1. There are several ways of incorporating a dependency injection. In the
interest of time, I've opted to do the simplest one, which is to make
a constructor which receives the engine instance variable (our "service")

2. I opted to use an Engine interface with a spinWheels method, so as
to avoid potentially unnecessary inheritance (as would be the case if
I used an Engine abstract class instead)

*/
public class Exercise2 {

	public static class Car {

		private Engine engine;

		public Car(Engine engineService) {
			engine = engineService;
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
