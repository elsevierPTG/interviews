package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine = new GasEngine();
		private Engine engine;
		public Car(Engine engine) {
			//constructor dependency injection is used here to remove hard dependency in the class
			this.engine=engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine {
		//engine interface is used so that it can be implemented by different clases to use spinwheels method
		public static interface Engine
		{
			public void  spinWheels();
		}
		public static class GasEngine implements Engine
		{
			public void  spinWheels();
		}
		public static class ElectricEngine implements Engine
		{
			public void  spinWheels();
		}
		public void spinWheels() {
			// no-op for now
		}
	}
}
