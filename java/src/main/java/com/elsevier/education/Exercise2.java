package com.elsevier.education;
import static java.lang.System.out;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

Chris Wolf <cw10025@gmail.com>, recruiter Emma Peterson <epeterse@teksystems.com>
*/
public class Exercise2 {

	public static class Car {
	    private final Engine engine;
	      
	    public Car() {
	        engine = new DefaultEngine();
	    }
	    
	    public Car(final Engine engine) {
	        this.engine = engine;
	    }
	    
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	interface Engine {
	    default public void spinWheels() {
	        out.println("Noop spin wheels.");
	    }
	}
	
	// Could also not use java8 default interface method 
	// and put default impl DefaultEngine class
	public static class DefaultEngine implements Engine {}
	
	public static class GasEngine implements Engine {
	    @Override
		public void spinWheels() {
	        out.println("Gas engine spin wheels.");
		}
	}
	
    public static class ElectricEngine implements Engine {
        @Override
        public void spinWheels() {
            out.println("Electric engine spin wheels.");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.moveForward();
        
        car = new Car(new GasEngine());
        car.moveForward();
        
        car = new Car(new ElectricEngine());
        car.moveForward();
    }
}