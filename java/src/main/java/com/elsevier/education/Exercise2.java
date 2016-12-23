package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/

public interface Engine{

spinWheels()
}

public class GasEngine implements Engine{
spinWheels(){
system.out.println("This is Gas Enginee");
}
}

public class ElectricEngine implements Engine{
spinWheels(){
system.out.println("This is electric Enginee");
}
}


public class Car{

private Engine engine;

// This is for setter Injection.
public void setEngine(Engine engine){
this.engine = engine;
}

// This is for constructor Injection.
public Car(Engine engine){

this.engine = engine;
}


public void moveForward() {
engine.spinWheels();
}

}

xml file
========

<bean id="car" class="Car">
<constructor-arg ref="gasEngine" />
</bean>

<bean id="gasEngine" class="GasEngine ">




