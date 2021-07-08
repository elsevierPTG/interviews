package com.elsevier.education;

/**
 * Using an inner interface as the contract for the different engine types,
 * since there is no absolute need for default functionality (i.e. abstract class
 * with some functioning methods), but moveForward could be defaulted.
*/
public class Exercise2 {

	public static class Car {
		
		// Removed assignment to force/allow DI.
		private Engine engine;
		
		// Can instantiate and set engine later.
		public Car() {}
		
		// Can instantiate and set at once.
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
		
		// Setter will use any Engine type.
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
	}
	
	// Designing towards interface as a contract for abstraction.
	interface Engine {
		void spinWheels();
	}
	
	// Now implements new interface.
	public static class GasEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
			//System.out.println("Moving forward...");
		}
	}
	
	// Now implements new interface.
	public static class ElectricEngine implements Engine {
		@Override
		public void spinWheels() {
			// no-op for now
			//System.out.println("Moving forward...");
		}
	}
	
	// Quickly checking code works.
	public static void main (String args[]) {
		Car gasCar = new Car(new GasEngine());
		gasCar.moveForward();
		
		Car electricCar = new Car();
		electricCar.setEngine(new ElectricEngine());
		electricCar.moveForward();
	}
}