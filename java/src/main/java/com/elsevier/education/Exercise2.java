package com.elsevier.education;

/**
to update to Java dependency injection, here used interface.

Dependency Injection main use is reduce coupling in our application and to make it more flexible and easier to test.

Objects don't have hard coded dependencies( creating using new operator). If you need to change the implementation of a dependency, just we need to Inject a different type of Object.

*/
public class Exercise2 {


public static interface Engine{

public void spinWheels();

}



public static class Car {


private Engine engine = null;


public Car(Engine engine) {

this.engine=engine;

}


public void moveForward() {

this.engine.spinWheels();

}

}


public static class GasEngine implements Engine{

@Override

public void spinWheels() {

// no-op for now

}

}


public static class ElectricEngine implements Engine{

@Override

public void spinWheels() {

// no-op for now

}

}


public static interface EngineInjector{


public Car getCar();


}


public static class GasEngineInjector implements EngineInjector{


@Override

public Car getCar(){

return new Car(new GasEngine());

}



}

public static class ElectricEngineInjector implements EngineInjector{

@Override

public Car getCar(){

return new Car(new ElectricEngine());

}

}



}
