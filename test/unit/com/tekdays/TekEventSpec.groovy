package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class TekEventSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
      when: "event has name and city"
        def tekEvent = new TekEvent(name:'Groovy Event', city: 'Toon', organiser: 'me')
      then: "to string works"
        tekEvent.toString() == 'Groovy Event, Toon'
    }
}
