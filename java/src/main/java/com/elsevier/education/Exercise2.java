package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private final Engine engine;
		
		public Car(final Engine engine ) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	//remove no-op from class as it is now in the interface
	public static final class GasEngine implements Engine{

	}

	public static final class ElectricEngine implements Engine{

	}
	//Since this keeps using nested classes, I'll keep up with the methodology, however in reality it should be in its own
	//class file like everything else.
	public interface Engine{
		default void spinWheels() {
			//No-op for the engines in interface.
		}
	}


}