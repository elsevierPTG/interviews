package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
interface Engine {

	public void spinWheels ();
}

interface Working{

  public void moveForward();
}

public class Exercise2 {

	public static class Car implements Working {
		
		private Engine wheels;
		
		public Car(Engine wheels) {
			this.wheels=wheels;
		}
		
		@Override
		public void moveForward() {
			// implement condition for selecting GasEngine or Electric Engiene
			
			this.wheels.spinWheels();
		}

	}
	
	public static class GasEngine implements Engine {
		
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine implements Engine {

		@Override
		public void spinWheels() {
			// no-op for now
		}

	}
}