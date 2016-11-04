package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {

		private GasEngine engine;
		private ElectricEngine engine1;

		public Car(GasEngine engine) {
			this.engine = engine;

		}

		public Car(ElectricEngine engine1) {
			this.engine1 = engine1;

		}

		public void setEngine1(ElectricEngine engine1) {
			this.engine1 = engine1;
		}

		public void setEngine(GasEngine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
			engine1.spinWheels();
		}

	}

	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine {
		public void spinWheels() {
			// no-op for now
		}
	}

}
