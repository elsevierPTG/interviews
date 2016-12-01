package com.elsevier.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * TODO refactor the Car to use dependency injection of the engine TODO allow
 * use of either a gas engine or electric engine. TODO make sure we have no-op
 * implementations of both engines.
 *
 */
public class Exercise2 {
    
    
    @Component
    public static class Car {
        
        @Autowired
        private GasEngine engine;

        public Car() {
        }

        public void moveForward() {
            engine.spinWheels();
        }
    }
    
    @Component
    public static class GasEngine implements Engine {

        @Override
        public void spinWheels() {
            // no-op for now
        }
    }
    
    @Component
    public static class ElectricEngine implements Engine {

        @Override
        public void spinWheels() {
            // no-op          
        }

    }
    public interface Engine {

        public void spinWheels();
    }
}
