package com.elsevier.education;

/**
TODO refactor the Car to use dependency injection of the engine
@NAmed and @Inject will do the DI
TODO allow use of either a gas engine or electric engine. 
We can set qualifier to be either gas or electric engine

TODO make sure we have no-op implementations of both engines.
No-op implementation is in both the engines, since i have declared abstract class in Engine.

*/

public class Exercise2 {
@Named
	public static class Car {
		@Inject
		@Qualifier("gasEngine")
		private Engine engine;

		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	@Named
	public static class GasEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	@Named
	public static class ElectricEngine extends Engine {
		public void spinWheels() {
			// no-op for now
		}
	}
	@Named
	public static abstract class Engine{
		@Inject
		private GasEngine gasEngine;
		@Inject
		private ElectricEngine elecEngine; 
		public static void abstract spinWheels();
		public Engine getEngine(String engineType)
		{
			if("gasEngine".equals(engineType))
			{
			return gasEngine;
			}
			if("elecEngine".equals(engineType))
			{
			return elecEngine;
			}
			return null;
		}
	}
}
