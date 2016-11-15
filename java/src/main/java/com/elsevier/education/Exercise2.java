package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine. 
TODO make sure we have no-op implementations of both engines.

*/
public class Exercise2 {

//Define a common interface with the method spinWheels 	
public interface CommonEngine {
		public abstract spinWheels() {
		}
	}
//Implemented dependency injection here. Used Constructor injection to create the object here. Inside the constructor object of 
	//GasEngine or Electric engine will be populated.
public static class Car {
 		private final CommonEngine engine;
		public Car(CommonEngine engine) {
			this.engine = engine;
 		}
 		
 		public void moveForward() {
 			engine.spinWheels();
 		}

 	}
//Gas Engine implementation	
public static class GasEngine implements CommonEngine {
public static void main(String[] args) {
		Car veryEfficientCar = new Car(new GasEngine());
		veryEfficientCar.moveForward();
 	}
	public void spinWheels() {
 			//implement spinWheels logic here.
 		}
}
//Electric Engine implementation.
	public static class ElectricEngine implements CommonEngine{

	public static void main(String[] args) {
		
		Car electricCar = new Car(new ElectricEngine());
		electricCar.moveForward();
 	}
		public void spinWheels() {
 			//implement spinWheels logic here.
 		}
}
