package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine; // Using the interface instead of class to achieve loose coupling
		
		public Car(Engine engine) {
                   this.engine = engine; // Engine has been used to inject any type of engine.
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public class GasEngin implements Engine  { // created GasEngine which implements Engine interface.
	   public void spinWheels() {
	    }
           }
         
        public class ElectricEngine implements Engine  { // created ElectricEngine which implements Engine interface.
	    public void spinWheels()   {
	     }
         }
}

public interface engine {            // created an interface for loose coupling.
	public void spinWheels();
}



