package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
        public interface Engine {
                default void spinWheels() {
        // no-op for now
             }
      }
	public static class Car {
		//To create dependency injection we do the following: 1.To create a static class Car.
                //                                                    2.This class can be used to create an object for the class Engine i.e., outside of it to maintain dependency injection.
 
		private final Engine engine;
                public Car(Engine engine) {
                this.engine = engine;
             }
		public void moveForward() {
                engine.spinWheels();
             }
      } 
	        public static class GasEngine implements Engine {
             }

                public static class ElectricEngine implements Engine {
             }
	        //To create an appropriate abstraction we need: 1.To create an interface Engine.
                //                                              2.To create static classes GasEngine and 
		
	
	        public static void main(String[] args) {
                Car car1 = new Car(new GasEngine());
                car1.moveForward();
                Car car2 = new Car(new ElectricEngine());
                car2.moveForward();
               }
       }
