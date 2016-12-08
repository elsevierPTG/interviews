package com.elsevier.education;

/**
 TODO refactor the Car to use dependency injection of the engine
 TODO allow use of either a gas engine or electric engine.
 TODO make sure we have no-op implementations of both engines.
 */
public class Exercise2 {
    
    public static class Car {
        
        private Engine engine = null;
        
        //Injecting Engine
        public Car(Engine engine) {
            this.engine = engine;
        }
        
        public void moveForward() {
            engine.spinWheels();
        }
    }
    
    public interface Engine {
        void spinWheels();
    }
    
    public static class GasEngine implements Engine {
        public void spinWheels() {
            // no-op for now
        }
    }
    
    //Created new Electric Engine
    public static class ElectricEngine implements Engine {
        public void spinWheels() {
            // no-op
        }
    }
}
