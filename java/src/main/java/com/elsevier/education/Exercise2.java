package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public class Car {
		
		private Engine engine = null;
		
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void startEngine(){
			this.engine.startEngine();
		}
		
		public void spinWheels() {
			if(engine.isOperational()){
				// spin the wheels.
			}
			else{
				// no-op condition.
			}
		}
		
		public void moveForward() {
			this.spinWheels();
		}
	}
	
	
	public class GasEngine extends Engine{
		public void startEngine(){
			// do gas engine specific stuff to determine if able to start engine.
			// if all ok, start engine.
			super.startEngine();
		}
	}
	

	public class ElectricEngine extends Engine{
		public void startEngine(){
			// do electric engine specific stuff to determine if able to start engine.
			// if all ok, start engine.
			super.startEngine();
		}
	}
	

	public class Engine {
		private boolean operational = true;
		
		public void startEngine(){
			this.operational = true;
		}
		
		public boolean isOperational(){
			return this.operational;
		}
	}
}