package com.elsevier.education;

/**

 Allowing use of either a gas engine or electric engine (create an appropriate abstraction)
 we can achieve abstraction by either from abstract class or from iterface


*/
public class Exercise2 {

    public static class Car {
        
        private Engine engine;
        /*
         * we achieved dependency injection by injecting Engine interface through constructor 
         * by removing concrete classes and passing Engine interface we removed hard coded object.   
         */
        public Car(Engine engine) {
            super();
            this.engine = engine;
        }
        public void moveForward() {
            engine.spinWheels();
        }
        public static void main(String[] args) {
            //if we are create object instance for Gas Engine it will evoke spinewheels method for gasEngine class
           new Car(new GasEngine()).moveForward();
           
           //if we are create object instance for Electric Engine it will evoke spinewheels method for ElectricEngine class
          new Car(new ElectricEngine()).moveForward();
        }
    }
    
    
    public static interface Engine{
        public void spinWheels();
    }
    //gasengine class is inheriting engine interface --inheritance 
    public static class GasEngine implements Engine {
        //with over riding we are capable of reusing same code --polymorphism 
        @Override
        public void spinWheels() {
            System.out.println("this is running through GasEngine");
        }
    }
    
    public static class ElectricEngine implements Engine {
        @Override
        public void spinWheels() {
            System.out.println("this is running through ElectricEngine");
        }
    }
}