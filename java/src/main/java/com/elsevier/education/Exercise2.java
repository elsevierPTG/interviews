package com.elsevier.education;

/**
 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine.
 TODO make sure we have no-op implementations of both engines.
 */
public class Exercise2 {

    public static class Car {

        private Engine engine;


      // We are pretending to do a constructor dependency injection here
        public Car(Engine engine) {
            this.engine = engine;
        }

        public void moveForward() {
            if (engine != null) {
                engine.spinWheels();
            }
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }
    }

    // Created an abstract class of Engine and the concrete classes
    // GasEngine and ElectricEngine can override the spinWheels method
    public static abstract class Engine {
        public abstract void spinWheels();
    }

    public static class GasEngine extends Engine{
        @Override
        public void spinWheels() {
            // no-op for now
        }
    }

    public static class ElectricEngine extends Engine{
        @Override
        public void spinWheels() {
            // no-op for now
        }
    }
}