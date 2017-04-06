package com.elsevier.education

import spock.lang.*

import static com.elsevier.education.Exercise2.*

class Exercise2Spec extends Specification {

  void "it moves forward by spinning it's wheels"() {
    given:
    Engine e = Mock()
    Car c    = new Car(e)

    when:
    c.moveForward()

    then:
    1 * e.spinWheels()
  }

  @Unroll
  void "it can use an #name engine"() {
    when:
    Car c = new Car(engine)

    then:
    c.moveForward()

    where:
    name       | engine
    'electric' | new ElectricEngine()
    'gas'      | new GasEngine()

  }

}

