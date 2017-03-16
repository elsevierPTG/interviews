package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine ;
		//Modified for the dependency injection- as the Car object can 
		//either accept the GasEngine instance or ElectricEngine instance.
		public Car(Engine Engine) {
			this.Engine = Engine
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	// Added new classes to implement the interface
	public static class GasEngine implement Engine{
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine implement Engine{
		public void spinwheels(){
			//no -op for now
		}
	}
}
//Interface to provide abstraction for the classes
public static interface Engine(){
	public void spinWheels();
}
