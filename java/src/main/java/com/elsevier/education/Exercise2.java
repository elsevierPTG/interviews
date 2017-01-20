package com.elsevier.education;

/**
 * I'm assuming engine is required, so I put the final qualifier
 * here so you have to pass in an engine to ensure the moveForward
 * method would work.  Yes, you can pass in null and it would fail
 * but at least in the code, you'd see something like new Car(null);
 */
public class Exercise2 {

	public static class Car {
		
		/**
		 * I'm assuming engine is required, so I put the final qualifier
		 * here so you have to pass in an engine to ensure the moveForward
		 * method would work.  Yes, you can pass in null and it would fail
		 * but at least in the code, you'd see something like new Car(null);
		 */
		private final Engine engine;

		/**
		 * Dependency injection means you pass in the engine
		 * up front instead of within the car class
		 */
		public Car(final Engine engine) {
			this.engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}

	/**
	 * I am using an abstract class instead of an interface since
	 * it feels more like an abstract similar to the classic animal
	 * example in that a cat and a dog are both animals, gas engines 
	 * and electric engines are both engines.  However, if you 
	 * wanted something like, "PoweredBy", where you'd then explain 
	 * how the engine received it's power, I would have used
	 * an interface instead. 
	 */
	public static abstract class Engine {
		public abstract void spinWheels();
	}
	
	public static class GasEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	
}