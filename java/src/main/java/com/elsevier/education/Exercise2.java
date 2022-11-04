package com.elsevier.education;


import javax.inject.Inject;

/**

TODO refactor the Car to use dependency injection of the engine
 I used javax.injection and added it as a dependency.
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
 //made an abstract Engine class that both electric and gas extend
TODO make sure we have no-op implementations of the gas engine and electric engine
 //by declaring the method abstract , the extending classes will have to implement.

*/
public class Exercise2 {

	public static class Car {


		private Engine engine;
		@Inject
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static abstract class Engine {
		public abstract void spinWheels();
	}
	public static class GasEngine extends Engine {

		@Override
		public void spinWheels() {

		}
	}

	public static class ElectricEngine extends Engine {
		@Override
		public void spinWheels() {

		}
	}

}