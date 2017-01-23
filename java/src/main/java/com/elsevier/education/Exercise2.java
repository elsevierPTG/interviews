package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		final Vehicle v;				
		public Car(Vehicle v) {
			this.v = v;
		}
		
		public void moveForward() {
			v.spinWheels();
		}
	}
	
	public static class GasEngine implements Vehicle{
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine implements Vehicle{
		public void spinWheels() {
			// no-op for now
		}
	}
	/** Create an interface for achieving abstraction**/
	public interface Vehicle{
		void spinWheels();
	}
}
