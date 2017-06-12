package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private Engine engine;
		

		public Car(Engine engine) {
            this.engine = engine;
        }
		public Engine getEngine() {
			return engine;
		}
		

		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	abstract interface Engine {
        public void spinWheels();
    }
	
	public class GasPoweredEngine implements Engine {
        public void spinWheels() {
        	// no-op for now
        }
    }

	public class ElectricalEngine implements Engine {
        public void spinWheels() {
        	// no-op for now
        }
    }

    public static void main(String args[]) {
        Car gasEngineCar = new Car(new GasPoweredEngine());
        gasEngineCar.moveForward();
        Car electricalEngineCar = new Car(new ElectricalEngine());
        electricalEngineCar.moveForward();
    }
}