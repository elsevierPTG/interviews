package com.elsevier.education;

/**
 * Refactored the Car class to use dependency injection of the engine.
 * Introduced an new EngineService interface with 2 implementations of GasEngine and ElectricEngine
 * The GasEngine spinWheels method returns the sound Vroom and
 * the ElectricEngine returns whirr Please see corresponding test case for how to use
 */

public class Exercise2 {

	public static class Car {

		private EngineService engine;

		public Car(EngineService engine) {
			this.engine = engine;
		}

		public String moveForward() {
			return engine.spinWheels();
		}
	}

	public interface EngineService {
		String spinWheels();
	}

	public static class GasEngine implements EngineService {
		public String spinWheels() {
			return "Vroom vroom vroom vroom...";
		}
	}

	public static class ElectricEngine implements EngineService {
		public String spinWheels() {
			return "Whirring whirr whirr whirr...";
		}
	}
}