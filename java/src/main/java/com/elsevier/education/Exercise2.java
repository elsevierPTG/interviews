package com.elsevier.education;

public class Exercise2 {

	public static class Car {
		// dependency injection
		private Engine engine;

		public Car(Engine engine) {

			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	/* Super class for Engine */
	public abstract class Engine {
		public abstract void spinWheels();
	}

	public class GasEngine extends Engine {
		@Override
		public void spinWheels() {
			// TODO: implementation
		}
	}

	public class ElectricEngine extends Engine {
		@Override
		public void spinWheels() {
			// TODO: implementation
		}
	}
}