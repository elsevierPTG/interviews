package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

    // Creating an interface - Engine, which will have spinWheels method.
    public static interface Engine {
        public void spinWheels();
    }

    public static class Car {

	// engine should be of type Engine
        private final Engine engine;

	// Constructor should accept Engine. Let caller decide if the Engine is
	// GasEngine (or say ElectricEngine) instance. 
        public Car(final Engine engine) {
            this.engine = engine;
        }

        public void moveForward() {
            engine.spinWheels();
        }
    }

    // GasEngine should be of type Engine. Should implement Engine interface and provide 
    // an appropriate behavior for spinWheels method.
    public static class GasEngine implements Engine {

        public void spinWheels() {
            // no-op for now
        }
    }
}
