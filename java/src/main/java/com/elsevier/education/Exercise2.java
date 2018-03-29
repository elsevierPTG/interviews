package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 AM: I left my tests in so that I could ensure my code actually worked!
*/
public class Exercise2 {

	public static class Car {

		//An Engine Variable
		private Engine engine;
		
		public Car(Engine engine) {
			//set the Engine so that a class that implements Engine can be used here
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}

	public interface Engine {
		public void spinWheels();
	}

	public static class ElectricEngine implements Engine{
		public void spinWheels() {
			// no-op for now
//			System.out.println("Its Electric");
		}
	}

	
	public static class GasEngine implements Engine {
		public void spinWheels() {
			// no-op for now
//			System.out.println("I Have Gas");
		}
	}

//	public static void main(String a[]){
//		Car c1 = new Car(new GasEngine()) ;
//		Car c2 = new Car(new ElectricEngine()) ;
//		c1.moveForward();
//	}
}