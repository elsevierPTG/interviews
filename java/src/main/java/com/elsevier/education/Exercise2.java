package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

// I cannot quite understand it. I think here what you want
// 1- hooks that we can use later for  DI framework or custom implementation
// 2- Car should be refactored so that it can accept any kind of engine that DI engine will figure out
// So, Lets do what I do understand 
public class Exercise2 {

	// interface for holding any kind of Engine
	public interface IEngine{
		public void spinWheels();
	}
	
	
	public static class Car {
		
		private IEngine engine;
		
	   // Allow for constructor injection
		public Car(IEngine p_engine ){
	    	this.engine = p_engine;
	    }
		
		public Car() {
		}
		
		// allow for setter injection
		public void setEngine(IEngine  p_engine){
			this.engine = p_engine;
		}
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine implements IEngine{
		public void spinWheels() {
			// no-op for now
		}
	}
	
	public static class ElectricEngine implements IEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}


