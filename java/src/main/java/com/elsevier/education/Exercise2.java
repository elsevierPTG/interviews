package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
	
	
	//interface Engine is created
	public interface Engine{
		default void spinWheels(){
		}
	}
		
	
	public static class Car {
		private final Engine engine;
		
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	//Classes GasEngine and ElectricEngine are created which implements Engine interface
	public static class GasEngine implements Engine{}
	public static class ElectricEngine implements Engine{}
	
	public static void main(String args[]){
	Car garCar = new Car(new GasEngine());
	gasCar.moveForward();
		
	Car electricCar = new Car(new ElectricEngine());
	electricCar.moveForward();
		
	}
	
	
	
}
