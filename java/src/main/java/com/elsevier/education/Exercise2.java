package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 Added a third engine type for... class B)

 I merely copy-pasted the 'no-op' spinWheels concrete implementation to the other engines.

*/
public class Exercise2 {

	public static class CarAssembler {
		public static Car assembleCar(final Engine arbitraryEngine) {
			return new Car(arbitraryEngine);
		}
	}

	public class Car {

		public Engine arbitraryEngine;

		protected Car() {}

		public Car(final Engine arbitraryEngine) {
			this.arbitraryEngine = arbitraryEngine;
		}
		
		public void moveForward() {
			this.arbitraryEngine.spinWheels();
		}
	}

	public interface Engine {
		void spinWheels();
	}

	public class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public class ElectricEngine implements Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public class FusionEngine implements Engine {
		public void spinWheels() {
			// The other engines are real garbage, to be fair...
		}
	}
}