package com.elsevier.education;

/**
 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine.
 TODO make sure we have no-op implementations of both engines.
 */
public class Exercise2 {

    public interface Engine { //establish an interface
        public void spinWheels();
    }

    public static class Car {

        private Engine engine;
        
        private Car() { //prohibit making Cars without engines
            
        }

        public Car(Engine engine) { //inject the interface into the instance of Car
            this.engine = engine;
        }

        public void moveForward() {
            engine.spinWheels();    //use a method from interface
        }
    }

    public static class GasEngine implements Engine {
        @Override
        public void spinWheels() {  //interface method implementation
            // no-op for now
        }
    }
    public static class ElectricEngine implements Engine {
        @Override
        public void spinWheels() {  //interface method implementation
            // no-op for now
        }
    }
}