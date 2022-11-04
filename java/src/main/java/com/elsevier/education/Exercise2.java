package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

 This implementation uses dependency injection by creating an abstract class
 Engine which is extended by ElectricEngine and GasEngine. Car has an Engine
 variable, and in it's constructor it expects to be passed an Engine, which
 could be of any type that extends the base class. I included spinWheels() as
 an abstract method that contains slightly different implementations in the
 two engine types.

*/
public class Exercise2 {

	public static class Car {

		private Engine engine;

		public Car(Engine e) {
			System.out.println("Car created");
			this.engine = e;

		}

		public void moveForward() {
			engine.spinWheels();
		}

	}

	public static abstract class Engine {
		public abstract void spinWheels();
	}

	public static class GasEngine extends Engine {
		public GasEngine() {
			System.out.println("Gas Engine created");;
		}
		public void spinWheels() {
			System.out.println("Vroom!");
		}
	}
	public static class ElectricEngine extends Engine {
		public ElectricEngine() {
			System.out.println("Electric Engine created");
		}
		public void spinWheels() {
			System.out.println("Whirrr!");
		}
	}
}