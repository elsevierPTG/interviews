package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
	
		Engine engine1;
		
		private GasEngine gengine = new GasEngine();// changing the object name
		private GasEngine eengine = new ElectricEngine();// Engine is an abstract class and hence cannot create an instance of the parent class
		public Car() {
		}
		
		public void moveForward() {
			gengine.spinWheels();// invoking no-op function
			eengine.spinWheels();
		}
	}

       public abstract class Engine( // Abstract class
			public void spinWheels() {
			// no-op for now
		}


	}
	
	public static class GasEngine extends Engine{ //Inheriting Engine
		public void spinWheels() {
			// no-op for now
		}
	}

	public static class ElectricEngine extends Engine{//Inheriting Engine
		public void spinWheels() {
			// no-op for now
		}
	}
}
