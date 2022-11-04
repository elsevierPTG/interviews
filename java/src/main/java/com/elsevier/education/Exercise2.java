package com.elsevier.education;

public class Exercise2 {

	public static class Car {
		
		/* we dont need to initiate the engine as long we will inject it into constructor */
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public static interface Engine {
 		void spinWheels();
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