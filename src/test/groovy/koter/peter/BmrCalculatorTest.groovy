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

    def almostEqual(expectedResult, result) {
        Math.abs(expectedResult - result) < 0.1
    }
    def 'Basal Metabolic Rate test'() {
        when:   def bmr = basalMetabolicRate(gender, weight, height, age)
        then:   almostEqual(bmr, result)

        where:  gender | weight | height | age || result
                MALE   | 60     | 178    | 27  || 1593.1
                FEMALE | 120    | 175    | 30  || 1969.4
    }

    def 'daily calorie intake test'() {
        when:   def dailyCalorieIntake = dailyCalorieIntake(activity, basalMetabolicRate)
        then:   almostEqual(dailyCalorieIntake, result)

        where:  activity   | basalMetabolicRate || result
                VERY_HEAVY | 1593.125           || 3026.9
                MODERATE   | 1969.483           || 3052.6
    }
    /*@formatter:on*/
}