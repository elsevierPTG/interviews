package com.elsevier.education;

/**
 * TODO refactor the Car to use dependency injection of the engine
 * TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
 * TODO make sure we have no-op implementations of the gas engine and electric engine
 * 
 * why an abstract class over an interface?
 * the choice for this one doesn't much matter in this specific instance, since its a toy class.
 * however, since it's likely that an Engine is more likely to have fields (since its a representation of a concrete thing rather than just some functionality).
 * as such, an abstract class seemed to be a better fit.
 * certainly either could work and could even have the spinWheels method be default to avoid implementing it in each class for now.
 * 
 * for dependency injection, i opted to use spring. i've added the dependency into the build.gradle file.
 * as well as adding the eclipse plugin since i'm developing in eclipse.
 * grabbed the dependency from maven central.
 * 
 * there's also two tests in Exercise2Test to make sure i can get the created beans for each car.
 */
public class Exercise2 {

	public static class Car {
		
		public final Engine engine;
		
		public Car(final Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	public static abstract class Engine {
		public void spinWheels(){
			// no-op for now
		}
	}
	
	public static class GasEngine extends Engine {}
	
	public static class ElectricEngine extends Engine {}
}