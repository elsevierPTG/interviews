package com.elsevier.education;
import org.springframework.beans.factory.annotation.Autowired;
/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {
	
    public static class Car {
	
	@Autowired
	   /**
		* The engine can be initialized with either of the gas engine or electric engine
                * via dependency injection of Exercise2.GasEngine, or Exercise2.ElectricEngine
           */
	private Engine engine; // = new GasEngine();

	public Car() {
	}

	public void moveForward() {
		engine.spinWheels();
	}
    }
	
    public static abstract class Engine {
	    public abstract void spinWheels();
		// Generic Engine logic.
		// This class Engine could be an interface instead, and in Java 8, the spinWheels can
		// be a default method implementation, in that case GasEngine and ElectricEngine can "implements Engine"
		// and optionally implementing/overriding the spinWheels method
		    
	    }
     }
    public static class GasEngine extends Engine{
            @Override
            public void spinWheels() {
                // GasEngine specific logic
	    }
    }
    public static class ElectricEngine extends Engine{
            @Override
            public void spinWheels() {
                // ElectricEngine specific logic
	    }
    }
}

	
