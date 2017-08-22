package com.elsevier.education;

/**

@author Todd Goglia 8/22/2017
Refactored the Car to use dependency injection of the IEngine interface.
Created the IEngine interface.
Updated the GasEngine class to implement the IEngine interface and created the ElectricEngine implementation.

*/
public class Exercise2 {

	public static class Car {
		
		private IEngine engine;
		
		public Car(IEngine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	/**
	 * Interface to abstract the Engine class.
	 */
	public interface IEngine
	{
		void spinWheels();
	}
		
	
	/** GasEngine implementation of the IEngine interface. */
	public static class GasEngine implements IEngine {
		public void spinWheels() {
			System.out.println("The wheels on the gas engine car go round and round...");
		}
	}
	
	/** ElectricEngine implementation of the IEngine interface. */
	public static class ElectricEngine implements IEngine {
		public void spinWheels() {
			System.out.println("The wheels on the electric car go round and round...");
		}
	}
	
	
	
	
	
}