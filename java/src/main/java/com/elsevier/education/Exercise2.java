package com.elsevier.education;

/**
 * TODO refactor the Car to use dependency injection of the engine TODO allow
 * use of either a gas engine or electric engine (create an appropriate
 * abstraction) TODO make sure we have no-op implementations of the gas engine
 * and electric engine
 */

public class Exercise2 {
    /*
     * Car class can have any kind of Engine (Gas or electric in this example)
     * as long as it implements an interface called Engine.
     */
    public static class Car {

	/*
	 * 1. private variable to hold the type of Engine.
	 *
	 * 2. Dependency injection
	 */
	private Engine engine;

	/*
	 * Modified constructor to take the type of Engine
	 */
	public Car(Engine engine) {
	    this.engine = engine;
	}

	public void moveForward() {
	    this.engine.spinWheels();
	}
    }

    public static class ElectricEngine implements Engine {
	@Override
	public void spinWheels() {
	    // no-op for now
	    // System.out.println("Electric engine");
	}
    }

    public static interface Engine {
	public void spinWheels();
    }

    public static class GasEngine implements Engine {
	@Override
	public void spinWheels() {
	    // no-op for now
	    // System.out.println("Gas engine");
	}
    }

    public static void main(String[] args) {

	Engine gasEngine = new GasEngine();
	Car gasCar = new Car(gasEngine);
	gasCar.moveForward();
	Engine electricEngine = new ElectricEngine();
	Car electricCar = new Car(electricEngine);
	electricCar.moveForward();
    }
}