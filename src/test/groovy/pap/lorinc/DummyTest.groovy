package pap.lorinc

import spock.lang.Specification

class DummyTest extends Specification {
    /*@formatter:off*/
    def 'Dummy?'() {
        when:   def value = Dummy.dummy()
        then:   !value.empty
    }
    /*@formatter:on*/
}
