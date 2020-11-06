package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine = new GasEngine();
		// Constructor injection is done here hence the child object when passed will be injected to the parrent class object
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	abstract class Engine {
       		public abstract void spinWheels();
	}
	class GasEngine extends Engine {
       		public void spinWheels() {
              		System.out.println("gas injection")
		}
	}
	class ElectricEngine extends Engine {
       		public void spinWheels() {
              		System.out.println("Electrical injection")
		}
	}
	 
       public static void main(String a[]){                 
	     Car car = new Car(new GasEngine());
	     car.moveForward();
	     car = new Car(new ElectricEngine());
	     car.moveForward();
      } 

}
