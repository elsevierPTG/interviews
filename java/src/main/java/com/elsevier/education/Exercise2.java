package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine* 

Implementation of the engine is passed as parameter. Interface is used for moveForward() so that
we don't have to care whether it's a gas or electric engine.

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		
		public Car(Engine paramEngine) {
                    engine = paramEngine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
        
        public static interface Engine {
            public void spinWheels();
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