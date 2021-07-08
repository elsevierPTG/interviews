package com.elsevier.education;

/**

I could have also used an abstract class with a no-op method. I used an
interface here because I started to imagine other bits of functionality
like 'power on' or 'fire missiles' that might or might not apply to
every object that has an engine.

*/
public class Exercise2 {
	
	static interface Engine {
		default void spinWheels() {}
	}

	public static class Car {
		
		private Engine engine;
		
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
}