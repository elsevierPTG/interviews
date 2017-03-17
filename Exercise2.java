package com.elsevier.education;

/**

 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
 TODO make sure we have no-op implementations of the gas engine and electric engine
 */

/**
 *  The Car class supports multiple types of engines by the abstraction of Engine class
 *  The constructor for the Car class supports the dependency injection of Engine by not instantiating a new Engine object
 *
 *  @author Karen Rainsford
 *  @date	 17-Mar-2017
*/
public class Exercise2 {

	public class Car {

		private Engine _engine;

		/**
		 * Constructor.
		 * @param engine - the engine for the car
		 */
		public Car(Engine engine) {
			_engine = engine;
		}

		public Engine getEngine() {
			return _engine;
		}

		public void setEngine(Engine engine) {
			this._engine = engine;
		}

		public void moveForward() {
			engine.spinWheels();
		}
	}
	public abstract class Engine {
		private String engineName;

		public Engine(String engineName) {
			setValues(String engineName);
		}

		private void setValues(String engineName) {
			setName(engineName);
		}

		public String getEngineName() {
			return engineName;
		}

		abstract void spinWheels();
	}

	public class EngineType extends Engine {
		private String engineType;

		public EngineType(String engineName, String engineType) {
			super(engineName);
			this.engineType = engineType;
		}

		public void spinWheels() {
			System.out.println("Wheels are spinning");
		}
	}
}