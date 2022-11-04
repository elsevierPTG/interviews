package com.elsevier.education

import spock.lang.*

import static com.elsevier.education.Exercise1.Person

class Exercise1Spec extends Specification {

  @Shared
  @Subject
  static final Person p = new Person('dave', 'millar', ['(555)555-5555'] as Set)

  void "names are immutable"() {
    when:
    String fn = p.getFirstName()
    fn = 'john'

    then:
    p.getFirstName() == 'dave'

  }

  void "phone numbers are immutable"() {
    when:
    p.phoneNumbers.add('(555)555-5556')

    then:
    thrown UnsupportedOperationException
  }

}

