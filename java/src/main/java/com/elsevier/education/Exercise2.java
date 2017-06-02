package com.elsevier.education;

/**

 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
 TODO make sure we have no-op implementations of the gas engine and electric engine

 Created and implemented interfaces for Driver, CarEngine, CarEngineInjector
 Created a noop method
 */
public class Exercise2 {
	/**
	 *
	 * No Op implementation
	 * @param o
	 */
	private static void noop(Object... o) { };


	/**
	 *  Interface for Engine
	 *
	 */
	public interface CarEngine{
		void spinWheels();
	}

	/**
	 * Electric Engine implementation
	 *
	 */
	public class ElectricEngine implements CarEngine{
		public void spinWheels() {
			noop();
		}
	}

	/**
	 * Gas Engine implementation
	 */
	public class GasEngine implements CarEngine{
		public void spinWheels() {
			noop();
		}
	}

    /**
     *  Interface for Driver
     */
	public interface Driver{
		void moveForward();
	}

    /**
     *  Driver Choice implementation
     */
	public class DriverChoice implements Driver{
		private CarEngine myCarEngine;
		public DriverChoice(CarEngine mce){
			this.myCarEngine = mce;
		}

		@Override
		public void moveForward(){
			this.myCarEngine.spinWheels();
		}
	}

    /**
     * Interface for injector
     */
	public interface CarEngineInjector {

		public DriverChoice getDriverChoice();
	}

    /**
     * Implementation for injector GasEngine
     */
	public  class GasEngineInjector implements CarEngineInjector{
		public DriverChoice getDriverChoice(){
			DriverChoice dc = new DriverChoice(new GasEngine());
			return dc;
		}
	}

    /**
     * Implementation for injector Electric Engine
     */
	public  class ElectricEngineInjector implements CarEngineInjector {
		public DriverChoice getDriverChoice() {
			DriverChoice dc = new DriverChoice(new ElectricEngine());
			return dc;
		}
	}
}