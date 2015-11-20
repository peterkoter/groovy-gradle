package koter.peter

import spock.lang.Specification

import static koter.peter.BmrCalculatorClass.*
import static koter.peter.BmrCalculatorClass.Gender.*
import static koter.peter.BmrCalculatorClass.Activity.*

/*
 * This is a TEST for BMR Calculator and for daily calorie intake.
 */

class BmrCalculatorTest extends Specification {
    /*@formatter:off*/

    def 'Basal Metabolic Rate test'() {
        when:
        def bmi = basalMetabolicRate(gender, weight, height, age)
        then:
        bmi == result

        where:
        gender | weight | height | age || result
        MALE   | 60     | 178    | 27  || 1593.125
        FEMALE | 120    | 175    | 30  || 1969.483
    }

    def 'daily calorie intake test'() {
        when:
        def dailyCalorieIntake = dailyCalorieIntake(activity, basalMetabolicRate)
        then:
        dailyCalorieIntake == result

        where:
        activity   | basalMetabolicRate || result
        VERY_HEAVY | 1593.125           || 3026.9375
        MODERATE   | 1969.483           || 3052.69865
    }
    /*@formatter:on*/
}