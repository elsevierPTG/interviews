package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

    /**
     * I abstracted the GasEngine into Engine interface.
     * Constructor dependency injection to get Engine.
     */
	public static class Car {
		
		private Engine engine;
		
		public Car(Engine engine) {
		    this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static class GasEngine implements Engine{
		public void spinWheels() {
			// no-op for now
		}
	}

    public static class ElectricEngine implements Engine{
        public void spinWheels() {
            // no-op for now
        }
    }

	public interface Engine {
		void spinWheels();
	}
}