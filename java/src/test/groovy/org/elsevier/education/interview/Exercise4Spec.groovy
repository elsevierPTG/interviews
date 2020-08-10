package com.elsevier.education

import spock.lang.*

import static com.elsevier.education.Exercise4.*

class Exercise4Spec extends Specification {

  @Shared
  @Subject
  static Counter c = new Counter()

  void "counter does all the things"() {
    expect:
    c.increment() == 1
    c.getCount()  == 1

    when:
    c.resetCount()

    then:
    c.getCount() == 0
  }

}

