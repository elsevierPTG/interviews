package com.elsevier.education;

import javax.annotation.Resource;
/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {

		@Resource
		private Engine engine;


		public Car() {
		}

		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine {
		public void spinWheels() ;
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