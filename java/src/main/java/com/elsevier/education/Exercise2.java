package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

@author ArnelLalicon
	a. create Engine class
	b. create ElectricEngine class
	c. GasEngine and ElectricEngine extended Engine class and override no-op method of parent class Engine
*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class Engine {
		
		public void spinWheels(){
			
		}
	}
	
	public static class GasEngine extends Engine{
		
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine extends Engine{
		
		@Override
		public void spinWheels() {
			// no-op for now
		}
	}
}
