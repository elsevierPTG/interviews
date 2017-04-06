package com.elsevier.education

import spock.lang.*

import static com.elsevier.education.Exercise5.Singleton

class Exercise5Spec extends Specification {

  void "singleton instance is a singleton and does something"() {
    expect:
    Singleton.INSTANCE == Singleton.INSTANCE
    Singleton.INSTANCE.doSomething()
  }

}

