package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
/**
 * 
 * @author swapnilkulkarni
 * email - kulswapnil@gmail.com
 * cell - 267 844 5443
 * recuiter - collabera
 * Added dependency injection for engine using constructor.
 * Added class for electric engine.
 * Added qualifer annotation for using gas engine.
 */
public class Exercise2 {

	public static class Car {
		
		@Qualifier("GasEngine")
		private Engine engine;
		
		public void setEngine(Engine engine) {
	        this.engine = engine;
	    }
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
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
