package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

Added ElectricEngine and made both engines implement Engine interface
So that Car can allow any engine by using Engine as reference.
@Inject annotation will allow dynamic injection of either engine as per configuration

*/

import javax.inject.Inject;

public class Exercise2 {

	public static class Car {
		
		@Inject 
		private Engine engine;
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public interface Engine {
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